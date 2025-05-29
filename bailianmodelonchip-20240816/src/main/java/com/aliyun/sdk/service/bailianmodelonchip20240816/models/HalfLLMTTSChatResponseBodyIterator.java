// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class HalfLLMTTSChatResponseBodyIterator extends SSEResponseIterator<HalfLLMTTSChatResponseBody> {

    HalfLLMTTSChatResponseBodyIterator() {
    }

    public static HalfLLMTTSChatResponseBodyIterator create() {
        return new HalfLLMTTSChatResponseBodyIterator();
    }

    @Override
    protected HalfLLMTTSChatResponseBody toModel(String data) {
        HalfLLMTTSChatResponseBody result = HalfLLMTTSChatResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
