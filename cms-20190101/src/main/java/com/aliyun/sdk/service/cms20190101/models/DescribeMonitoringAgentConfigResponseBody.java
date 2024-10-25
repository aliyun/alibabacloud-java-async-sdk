// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitoringAgentConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentConfigResponseBody</p>
 */
public class DescribeMonitoringAgentConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoInstall")
    private Boolean autoInstall;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EnableActiveAlert")
    private String enableActiveAlert;

    @com.aliyun.core.annotation.NameInMap("EnableInstallAgentNewECS")
    private Boolean enableInstallAgentNewECS;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMonitoringAgentConfigResponseBody(Builder builder) {
        this.autoInstall = builder.autoInstall;
        this.code = builder.code;
        this.enableActiveAlert = builder.enableActiveAlert;
        this.enableInstallAgentNewECS = builder.enableInstallAgentNewECS;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentConfigResponseBody create() {
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
     * @return enableActiveAlert
     */
    public String getEnableActiveAlert() {
        return this.enableActiveAlert;
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
        private String enableActiveAlert; 
        private Boolean enableInstallAgentNewECS; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>Indicates whether the Cloud Monitor agent is automatically installed on existing Elastic Compute Service (ECS) instances. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoInstall(Boolean autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates a success.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The service for which one-click alert is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>redis,rds,ecs</p>
         */
        public Builder enableActiveAlert(String enableActiveAlert) {
            this.enableActiveAlert = enableActiveAlert;
            return this;
        }

        /**
         * <p>Indicates whether the Cloud Monitor agent is automatically installed on new ECS instances. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInstallAgentNewECS(Boolean enableInstallAgentNewECS) {
            this.enableInstallAgentNewECS = enableInstallAgentNewECS;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E9F4FA2A-54BE-4EF9-9D1D-1A0B1DC86B8D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li>true: successful.</li>
         * <li>false: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMonitoringAgentConfigResponseBody build() {
            return new DescribeMonitoringAgentConfigResponseBody(this);
        } 

    } 

}
