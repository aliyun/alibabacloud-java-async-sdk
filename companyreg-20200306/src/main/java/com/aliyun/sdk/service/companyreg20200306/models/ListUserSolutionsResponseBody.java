// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserSolutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserSolutionsResponseBody</p>
 */
public class ListUserSolutionsResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private ListUserSolutionsResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserSolutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private java.util.List < Data> data; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public ListUserSolutionsResponseBody build() {
            return new ListUserSolutionsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DeliveryOrderBizId")
        private String deliveryOrderBizId;

        @NameInMap("IntentionAssignBizId")
        private String intentionAssignBizId;

        @NameInMap("IntentionBizId")
        private String intentionBizId;

        @NameInMap("PartnerCode")
        private String partnerCode;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.bizId = builder.bizId;
            this.bizType = builder.bizType;
            this.createTime = builder.createTime;
            this.deliveryOrderBizId = builder.deliveryOrderBizId;
            this.intentionAssignBizId = builder.intentionAssignBizId;
            this.intentionBizId = builder.intentionBizId;
            this.partnerCode = builder.partnerCode;
            this.reason = builder.reason;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deliveryOrderBizId
         */
        public String getDeliveryOrderBizId() {
            return this.deliveryOrderBizId;
        }

        /**
         * @return intentionAssignBizId
         */
        public String getIntentionAssignBizId() {
            return this.intentionAssignBizId;
        }

        /**
         * @return intentionBizId
         */
        public String getIntentionBizId() {
            return this.intentionBizId;
        }

        /**
         * @return partnerCode
         */
        public String getPartnerCode() {
            return this.partnerCode;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bizId; 
            private String bizType; 
            private Long createTime; 
            private String deliveryOrderBizId; 
            private String intentionAssignBizId; 
            private String intentionBizId; 
            private String partnerCode; 
            private String reason; 
            private Integer status; 
            private Long updateTime; 
            private String userId; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeliveryOrderBizId.
             */
            public Builder deliveryOrderBizId(String deliveryOrderBizId) {
                this.deliveryOrderBizId = deliveryOrderBizId;
                return this;
            }

            /**
             * IntentionAssignBizId.
             */
            public Builder intentionAssignBizId(String intentionAssignBizId) {
                this.intentionAssignBizId = intentionAssignBizId;
                return this;
            }

            /**
             * IntentionBizId.
             */
            public Builder intentionBizId(String intentionBizId) {
                this.intentionBizId = intentionBizId;
                return this;
            }

            /**
             * PartnerCode.
             */
            public Builder partnerCode(String partnerCode) {
                this.partnerCode = partnerCode;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
