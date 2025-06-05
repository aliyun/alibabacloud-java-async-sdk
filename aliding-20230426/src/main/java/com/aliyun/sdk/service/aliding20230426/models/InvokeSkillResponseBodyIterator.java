// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class InvokeSkillResponseBodyIterator extends SSEResponseIterator<InvokeSkillResponseBody> {

    InvokeSkillResponseBodyIterator() {
    }

    public static InvokeSkillResponseBodyIterator create() {
        return new InvokeSkillResponseBodyIterator();
    }

    @Override
    protected InvokeSkillResponseBody toModel(String data) {
        InvokeSkillResponseBody result = InvokeSkillResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
