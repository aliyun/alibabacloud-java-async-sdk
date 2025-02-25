// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimath20241114.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class GenStepResponseBodyIterator extends SSEResponseIterator<GenStepResponseBody> {

    GenStepResponseBodyIterator() {
    }

    public static GenStepResponseBodyIterator create() {
        return new GenStepResponseBodyIterator();
    }

    @Override
    protected GenStepResponseBody toModel(String data) {
        GenStepResponseBody result = GenStepResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
