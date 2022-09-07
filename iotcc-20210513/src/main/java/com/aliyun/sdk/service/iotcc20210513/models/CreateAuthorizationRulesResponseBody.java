// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuthorizationRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAuthorizationRulesResponseBody</p>
 */
public class CreateAuthorizationRulesResponseBody extends TeaModel {
    @NameInMap("AuthorizationRuleIds")
    private java.util.List < String > authorizationRuleIds;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAuthorizationRulesResponseBody(Builder builder) {
        this.authorizationRuleIds = builder.authorizationRuleIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorizationRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizationRuleIds
     */
    public java.util.List < String > getAuthorizationRuleIds() {
        return this.authorizationRuleIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > authorizationRuleIds; 
        private String requestId; 

        /**
         * AuthorizationRuleIds.
         */
        public Builder authorizationRuleIds(java.util.List < String > authorizationRuleIds) {
            this.authorizationRuleIds = authorizationRuleIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAuthorizationRulesResponseBody build() {
            return new CreateAuthorizationRulesResponseBody(this);
        } 

    } 

}
