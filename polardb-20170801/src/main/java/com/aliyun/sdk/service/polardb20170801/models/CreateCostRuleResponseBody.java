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
 * {@link CreateCostRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCostRuleResponseBody</p>
 */
public class CreateCostRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostRuleId")
    private String costRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCostRuleResponseBody(Builder builder) {
        this.costRuleId = builder.costRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCostRuleResponseBody create() {
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

        private Builder(CreateCostRuleResponseBody model) {
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
         * <p>580EF224-9647-59E7-9950-D9EBFD6A2921</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCostRuleResponseBody build() {
            return new CreateCostRuleResponseBody(this);
        } 

    } 

}
