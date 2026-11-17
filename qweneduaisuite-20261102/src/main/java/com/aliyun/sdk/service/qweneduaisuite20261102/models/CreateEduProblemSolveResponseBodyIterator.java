// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class CreateEduProblemSolveResponseBodyIterator extends SSEResponseIterator<CreateEduProblemSolveResponseBody> {

    CreateEduProblemSolveResponseBodyIterator() {
    }

    public static CreateEduProblemSolveResponseBodyIterator create() {
        return new CreateEduProblemSolveResponseBodyIterator();
    }

    @Override
    protected CreateEduProblemSolveResponseBody toModel(String data) {
        CreateEduProblemSolveResponseBody result = CreateEduProblemSolveResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
