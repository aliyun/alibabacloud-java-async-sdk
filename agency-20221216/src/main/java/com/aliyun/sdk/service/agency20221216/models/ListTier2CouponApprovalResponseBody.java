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
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data object.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
             * <p>The ID of the application form.</p>
             * 
             * <strong>example:</strong>
             * <p>d54ca949-9b88-4514-add3-c6029c4027f4</p>
             */
            public Builder applicationSheetId(String applicationSheetId) {
                this.applicationSheetId = applicationSheetId;
                return this;
            }

            /**
             * <p>The application time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-21 11:24</p>
             */
            public Builder applicationTime(String applicationTime) {
                this.applicationTime = applicationTime;
                return this;
            }

            /**
             * <p>The approval status. Valid values:</p>
             * <ul>
             * <li>1: Revoked.</li>
             * <li>2: Under review.</li>
             * <li>3: Rejected.</li>
             * <li>4: Approved.</li>
             * <li>5: Approved but issuance failed.</li>
             * <li>8: Pending.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder approvalStatus(String approvalStatus) {
                this.approvalStatus = approvalStatus;
                return this;
            }

            /**
             * <p>The name of the secondary distributor.</p>
             * 
             * <strong>example:</strong>
             * <p>test account</p>
             */
            public Builder t2PartnerName(String t2PartnerName) {
                this.t2PartnerName = t2PartnerName;
                return this;
            }

            /**
             * <p>The UID of the secondary distributor.</p>
             * 
             * <strong>example:</strong>
             * <p>5248516956402795</p>
             */
            public Builder t2PartnerUid(Long t2PartnerUid) {
                this.t2PartnerUid = t2PartnerUid;
                return this;
            }

            /**
             * <p>The requested amount.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
