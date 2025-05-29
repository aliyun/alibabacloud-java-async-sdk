// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class HalfLLMImageOcrResponseBodyIterator extends SSEResponseIterator<HalfLLMImageOcrResponseBody> {

    HalfLLMImageOcrResponseBodyIterator() {
    }

    public static HalfLLMImageOcrResponseBodyIterator create() {
        return new HalfLLMImageOcrResponseBodyIterator();
    }

    @Override
    protected HalfLLMImageOcrResponseBody toModel(String data) {
        HalfLLMImageOcrResponseBody result = HalfLLMImageOcrResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
