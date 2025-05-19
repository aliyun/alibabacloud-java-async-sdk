// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateResourceRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceRuleResponseBody</p>
 */
public class CreateResourceRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceRuleId")
    private String resourceRuleId;

    private CreateResourceRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceRuleId = builder.resourceRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceRuleResponseBody create() {
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
     * @return resourceRuleId
     */
    public String getResourceRuleId() {
        return this.resourceRuleId;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceRuleId; 

        private Builder() {
        } 

        private Builder(CreateResourceRuleResponseBody model) {
            this.requestId = model.requestId;
            this.resourceRuleId = model.resourceRuleId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceRuleId.
         */
        public Builder resourceRuleId(String resourceRuleId) {
            this.resourceRuleId = resourceRuleId;
            return this;
        }

        public CreateResourceRuleResponseBody build() {
            return new CreateResourceRuleResponseBody(this);
        } 

    } 

}
