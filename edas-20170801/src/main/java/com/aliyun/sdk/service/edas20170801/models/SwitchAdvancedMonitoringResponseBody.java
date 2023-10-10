// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchAdvancedMonitoringResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchAdvancedMonitoringResponseBody</p>
 */
public class SwitchAdvancedMonitoringResponseBody extends TeaModel {
    @NameInMap("AdvancedMonitoringEnabled")
    private Boolean advancedMonitoringEnabled;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

        /**
         * Indicates whether the advanced application monitoring feature is enabled. Valid values:
         * <p>
         * 
         * *   true: The advanced application monitoring feature is enabled.
         * *   false: The advanced application monitoring feature is disabled.
         */
        public Builder advancedMonitoringEnabled(Boolean advancedMonitoringEnabled) {
            this.advancedMonitoringEnabled = advancedMonitoringEnabled;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
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
