// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCloudResourceAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCloudResourceAuthorizedResponseBody</p>
 */
public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    @NameInMap("AuthorizationState")
    private Integer authorizationState;

    @NameInMap("RequestId")
    private String requestId;

    private CheckCloudResourceAuthorizedResponseBody(Builder builder) {
        this.authorizationState = builder.authorizationState;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCloudResourceAuthorizedResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizationState
     */
    public Integer getAuthorizationState() {
        return this.authorizationState;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer authorizationState; 
        private String requestId; 

        /**
         * AuthorizationState.
         */
        public Builder authorizationState(Integer authorizationState) {
            this.authorizationState = authorizationState;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCloudResourceAuthorizedResponseBody build() {
            return new CheckCloudResourceAuthorizedResponseBody(this);
        } 

    } 

}
