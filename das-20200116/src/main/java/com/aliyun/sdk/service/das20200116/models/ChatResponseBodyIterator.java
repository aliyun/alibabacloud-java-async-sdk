// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ChatResponseBodyIterator extends SSEResponseIterator<ChatResponseBody> {

    ChatResponseBodyIterator() {
    }

    public static ChatResponseBodyIterator create() {
        return new ChatResponseBodyIterator();
    }

    @Override
    protected ChatResponseBody toModel(String data) {
        ChatResponseBody result = ChatResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
