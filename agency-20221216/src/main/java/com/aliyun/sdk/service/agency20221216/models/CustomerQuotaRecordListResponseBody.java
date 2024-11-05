// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CustomerQuotaRecordListResponseBody} extends {@link TeaModel}
 *
 * <p>CustomerQuotaRecordListResponseBody</p>
 */
public class CustomerQuotaRecordListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private CustomerQuotaRecordListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomerQuotaRecordListResponseBody create() {
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private java.util.List < Data> data; 
        private String msg; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * <p>Status code of returning result, 200 means success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Listed data of returning result</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of returning data</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Record number on each page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>ID of request</p>
         * 
         * <strong>example:</strong>
         * <p>2103a0ae16849855284594613d874e</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total volume</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public CustomerQuotaRecordListResponseBody build() {
            return new CustomerQuotaRecordListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CustomerQuotaRecordListResponseBody} extends {@link TeaModel}
     *
     * <p>CustomerQuotaRecordListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationSubmitType")
        private String operationSubmitType;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("OperationTypeCode")
        private String operationTypeCode;

        @com.aliyun.core.annotation.NameInMap("OperationTypeDesc")
        private String operationTypeDesc;

        @com.aliyun.core.annotation.NameInMap("OperationUid")
        private String operationUid;

        @com.aliyun.core.annotation.NameInMap("UpdateAfterAmount")
        private String updateAfterAmount;

        @com.aliyun.core.annotation.NameInMap("UpdateAmount")
        private String updateAmount;

        @com.aliyun.core.annotation.NameInMap("UpdateBeforeAmount")
        private String updateBeforeAmount;

        private Data(Builder builder) {
            this.operationSubmitType = builder.operationSubmitType;
            this.operationTime = builder.operationTime;
            this.operationTypeCode = builder.operationTypeCode;
            this.operationTypeDesc = builder.operationTypeDesc;
            this.operationUid = builder.operationUid;
            this.updateAfterAmount = builder.updateAfterAmount;
            this.updateAmount = builder.updateAmount;
            this.updateBeforeAmount = builder.updateBeforeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return operationSubmitType
         */
        public String getOperationSubmitType() {
            return this.operationSubmitType;
        }

        /**
         * @return operationTime
         */
        public String getOperationTime() {
            return this.operationTime;
        }

        /**
         * @return operationTypeCode
         */
        public String getOperationTypeCode() {
            return this.operationTypeCode;
        }

        /**
         * @return operationTypeDesc
         */
        public String getOperationTypeDesc() {
            return this.operationTypeDesc;
        }

        /**
         * @return operationUid
         */
        public String getOperationUid() {
            return this.operationUid;
        }

        /**
         * @return updateAfterAmount
         */
        public String getUpdateAfterAmount() {
            return this.updateAfterAmount;
        }

        /**
         * @return updateAmount
         */
        public String getUpdateAmount() {
            return this.updateAmount;
        }

        /**
         * @return updateBeforeAmount
         */
        public String getUpdateBeforeAmount() {
            return this.updateBeforeAmount;
        }

        public static final class Builder {
            private String operationSubmitType; 
            private String operationTime; 
            private String operationTypeCode; 
            private String operationTypeDesc; 
            private String operationUid; 
            private String updateAfterAmount; 
            private String updateAmount; 
            private String updateBeforeAmount; 

            /**
             * <p>The way to submit the quota adjustment operation. API/ACPN</p>
             * 
             * <strong>example:</strong>
             * <p>ACPN</p>
             */
            public Builder operationSubmitType(String operationSubmitType) {
                this.operationSubmitType = operationSubmitType;
                return this;
            }

            /**
             * <p>The time of submit the quota adjustment operation.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-15 10:34:36 UTC+8</p>
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * <p>Operation Type Enum</br>
             * all All types</br>
             * quota_create Create quota</br>
             * quota_amount_adjust Adjust the amount of quota</br></p>
             * 
             * <strong>example:</strong>
             * <p>quota_amount_adjust</p>
             */
            public Builder operationTypeCode(String operationTypeCode) {
                this.operationTypeCode = operationTypeCode;
                return this;
            }

            /**
             * <p>The description of submitted quota adjustment operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Quota Adjustment</p>
             */
            public Builder operationTypeDesc(String operationTypeDesc) {
                this.operationTypeDesc = operationTypeDesc;
                return this;
            }

            /**
             * <p>The UID of operator(Partner&quot;s UID).</p>
             * 
             * <strong>example:</strong>
             * <p>5113766248601929</p>
             */
            public Builder operationUid(String operationUid) {
                this.operationUid = operationUid;
                return this;
            }

            /**
             * <p>Updated quota amount</p>
             * 
             * <strong>example:</strong>
             * <p>121.00</p>
             */
            public Builder updateAfterAmount(String updateAfterAmount) {
                this.updateAfterAmount = updateAfterAmount;
                return this;
            }

            /**
             * <p>The difference amount between updated quota and original quota.</p>
             * 
             * <strong>example:</strong>
             * <p>-100.00</p>
             */
            public Builder updateAmount(String updateAmount) {
                this.updateAmount = updateAmount;
                return this;
            }

            /**
             * <p>Original quota amount</p>
             * 
             * <strong>example:</strong>
             * <p>221.00</p>
             */
            public Builder updateBeforeAmount(String updateBeforeAmount) {
                this.updateBeforeAmount = updateBeforeAmount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
