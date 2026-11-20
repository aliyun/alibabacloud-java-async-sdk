// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bmed20261116.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class MedicalModelInferenceResponseBodyIterator extends SSEResponseIterator<MedicalModelInferenceResponseBody> {

    MedicalModelInferenceResponseBodyIterator() {
    }

    public static MedicalModelInferenceResponseBodyIterator create() {
        return new MedicalModelInferenceResponseBodyIterator();
    }

    @Override
    protected MedicalModelInferenceResponseBody toModel(String data) {
        MedicalModelInferenceResponseBody result = MedicalModelInferenceResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
