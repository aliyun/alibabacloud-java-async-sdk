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
 * {@link GetWorkloadAccessTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkloadAccessTokenResponseBody</p>
 */
public class GetWorkloadAccessTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkloadAccessToken")
    private String workloadAccessToken;

    @com.aliyun.core.annotation.NameInMap("WorkloadIdentityArn")
    private String workloadIdentityArn;

    private GetWorkloadAccessTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workloadAccessToken = builder.workloadAccessToken;
        this.workloadIdentityArn = builder.workloadIdentityArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkloadAccessTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

    /**
     * @return workloadIdentityArn
     */
    public String getWorkloadIdentityArn() {
        return this.workloadIdentityArn;
    }

    public static final class Builder {
        private String requestId; 
        private String workloadAccessToken; 
        private String workloadIdentityArn; 

        private Builder() {
        } 

        private Builder(GetWorkloadAccessTokenResponseBody model) {
            this.requestId = model.requestId;
            this.workloadAccessToken = model.workloadAccessToken;
            this.workloadIdentityArn = model.workloadIdentityArn;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkloadAccessToken.
         */
        public Builder workloadAccessToken(String workloadAccessToken) {
            this.workloadAccessToken = workloadAccessToken;
            return this;
        }

        /**
         * WorkloadIdentityArn.
         */
        public Builder workloadIdentityArn(String workloadIdentityArn) {
            this.workloadIdentityArn = workloadIdentityArn;
            return this;
        }

        public GetWorkloadAccessTokenResponseBody build() {
            return new GetWorkloadAccessTokenResponseBody(this);
        } 

    } 

}
