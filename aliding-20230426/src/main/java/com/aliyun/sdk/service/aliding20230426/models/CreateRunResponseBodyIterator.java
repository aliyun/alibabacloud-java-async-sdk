// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class CreateRunResponseBodyIterator extends SSEResponseIterator<CreateRunResponseBody> {

    CreateRunResponseBodyIterator() {
    }

    public static CreateRunResponseBodyIterator create() {
        return new CreateRunResponseBodyIterator();
    }

    @Override
    protected CreateRunResponseBody toModel(String data) {
        CreateRunResponseBody result = CreateRunResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
