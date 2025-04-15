// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetApprovalProcessRequest} extends {@link RequestModel}
 *
 * <p>GetApprovalProcessRequest</p>
 */
public class GetApprovalProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processId;

    private GetApprovalProcessRequest(Builder builder) {
        super(builder);
        this.processId = builder.processId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApprovalProcessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    public static final class Builder extends Request.Builder<GetApprovalProcessRequest, Builder> {
        private String processId; 

        private Builder() {
            super();
        } 

        private Builder(GetApprovalProcessRequest request) {
            super(request);
            this.processId = request.processId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-fcc351b8a95b****</p>
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        @Override
        public GetApprovalProcessRequest build() {
            return new GetApprovalProcessRequest(this);
        } 

    } 

}
