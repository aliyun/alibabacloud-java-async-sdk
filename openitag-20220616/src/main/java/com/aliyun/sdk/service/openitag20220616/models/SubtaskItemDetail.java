// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubtaskItemDetail} extends {@link TeaModel}
 *
 * <p>SubtaskItemDetail</p>
 */
public class SubtaskItemDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Annotations")
    private java.util.List < Annotations> annotations;

    @com.aliyun.core.annotation.NameInMap("DataSource")
    private java.util.Map < String, ? > dataSource;

    @com.aliyun.core.annotation.NameInMap("ItemId")
    private Long itemId;

    private SubtaskItemDetail(Builder builder) {
        this.annotations = builder.annotations;
        this.dataSource = builder.dataSource;
        this.itemId = builder.itemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubtaskItemDetail create() {
        return builder().build();
    }

    /**
     * @return annotations
     */
    public java.util.List < Annotations> getAnnotations() {
        return this.annotations;
    }

    /**
     * @return dataSource
     */
    public java.util.Map < String, ? > getDataSource() {
        return this.dataSource;
    }

    /**
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    public static final class Builder {
        private java.util.List < Annotations> annotations; 
        private java.util.Map < String, ? > dataSource; 
        private Long itemId; 

        /**
         * Annotations.
         */
        public Builder annotations(java.util.List < Annotations> annotations) {
            this.annotations = annotations;
            return this;
        }

        /**
         * DataSource.
         */
        public Builder dataSource(java.util.Map < String, ? > dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }

        public SubtaskItemDetail build() {
            return new SubtaskItemDetail(this);
        } 

    } 

    public static class Annotations extends TeaModel {
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

        private Annotations(Builder builder) {
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

        public static Annotations create() {
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

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
}
