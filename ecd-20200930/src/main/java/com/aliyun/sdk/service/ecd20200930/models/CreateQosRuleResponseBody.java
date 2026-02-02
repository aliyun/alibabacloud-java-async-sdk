// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateQosRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQosRuleResponseBody</p>
 */
public class CreateQosRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QosRuleId")
    private String qosRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateQosRuleResponseBody(Builder builder) {
        this.qosRuleId = builder.qosRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQosRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return qosRuleId
     */
    public String getQosRuleId() {
        return this.qosRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String qosRuleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateQosRuleResponseBody model) {
            this.qosRuleId = model.qosRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * QosRuleId.
         */
        public Builder qosRuleId(String qosRuleId) {
            this.qosRuleId = qosRuleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateQosRuleResponseBody build() {
            return new CreateQosRuleResponseBody(this);
        } 

    } 

}
