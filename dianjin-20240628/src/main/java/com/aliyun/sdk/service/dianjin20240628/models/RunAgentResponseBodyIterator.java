// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunAgentResponseBodyIterator extends SSEResponseIterator<RunAgentResponseBody> {

    RunAgentResponseBodyIterator() {
    }

    public static RunAgentResponseBodyIterator create() {
        return new RunAgentResponseBodyIterator();
    }

    @Override
    protected RunAgentResponseBody toModel(String data) {
        RunAgentResponseBody result = RunAgentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
