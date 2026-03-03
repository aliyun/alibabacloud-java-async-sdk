// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class GetYaoChiAgentResponseBodyIterator extends SSEResponseIterator<GetYaoChiAgentResponseBody> {

    GetYaoChiAgentResponseBodyIterator() {
    }

    public static GetYaoChiAgentResponseBodyIterator create() {
        return new GetYaoChiAgentResponseBodyIterator();
    }

    @Override
    protected GetYaoChiAgentResponseBody toModel(String data) {
        GetYaoChiAgentResponseBody result = GetYaoChiAgentResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
