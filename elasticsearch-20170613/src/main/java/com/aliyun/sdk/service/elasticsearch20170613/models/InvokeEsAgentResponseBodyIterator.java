// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class InvokeEsAgentResponseBodyIterator extends SSEResponseIterator<InvokeEsAgentResponseBody> {

    InvokeEsAgentResponseBodyIterator() {
    }

    public static InvokeEsAgentResponseBodyIterator create() {
        return new InvokeEsAgentResponseBodyIterator();
    }

    @Override
    protected InvokeEsAgentResponseBody toModel(String data) {
        InvokeEsAgentResponseBody result = InvokeEsAgentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
