// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link CreateAggregateConfigRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAggregateConfigRuleResponseBody</p>
 */
public class CreateAggregateConfigRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    private String configRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAggregateConfigRuleResponseBody(Builder builder) {
        this.configRuleId = builder.configRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAggregateConfigRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configRuleId; 
        private String requestId; 

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-4e3d626622af0080****</p>
         */
        public Builder configRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5895065A-196C-4254-8AD8-14EFC31EEF50</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAggregateConfigRuleResponseBody build() {
            return new CreateAggregateConfigRuleResponseBody(this);
        } 

    } 

}
