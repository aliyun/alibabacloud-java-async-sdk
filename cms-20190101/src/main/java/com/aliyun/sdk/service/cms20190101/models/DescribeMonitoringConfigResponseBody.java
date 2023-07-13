// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringConfigResponseBody</p>
 */
public class DescribeMonitoringConfigResponseBody extends TeaModel {
    @NameInMap("AutoInstall")
    private Boolean autoInstall;

    @NameInMap("Code")
    private String code;

    @NameInMap("EnableInstallAgentNewECS")
    private Boolean enableInstallAgentNewECS;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeMonitoringConfigResponseBody(Builder builder) {
        this.autoInstall = builder.autoInstall;
        this.code = builder.code;
        this.enableInstallAgentNewECS = builder.enableInstallAgentNewECS;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoInstall
     */
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return enableInstallAgentNewECS
     */
    public Boolean getEnableInstallAgentNewECS() {
        return this.enableInstallAgentNewECS;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean autoInstall; 
        private String code; 
        private Boolean enableInstallAgentNewECS; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates whether the Cloud Monitor agent is automatically installed on existing ECS instances. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder autoInstall(Boolean autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the Cloud Monitor agent is automatically installed on new Elastic Compute Service (ECS) instances. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder enableInstallAgentNewECS(Boolean enableInstallAgentNewECS) {
            this.enableInstallAgentNewECS = enableInstallAgentNewECS;
            return this;
        }

        /**
         * The error message.
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

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitoringConfigResponseBody build() {
            return new DescribeMonitoringConfigResponseBody(this);
        } 

    } 

}
