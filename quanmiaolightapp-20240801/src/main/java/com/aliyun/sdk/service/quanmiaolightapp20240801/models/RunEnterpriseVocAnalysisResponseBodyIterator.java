// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class RunEnterpriseVocAnalysisResponseBodyIterator extends SSEResponseIterator<RunEnterpriseVocAnalysisResponseBody> {

    RunEnterpriseVocAnalysisResponseBodyIterator() {
    }

    public static RunEnterpriseVocAnalysisResponseBodyIterator create() {
        return new RunEnterpriseVocAnalysisResponseBodyIterator();
    }

    @Override
    protected RunEnterpriseVocAnalysisResponseBody toModel(String data) {
        RunEnterpriseVocAnalysisResponseBody result = RunEnterpriseVocAnalysisResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
