// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunBookSmartCardResponseBodyIterator extends SSEResponseIterator<RunBookSmartCardResponseBody> {

    RunBookSmartCardResponseBodyIterator() {
    }

    public static RunBookSmartCardResponseBodyIterator create() {
        return new RunBookSmartCardResponseBodyIterator();
    }

    @Override
    protected RunBookSmartCardResponseBody toModel(String data) {
        RunBookSmartCardResponseBody result = RunBookSmartCardResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
