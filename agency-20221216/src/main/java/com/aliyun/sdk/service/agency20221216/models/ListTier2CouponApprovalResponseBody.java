// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTier2CouponApprovalResponseBody} extends {@link TeaModel}
 *
 * <p>ListTier2CouponApprovalResponseBody</p>
 */
public class ListTier2CouponApprovalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListTier2CouponApprovalResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTier2CouponApprovalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListTier2CouponApprovalResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

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
        public Builder data(java.util.List<Data> data) {
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
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListTier2CouponApprovalResponseBody build() {
            return new ListTier2CouponApprovalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTier2CouponApprovalResponseBody} extends {@link TeaModel}
     *
     * <p>ListTier2CouponApprovalResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationSheetId")
        private String applicationSheetId;

        @com.aliyun.core.annotation.NameInMap("ApplicationTime")
        private String applicationTime;

        @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
        private String approvalStatus;

        @com.aliyun.core.annotation.NameInMap("T2PartnerName")
        private String t2PartnerName;

        @com.aliyun.core.annotation.NameInMap("T2PartnerUid")
        private Long t2PartnerUid;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private String totalAmount;

        private Data(Builder builder) {
            this.applicationSheetId = builder.applicationSheetId;
            this.applicationTime = builder.applicationTime;
            this.approvalStatus = builder.approvalStatus;
            this.t2PartnerName = builder.t2PartnerName;
            this.t2PartnerUid = builder.t2PartnerUid;
            this.totalAmount = builder.totalAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicationSheetId
         */
        public String getApplicationSheetId() {
            return this.applicationSheetId;
        }

        /**
         * @return applicationTime
         */
        public String getApplicationTime() {
            return this.applicationTime;
        }

        /**
         * @return approvalStatus
         */
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        /**
         * @return t2PartnerName
         */
        public String getT2PartnerName() {
            return this.t2PartnerName;
        }

        /**
         * @return t2PartnerUid
         */
        public Long getT2PartnerUid() {
            return this.t2PartnerUid;
        }

        /**
         * @return totalAmount
         */
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public static final class Builder {
            private String applicationSheetId; 
            private String applicationTime; 
            private String approvalStatus; 
            private String t2PartnerName; 
            private Long t2PartnerUid; 
            private String totalAmount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicationSheetId = model.applicationSheetId;
                this.applicationTime = model.applicationTime;
                this.approvalStatus = model.approvalStatus;
                this.t2PartnerName = model.t2PartnerName;
                this.t2PartnerUid = model.t2PartnerUid;
                this.totalAmount = model.totalAmount;
            } 

            /**
             * ApplicationSheetId.
             */
            public Builder applicationSheetId(String applicationSheetId) {
                this.applicationSheetId = applicationSheetId;
                return this;
            }

            /**
             * ApplicationTime.
             */
            public Builder applicationTime(String applicationTime) {
                this.applicationTime = applicationTime;
                return this;
            }

            /**
             * ApprovalStatus.
             */
            public Builder approvalStatus(String approvalStatus) {
                this.approvalStatus = approvalStatus;
                return this;
            }

            /**
             * T2PartnerName.
             */
            public Builder t2PartnerName(String t2PartnerName) {
                this.t2PartnerName = t2PartnerName;
                return this;
            }

            /**
             * T2PartnerUid.
             */
            public Builder t2PartnerUid(Long t2PartnerUid) {
                this.t2PartnerUid = t2PartnerUid;
                return this;
            }

            /**
             * TotalAmount.
             */
            public Builder totalAmount(String totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
