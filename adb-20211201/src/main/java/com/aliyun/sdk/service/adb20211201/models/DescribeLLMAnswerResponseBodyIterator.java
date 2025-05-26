// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class DescribeLLMAnswerResponseBodyIterator extends SSEResponseIterator<DescribeLLMAnswerResponseBody> {

    DescribeLLMAnswerResponseBodyIterator() {
    }

    public static DescribeLLMAnswerResponseBodyIterator create() {
        return new DescribeLLMAnswerResponseBodyIterator();
    }

    @Override
    protected DescribeLLMAnswerResponseBody toModel(String data) {
        DescribeLLMAnswerResponseBody result = DescribeLLMAnswerResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
