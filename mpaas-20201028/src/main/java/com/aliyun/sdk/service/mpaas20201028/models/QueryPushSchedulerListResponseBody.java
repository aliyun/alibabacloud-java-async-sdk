// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushSchedulerListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPushSchedulerListResponseBody</p>
 */
public class QueryPushSchedulerListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private QueryPushSchedulerListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPushSchedulerListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public QueryPushSchedulerListResponseBody build() {
            return new QueryPushSchedulerListResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateType")
        private Integer createType;

        @com.aliyun.core.annotation.NameInMap("DeliveryType")
        private Integer deliveryType;

        @com.aliyun.core.annotation.NameInMap("ExecutedStatus")
        private String executedStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("PushContent")
        private String pushContent;

        @com.aliyun.core.annotation.NameInMap("PushTime")
        private Long pushTime;

        @com.aliyun.core.annotation.NameInMap("PushTitle")
        private String pushTitle;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private Integer strategyType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        private List(Builder builder) {
            this.createType = builder.createType;
            this.deliveryType = builder.deliveryType;
            this.executedStatus = builder.executedStatus;
            this.gmtCreate = builder.gmtCreate;
            this.parentId = builder.parentId;
            this.pushContent = builder.pushContent;
            this.pushTime = builder.pushTime;
            this.pushTitle = builder.pushTitle;
            this.strategyType = builder.strategyType;
            this.type = builder.type;
            this.uniqueId = builder.uniqueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return createType
         */
        public Integer getCreateType() {
            return this.createType;
        }

        /**
         * @return deliveryType
         */
        public Integer getDeliveryType() {
            return this.deliveryType;
        }

        /**
         * @return executedStatus
         */
        public String getExecutedStatus() {
            return this.executedStatus;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return pushContent
         */
        public String getPushContent() {
            return this.pushContent;
        }

        /**
         * @return pushTime
         */
        public Long getPushTime() {
            return this.pushTime;
        }

        /**
         * @return pushTitle
         */
        public String getPushTitle() {
            return this.pushTitle;
        }

        /**
         * @return strategyType
         */
        public Integer getStrategyType() {
            return this.strategyType;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        public static final class Builder {
            private Integer createType; 
            private Integer deliveryType; 
            private String executedStatus; 
            private Long gmtCreate; 
            private String parentId; 
            private String pushContent; 
            private Long pushTime; 
            private String pushTitle; 
            private Integer strategyType; 
            private Integer type; 
            private String uniqueId; 

            /**
             * CreateType.
             */
            public Builder createType(Integer createType) {
                this.createType = createType;
                return this;
            }

            /**
             * DeliveryType.
             */
            public Builder deliveryType(Integer deliveryType) {
                this.deliveryType = deliveryType;
                return this;
            }

            /**
             * ExecutedStatus.
             */
            public Builder executedStatus(String executedStatus) {
                this.executedStatus = executedStatus;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * PushContent.
             */
            public Builder pushContent(String pushContent) {
                this.pushContent = pushContent;
                return this;
            }

            /**
             * PushTime.
             */
            public Builder pushTime(Long pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * PushTitle.
             */
            public Builder pushTitle(String pushTitle) {
                this.pushTitle = pushTitle;
                return this;
            }

            /**
             * StrategyType.
             */
            public Builder strategyType(Integer strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * UniqueId.
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ResultContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        private ResultContent(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        public static final class Builder {
            private Data data; 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
