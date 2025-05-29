// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class HalfLLMImageChatResponseBodyIterator extends SSEResponseIterator<HalfLLMImageChatResponseBody> {

    HalfLLMImageChatResponseBodyIterator() {
    }

    public static HalfLLMImageChatResponseBodyIterator create() {
        return new HalfLLMImageChatResponseBodyIterator();
    }

    @Override
    protected HalfLLMImageChatResponseBody toModel(String data) {
        HalfLLMImageChatResponseBody result = HalfLLMImageChatResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
