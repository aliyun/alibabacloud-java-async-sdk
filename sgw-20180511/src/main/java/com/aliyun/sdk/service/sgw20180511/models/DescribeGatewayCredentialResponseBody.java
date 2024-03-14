// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayCredentialResponseBody</p>
 */
public class DescribeGatewayCredentialResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ConsolePassword")
    private String consolePassword;

    @NameInMap("ConsoleUsername")
    private String consoleUsername;

    @NameInMap("EcsIp")
    private String ecsIp;

    @NameInMap("EcsPassword")
    private String ecsPassword;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
    private String vpcId;

    private DescribeGatewayCredentialResponseBody(Builder builder) {
        this.code = builder.code;
        this.consolePassword = builder.consolePassword;
        this.consoleUsername = builder.consoleUsername;
        this.ecsIp = builder.ecsIp;
        this.ecsPassword = builder.ecsPassword;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayCredentialResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return consolePassword
     */
    public String getConsolePassword() {
        return this.consolePassword;
    }

    /**
     * @return consoleUsername
     */
    public String getConsoleUsername() {
        return this.consoleUsername;
    }

    /**
     * @return ecsIp
     */
    public String getEcsIp() {
        return this.ecsIp;
    }

    /**
     * @return ecsPassword
     */
    public String getEcsPassword() {
        return this.ecsPassword;
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

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String code; 
        private String consolePassword; 
        private String consoleUsername; 
        private String ecsIp; 
        private String ecsPassword; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String vSwitchId; 
        private String vpcId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ConsolePassword.
         */
        public Builder consolePassword(String consolePassword) {
            this.consolePassword = consolePassword;
            return this;
        }

        /**
         * ConsoleUsername.
         */
        public Builder consoleUsername(String consoleUsername) {
            this.consoleUsername = consoleUsername;
            return this;
        }

        /**
         * EcsIp.
         */
        public Builder ecsIp(String ecsIp) {
            this.ecsIp = ecsIp;
            return this;
        }

        /**
         * EcsPassword.
         */
        public Builder ecsPassword(String ecsPassword) {
            this.ecsPassword = ecsPassword;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeGatewayCredentialResponseBody build() {
            return new DescribeGatewayCredentialResponseBody(this);
        } 

    } 

}
