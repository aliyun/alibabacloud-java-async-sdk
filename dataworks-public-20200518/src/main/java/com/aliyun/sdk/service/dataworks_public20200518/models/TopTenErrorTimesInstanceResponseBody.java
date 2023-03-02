// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TopTenErrorTimesInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>TopTenErrorTimesInstanceResponseBody</p>
 */
public class TopTenErrorTimesInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceErrorRank")
    private InstanceErrorRank instanceErrorRank;

    @NameInMap("RequestId")
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
         * The ranking of nodes on which errors occur.
         */
        public Builder instanceErrorRank(InstanceErrorRank instanceErrorRank) {
            this.instanceErrorRank = instanceErrorRank;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to troubleshoot issues.
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
        @NameInMap("Count")
        private Integer count;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ProgramType")
        private Integer programType;

        @NameInMap("ProjectId")
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
             * The number of errors that occur on the node.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The ID of the node.
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
             * The user identifier (UID) of the Alibaba Cloud account used by the owner of the node.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The type of the node.
             * <p>
             * 
             * Valid values:
             * 
             * 6 (Shell node), 10 (ODPS SQL node), 11 (ODPS MR node), 23 (Data Integration node), 24 (ODPS Script node), 99 (zero load node), 221 (PyODPS 2 node), 225 (ODPS Spark node), 227 (EMR Hive node), 228 (EMR Spark node), 229 (EMR Spark SQL node), 230 (EMR MR node), 239 (OSS object inspection node), 257 (EMR Shell node), 258 (EMR Spark Shell node), 259 (EMR Presto node), 260 (EMR Impala node), 900 (real-time data synchronization node), 1089 (cross-tenant collaboration node), 1091 (Hologres development node), 1093 (Hologres SQL node), 1100 (assignment node), and 1221 (PyODPS 3 node).
             */
            public Builder programType(Integer programType) {
                this.programType = programType;
                return this;
            }

            /**
             * The ID of the DataWorks workspace.
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
        @NameInMap("ErrorRank")
        private java.util.List < ErrorRank> errorRank;

        @NameInMap("UpdateTime")
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
             * The ranking of nodes on which errors occur within the last month.
             */
            public Builder errorRank(java.util.List < ErrorRank> errorRank) {
                this.errorRank = errorRank;
                return this;
            }

            /**
             * The time when the ranking was updated.
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
