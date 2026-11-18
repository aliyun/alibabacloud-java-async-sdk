// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link CreateWarmPoolInput} extends {@link TeaModel}
 *
 * <p>CreateWarmPoolInput</p>
 */
public class CreateWarmPoolInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("capacityPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private WarmPoolCapacityPolicyInput capacityPolicy;

    @com.aliyun.core.annotation.NameInMap("templateID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateID;

    private CreateWarmPoolInput(Builder builder) {
        this.capacityPolicy = builder.capacityPolicy;
        this.templateID = builder.templateID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWarmPoolInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacityPolicy
     */
    public WarmPoolCapacityPolicyInput getCapacityPolicy() {
        return this.capacityPolicy;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    public static final class Builder {
        private WarmPoolCapacityPolicyInput capacityPolicy; 
        private String templateID; 

        private Builder() {
        } 

        private Builder(CreateWarmPoolInput model) {
            this.capacityPolicy = model.capacityPolicy;
            this.templateID = model.templateID;
        } 

        /**
         * <p>The warm pool capacity policy, which includes the base target capacity and optional scheduled rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder capacityPolicy(WarmPoolCapacityPolicyInput capacityPolicy) {
            this.capacityPolicy = capacityPolicy;
            return this;
        }

        /**
         * <p>The template ID, which specifies the template associated with the warm pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-example1234567890</p>
         */
        public Builder templateID(String templateID) {
            this.templateID = templateID;
            return this;
        }

        public CreateWarmPoolInput build() {
            return new CreateWarmPoolInput(this);
        } 

    } 

}
