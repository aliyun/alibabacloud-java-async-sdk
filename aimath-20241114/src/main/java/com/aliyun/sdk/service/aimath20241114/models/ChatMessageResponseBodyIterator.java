// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimath20241114.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ChatMessageResponseBodyIterator extends SSEResponseIterator<ChatMessageResponseBody> {

    ChatMessageResponseBodyIterator() {
    }

    public static ChatMessageResponseBodyIterator create() {
        return new ChatMessageResponseBodyIterator();
    }

    @Override
    protected ChatMessageResponseBody toModel(String data) {
        ChatMessageResponseBody result = ChatMessageResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
