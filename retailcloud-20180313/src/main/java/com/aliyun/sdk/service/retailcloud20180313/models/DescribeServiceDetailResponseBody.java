// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceDetailResponseBody</p>
 */
public class DescribeServiceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeServiceDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeServiceDetailResponseBody build() {
            return new DescribeServiceDetailResponseBody(this);
        } 

    } 

    public static class PortMappings extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("NodePort")
        private Integer nodePort;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("TargetPort")
        private String targetPort;

        private PortMappings(Builder builder) {
            this.name = builder.name;
            this.nodePort = builder.nodePort;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.targetPort = builder.targetPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortMappings create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodePort
         */
        public Integer getNodePort() {
            return this.nodePort;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return targetPort
         */
        public String getTargetPort() {
            return this.targetPort;
        }

        public static final class Builder {
            private String name; 
            private Integer nodePort; 
            private Integer port; 
            private String protocol; 
            private String targetPort; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodePort.
             */
            public Builder nodePort(Integer nodePort) {
                this.nodePort = nodePort;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * TargetPort.
             */
            public Builder targetPort(String targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            public PortMappings build() {
                return new PortMappings(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("ClusterIP")
        private String clusterIP;

        @NameInMap("EnvId")
        private Long envId;

        @NameInMap("Headless")
        private Boolean headless;

        @NameInMap("K8sServiceId")
        private String k8sServiceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("PortMappings")
        private java.util.List < PortMappings> portMappings;

        @NameInMap("ServiceId")
        private Long serviceId;

        @NameInMap("ServiceType")
        private String serviceType;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.clusterIP = builder.clusterIP;
            this.envId = builder.envId;
            this.headless = builder.headless;
            this.k8sServiceId = builder.k8sServiceId;
            this.name = builder.name;
            this.portMappings = builder.portMappings;
            this.serviceId = builder.serviceId;
            this.serviceType = builder.serviceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return clusterIP
         */
        public String getClusterIP() {
            return this.clusterIP;
        }

        /**
         * @return envId
         */
        public Long getEnvId() {
            return this.envId;
        }

        /**
         * @return headless
         */
        public Boolean getHeadless() {
            return this.headless;
        }

        /**
         * @return k8sServiceId
         */
        public String getK8sServiceId() {
            return this.k8sServiceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return portMappings
         */
        public java.util.List < PortMappings> getPortMappings() {
            return this.portMappings;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        public static final class Builder {
            private Long appId; 
            private String clusterIP; 
            private Long envId; 
            private Boolean headless; 
            private String k8sServiceId; 
            private String name; 
            private java.util.List < PortMappings> portMappings; 
            private Long serviceId; 
            private String serviceType; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ClusterIP.
             */
            public Builder clusterIP(String clusterIP) {
                this.clusterIP = clusterIP;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(Long envId) {
                this.envId = envId;
                return this;
            }

            /**
             * Headless.
             */
            public Builder headless(Boolean headless) {
                this.headless = headless;
                return this;
            }

            /**
             * K8sServiceId.
             */
            public Builder k8sServiceId(String k8sServiceId) {
                this.k8sServiceId = k8sServiceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PortMappings.
             */
            public Builder portMappings(java.util.List < PortMappings> portMappings) {
                this.portMappings = portMappings;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
