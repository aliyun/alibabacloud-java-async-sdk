// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentDevicesResponseBody</p>
 */
public class ListAgentDevicesResponseBody extends TeaModel {
    @NameInMap("AgentDeviceList")
    private AgentDeviceList agentDeviceList;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListAgentDevicesResponseBody(Builder builder) {
        this.agentDeviceList = builder.agentDeviceList;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return agentDeviceList
     */
    public AgentDeviceList getAgentDeviceList() {
        return this.agentDeviceList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private AgentDeviceList agentDeviceList; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AgentDeviceList.
         */
        public Builder agentDeviceList(AgentDeviceList agentDeviceList) {
            this.agentDeviceList = agentDeviceList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public ListAgentDevicesResponseBody build() {
            return new ListAgentDevicesResponseBody(this);
        } 

    } 

    public static class AgentDevice extends TeaModel {
        @NameInMap("BrowserVersion")
        private String browserVersion;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("ClientPort")
        private String clientPort;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IsLogin")
        private Integer isLogin;

        @NameInMap("LoginTime")
        private Long loginTime;

        @NameInMap("RamId")
        private Long ramId;

        @NameInMap("Remark")
        private String remark;

        private AgentDevice(Builder builder) {
            this.browserVersion = builder.browserVersion;
            this.clientIp = builder.clientIp;
            this.clientPort = builder.clientPort;
            this.instanceId = builder.instanceId;
            this.isLogin = builder.isLogin;
            this.loginTime = builder.loginTime;
            this.ramId = builder.ramId;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentDevice create() {
            return builder().build();
        }

        /**
         * @return browserVersion
         */
        public String getBrowserVersion() {
            return this.browserVersion;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return clientPort
         */
        public String getClientPort() {
            return this.clientPort;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isLogin
         */
        public Integer getIsLogin() {
            return this.isLogin;
        }

        /**
         * @return loginTime
         */
        public Long getLoginTime() {
            return this.loginTime;
        }

        /**
         * @return ramId
         */
        public Long getRamId() {
            return this.ramId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String browserVersion; 
            private String clientIp; 
            private String clientPort; 
            private String instanceId; 
            private Integer isLogin; 
            private Long loginTime; 
            private Long ramId; 
            private String remark; 

            /**
             * BrowserVersion.
             */
            public Builder browserVersion(String browserVersion) {
                this.browserVersion = browserVersion;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * ClientPort.
             */
            public Builder clientPort(String clientPort) {
                this.clientPort = clientPort;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsLogin.
             */
            public Builder isLogin(Integer isLogin) {
                this.isLogin = isLogin;
                return this;
            }

            /**
             * LoginTime.
             */
            public Builder loginTime(Long loginTime) {
                this.loginTime = loginTime;
                return this;
            }

            /**
             * RamId.
             */
            public Builder ramId(Long ramId) {
                this.ramId = ramId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public AgentDevice build() {
                return new AgentDevice(this);
            } 

        } 

    }
    public static class AgentDeviceList extends TeaModel {
        @NameInMap("AgentDevice")
        private java.util.List < AgentDevice> agentDevice;

        private AgentDeviceList(Builder builder) {
            this.agentDevice = builder.agentDevice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentDeviceList create() {
            return builder().build();
        }

        /**
         * @return agentDevice
         */
        public java.util.List < AgentDevice> getAgentDevice() {
            return this.agentDevice;
        }

        public static final class Builder {
            private java.util.List < AgentDevice> agentDevice; 

            /**
             * AgentDevice.
             */
            public Builder agentDevice(java.util.List < AgentDevice> agentDevice) {
                this.agentDevice = agentDevice;
                return this;
            }

            public AgentDeviceList build() {
                return new AgentDeviceList(this);
            } 

        } 

    }
}
