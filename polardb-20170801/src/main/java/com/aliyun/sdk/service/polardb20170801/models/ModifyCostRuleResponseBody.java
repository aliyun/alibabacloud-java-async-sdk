// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyCostRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCostRuleResponseBody</p>
 */
public class ModifyCostRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostRuleId")
    private String costRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyCostRuleResponseBody(Builder builder) {
        this.costRuleId = builder.costRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCostRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costRuleId
     */
    public String getCostRuleId() {
        return this.costRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String costRuleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyCostRuleResponseBody model) {
            this.costRuleId = model.costRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * CostRuleId.
         */
        public Builder costRuleId(String costRuleId) {
            this.costRuleId = costRuleId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCostRuleResponseBody build() {
            return new ModifyCostRuleResponseBody(this);
        } 

    } 

}
