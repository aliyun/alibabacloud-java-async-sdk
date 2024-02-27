// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CustomerQuotaRecordListResponseBody} extends {@link TeaModel}
 *
 * <p>CustomerQuotaRecordListResponseBody</p>
 */
public class CustomerQuotaRecordListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * Status code of returning result, 200 means success.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Listed data of returning result
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Description of returning data
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Current page number
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * Record number on each page
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ID of request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total volume
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public CustomerQuotaRecordListResponseBody build() {
            return new CustomerQuotaRecordListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("OperationSubmitType")
        private String operationSubmitType;

        @NameInMap("OperationTime")
        private String operationTime;

        @NameInMap("OperationTypeCode")
        private String operationTypeCode;

        @NameInMap("OperationTypeDesc")
        private String operationTypeDesc;

        @NameInMap("OperationUid")
        private String operationUid;

        @NameInMap("UpdateAfterAmount")
        private String updateAfterAmount;

        @NameInMap("UpdateAmount")
        private String updateAmount;

        @NameInMap("UpdateBeforeAmount")
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
             * The way to submit the quota adjustment operation. API/ACPN
             */
            public Builder operationSubmitType(String operationSubmitType) {
                this.operationSubmitType = operationSubmitType;
                return this;
            }

            /**
             * The time of submit the quota adjustment operation.
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * Operation Type Enum</br>
             * <p>
             * all All types</br>
             * quota_create Create quota</br>
             * quota_amount_adjust Adjust the amount of quota</br>
             */
            public Builder operationTypeCode(String operationTypeCode) {
                this.operationTypeCode = operationTypeCode;
                return this;
            }

            /**
             * The description of submitted quota adjustment operation.
             */
            public Builder operationTypeDesc(String operationTypeDesc) {
                this.operationTypeDesc = operationTypeDesc;
                return this;
            }

            /**
             * The UID of operator(Partner\"s UID).
             */
            public Builder operationUid(String operationUid) {
                this.operationUid = operationUid;
                return this;
            }

            /**
             * Updated quota amount
             */
            public Builder updateAfterAmount(String updateAfterAmount) {
                this.updateAfterAmount = updateAfterAmount;
                return this;
            }

            /**
             * The difference amount between updated quota and original quota.
             */
            public Builder updateAmount(String updateAmount) {
                this.updateAmount = updateAmount;
                return this;
            }

            /**
             * Original quota amount
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
