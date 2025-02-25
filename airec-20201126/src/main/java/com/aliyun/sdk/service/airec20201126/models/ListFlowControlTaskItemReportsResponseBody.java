// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFlowControlTaskItemReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowControlTaskItemReportsResponseBody</p>
 */
public class ListFlowControlTaskItemReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListFlowControlTaskItemReportsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowControlTaskItemReportsResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListFlowControlTaskItemReportsResponseBody build() {
            return new ListFlowControlTaskItemReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowControlTaskItemReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskItemReportsResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accClickPercent")
        private String accClickPercent;

        @com.aliyun.core.annotation.NameInMap("accItemClick")
        private String accItemClick;

        @com.aliyun.core.annotation.NameInMap("accItemCtr")
        private String accItemCtr;

        @com.aliyun.core.annotation.NameInMap("accItemPv")
        private String accItemPv;

        @com.aliyun.core.annotation.NameInMap("accPvPercent")
        private String accPvPercent;

        @com.aliyun.core.annotation.NameInMap("accTaskClick")
        private String accTaskClick;

        @com.aliyun.core.annotation.NameInMap("accTaskCtr")
        private String accTaskCtr;

        @com.aliyun.core.annotation.NameInMap("accTaskPv")
        private String accTaskPv;

        @com.aliyun.core.annotation.NameInMap("accTaskRank")
        private String accTaskRank;

        @com.aliyun.core.annotation.NameInMap("clickPercent")
        private String clickPercent;

        @com.aliyun.core.annotation.NameInMap("itemClick")
        private String itemClick;

        @com.aliyun.core.annotation.NameInMap("itemCtr")
        private String itemCtr;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("itemPv")
        private String itemPv;

        @com.aliyun.core.annotation.NameInMap("itemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("pvPercent")
        private String pvPercent;

        @com.aliyun.core.annotation.NameInMap("taskClick")
        private String taskClick;

        @com.aliyun.core.annotation.NameInMap("taskCtr")
        private String taskCtr;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("taskPv")
        private String taskPv;

        @com.aliyun.core.annotation.NameInMap("taskRank")
        private String taskRank;

        private Detail(Builder builder) {
            this.accClickPercent = builder.accClickPercent;
            this.accItemClick = builder.accItemClick;
            this.accItemCtr = builder.accItemCtr;
            this.accItemPv = builder.accItemPv;
            this.accPvPercent = builder.accPvPercent;
            this.accTaskClick = builder.accTaskClick;
            this.accTaskCtr = builder.accTaskCtr;
            this.accTaskPv = builder.accTaskPv;
            this.accTaskRank = builder.accTaskRank;
            this.clickPercent = builder.clickPercent;
            this.itemClick = builder.itemClick;
            this.itemCtr = builder.itemCtr;
            this.itemId = builder.itemId;
            this.itemPv = builder.itemPv;
            this.itemType = builder.itemType;
            this.pvPercent = builder.pvPercent;
            this.taskClick = builder.taskClick;
            this.taskCtr = builder.taskCtr;
            this.taskId = builder.taskId;
            this.taskPv = builder.taskPv;
            this.taskRank = builder.taskRank;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return accClickPercent
         */
        public String getAccClickPercent() {
            return this.accClickPercent;
        }

        /**
         * @return accItemClick
         */
        public String getAccItemClick() {
            return this.accItemClick;
        }

        /**
         * @return accItemCtr
         */
        public String getAccItemCtr() {
            return this.accItemCtr;
        }

        /**
         * @return accItemPv
         */
        public String getAccItemPv() {
            return this.accItemPv;
        }

        /**
         * @return accPvPercent
         */
        public String getAccPvPercent() {
            return this.accPvPercent;
        }

        /**
         * @return accTaskClick
         */
        public String getAccTaskClick() {
            return this.accTaskClick;
        }

        /**
         * @return accTaskCtr
         */
        public String getAccTaskCtr() {
            return this.accTaskCtr;
        }

        /**
         * @return accTaskPv
         */
        public String getAccTaskPv() {
            return this.accTaskPv;
        }

        /**
         * @return accTaskRank
         */
        public String getAccTaskRank() {
            return this.accTaskRank;
        }

        /**
         * @return clickPercent
         */
        public String getClickPercent() {
            return this.clickPercent;
        }

        /**
         * @return itemClick
         */
        public String getItemClick() {
            return this.itemClick;
        }

        /**
         * @return itemCtr
         */
        public String getItemCtr() {
            return this.itemCtr;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemPv
         */
        public String getItemPv() {
            return this.itemPv;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return pvPercent
         */
        public String getPvPercent() {
            return this.pvPercent;
        }

        /**
         * @return taskClick
         */
        public String getTaskClick() {
            return this.taskClick;
        }

        /**
         * @return taskCtr
         */
        public String getTaskCtr() {
            return this.taskCtr;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskPv
         */
        public String getTaskPv() {
            return this.taskPv;
        }

        /**
         * @return taskRank
         */
        public String getTaskRank() {
            return this.taskRank;
        }

        public static final class Builder {
            private String accClickPercent; 
            private String accItemClick; 
            private String accItemCtr; 
            private String accItemPv; 
            private String accPvPercent; 
            private String accTaskClick; 
            private String accTaskCtr; 
            private String accTaskPv; 
            private String accTaskRank; 
            private String clickPercent; 
            private String itemClick; 
            private String itemCtr; 
            private String itemId; 
            private String itemPv; 
            private String itemType; 
            private String pvPercent; 
            private String taskClick; 
            private String taskCtr; 
            private String taskId; 
            private String taskPv; 
            private String taskRank; 

            /**
             * accClickPercent.
             */
            public Builder accClickPercent(String accClickPercent) {
                this.accClickPercent = accClickPercent;
                return this;
            }

            /**
             * accItemClick.
             */
            public Builder accItemClick(String accItemClick) {
                this.accItemClick = accItemClick;
                return this;
            }

            /**
             * accItemCtr.
             */
            public Builder accItemCtr(String accItemCtr) {
                this.accItemCtr = accItemCtr;
                return this;
            }

            /**
             * accItemPv.
             */
            public Builder accItemPv(String accItemPv) {
                this.accItemPv = accItemPv;
                return this;
            }

            /**
             * accPvPercent.
             */
            public Builder accPvPercent(String accPvPercent) {
                this.accPvPercent = accPvPercent;
                return this;
            }

            /**
             * accTaskClick.
             */
            public Builder accTaskClick(String accTaskClick) {
                this.accTaskClick = accTaskClick;
                return this;
            }

            /**
             * accTaskCtr.
             */
            public Builder accTaskCtr(String accTaskCtr) {
                this.accTaskCtr = accTaskCtr;
                return this;
            }

            /**
             * accTaskPv.
             */
            public Builder accTaskPv(String accTaskPv) {
                this.accTaskPv = accTaskPv;
                return this;
            }

            /**
             * accTaskRank.
             */
            public Builder accTaskRank(String accTaskRank) {
                this.accTaskRank = accTaskRank;
                return this;
            }

            /**
             * clickPercent.
             */
            public Builder clickPercent(String clickPercent) {
                this.clickPercent = clickPercent;
                return this;
            }

            /**
             * itemClick.
             */
            public Builder itemClick(String itemClick) {
                this.itemClick = itemClick;
                return this;
            }

            /**
             * itemCtr.
             */
            public Builder itemCtr(String itemCtr) {
                this.itemCtr = itemCtr;
                return this;
            }

            /**
             * itemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * itemPv.
             */
            public Builder itemPv(String itemPv) {
                this.itemPv = itemPv;
                return this;
            }

            /**
             * itemType.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * pvPercent.
             */
            public Builder pvPercent(String pvPercent) {
                this.pvPercent = pvPercent;
                return this;
            }

            /**
             * taskClick.
             */
            public Builder taskClick(String taskClick) {
                this.taskClick = taskClick;
                return this;
            }

            /**
             * taskCtr.
             */
            public Builder taskCtr(String taskCtr) {
                this.taskCtr = taskCtr;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * taskPv.
             */
            public Builder taskPv(String taskPv) {
                this.taskPv = taskPv;
                return this;
            }

            /**
             * taskRank.
             */
            public Builder taskRank(String taskRank) {
                this.taskRank = taskRank;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlowControlTaskItemReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskItemReportsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private java.util.List < Detail> detail;

        private Result(Builder builder) {
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 

            /**
             * detail.
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
