// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class PromptAgentSessionResponseBodyIterator extends SSEResponseIterator<PromptAgentSessionResponseBody> {

    PromptAgentSessionResponseBodyIterator() {
    }

    public static PromptAgentSessionResponseBodyIterator create() {
        return new PromptAgentSessionResponseBodyIterator();
    }

    @Override
    protected PromptAgentSessionResponseBody toModel(String data) {
        PromptAgentSessionResponseBody result = PromptAgentSessionResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
