// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcEquityFrozenResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcEquityFrozenResponseBody</p>
 */
public class GetOcIcEquityFrozenResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalNum")
    private Integer totalNum;

    private GetOcIcEquityFrozenResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcIcEquityFrozenResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageNum; 
        private String requestId; 
        private Boolean success; 
        private Integer totalNum; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public GetOcIcEquityFrozenResponseBody build() {
            return new GetOcIcEquityFrozenResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("FreezeAmount")
        private String freezeAmount;

        @NameInMap("FreezeCardNum")
        private String freezeCardNum;

        @NameInMap("FreezeCardType")
        private String freezeCardType;

        @NameInMap("FreezeCourt")
        private String freezeCourt;

        @NameInMap("FreezeEndDate")
        private String freezeEndDate;

        @NameInMap("FreezeExecItem")
        private String freezeExecItem;

        @NameInMap("FreezeExecPerson")
        private String freezeExecPerson;

        @NameInMap("FreezeNoticeNum")
        private String freezeNoticeNum;

        @NameInMap("FreezePublishDate")
        private String freezePublishDate;

        @NameInMap("FreezeStartDate")
        private String freezeStartDate;

        @NameInMap("Status")
        private String status;

        @NameInMap("UnfreezeAdjustNum")
        private String unfreezeAdjustNum;

        @NameInMap("UnfreezeCourt")
        private String unfreezeCourt;

        @NameInMap("UnfreezeDate")
        private String unfreezeDate;

        @NameInMap("UnfreezeReason")
        private String unfreezeReason;

        private Data(Builder builder) {
            this.freezeAmount = builder.freezeAmount;
            this.freezeCardNum = builder.freezeCardNum;
            this.freezeCardType = builder.freezeCardType;
            this.freezeCourt = builder.freezeCourt;
            this.freezeEndDate = builder.freezeEndDate;
            this.freezeExecItem = builder.freezeExecItem;
            this.freezeExecPerson = builder.freezeExecPerson;
            this.freezeNoticeNum = builder.freezeNoticeNum;
            this.freezePublishDate = builder.freezePublishDate;
            this.freezeStartDate = builder.freezeStartDate;
            this.status = builder.status;
            this.unfreezeAdjustNum = builder.unfreezeAdjustNum;
            this.unfreezeCourt = builder.unfreezeCourt;
            this.unfreezeDate = builder.unfreezeDate;
            this.unfreezeReason = builder.unfreezeReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return freezeAmount
         */
        public String getFreezeAmount() {
            return this.freezeAmount;
        }

        /**
         * @return freezeCardNum
         */
        public String getFreezeCardNum() {
            return this.freezeCardNum;
        }

        /**
         * @return freezeCardType
         */
        public String getFreezeCardType() {
            return this.freezeCardType;
        }

        /**
         * @return freezeCourt
         */
        public String getFreezeCourt() {
            return this.freezeCourt;
        }

        /**
         * @return freezeEndDate
         */
        public String getFreezeEndDate() {
            return this.freezeEndDate;
        }

        /**
         * @return freezeExecItem
         */
        public String getFreezeExecItem() {
            return this.freezeExecItem;
        }

        /**
         * @return freezeExecPerson
         */
        public String getFreezeExecPerson() {
            return this.freezeExecPerson;
        }

        /**
         * @return freezeNoticeNum
         */
        public String getFreezeNoticeNum() {
            return this.freezeNoticeNum;
        }

        /**
         * @return freezePublishDate
         */
        public String getFreezePublishDate() {
            return this.freezePublishDate;
        }

        /**
         * @return freezeStartDate
         */
        public String getFreezeStartDate() {
            return this.freezeStartDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unfreezeAdjustNum
         */
        public String getUnfreezeAdjustNum() {
            return this.unfreezeAdjustNum;
        }

        /**
         * @return unfreezeCourt
         */
        public String getUnfreezeCourt() {
            return this.unfreezeCourt;
        }

        /**
         * @return unfreezeDate
         */
        public String getUnfreezeDate() {
            return this.unfreezeDate;
        }

        /**
         * @return unfreezeReason
         */
        public String getUnfreezeReason() {
            return this.unfreezeReason;
        }

        public static final class Builder {
            private String freezeAmount; 
            private String freezeCardNum; 
            private String freezeCardType; 
            private String freezeCourt; 
            private String freezeEndDate; 
            private String freezeExecItem; 
            private String freezeExecPerson; 
            private String freezeNoticeNum; 
            private String freezePublishDate; 
            private String freezeStartDate; 
            private String status; 
            private String unfreezeAdjustNum; 
            private String unfreezeCourt; 
            private String unfreezeDate; 
            private String unfreezeReason; 

            /**
             * 数额
             */
            public Builder freezeAmount(String freezeAmount) {
                this.freezeAmount = freezeAmount;
                return this;
            }

            /**
             * 被执行人证件号码
             */
            public Builder freezeCardNum(String freezeCardNum) {
                this.freezeCardNum = freezeCardNum;
                return this;
            }

            /**
             * 被执行人证件种类
             */
            public Builder freezeCardType(String freezeCardType) {
                this.freezeCardType = freezeCardType;
                return this;
            }

            /**
             * 执行法院
             */
            public Builder freezeCourt(String freezeCourt) {
                this.freezeCourt = freezeCourt;
                return this;
            }

            /**
             * 冻结截止日期
             */
            public Builder freezeEndDate(String freezeEndDate) {
                this.freezeEndDate = freezeEndDate;
                return this;
            }

            /**
             * 执行事项
             */
            public Builder freezeExecItem(String freezeExecItem) {
                this.freezeExecItem = freezeExecItem;
                return this;
            }

            /**
             * 被执行人
             */
            public Builder freezeExecPerson(String freezeExecPerson) {
                this.freezeExecPerson = freezeExecPerson;
                return this;
            }

            /**
             * 执行通知书文号
             */
            public Builder freezeNoticeNum(String freezeNoticeNum) {
                this.freezeNoticeNum = freezeNoticeNum;
                return this;
            }

            /**
             * 公示日期
             */
            public Builder freezePublishDate(String freezePublishDate) {
                this.freezePublishDate = freezePublishDate;
                return this;
            }

            /**
             * 冻结起始日期
             */
            public Builder freezeStartDate(String freezeStartDate) {
                this.freezeStartDate = freezeStartDate;
                return this;
            }

            /**
             * 状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 解冻文号
             */
            public Builder unfreezeAdjustNum(String unfreezeAdjustNum) {
                this.unfreezeAdjustNum = unfreezeAdjustNum;
                return this;
            }

            /**
             * 解冻机关
             */
            public Builder unfreezeCourt(String unfreezeCourt) {
                this.unfreezeCourt = unfreezeCourt;
                return this;
            }

            /**
             * 解冻日期
             */
            public Builder unfreezeDate(String unfreezeDate) {
                this.unfreezeDate = unfreezeDate;
                return this;
            }

            /**
             * 解冻说明
             */
            public Builder unfreezeReason(String unfreezeReason) {
                this.unfreezeReason = unfreezeReason;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
