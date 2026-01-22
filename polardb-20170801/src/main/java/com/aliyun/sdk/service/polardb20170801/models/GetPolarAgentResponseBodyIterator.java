// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class GetPolarAgentResponseBodyIterator extends SSEResponseIterator<GetPolarAgentResponseBody> {

    GetPolarAgentResponseBodyIterator() {
    }

    public static GetPolarAgentResponseBodyIterator create() {
        return new GetPolarAgentResponseBodyIterator();
    }

    @Override
    protected GetPolarAgentResponseBody toModel(String data) {
        GetPolarAgentResponseBody result = GetPolarAgentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
