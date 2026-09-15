// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasqiservice20260831.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class AigcChatCompletionStreamResponseBodyIterator extends SSEResponseIterator<AigcChatCompletionStreamResponseBody> {

    AigcChatCompletionStreamResponseBodyIterator() {
    }

    public static AigcChatCompletionStreamResponseBodyIterator create() {
        return new AigcChatCompletionStreamResponseBodyIterator();
    }

    @Override
    protected AigcChatCompletionStreamResponseBody toModel(String data) {
        AigcChatCompletionStreamResponseBody result = AigcChatCompletionStreamResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
