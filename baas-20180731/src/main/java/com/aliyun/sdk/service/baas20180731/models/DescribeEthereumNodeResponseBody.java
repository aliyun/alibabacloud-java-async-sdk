// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumNodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEthereumNodeResponseBody</p>
 */
public class DescribeEthereumNodeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeEthereumNodeResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEthereumNodeResponseBody create() {
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
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
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

        public DescribeEthereumNodeResponseBody build() {
            return new DescribeEthereumNodeResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("Description")
        private String description;

        @NameInMap("EthereumId")
        private String ethereumId;

        @NameInMap("EthereumName")
        private String ethereumName;

        @NameInMap("Id")
        private String id;

        @NameInMap("NetworkId")
        private String networkId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("PublicIp")
        private String publicIp;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RpcPort")
        private Integer rpcPort;

        @NameInMap("State")
        private String state;

        @NameInMap("WsPort")
        private Integer wsPort;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.ethereumId = builder.ethereumId;
            this.ethereumName = builder.ethereumName;
            this.id = builder.id;
            this.networkId = builder.networkId;
            this.nodeName = builder.nodeName;
            this.publicIp = builder.publicIp;
            this.regionId = builder.regionId;
            this.rpcPort = builder.rpcPort;
            this.state = builder.state;
            this.wsPort = builder.wsPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
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
        public Integer getRpcPort() {
            return this.rpcPort;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return wsPort
         */
        public Integer getWsPort() {
            return this.wsPort;
        }

        public static final class Builder {
            private Long createTime; 
            private String creator; 
            private String description; 
            private String ethereumId; 
            private String ethereumName; 
            private String id; 
            private String networkId; 
            private String nodeName; 
            private String publicIp; 
            private String regionId; 
            private Integer rpcPort; 
            private String state; 
            private Integer wsPort; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * NetworkId.
             */
            public Builder networkId(String networkId) {
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
            public Builder rpcPort(Integer rpcPort) {
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
             * WsPort.
             */
            public Builder wsPort(Integer wsPort) {
                this.wsPort = wsPort;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
