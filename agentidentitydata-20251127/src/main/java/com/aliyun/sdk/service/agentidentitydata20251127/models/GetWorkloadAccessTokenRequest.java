// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127.models;

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
 * {@link GetWorkloadAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>GetWorkloadAccessTokenRequest</p>
 */
public class GetWorkloadAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadIdentityName")
    private String workloadIdentityName;

    private GetWorkloadAccessTokenRequest(Builder builder) {
        super(builder);
        this.workloadIdentityName = builder.workloadIdentityName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkloadAccessTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workloadIdentityName
     */
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

    public static final class Builder extends Request.Builder<GetWorkloadAccessTokenRequest, Builder> {
        private String workloadIdentityName; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkloadAccessTokenRequest request) {
            super(request);
            this.workloadIdentityName = request.workloadIdentityName;
        } 

        /**
         * WorkloadIdentityName.
         */
        public Builder workloadIdentityName(String workloadIdentityName) {
            this.putBodyParameter("WorkloadIdentityName", workloadIdentityName);
            this.workloadIdentityName = workloadIdentityName;
            return this;
        }

        @Override
        public GetWorkloadAccessTokenRequest build() {
            return new GetWorkloadAccessTokenRequest(this);
        } 

    } 

}
