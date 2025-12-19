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
 * {@link GetWorkloadAccessTokenForUserIdRequest} extends {@link RequestModel}
 *
 * <p>GetWorkloadAccessTokenForUserIdRequest</p>
 */
public class GetWorkloadAccessTokenForUserIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadIdentityName")
    private String workloadIdentityName;

    private GetWorkloadAccessTokenForUserIdRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.workloadIdentityName = builder.workloadIdentityName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkloadAccessTokenForUserIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workloadIdentityName
     */
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

    public static final class Builder extends Request.Builder<GetWorkloadAccessTokenForUserIdRequest, Builder> {
        private String userId; 
        private String workloadIdentityName; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkloadAccessTokenForUserIdRequest request) {
            super(request);
            this.userId = request.userId;
            this.workloadIdentityName = request.workloadIdentityName;
        } 

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
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
        public GetWorkloadAccessTokenForUserIdRequest build() {
            return new GetWorkloadAccessTokenForUserIdRequest(this);
        } 

    } 

}
