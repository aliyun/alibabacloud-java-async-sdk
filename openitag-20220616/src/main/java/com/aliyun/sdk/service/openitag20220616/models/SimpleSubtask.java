// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SimpleSubtask} extends {@link TeaModel}
 *
 * <p>SimpleSubtask</p>
 */
public class SimpleSubtask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubtaskId")
    private Long subtaskId;

    private SimpleSubtask(Builder builder) {
        this.items = builder.items;
        this.status = builder.status;
        this.subtaskId = builder.subtaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleSubtask create() {
        return builder().build();
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
    public Long getSubtaskId() {
        return this.subtaskId;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private String status; 
        private Long subtaskId; 

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
        public Builder subtaskId(Long subtaskId) {
            this.subtaskId = subtaskId;
            return this;
        }

        public SimpleSubtask build() {
            return new SimpleSubtask(this);
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

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

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
            this.itemId = builder.itemId;
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
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
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
            private Long itemId; 
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
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
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
