// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateAuthorizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAuthorizationRuleResponseBody</p>
 */
public class CreateAuthorizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationRuleId")
    private String authorizationRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAuthorizationRuleResponseBody(Builder builder) {
        this.authorizationRuleId = builder.authorizationRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthorizationRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateAuthorizationRuleResponseBody model) {
            this.authorizationRuleId = model.authorizationRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The authorization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>arrule_01kf143ug06fg7m9f43u7vahxxxx</p>
         */
        public Builder authorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAuthorizationRuleResponseBody build() {
            return new CreateAuthorizationRuleResponseBody(this);
        } 

    } 

}
