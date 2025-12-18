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
 * {@link StartConfigRuleEvaluationByResourceResponseBody} extends {@link TeaModel}
 *
 * <p>StartConfigRuleEvaluationByResourceResponseBody</p>
 */
public class StartConfigRuleEvaluationByResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    private String configRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartConfigRuleEvaluationByResourceResponseBody(Builder builder) {
        this.configRuleId = builder.configRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartConfigRuleEvaluationByResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StartConfigRuleEvaluationByResourceResponseBody model) {
            this.configRuleId = model.configRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * ConfigRuleId.
         */
        public Builder configRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartConfigRuleEvaluationByResourceResponseBody build() {
            return new StartConfigRuleEvaluationByResourceResponseBody(this);
        } 

    } 

}
