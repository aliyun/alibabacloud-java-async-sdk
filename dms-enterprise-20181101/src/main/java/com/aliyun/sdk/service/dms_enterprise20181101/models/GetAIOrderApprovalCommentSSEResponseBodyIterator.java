// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.utils.ParseUtil;
import darabonba.core.sse.SSEResponseIterator;
import darabonba.core.TeaModel;
import darabonba.core.utils.CommonUtil;

import java.util.*;

public class GetAIOrderApprovalCommentSSEResponseBodyIterator extends SSEResponseIterator<GetAIOrderApprovalCommentSSEResponseBody> {

    GetAIOrderApprovalCommentSSEResponseBodyIterator() {
    }

    public static GetAIOrderApprovalCommentSSEResponseBodyIterator create() {
        return new GetAIOrderApprovalCommentSSEResponseBodyIterator();
    }

    @Override
    protected GetAIOrderApprovalCommentSSEResponseBody toModel(String data) {
        GetAIOrderApprovalCommentSSEResponseBody result = GetAIOrderApprovalCommentSSEResponseBody.create();
        Map<String, Object> object = CommonUtil.assertAsMap(ParseUtil.parseJSON(data));
        TeaModel.toModel(object, result);
        return result;
    }

}
