package com.quarkalchs.brainpeek

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.peeker_fragment.*

class PeekerFragment : Fragment() {

    companion object {
        fun newInstance() = PeekerFragment()
    }

    private lateinit var viewModel: PeekerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.peeker_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PeekerViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        start_button.setOnClickListener {
            playWords(true)
        }
        pause_button.setOnClickListener {
            playWords(false)
        }

    }

    private fun startTextsForPlay() {
        var a = "Muchas veces la realidad supera a la ficción. Otras, directamente la copia. Eso ocurrió ayer en un acto por el 9 de Julio en el municipio de El Carmen, situado a pocos kilómetros de San Salvador de Jujuy.\n" +
                "\n" +
                "Con motivo del aniversario de la Independencia, el intendente Rodolfo Alejandro Torres pronunció un discurso que comenzó con los clásicos agradecimientos a los funcionarios del gobierno y a los empleados de la administración pública por su esfuerzo cotidiano en el marco de la pandemia de coronavirus.\n" +
                "\n" +
                "Luego, aseguró que la “lucha sanitaria” encontrará unidos a todos los jujeños. Sin embargo, algunas de sus palabras llamaron la atención: especialmente su arenga a “luchar una vez más por la libertad” y “no morir sin pelear”.\n" +
                "\n" +
                "“Tal vez sea el destino que hoy 9 de Julio, una fecha tan especial, sea tiempo de luchar una vez más por la libertad. No entraremos rendidos y en silencio hacia la enfermedad, no nos entregaremos a la pandemia y no moriremos sin pelear. Vamos a buscar vivir, vamos a buscar existir, hoy celebramos nuestro Día de la Independencia”, dijo el intendente. Su cara estaba cubierta con un tapaboca de los colores de la bandera argentina.\n" +
                "\n" +
                "Desafortunadamente para él, algún memorioso o fanático de las películas de ciencia ficción reconoció la estructura de su discurso. Si bien el mandatario municipal se encargó de adaptarlo al contexto de la pandemia, plagió varias partes de la emotiva arenga previa a la batalla final contra los alienígenas en el film Día de la Independencia."

        viewModel.listify(a)
    }

    fun playWords(play: Boolean) {

    }
}