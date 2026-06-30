// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class ExecuteAgentResponseBodyIterator extends SSEResponseIterator<ExecuteAgentResponseBody> {

    ExecuteAgentResponseBodyIterator() {
    }

    public static ExecuteAgentResponseBodyIterator create() {
        return new ExecuteAgentResponseBodyIterator();
    }

    @Override
    protected ExecuteAgentResponseBody toModel(String data) {
        ExecuteAgentResponseBody result = ExecuteAgentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
