// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunLegalAdviceConsultationResponseBodyIterator extends SSEResponseIterator<RunLegalAdviceConsultationResponseBody> {

    RunLegalAdviceConsultationResponseBodyIterator() {
    }

    public static RunLegalAdviceConsultationResponseBodyIterator create() {
        return new RunLegalAdviceConsultationResponseBodyIterator();
    }

    @Override
    protected RunLegalAdviceConsultationResponseBody toModel(String data) {
        RunLegalAdviceConsultationResponseBody result = RunLegalAdviceConsultationResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
