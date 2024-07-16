// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGroupDnsAuthorizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>AddGroupDnsAuthorizationRuleResponseBody</p>
 */
public class AddGroupDnsAuthorizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
    private String authorizationRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddGroupDnsAuthorizationRuleResponseBody(Builder builder) {
        this.authorizationRuleId = builder.authorizationRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGroupDnsAuthorizationRuleResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddGroupDnsAuthorizationRuleResponseBody build() {
            return new AddGroupDnsAuthorizationRuleResponseBody(this);
        } 

    } 

}
