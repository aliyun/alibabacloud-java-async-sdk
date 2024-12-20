// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetAppJVMConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppJVMConfigResponseBody</p>
 */
public class GetAppJVMConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("JvmInfoList")
    private java.util.List<JvmInfoList> jvmInfoList;

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
    public java.util.List<JvmInfoList> getJvmInfoList() {
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
        private java.util.List<JvmInfoList> jvmInfoList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code. Valid values: 2XX: The request is successful. 3XX: A redirection message is returned. 4XX: The request is invalid. 5XX: A server error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of JVM information.</p>
         */
        public Builder jvmInfoList(java.util.List<JvmInfoList> jvmInfoList) {
            this.jvmInfoList = jvmInfoList;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAppJVMConfigResponseBody build() {
            return new GetAppJVMConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppJVMConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppJVMConfigResponseBody</p>
     */
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
             * <p>The version of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>1.7.0-SNAPSHOT_3.0.3_3756244</p>
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>host_name</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.91.59.244</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dsv9zcel92@1455182510c5369</p>
             */
            public Builder pid(String pid) {
                this.pid = pid;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder procId(String procId) {
                this.procId = procId;
                return this;
            }

            /**
             * <p>The VM parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>[-javaagent:/home/admin/.opt/ArmsAgent/arms-bootstrap-1.7.0-SNAPSHOT.jar, -Doneagent.plugin.arms-agent.enabled=true, -Darms.licenseKey=[******], -Darms.agent.env=K8s, -Darms.agent.podinfo.path=/etc/podinfo, -Darms.appName=productservice, -Doneagent.region=cn-hangzhou, -Dproject.name=Product]</p>
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
