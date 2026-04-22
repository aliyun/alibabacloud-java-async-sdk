// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class LoadAgentSessionResponseBodyIterator extends SSEResponseIterator<LoadAgentSessionResponseBody> {

    LoadAgentSessionResponseBodyIterator() {
    }

    public static LoadAgentSessionResponseBodyIterator create() {
        return new LoadAgentSessionResponseBodyIterator();
    }

    @Override
    protected LoadAgentSessionResponseBody toModel(String data) {
        LoadAgentSessionResponseBody result = LoadAgentSessionResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
