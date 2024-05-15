// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubtaskDetail} extends {@link TeaModel}
 *
 * <p>SubtaskDetail</p>
 */
public class SubtaskDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanDiscard")
    private Boolean canDiscard;

    @com.aliyun.core.annotation.NameInMap("CanReassign")
    private Boolean canReassign;

    @com.aliyun.core.annotation.NameInMap("CanRelease")
    private Boolean canRelease;

    @com.aliyun.core.annotation.NameInMap("CurrentWorkNode")
    private String currentWorkNode;

    @com.aliyun.core.annotation.NameInMap("ExtConfigs")
    private String extConfigs;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubtaskId")
    private String subtaskId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("Weight")
    private Long weight;

    @com.aliyun.core.annotation.NameInMap("WorkNodeState")
    private String workNodeState;

    @com.aliyun.core.annotation.NameInMap("Workforce")
    private java.util.List < Workforce > workforce;

    private SubtaskDetail(Builder builder) {
        this.canDiscard = builder.canDiscard;
        this.canReassign = builder.canReassign;
        this.canRelease = builder.canRelease;
        this.currentWorkNode = builder.currentWorkNode;
        this.extConfigs = builder.extConfigs;
        this.items = builder.items;
        this.status = builder.status;
        this.subtaskId = builder.subtaskId;
        this.taskId = builder.taskId;
        this.weight = builder.weight;
        this.workNodeState = builder.workNodeState;
        this.workforce = builder.workforce;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubtaskDetail create() {
        return builder().build();
    }

    /**
     * @return canDiscard
     */
    public Boolean getCanDiscard() {
        return this.canDiscard;
    }

    /**
     * @return canReassign
     */
    public Boolean getCanReassign() {
        return this.canReassign;
    }

    /**
     * @return canRelease
     */
    public Boolean getCanRelease() {
        return this.canRelease;
    }

    /**
     * @return currentWorkNode
     */
    public String getCurrentWorkNode() {
        return this.currentWorkNode;
    }

    /**
     * @return extConfigs
     */
    public String getExtConfigs() {
        return this.extConfigs;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subtaskId
     */
    public String getSubtaskId() {
        return this.subtaskId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return weight
     */
    public Long getWeight() {
        return this.weight;
    }

    /**
     * @return workNodeState
     */
    public String getWorkNodeState() {
        return this.workNodeState;
    }

    /**
     * @return workforce
     */
    public java.util.List < Workforce > getWorkforce() {
        return this.workforce;
    }

    public static final class Builder {
        private Boolean canDiscard; 
        private Boolean canReassign; 
        private Boolean canRelease; 
        private String currentWorkNode; 
        private String extConfigs; 
        private java.util.List < Items> items; 
        private String status; 
        private String subtaskId; 
        private String taskId; 
        private Long weight; 
        private String workNodeState; 
        private java.util.List < Workforce > workforce; 

        /**
         * CanDiscard.
         */
        public Builder canDiscard(Boolean canDiscard) {
            this.canDiscard = canDiscard;
            return this;
        }

        /**
         * CanReassign.
         */
        public Builder canReassign(Boolean canReassign) {
            this.canReassign = canReassign;
            return this;
        }

        /**
         * CanRelease.
         */
        public Builder canRelease(Boolean canRelease) {
            this.canRelease = canRelease;
            return this;
        }

        /**
         * CurrentWorkNode.
         */
        public Builder currentWorkNode(String currentWorkNode) {
            this.currentWorkNode = currentWorkNode;
            return this;
        }

        /**
         * ExtConfigs.
         */
        public Builder extConfigs(String extConfigs) {
            this.extConfigs = extConfigs;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
         * SubtaskId.
         */
        public Builder subtaskId(String subtaskId) {
            this.subtaskId = subtaskId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * Weight.
         */
        public Builder weight(Long weight) {
            this.weight = weight;
            return this;
        }

        /**
         * WorkNodeState.
         */
        public Builder workNodeState(String workNodeState) {
            this.workNodeState = workNodeState;
            return this;
        }

        /**
         * Workforce.
         */
        public Builder workforce(java.util.List < Workforce > workforce) {
            this.workforce = workforce;
            return this;
        }

        public SubtaskDetail build() {
            return new SubtaskDetail(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbandonFlag")
        private Boolean abandonFlag;

        @com.aliyun.core.annotation.NameInMap("AbandonRemark")
        private String abandonRemark;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("FeedbackFlag")
        private Boolean feedbackFlag;

        @com.aliyun.core.annotation.NameInMap("FeedbackRemark")
        private String feedbackRemark;

        @com.aliyun.core.annotation.NameInMap("FixedFlag")
        private Boolean fixedFlag;

        @com.aliyun.core.annotation.NameInMap("Mine")
        private Long mine;

        @com.aliyun.core.annotation.NameInMap("RejectFlag")
        private Boolean rejectFlag;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Long weight;

        private Items(Builder builder) {
            this.abandonFlag = builder.abandonFlag;
            this.abandonRemark = builder.abandonRemark;
            this.dataId = builder.dataId;
            this.feedbackFlag = builder.feedbackFlag;
            this.feedbackRemark = builder.feedbackRemark;
            this.fixedFlag = builder.fixedFlag;
            this.mine = builder.mine;
            this.rejectFlag = builder.rejectFlag;
            this.state = builder.state;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return abandonFlag
         */
        public Boolean getAbandonFlag() {
            return this.abandonFlag;
        }

        /**
         * @return abandonRemark
         */
        public String getAbandonRemark() {
            return this.abandonRemark;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return feedbackFlag
         */
        public Boolean getFeedbackFlag() {
            return this.feedbackFlag;
        }

        /**
         * @return feedbackRemark
         */
        public String getFeedbackRemark() {
            return this.feedbackRemark;
        }

        /**
         * @return fixedFlag
         */
        public Boolean getFixedFlag() {
            return this.fixedFlag;
        }

        /**
         * @return mine
         */
        public Long getMine() {
            return this.mine;
        }

        /**
         * @return rejectFlag
         */
        public Boolean getRejectFlag() {
            return this.rejectFlag;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return weight
         */
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Boolean abandonFlag; 
            private String abandonRemark; 
            private String dataId; 
            private Boolean feedbackFlag; 
            private String feedbackRemark; 
            private Boolean fixedFlag; 
            private Long mine; 
            private Boolean rejectFlag; 
            private String state; 
            private Long weight; 

            /**
             * AbandonFlag.
             */
            public Builder abandonFlag(Boolean abandonFlag) {
                this.abandonFlag = abandonFlag;
                return this;
            }

            /**
             * AbandonRemark.
             */
            public Builder abandonRemark(String abandonRemark) {
                this.abandonRemark = abandonRemark;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * FeedbackFlag.
             */
            public Builder feedbackFlag(Boolean feedbackFlag) {
                this.feedbackFlag = feedbackFlag;
                return this;
            }

            /**
             * FeedbackRemark.
             */
            public Builder feedbackRemark(String feedbackRemark) {
                this.feedbackRemark = feedbackRemark;
                return this;
            }

            /**
             * FixedFlag.
             */
            public Builder fixedFlag(Boolean fixedFlag) {
                this.fixedFlag = fixedFlag;
                return this;
            }

            /**
             * Mine.
             */
            public Builder mine(Long mine) {
                this.mine = mine;
                return this;
            }

            /**
             * RejectFlag.
             */
            public Builder rejectFlag(Boolean rejectFlag) {
                this.rejectFlag = rejectFlag;
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
             * Weight.
             */
            public Builder weight(Long weight) {
                this.weight = weight;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
