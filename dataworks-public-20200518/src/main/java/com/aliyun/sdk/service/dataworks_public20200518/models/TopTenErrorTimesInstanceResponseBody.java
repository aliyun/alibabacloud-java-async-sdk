// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TopTenErrorTimesInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>TopTenErrorTimesInstanceResponseBody</p>
 */
public class TopTenErrorTimesInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceErrorRank")
    private InstanceErrorRank instanceErrorRank;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TopTenErrorTimesInstanceResponseBody(Builder builder) {
        this.instanceErrorRank = builder.instanceErrorRank;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TopTenErrorTimesInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceErrorRank
     */
    public InstanceErrorRank getInstanceErrorRank() {
        return this.instanceErrorRank;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceErrorRank instanceErrorRank; 
        private String requestId; 

        /**
         * The ranking data of nodes on which errors occurred.
         */
        public Builder instanceErrorRank(InstanceErrorRank instanceErrorRank) {
            this.instanceErrorRank = instanceErrorRank;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TopTenErrorTimesInstanceResponseBody build() {
            return new TopTenErrorTimesInstanceResponseBody(this);
        } 

    } 

    public static class ErrorRank extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProgramType")
        private Integer programType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private ErrorRank(Builder builder) {
            this.count = builder.count;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.owner = builder.owner;
            this.programType = builder.programType;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorRank create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return programType
         */
        public Integer getProgramType() {
            return this.programType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Integer count; 
            private Long nodeId; 
            private String nodeName; 
            private String owner; 
            private Integer programType; 
            private Long projectId; 

            /**
             * The number of errors that occurred on the node.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the node owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The type of the node. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)
             */
            public Builder programType(Integer programType) {
                this.programType = programType;
                return this;
            }

            /**
             * The DataWorks workspace ID.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public ErrorRank build() {
                return new ErrorRank(this);
            } 

        } 

    }
    public static class InstanceErrorRank extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorRank")
        private java.util.List < ErrorRank> errorRank;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private InstanceErrorRank(Builder builder) {
            this.errorRank = builder.errorRank;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceErrorRank create() {
            return builder().build();
        }

        /**
         * @return errorRank
         */
        public java.util.List < ErrorRank> getErrorRank() {
            return this.errorRank;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List < ErrorRank> errorRank; 
            private Long updateTime; 

            /**
             * The ranking data of nodes on which errors occurred within the last month.
             */
            public Builder errorRank(java.util.List < ErrorRank> errorRank) {
                this.errorRank = errorRank;
                return this;
            }

            /**
             * The timestamp at which the rankings were updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public InstanceErrorRank build() {
                return new InstanceErrorRank(this);
            } 

        } 

    }
}
