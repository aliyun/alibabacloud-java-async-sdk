// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bmed20261121.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class MedicalAgentChatResponseBodyIterator extends SSEResponseIterator<MedicalAgentChatResponseBody> {

    MedicalAgentChatResponseBodyIterator() {
    }

    public static MedicalAgentChatResponseBodyIterator create() {
        return new MedicalAgentChatResponseBodyIterator();
    }

    @Override
    protected MedicalAgentChatResponseBody toModel(String data) {
        MedicalAgentChatResponseBody result = MedicalAgentChatResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
