// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumNodeConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEthereumNodeConfigurationResponseBody</p>
 */
public class DescribeEthereumNodeConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEthereumNodeConfigurationResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEthereumNodeConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
        public Builder result(java.util.List < Result> result) {
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

        public DescribeEthereumNodeConfigurationResponseBody build() {
            return new DescribeEthereumNodeConfigurationResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GenesisJson")
        private String genesisJson;

        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NodePub")
        private String nodePub;

        @com.aliyun.core.annotation.NameInMap("P2pPort")
        private Integer p2pPort;

        @com.aliyun.core.annotation.NameInMap("PermissionedNodesJson")
        private String permissionedNodesJson;

        @com.aliyun.core.annotation.NameInMap("RaftPort")
        private Integer raftPort;

        @com.aliyun.core.annotation.NameInMap("RpcPort")
        private Integer rpcPort;

        @com.aliyun.core.annotation.NameInMap("StaticNodesJson")
        private String staticNodesJson;

        @com.aliyun.core.annotation.NameInMap("TMJson")
        private String TMJson;

        @com.aliyun.core.annotation.NameInMap("TMPort")
        private Integer TMPort;

        @com.aliyun.core.annotation.NameInMap("TMPub")
        private String TMPub;

        @com.aliyun.core.annotation.NameInMap("WSPort")
        private Integer WSPort;

        private Result(Builder builder) {
            this.genesisJson = builder.genesisJson;
            this.ip = builder.ip;
            this.nodePub = builder.nodePub;
            this.p2pPort = builder.p2pPort;
            this.permissionedNodesJson = builder.permissionedNodesJson;
            this.raftPort = builder.raftPort;
            this.rpcPort = builder.rpcPort;
            this.staticNodesJson = builder.staticNodesJson;
            this.TMJson = builder.TMJson;
            this.TMPort = builder.TMPort;
            this.TMPub = builder.TMPub;
            this.WSPort = builder.WSPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return genesisJson
         */
        public String getGenesisJson() {
            return this.genesisJson;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return nodePub
         */
        public String getNodePub() {
            return this.nodePub;
        }

        /**
         * @return p2pPort
         */
        public Integer getP2pPort() {
            return this.p2pPort;
        }

        /**
         * @return permissionedNodesJson
         */
        public String getPermissionedNodesJson() {
            return this.permissionedNodesJson;
        }

        /**
         * @return raftPort
         */
        public Integer getRaftPort() {
            return this.raftPort;
        }

        /**
         * @return rpcPort
         */
        public Integer getRpcPort() {
            return this.rpcPort;
        }

        /**
         * @return staticNodesJson
         */
        public String getStaticNodesJson() {
            return this.staticNodesJson;
        }

        /**
         * @return TMJson
         */
        public String getTMJson() {
            return this.TMJson;
        }

        /**
         * @return TMPort
         */
        public Integer getTMPort() {
            return this.TMPort;
        }

        /**
         * @return TMPub
         */
        public String getTMPub() {
            return this.TMPub;
        }

        /**
         * @return WSPort
         */
        public Integer getWSPort() {
            return this.WSPort;
        }

        public static final class Builder {
            private String genesisJson; 
            private String ip; 
            private String nodePub; 
            private Integer p2pPort; 
            private String permissionedNodesJson; 
            private Integer raftPort; 
            private Integer rpcPort; 
            private String staticNodesJson; 
            private String TMJson; 
            private Integer TMPort; 
            private String TMPub; 
            private Integer WSPort; 

            /**
             * GenesisJson.
             */
            public Builder genesisJson(String genesisJson) {
                this.genesisJson = genesisJson;
                return this;
            }

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * NodePub.
             */
            public Builder nodePub(String nodePub) {
                this.nodePub = nodePub;
                return this;
            }

            /**
             * P2pPort.
             */
            public Builder p2pPort(Integer p2pPort) {
                this.p2pPort = p2pPort;
                return this;
            }

            /**
             * PermissionedNodesJson.
             */
            public Builder permissionedNodesJson(String permissionedNodesJson) {
                this.permissionedNodesJson = permissionedNodesJson;
                return this;
            }

            /**
             * RaftPort.
             */
            public Builder raftPort(Integer raftPort) {
                this.raftPort = raftPort;
                return this;
            }

            /**
             * RpcPort.
             */
            public Builder rpcPort(Integer rpcPort) {
                this.rpcPort = rpcPort;
                return this;
            }

            /**
             * StaticNodesJson.
             */
            public Builder staticNodesJson(String staticNodesJson) {
                this.staticNodesJson = staticNodesJson;
                return this;
            }

            /**
             * TMJson.
             */
            public Builder TMJson(String TMJson) {
                this.TMJson = TMJson;
                return this;
            }

            /**
             * TMPort.
             */
            public Builder TMPort(Integer TMPort) {
                this.TMPort = TMPort;
                return this;
            }

            /**
             * TMPub.
             */
            public Builder TMPub(String TMPub) {
                this.TMPub = TMPub;
                return this;
            }

            /**
             * WSPort.
             */
            public Builder WSPort(Integer WSPort) {
                this.WSPort = WSPort;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
