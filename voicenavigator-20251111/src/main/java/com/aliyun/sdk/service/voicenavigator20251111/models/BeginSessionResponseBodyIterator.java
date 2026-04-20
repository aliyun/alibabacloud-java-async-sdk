// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class BeginSessionResponseBodyIterator extends SSEResponseIterator<BeginSessionResponseBody> {

    BeginSessionResponseBodyIterator() {
    }

    public static BeginSessionResponseBodyIterator create() {
        return new BeginSessionResponseBodyIterator();
    }

    @Override
    protected BeginSessionResponseBody toModel(String data) {
        BeginSessionResponseBody result = BeginSessionResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
