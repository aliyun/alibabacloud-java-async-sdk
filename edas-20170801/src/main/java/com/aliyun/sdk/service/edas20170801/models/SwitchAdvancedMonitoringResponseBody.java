// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link SwitchAdvancedMonitoringResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchAdvancedMonitoringResponseBody</p>
 */
public class SwitchAdvancedMonitoringResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdvancedMonitoringEnabled")
    private Boolean advancedMonitoringEnabled;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SwitchAdvancedMonitoringResponseBody(Builder builder) {
        this.advancedMonitoringEnabled = builder.advancedMonitoringEnabled;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchAdvancedMonitoringResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedMonitoringEnabled
     */
    public Boolean getAdvancedMonitoringEnabled() {
        return this.advancedMonitoringEnabled;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean advancedMonitoringEnabled; 
        private Integer code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SwitchAdvancedMonitoringResponseBody model) {
            this.advancedMonitoringEnabled = model.advancedMonitoringEnabled;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the advanced application monitoring feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: The advanced application monitoring feature is enabled.</li>
         * <li>false: The advanced application monitoring feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder advancedMonitoringEnabled(Boolean advancedMonitoringEnabled) {
            this.advancedMonitoringEnabled = advancedMonitoringEnabled;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The advanced monitoring status is disabled already for application which app_id is 9e224bc6-a646-4484-ae31-e617b7e7****</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>577AED12-32D8-40B6-991F-17D7A601****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SwitchAdvancedMonitoringResponseBody build() {
            return new SwitchAdvancedMonitoringResponseBody(this);
        } 

    } 

}
