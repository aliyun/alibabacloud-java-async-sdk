// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEthereumNodesResponseBody</p>
 */
public class DescribeEthereumNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEthereumNodesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEthereumNodesResponseBody create() {
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

        public DescribeEthereumNodesResponseBody build() {
            return new DescribeEthereumNodesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Consensus")
        private String consensus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EthereumId")
        private String ethereumId;

        @com.aliyun.core.annotation.NameInMap("EthereumName")
        private String ethereumName;

        @com.aliyun.core.annotation.NameInMap("External")
        private Boolean external;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("NetworkId")
        private Long networkId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("PublicIp")
        private String publicIp;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RpcPort")
        private String rpcPort;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Validator")
        private Boolean validator;

        @com.aliyun.core.annotation.NameInMap("WsPort")
        private String wsPort;

        private Result(Builder builder) {
            this.consensus = builder.consensus;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.ethereumId = builder.ethereumId;
            this.ethereumName = builder.ethereumName;
            this.external = builder.external;
            this.id = builder.id;
            this.networkId = builder.networkId;
            this.nodeName = builder.nodeName;
            this.publicIp = builder.publicIp;
            this.regionId = builder.regionId;
            this.rpcPort = builder.rpcPort;
            this.state = builder.state;
            this.validator = builder.validator;
            this.wsPort = builder.wsPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return consensus
         */
        public String getConsensus() {
            return this.consensus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ethereumId
         */
        public String getEthereumId() {
            return this.ethereumId;
        }

        /**
         * @return ethereumName
         */
        public String getEthereumName() {
            return this.ethereumName;
        }

        /**
         * @return external
         */
        public Boolean getExternal() {
            return this.external;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return networkId
         */
        public Long getNetworkId() {
            return this.networkId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return publicIp
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return rpcPort
         */
        public String getRpcPort() {
            return this.rpcPort;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return validator
         */
        public Boolean getValidator() {
            return this.validator;
        }

        /**
         * @return wsPort
         */
        public String getWsPort() {
            return this.wsPort;
        }

        public static final class Builder {
            private String consensus; 
            private String createTime; 
            private String creator; 
            private String description; 
            private String ethereumId; 
            private String ethereumName; 
            private Boolean external; 
            private String id; 
            private Long networkId; 
            private String nodeName; 
            private String publicIp; 
            private String regionId; 
            private String rpcPort; 
            private String state; 
            private Boolean validator; 
            private String wsPort; 

            /**
             * Consensus.
             */
            public Builder consensus(String consensus) {
                this.consensus = consensus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EthereumId.
             */
            public Builder ethereumId(String ethereumId) {
                this.ethereumId = ethereumId;
                return this;
            }

            /**
             * EthereumName.
             */
            public Builder ethereumName(String ethereumName) {
                this.ethereumName = ethereumName;
                return this;
            }

            /**
             * External.
             */
            public Builder external(Boolean external) {
                this.external = external;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * NetworkId.
             */
            public Builder networkId(Long networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * PublicIp.
             */
            public Builder publicIp(String publicIp) {
                this.publicIp = publicIp;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RpcPort.
             */
            public Builder rpcPort(String rpcPort) {
                this.rpcPort = rpcPort;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Validator.
             */
            public Builder validator(Boolean validator) {
                this.validator = validator;
                return this;
            }

            /**
             * WsPort.
             */
            public Builder wsPort(String wsPort) {
                this.wsPort = wsPort;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
