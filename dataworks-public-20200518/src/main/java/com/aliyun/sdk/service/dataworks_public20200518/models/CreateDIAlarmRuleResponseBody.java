// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDIAlarmRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDIAlarmRuleResponseBody</p>
 */
public class CreateDIAlarmRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DIAlarmRuleId")
    private Long DIAlarmRuleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDIAlarmRuleResponseBody(Builder builder) {
        this.DIAlarmRuleId = builder.DIAlarmRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDIAlarmRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return DIAlarmRuleId
     */
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long DIAlarmRuleId; 
        private String requestId; 

        /**
         * The alert rule ID.
         */
        public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDIAlarmRuleResponseBody build() {
            return new CreateDIAlarmRuleResponseBody(this);
        } 

    } 

}
