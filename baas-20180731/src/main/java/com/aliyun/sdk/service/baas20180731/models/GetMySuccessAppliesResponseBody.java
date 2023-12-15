// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMySuccessAppliesResponseBody} extends {@link TeaModel}
 *
 * <p>GetMySuccessAppliesResponseBody</p>
 */
public class GetMySuccessAppliesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private GetMySuccessAppliesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMySuccessAppliesResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

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

        public GetMySuccessAppliesResponseBody build() {
            return new GetMySuccessAppliesResponseBody(this);
        } 

    } 

    public static class NodeInfoList extends TeaModel {
        @NameInMap("BlockHeight")
        private Long blockHeight;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Status")
        private Boolean status;

        @NameInMap("Version")
        private String version;

        private NodeInfoList(Builder builder) {
            this.blockHeight = builder.blockHeight;
            this.nodeName = builder.nodeName;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfoList create() {
            return builder().build();
        }

        /**
         * @return blockHeight
         */
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long blockHeight; 
            private String nodeName; 
            private Boolean status; 
            private String version; 

            /**
             * BlockHeight.
             */
            public Builder blockHeight(Long blockHeight) {
                this.blockHeight = blockHeight;
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
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public NodeInfoList build() {
                return new NodeInfoList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AbnormalNodes")
        private Integer abnormalNodes;

        @NameInMap("Bizid")
        private String bizid;

        @NameInMap("BlockHeight")
        private Integer blockHeight;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("IsRole")
        private Boolean isRole;

        @NameInMap("Name")
        private String name;

        @NameInMap("NodeInfoList")
        private java.util.List < NodeInfoList> nodeInfoList;

        @NameInMap("NodeNumber")
        private Integer nodeNumber;

        @NameInMap("Normal")
        private Boolean normal;

        @NameInMap("TransactionSum")
        private Integer transactionSum;

        @NameInMap("Version")
        private String version;

        private Result(Builder builder) {
            this.abnormalNodes = builder.abnormalNodes;
            this.bizid = builder.bizid;
            this.blockHeight = builder.blockHeight;
            this.createTime = builder.createTime;
            this.isRole = builder.isRole;
            this.name = builder.name;
            this.nodeInfoList = builder.nodeInfoList;
            this.nodeNumber = builder.nodeNumber;
            this.normal = builder.normal;
            this.transactionSum = builder.transactionSum;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return abnormalNodes
         */
        public Integer getAbnormalNodes() {
            return this.abnormalNodes;
        }

        /**
         * @return bizid
         */
        public String getBizid() {
            return this.bizid;
        }

        /**
         * @return blockHeight
         */
        public Integer getBlockHeight() {
            return this.blockHeight;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return isRole
         */
        public Boolean getIsRole() {
            return this.isRole;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeInfoList
         */
        public java.util.List < NodeInfoList> getNodeInfoList() {
            return this.nodeInfoList;
        }

        /**
         * @return nodeNumber
         */
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        /**
         * @return normal
         */
        public Boolean getNormal() {
            return this.normal;
        }

        /**
         * @return transactionSum
         */
        public Integer getTransactionSum() {
            return this.transactionSum;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Integer abnormalNodes; 
            private String bizid; 
            private Integer blockHeight; 
            private Long createTime; 
            private Boolean isRole; 
            private String name; 
            private java.util.List < NodeInfoList> nodeInfoList; 
            private Integer nodeNumber; 
            private Boolean normal; 
            private Integer transactionSum; 
            private String version; 

            /**
             * AbnormalNodes.
             */
            public Builder abnormalNodes(Integer abnormalNodes) {
                this.abnormalNodes = abnormalNodes;
                return this;
            }

            /**
             * Bizid.
             */
            public Builder bizid(String bizid) {
                this.bizid = bizid;
                return this;
            }

            /**
             * BlockHeight.
             */
            public Builder blockHeight(Integer blockHeight) {
                this.blockHeight = blockHeight;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IsRole.
             */
            public Builder isRole(Boolean isRole) {
                this.isRole = isRole;
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
             * NodeInfoList.
             */
            public Builder nodeInfoList(java.util.List < NodeInfoList> nodeInfoList) {
                this.nodeInfoList = nodeInfoList;
                return this;
            }

            /**
             * NodeNumber.
             */
            public Builder nodeNumber(Integer nodeNumber) {
                this.nodeNumber = nodeNumber;
                return this;
            }

            /**
             * Normal.
             */
            public Builder normal(Boolean normal) {
                this.normal = normal;
                return this;
            }

            /**
             * TransactionSum.
             */
            public Builder transactionSum(Integer transactionSum) {
                this.transactionSum = transactionSum;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
