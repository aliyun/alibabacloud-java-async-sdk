// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class HalfLLMAppCallResponseBodyIterator extends SSEResponseIterator<HalfLLMAppCallResponseBody> {

    HalfLLMAppCallResponseBodyIterator() {
    }

    public static HalfLLMAppCallResponseBodyIterator create() {
        return new HalfLLMAppCallResponseBodyIterator();
    }

    @Override
    protected HalfLLMAppCallResponseBody toModel(String data) {
        HalfLLMAppCallResponseBody result = HalfLLMAppCallResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
