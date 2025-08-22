// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ValidateModuleResponseBodyIterator extends SSEResponseIterator<ValidateModuleResponseBody> {

    ValidateModuleResponseBodyIterator() {
    }

    public static ValidateModuleResponseBodyIterator create() {
        return new ValidateModuleResponseBodyIterator();
    }

    @Override
    protected ValidateModuleResponseBody toModel(String data) {
        ValidateModuleResponseBody result = ValidateModuleResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
