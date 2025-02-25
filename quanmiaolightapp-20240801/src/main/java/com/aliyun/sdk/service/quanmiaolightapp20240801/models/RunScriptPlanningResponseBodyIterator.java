// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunScriptPlanningResponseBodyIterator extends SSEResponseIterator<RunScriptPlanningResponseBody> {

    RunScriptPlanningResponseBodyIterator() {
    }

    public static RunScriptPlanningResponseBodyIterator create() {
        return new RunScriptPlanningResponseBodyIterator();
    }

    @Override
    protected RunScriptPlanningResponseBody toModel(String data) {
        RunScriptPlanningResponseBody result = RunScriptPlanningResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
