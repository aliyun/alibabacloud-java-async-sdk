// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class GenerateCopilotStreamResponseResponseBodyIterator extends SSEResponseIterator<GenerateCopilotStreamResponseResponseBody> {

    GenerateCopilotStreamResponseResponseBodyIterator() {
    }

    public static GenerateCopilotStreamResponseResponseBodyIterator create() {
        return new GenerateCopilotStreamResponseResponseBodyIterator();
    }

    @Override
    protected GenerateCopilotStreamResponseResponseBody toModel(String data) {
        GenerateCopilotStreamResponseResponseBody result = GenerateCopilotStreamResponseResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
