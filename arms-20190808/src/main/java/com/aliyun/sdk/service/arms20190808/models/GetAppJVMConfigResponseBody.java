// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppJVMConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppJVMConfigResponseBody</p>
 */
public class GetAppJVMConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("JvmInfoList")
    private java.util.List < JvmInfoList> jvmInfoList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAppJVMConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.jvmInfoList = builder.jvmInfoList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppJVMConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return jvmInfoList
     */
    public java.util.List < JvmInfoList> getJvmInfoList() {
        return this.jvmInfoList;
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
        private Integer code; 
        private java.util.List < JvmInfoList> jvmInfoList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Java VM info list.
         */
        public Builder jvmInfoList(java.util.List < JvmInfoList> jvmInfoList) {
            this.jvmInfoList = jvmInfoList;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAppJVMConfigResponseBody build() {
            return new GetAppJVMConfigResponseBody(this);
        } 

    } 

    public static class JvmInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("ProcId")
        private String procId;

        @com.aliyun.core.annotation.NameInMap("VmArgs")
        private String vmArgs;

        private JvmInfoList(Builder builder) {
            this.agentVersion = builder.agentVersion;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.pid = builder.pid;
            this.procId = builder.procId;
            this.vmArgs = builder.vmArgs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JvmInfoList create() {
            return builder().build();
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return procId
         */
        public String getProcId() {
            return this.procId;
        }

        /**
         * @return vmArgs
         */
        public String getVmArgs() {
            return this.vmArgs;
        }

        public static final class Builder {
            private String agentVersion; 
            private String hostName; 
            private String ip; 
            private String pid; 
            private String procId; 
            private String vmArgs; 

            /**
             * Agent version.
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * The name of the elastic container instance.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * Ip address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The PID.
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Process Id.
             */
            public Builder procId(String procId) {
                this.procId = procId;
                return this;
            }

            /**
             * Java VM config.
             */
            public Builder vmArgs(String vmArgs) {
                this.vmArgs = vmArgs;
                return this;
            }

            public JvmInfoList build() {
                return new JvmInfoList(this);
            } 

        } 

    }
}
