// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ChatMessagesResponseBodyIterator extends SSEResponseIterator<ChatMessagesResponseBody> {

    ChatMessagesResponseBodyIterator() {
    }

    public static ChatMessagesResponseBodyIterator create() {
        return new ChatMessagesResponseBodyIterator();
    }

    @Override
    protected ChatMessagesResponseBody toModel(String data) {
        ChatMessagesResponseBody result = ChatMessagesResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
