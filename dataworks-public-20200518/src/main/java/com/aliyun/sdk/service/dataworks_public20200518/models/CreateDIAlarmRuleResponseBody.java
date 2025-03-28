// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDIAlarmRuleResponseBody model) {
            this.DIAlarmRuleId = model.DIAlarmRuleId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The alert rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34988</p>
         */
        public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C636A747-7E4E-594D-94CD-2B4F8A9A9A63</p>
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
