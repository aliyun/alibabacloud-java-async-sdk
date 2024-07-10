// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunContractResultGenerationResponseBodyIterator extends SSEResponseIterator<RunContractResultGenerationResponseBody> {

    RunContractResultGenerationResponseBodyIterator() {
    }

    public static RunContractResultGenerationResponseBodyIterator create() {
        return new RunContractResultGenerationResponseBodyIterator();
    }

    @Override
    protected RunContractResultGenerationResponseBody toModel(String data) {
        RunContractResultGenerationResponseBody result = RunContractResultGenerationResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
