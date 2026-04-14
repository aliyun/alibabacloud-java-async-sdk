// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class CpuHighAgentStreamResponseResponseBodyIterator extends SSEResponseIterator<CpuHighAgentStreamResponseResponseBody> {

    CpuHighAgentStreamResponseResponseBodyIterator() {
    }

    public static CpuHighAgentStreamResponseResponseBodyIterator create() {
        return new CpuHighAgentStreamResponseResponseBodyIterator();
    }

    @Override
    protected CpuHighAgentStreamResponseResponseBody toModel(String data) {
        CpuHighAgentStreamResponseResponseBody result = CpuHighAgentStreamResponseResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
