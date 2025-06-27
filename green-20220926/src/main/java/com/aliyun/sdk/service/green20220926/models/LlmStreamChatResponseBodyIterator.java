// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class LlmStreamChatResponseBodyIterator extends SSEResponseIterator<LlmStreamChatResponseBody> {

    LlmStreamChatResponseBodyIterator() {
    }

    public static LlmStreamChatResponseBodyIterator create() {
        return new LlmStreamChatResponseBodyIterator();
    }

    @Override
    protected LlmStreamChatResponseBody toModel(String data) {
        LlmStreamChatResponseBody result = LlmStreamChatResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
