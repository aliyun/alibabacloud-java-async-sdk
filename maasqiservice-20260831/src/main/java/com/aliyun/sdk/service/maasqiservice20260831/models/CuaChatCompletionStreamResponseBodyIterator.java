// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasqiservice20260831.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class CuaChatCompletionStreamResponseBodyIterator extends SSEResponseIterator<CuaChatCompletionStreamResponseBody> {

    CuaChatCompletionStreamResponseBodyIterator() {
    }

    public static CuaChatCompletionStreamResponseBodyIterator create() {
        return new CuaChatCompletionStreamResponseBodyIterator();
    }

    @Override
    protected CuaChatCompletionStreamResponseBody toModel(String data) {
        CuaChatCompletionStreamResponseBody result = CuaChatCompletionStreamResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
