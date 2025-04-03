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
 * {@link StartAggregateConfigRuleEvaluationResponseBody} extends {@link TeaModel}
 *
 * <p>StartAggregateConfigRuleEvaluationResponseBody</p>
 */
public class StartAggregateConfigRuleEvaluationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private StartAggregateConfigRuleEvaluationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAggregateConfigRuleEvaluationResponseBody create() {
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
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        private Builder() {
        } 

        private Builder(StartAggregateConfigRuleEvaluationResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABC0FFF8-0B44-40C6-8BBF-3A185EFDD212</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the involved resources were evaluated. Valid values:</p>
         * <ul>
         * <li>true: The involved resources were evaluated.</li>
         * <li>false: The involved resources were not evaluated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public StartAggregateConfigRuleEvaluationResponseBody build() {
            return new StartAggregateConfigRuleEvaluationResponseBody(this);
        } 

    } 

}
