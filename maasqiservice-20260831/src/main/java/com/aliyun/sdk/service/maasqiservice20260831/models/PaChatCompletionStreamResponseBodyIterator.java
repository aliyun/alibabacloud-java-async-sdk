// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasqiservice20260831.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class PaChatCompletionStreamResponseBodyIterator extends SSEResponseIterator<PaChatCompletionStreamResponseBody> {

    PaChatCompletionStreamResponseBodyIterator() {
    }

    public static PaChatCompletionStreamResponseBodyIterator create() {
        return new PaChatCompletionStreamResponseBodyIterator();
    }

    @Override
    protected PaChatCompletionStreamResponseBody toModel(String data) {
        PaChatCompletionStreamResponseBody result = PaChatCompletionStreamResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
