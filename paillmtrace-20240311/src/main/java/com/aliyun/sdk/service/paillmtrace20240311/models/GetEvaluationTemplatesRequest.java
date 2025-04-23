// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEvaluationTemplatesRequest} extends {@link RequestModel}
 *
 * <p>GetEvaluationTemplatesRequest</p>
 */
public class GetEvaluationTemplatesRequest extends Request {
    private GetEvaluationTemplatesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEvaluationTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetEvaluationTemplatesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetEvaluationTemplatesRequest request) {
            super(request);
        } 

        @Override
        public GetEvaluationTemplatesRequest build() {
            return new GetEvaluationTemplatesRequest(this);
        } 

    } 

}
