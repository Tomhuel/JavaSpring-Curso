package io.github.tomhuel;

import io.github.tomhuel.APIStream.StreamAnyMatch.StreamAnyMatch;
import io.github.tomhuel.APIStream.StreamAnyMatch.StreamCount;
import io.github.tomhuel.APIStream.StreamFilter.StreamFilter;
import io.github.tomhuel.APIStream.StreamFilter.StreamSingleFilter;
import io.github.tomhuel.APIStream.StreamOperators.StreamDistinct;
import io.github.tomhuel.APIStream.StreamOperators.StreamFilterEmpty;
import io.github.tomhuel.APIStream.StreamOperators.StreamRange;
import io.github.tomhuel.APIStream.StreamOperators.StreamReduce;

public class Main {
    public static void main(String[] args) {
//        CreateStream.execute();

//        StreamMap.execute();

//        StreamFilter.execute();
//        StreamSingleFilter.execute();

//        StreamAnyMatch.execute();
//        StreamCount.execute();

        StreamFilterEmpty.execute();
        StreamDistinct.execute();
        StreamReduce.execute();
        StreamRange.execute();
    }
}