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
 * {@link CreateResourceRuleItemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceRuleItemResponseBody</p>
 */
public class CreateResourceRuleItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceRuleItemId")
    private String resourceRuleItemId;

    private CreateResourceRuleItemResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceRuleItemId = builder.resourceRuleItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceRuleItemResponseBody create() {
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
     * @return resourceRuleItemId
     */
    public String getResourceRuleItemId() {
        return this.resourceRuleItemId;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceRuleItemId; 

        private Builder() {
        } 

        private Builder(CreateResourceRuleItemResponseBody model) {
            this.requestId = model.requestId;
            this.resourceRuleItemId = model.resourceRuleItemId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceRuleItemId.
         */
        public Builder resourceRuleItemId(String resourceRuleItemId) {
            this.resourceRuleItemId = resourceRuleItemId;
            return this;
        }

        public CreateResourceRuleItemResponseBody build() {
            return new CreateResourceRuleItemResponseBody(this);
        } 

    } 

}
