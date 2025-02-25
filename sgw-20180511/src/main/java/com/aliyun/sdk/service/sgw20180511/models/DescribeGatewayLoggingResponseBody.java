// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayLoggingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayLoggingResponseBody</p>
 */
public class DescribeGatewayLoggingResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GatewayLoggingStatus")
    private String gatewayLoggingStatus;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsLogstore")
    private String slsLogstore;

    @NameInMap("SlsProject")
    private String slsProject;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayLoggingResponseBody(Builder builder) {
        this.code = builder.code;
        this.gatewayLoggingStatus = builder.gatewayLoggingStatus;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.slsLogstore = builder.slsLogstore;
        this.slsProject = builder.slsProject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayLoggingResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gatewayLoggingStatus
     */
    public String getGatewayLoggingStatus() {
        return this.gatewayLoggingStatus;
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
     * @return slsLogstore
     */
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String gatewayLoggingStatus; 
        private String message; 
        private String requestId; 
        private String slsLogstore; 
        private String slsProject; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * GatewayLoggingStatus.
         */
        public Builder gatewayLoggingStatus(String gatewayLoggingStatus) {
            this.gatewayLoggingStatus = gatewayLoggingStatus;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsLogstore.
         */
        public Builder slsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }

        /**
         * SlsProject.
         */
        public Builder slsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGatewayLoggingResponseBody build() {
            return new DescribeGatewayLoggingResponseBody(this);
        } 

    } 

}
