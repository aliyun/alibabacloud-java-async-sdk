// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20240820.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class PredictSseResponseBodyIterator extends SSEResponseIterator<PredictSseResponseBody> {

    PredictSseResponseBodyIterator() {
    }

    public static PredictSseResponseBodyIterator create() {
        return new PredictSseResponseBodyIterator();
    }

    @Override
    protected PredictSseResponseBody toModel(String data) {
        PredictSseResponseBody result = PredictSseResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
