// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunEssayCorrectionResponseBodyIterator extends SSEResponseIterator<RunEssayCorrectionResponseBody> {

    RunEssayCorrectionResponseBodyIterator() {
    }

    public static RunEssayCorrectionResponseBodyIterator create() {
        return new RunEssayCorrectionResponseBodyIterator();
    }

    @Override
    protected RunEssayCorrectionResponseBody toModel(String data) {
        RunEssayCorrectionResponseBody result = RunEssayCorrectionResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
