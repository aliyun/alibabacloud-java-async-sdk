// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWorkflowResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWorkflowResponseBody</p>
 */
public class DescribeWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WorkFlowInfo")
    private java.util.List < WorkFlowInfo> workFlowInfo;

    private DescribeWorkflowResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.workFlowInfo = builder.workFlowInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWorkflowResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workFlowInfo
     */
    public java.util.List < WorkFlowInfo> getWorkFlowInfo() {
        return this.workFlowInfo;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < WorkFlowInfo> workFlowInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkFlowInfo.
         */
        public Builder workFlowInfo(java.util.List < WorkFlowInfo> workFlowInfo) {
            this.workFlowInfo = workFlowInfo;
            return this;
        }

        public DescribeWorkflowResponseBody build() {
            return new DescribeWorkflowResponseBody(this);
        } 

    } 

    public static class WorkFlowInfo extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("BussinessId")
        private String bussinessId;

        @NameInMap("Duration")
        private String duration;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtEnd")
        private String gmtEnd;

        @NameInMap("GmtExpire")
        private String gmtExpire;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("GmtStart")
        private String gmtStart;

        @NameInMap("Id")
        private String id;

        @NameInMap("InitAttributes")
        private String initAttributes;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Status")
        private String status;

        @NameInMap("WorkerNode")
        private String workerNode;

        @NameInMap("WorkflowId")
        private String workflowId;

        private WorkFlowInfo(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bizType = builder.bizType;
            this.bussinessId = builder.bussinessId;
            this.duration = builder.duration;
            this.ensRegionId = builder.ensRegionId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtEnd = builder.gmtEnd;
            this.gmtExpire = builder.gmtExpire;
            this.gmtModify = builder.gmtModify;
            this.gmtStart = builder.gmtStart;
            this.id = builder.id;
            this.initAttributes = builder.initAttributes;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.priority = builder.priority;
            this.status = builder.status;
            this.workerNode = builder.workerNode;
            this.workflowId = builder.workflowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkFlowInfo create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return bussinessId
         */
        public String getBussinessId() {
            return this.bussinessId;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtEnd
         */
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtExpire
         */
        public String getGmtExpire() {
            return this.gmtExpire;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return gmtStart
         */
        public String getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return initAttributes
         */
        public String getInitAttributes() {
            return this.initAttributes;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return workerNode
         */
        public String getWorkerNode() {
            return this.workerNode;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        public static final class Builder {
            private String aliUid; 
            private String bizType; 
            private String bussinessId; 
            private String duration; 
            private String ensRegionId; 
            private String gmtCreate; 
            private String gmtEnd; 
            private String gmtExpire; 
            private String gmtModify; 
            private String gmtStart; 
            private String id; 
            private String initAttributes; 
            private String instanceId; 
            private String name; 
            private String priority; 
            private String status; 
            private String workerNode; 
            private String workflowId; 

            /**
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * BussinessId.
             */
            public Builder bussinessId(String bussinessId) {
                this.bussinessId = bussinessId;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtEnd.
             */
            public Builder gmtEnd(String gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * GmtExpire.
             */
            public Builder gmtExpire(String gmtExpire) {
                this.gmtExpire = gmtExpire;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * GmtStart.
             */
            public Builder gmtStart(String gmtStart) {
                this.gmtStart = gmtStart;
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
             * InitAttributes.
             */
            public Builder initAttributes(String initAttributes) {
                this.initAttributes = initAttributes;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WorkerNode.
             */
            public Builder workerNode(String workerNode) {
                this.workerNode = workerNode;
                return this;
            }

            /**
             * WorkflowId.
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            public WorkFlowInfo build() {
                return new WorkFlowInfo(this);
            } 

        } 

    }
}
