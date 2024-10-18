// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDIAlarmRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDIAlarmRuleResponseBody</p>
 */
public class CreateDIAlarmRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DIAlarmRuleId")
    private String DIAlarmRuleId;

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
    public String getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DIAlarmRuleId; 
        private String requestId; 

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder DIAlarmRuleId(String DIAlarmRuleId) {
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
