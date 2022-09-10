package com.patika.week3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.patika.week3.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var dayList: MutableList<Day>


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvDay = binding.recyclerView
        val buttonAdd = binding.buttonAdd
        dayList = mutableListOf(
            Day(
                "01-09-2022",
                R.color.white,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "02-09-2022",
                R.color.purple_200,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "03-09-2022",
                R.color.teal_200,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "04-09-2022",
                R.color.white,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "05-09-2022",
                R.color.purple_700,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "06-09-2022",
                R.color.red,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "07-09-2022",
                R.color.blue,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "08-09-2022",
                R.color.teal_700,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "09-09-2022",
                R.color.teal_700,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "10-09-2022",
                R.color.white,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            ),
            Day(
                "11-09-2022",
                R.color.red,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer cursus nisi urna, elementum sagittis mauris congue quis. Vestibulum interdum fringilla enim, id ultrices velit facilisis et. Phasellus dignissim urna sem, eu egestas velit pulvinar vel. Morbi eget urna vel leo facilisis pellentesque. Nunc quis tortor tincidunt, venenatis ipsum ac, feugiat ante. Curabitur risus nisl, sagittis vitae ullamcorper vel, iaculis vel nibh. Suspendisse consequat massa vulputate congue malesuada. Suspendisse vel mauris interdum, semper libero a, molestie arcu. Morbi vitae varius felis, dapibus volutpat nunc.\n" + "\n" + "Nunc mollis urna mauris, ut efficitur odio semper eu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur eu nibh nec leo sodales cursus sit amet nec nisl. Ut placerat at leo consequat iaculis. Quisque a dictum quam. Sed risus odio, gravida in laoreet ultrices, sagittis eget purus. Vivamus leo turpis, egestas aliquet ornare vitae, ornare quis eros. Duis ac risus non ligula ornare semper luctus quis dui. Fusce quis velit sit amet arcu feugiat pretium eget eget augue. Nulla eu tincidunt quam. Duis sit amet magna velit. Quisque iaculis sed mi quis laoreet. Cras purus mauris, porta vestibulum tellus fringilla, accumsan finibus augue."
            )
        )
        val adapter = DayAdapter(dayList)
        rvDay.adapter = adapter
        rvDay.layoutManager = LinearLayoutManager(activity)


        buttonAdd.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_dayFragment2)
        }
    }
}