// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ChatWithKnowledgeBaseStreamResponseBodyIterator extends SSEResponseIterator<ChatWithKnowledgeBaseStreamResponseBody> {

    ChatWithKnowledgeBaseStreamResponseBodyIterator() {
    }

    public static ChatWithKnowledgeBaseStreamResponseBodyIterator create() {
        return new ChatWithKnowledgeBaseStreamResponseBodyIterator();
    }

    @Override
    protected ChatWithKnowledgeBaseStreamResponseBody toModel(String data) {
        ChatWithKnowledgeBaseStreamResponseBody result = ChatWithKnowledgeBaseStreamResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
