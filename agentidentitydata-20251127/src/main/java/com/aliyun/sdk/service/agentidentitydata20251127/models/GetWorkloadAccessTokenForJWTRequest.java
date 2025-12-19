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
 * {@link GetWorkloadAccessTokenForJWTRequest} extends {@link RequestModel}
 *
 * <p>GetWorkloadAccessTokenForJWTRequest</p>
 */
public class GetWorkloadAccessTokenForJWTRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserToken")
    private String userToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadIdentityName")
    private String workloadIdentityName;

    private GetWorkloadAccessTokenForJWTRequest(Builder builder) {
        super(builder);
        this.userToken = builder.userToken;
        this.workloadIdentityName = builder.workloadIdentityName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkloadAccessTokenForJWTRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userToken
     */
    public String getUserToken() {
        return this.userToken;
    }

    /**
     * @return workloadIdentityName
     */
    public String getWorkloadIdentityName() {
        return this.workloadIdentityName;
    }

    public static final class Builder extends Request.Builder<GetWorkloadAccessTokenForJWTRequest, Builder> {
        private String userToken; 
        private String workloadIdentityName; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkloadAccessTokenForJWTRequest request) {
            super(request);
            this.userToken = request.userToken;
            this.workloadIdentityName = request.workloadIdentityName;
        } 

        /**
         * UserToken.
         */
        public Builder userToken(String userToken) {
            this.putBodyParameter("UserToken", userToken);
            this.userToken = userToken;
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
        public GetWorkloadAccessTokenForJWTRequest build() {
            return new GetWorkloadAccessTokenForJWTRequest(this);
        } 

    } 

}
