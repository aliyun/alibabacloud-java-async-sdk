// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunKeywordsExtractionGenerationResponseBodyIterator extends SSEResponseIterator<RunKeywordsExtractionGenerationResponseBody> {

    RunKeywordsExtractionGenerationResponseBodyIterator() {
    }

    public static RunKeywordsExtractionGenerationResponseBodyIterator create() {
        return new RunKeywordsExtractionGenerationResponseBodyIterator();
    }

    @Override
    protected RunKeywordsExtractionGenerationResponseBody toModel(String data) {
        RunKeywordsExtractionGenerationResponseBody result = RunKeywordsExtractionGenerationResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
