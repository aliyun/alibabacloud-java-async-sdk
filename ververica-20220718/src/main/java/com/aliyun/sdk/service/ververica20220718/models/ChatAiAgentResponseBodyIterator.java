// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ChatAiAgentResponseBodyIterator extends SSEResponseIterator<ChatAiAgentResponseBody> {

    ChatAiAgentResponseBodyIterator() {
    }

    public static ChatAiAgentResponseBodyIterator create() {
        return new ChatAiAgentResponseBodyIterator();
    }

    @Override
    protected ChatAiAgentResponseBody toModel(String data) {
        ChatAiAgentResponseBody result = ChatAiAgentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
