// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEventCenterRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEventCenterRuleResponseBody</p>
 */
public class UpdateEventCenterRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleId")
    private String ruleId;

    private UpdateEventCenterRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventCenterRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder {
        private Integer code; 
        private String requestId; 
        private String ruleId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public UpdateEventCenterRuleResponseBody build() {
            return new UpdateEventCenterRuleResponseBody(this);
        } 

    } 

}
