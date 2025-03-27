// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
    @Deprecated
    private String DIAlarmRuleId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDIAlarmRuleResponseBody(Builder builder) {
        this.DIAlarmRuleId = builder.DIAlarmRuleId;
        this.id = builder.id;
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
    public String getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DIAlarmRuleId; 
        private Long id; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDIAlarmRuleResponseBody model) {
            this.DIAlarmRuleId = model.DIAlarmRuleId;
            this.id = model.id;
            this.requestId = model.requestId;
        } 

        /**
         * <p>This parameter is deprecated and is replaced by the Id parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder DIAlarmRuleId(String DIAlarmRuleId) {
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
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
