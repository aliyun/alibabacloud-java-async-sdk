// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDIAlarmRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDIAlarmRuleResponseBody</p>
 */
public class CreateDIAlarmRuleResponseBody extends TeaModel {
    @NameInMap("DIAlarmRuleId")
    private Long DIAlarmRuleId;

    @NameInMap("RequestId")
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
         * DIAlarmRuleId.
         */
        public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        /**
         * RequestId.
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
