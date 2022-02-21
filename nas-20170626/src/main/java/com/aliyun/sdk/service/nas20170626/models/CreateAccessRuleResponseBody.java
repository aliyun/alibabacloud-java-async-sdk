// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessRuleResponseBody</p>
 */
public class CreateAccessRuleResponseBody extends TeaModel {
    @NameInMap("AccessRuleId")
    private String accessRuleId;

    @NameInMap("RequestId")
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
         * AccessRuleId.
         */
        public Builder accessRuleId(String accessRuleId) {
            this.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * RequestId.
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
