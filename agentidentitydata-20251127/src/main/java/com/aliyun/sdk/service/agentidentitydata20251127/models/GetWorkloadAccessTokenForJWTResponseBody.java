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
 * {@link GetWorkloadAccessTokenForJWTResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkloadAccessTokenForJWTResponseBody</p>
 */
public class GetWorkloadAccessTokenForJWTResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkloadAccessToken")
    private String workloadAccessToken;

    private GetWorkloadAccessTokenForJWTResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workloadAccessToken = builder.workloadAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkloadAccessTokenForJWTResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private String workloadAccessToken; 

        private Builder() {
        } 

        private Builder(GetWorkloadAccessTokenForJWTResponseBody model) {
            this.requestId = model.requestId;
            this.workloadAccessToken = model.workloadAccessToken;
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

        public GetWorkloadAccessTokenForJWTResponseBody build() {
            return new GetWorkloadAccessTokenForJWTResponseBody(this);
        } 

    } 

}
