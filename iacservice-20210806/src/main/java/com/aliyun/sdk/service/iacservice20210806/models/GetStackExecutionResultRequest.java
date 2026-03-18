// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetStackExecutionResultRequest} extends {@link RequestModel}
 *
 * <p>GetStackExecutionResultRequest</p>
 */
public class GetStackExecutionResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("triggerId")
    private String triggerId;

    private GetStackExecutionResultRequest(Builder builder) {
        super(builder);
        this.triggerId = builder.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackExecutionResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
    }

    public static final class Builder extends Request.Builder<GetStackExecutionResultRequest, Builder> {
        private String triggerId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackExecutionResultRequest request) {
            super(request);
            this.triggerId = request.triggerId;
        } 

        /**
         * triggerId.
         */
        public Builder triggerId(String triggerId) {
            this.putPathParameter("triggerId", triggerId);
            this.triggerId = triggerId;
            return this;
        }

        @Override
        public GetStackExecutionResultRequest build() {
            return new GetStackExecutionResultRequest(this);
        } 

    } 

}
