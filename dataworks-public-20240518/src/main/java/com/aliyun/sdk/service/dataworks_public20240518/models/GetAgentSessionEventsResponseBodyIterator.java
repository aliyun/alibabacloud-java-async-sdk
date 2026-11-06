// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class GetAgentSessionEventsResponseBodyIterator extends SSEResponseIterator<GetAgentSessionEventsResponseBody> {

    GetAgentSessionEventsResponseBodyIterator() {
    }

    public static GetAgentSessionEventsResponseBodyIterator create() {
        return new GetAgentSessionEventsResponseBodyIterator();
    }

    @Override
    protected GetAgentSessionEventsResponseBody toModel(String data) {
        GetAgentSessionEventsResponseBody result = GetAgentSessionEventsResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
