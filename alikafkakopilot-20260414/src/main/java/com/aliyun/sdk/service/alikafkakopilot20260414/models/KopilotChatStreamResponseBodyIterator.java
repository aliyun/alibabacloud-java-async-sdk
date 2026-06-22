// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class KopilotChatStreamResponseBodyIterator extends SSEResponseIterator<KopilotChatStreamResponseBody> {

    KopilotChatStreamResponseBodyIterator() {
    }

    public static KopilotChatStreamResponseBodyIterator create() {
        return new KopilotChatStreamResponseBodyIterator();
    }

    @Override
    protected KopilotChatStreamResponseBody toModel(String data) {
        KopilotChatStreamResponseBody result = KopilotChatStreamResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
