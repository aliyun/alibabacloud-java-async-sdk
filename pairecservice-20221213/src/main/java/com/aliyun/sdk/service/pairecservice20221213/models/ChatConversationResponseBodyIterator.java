// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ChatConversationResponseBodyIterator extends SSEResponseIterator<ChatConversationResponseBody> {

    ChatConversationResponseBodyIterator() {
    }

    public static ChatConversationResponseBodyIterator create() {
        return new ChatConversationResponseBodyIterator();
    }

    @Override
    protected ChatConversationResponseBody toModel(String data) {
        ChatConversationResponseBody result = ChatConversationResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
