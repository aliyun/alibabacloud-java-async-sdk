// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDNSAuthorizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>AddDNSAuthorizationRuleResponseBody</p>
 */
public class AddDNSAuthorizationRuleResponseBody extends TeaModel {
    @NameInMap("AuthorizationRuleId")
    private String authorizationRuleId;

    @NameInMap("RequestId")
    private String requestId;

    private AddDNSAuthorizationRuleResponseBody(Builder builder) {
        this.authorizationRuleId = builder.authorizationRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDNSAuthorizationRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizationRuleId
     */
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authorizationRuleId; 
        private String requestId; 

        /**
         * AuthorizationRuleId.
         */
        public Builder authorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddDNSAuthorizationRuleResponseBody build() {
            return new AddDNSAuthorizationRuleResponseBody(this);
        } 

    } 

}
