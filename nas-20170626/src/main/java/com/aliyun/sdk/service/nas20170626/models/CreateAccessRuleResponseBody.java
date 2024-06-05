// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessRuleResponseBody</p>
 */
public class CreateAccessRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessRuleId")
    private String accessRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAccessRuleResponseBody(Builder builder) {
        this.accessRuleId = builder.accessRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessRuleId
     */
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessRuleId; 
        private String requestId; 

        /**
         * The rule ID.
         */
        public Builder accessRuleId(String accessRuleId) {
            this.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessRuleResponseBody build() {
            return new CreateAccessRuleResponseBody(this);
        } 

    } 

}
