// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainSubnetNodeListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainSubnetNodeListResponseBody</p>
 */
public class DescribeAntChainSubnetNodeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAntChainSubnetNodeListResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainSubnetNodeListResponseBody create() {
        return builder().build();
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
    public String getHttpStatusCode() {
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
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 
        private String resultCode; 
        private String resultMessage; 
        private Boolean success; 

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
        public Builder httpStatusCode(String httpStatusCode) {
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAntChainSubnetNodeListResponseBody build() {
            return new DescribeAntChainSubnetNodeListResponseBody(this);
        } 

    } 

    public static class ChainNodeInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskTotal")
        private String diskTotal;

        @com.aliyun.core.annotation.NameInMap("DiskUse")
        private String diskUse;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodePort")
        private String nodePort;

        @com.aliyun.core.annotation.NameInMap("NodeSource")
        private String nodeSource;

        @com.aliyun.core.annotation.NameInMap("NodeState")
        private String nodeState;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("PublicKey")
        private String publicKey;

        private ChainNodeInfoList(Builder builder) {
            this.diskTotal = builder.diskTotal;
            this.diskUse = builder.diskUse;
            this.nodeId = builder.nodeId;
            this.nodeIp = builder.nodeIp;
            this.nodeName = builder.nodeName;
            this.nodePort = builder.nodePort;
            this.nodeSource = builder.nodeSource;
            this.nodeState = builder.nodeState;
            this.nodeType = builder.nodeType;
            this.publicKey = builder.publicKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChainNodeInfoList create() {
            return builder().build();
        }

        /**
         * @return diskTotal
         */
        public String getDiskTotal() {
            return this.diskTotal;
        }

        /**
         * @return diskUse
         */
        public String getDiskUse() {
            return this.diskUse;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodePort
         */
        public String getNodePort() {
            return this.nodePort;
        }

        /**
         * @return nodeSource
         */
        public String getNodeSource() {
            return this.nodeSource;
        }

        /**
         * @return nodeState
         */
        public String getNodeState() {
            return this.nodeState;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        public static final class Builder {
            private String diskTotal; 
            private String diskUse; 
            private String nodeId; 
            private String nodeIp; 
            private String nodeName; 
            private String nodePort; 
            private String nodeSource; 
            private String nodeState; 
            private String nodeType; 
            private String publicKey; 

            /**
             * DiskTotal.
             */
            public Builder diskTotal(String diskTotal) {
                this.diskTotal = diskTotal;
                return this;
            }

            /**
             * DiskUse.
             */
            public Builder diskUse(String diskUse) {
                this.diskUse = diskUse;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeIp.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
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
             * NodePort.
             */
            public Builder nodePort(String nodePort) {
                this.nodePort = nodePort;
                return this;
            }

            /**
             * NodeSource.
             */
            public Builder nodeSource(String nodeSource) {
                this.nodeSource = nodeSource;
                return this;
            }

            /**
             * NodeState.
             */
            public Builder nodeState(String nodeState) {
                this.nodeState = nodeState;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * PublicKey.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            public ChainNodeInfoList build() {
                return new ChainNodeInfoList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChainNodeInfoList")
        private java.util.List < ChainNodeInfoList> chainNodeInfoList;

        @com.aliyun.core.annotation.NameInMap("ConsortiumAdmin")
        private Boolean consortiumAdmin;

        private Result(Builder builder) {
            this.chainNodeInfoList = builder.chainNodeInfoList;
            this.consortiumAdmin = builder.consortiumAdmin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return chainNodeInfoList
         */
        public java.util.List < ChainNodeInfoList> getChainNodeInfoList() {
            return this.chainNodeInfoList;
        }

        /**
         * @return consortiumAdmin
         */
        public Boolean getConsortiumAdmin() {
            return this.consortiumAdmin;
        }

        public static final class Builder {
            private java.util.List < ChainNodeInfoList> chainNodeInfoList; 
            private Boolean consortiumAdmin; 

            /**
             * ChainNodeInfoList.
             */
            public Builder chainNodeInfoList(java.util.List < ChainNodeInfoList> chainNodeInfoList) {
                this.chainNodeInfoList = chainNodeInfoList;
                return this;
            }

            /**
             * ConsortiumAdmin.
             */
            public Builder consortiumAdmin(Boolean consortiumAdmin) {
                this.consortiumAdmin = consortiumAdmin;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
