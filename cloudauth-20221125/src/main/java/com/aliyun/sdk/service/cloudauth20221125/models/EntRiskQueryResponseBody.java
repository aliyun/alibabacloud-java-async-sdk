// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntRiskQueryResponseBody} extends {@link TeaModel}
 *
 * <p>EntRiskQueryResponseBody</p>
 */
public class EntRiskQueryResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private EntRiskQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntRiskQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public EntRiskQueryResponseBody build() {
            return new EntRiskQueryResponseBody(this);
        } 

    } 

    public static class RiskList extends TeaModel {
        @NameInMap("CreditCode")
        private String creditCode;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("ListedDate")
        private String listedDate;

        @NameInMap("ListedReason")
        private String listedReason;

        @NameInMap("OperationOrg")
        private String operationOrg;

        @NameInMap("RegNo")
        private String regNo;

        @NameInMap("RemovedDate")
        private String removedDate;

        @NameInMap("RemovedOrg")
        private String removedOrg;

        @NameInMap("RemovedReason")
        private String removedReason;

        private RiskList(Builder builder) {
            this.creditCode = builder.creditCode;
            this.entName = builder.entName;
            this.listedDate = builder.listedDate;
            this.listedReason = builder.listedReason;
            this.operationOrg = builder.operationOrg;
            this.regNo = builder.regNo;
            this.removedDate = builder.removedDate;
            this.removedOrg = builder.removedOrg;
            this.removedReason = builder.removedReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskList create() {
            return builder().build();
        }

        /**
         * @return creditCode
         */
        public String getCreditCode() {
            return this.creditCode;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return listedDate
         */
        public String getListedDate() {
            return this.listedDate;
        }

        /**
         * @return listedReason
         */
        public String getListedReason() {
            return this.listedReason;
        }

        /**
         * @return operationOrg
         */
        public String getOperationOrg() {
            return this.operationOrg;
        }

        /**
         * @return regNo
         */
        public String getRegNo() {
            return this.regNo;
        }

        /**
         * @return removedDate
         */
        public String getRemovedDate() {
            return this.removedDate;
        }

        /**
         * @return removedOrg
         */
        public String getRemovedOrg() {
            return this.removedOrg;
        }

        /**
         * @return removedReason
         */
        public String getRemovedReason() {
            return this.removedReason;
        }

        public static final class Builder {
            private String creditCode; 
            private String entName; 
            private String listedDate; 
            private String listedReason; 
            private String operationOrg; 
            private String regNo; 
            private String removedDate; 
            private String removedOrg; 
            private String removedReason; 

            /**
             * CreditCode.
             */
            public Builder creditCode(String creditCode) {
                this.creditCode = creditCode;
                return this;
            }

            /**
             * EntName.
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * ListedDate.
             */
            public Builder listedDate(String listedDate) {
                this.listedDate = listedDate;
                return this;
            }

            /**
             * ListedReason.
             */
            public Builder listedReason(String listedReason) {
                this.listedReason = listedReason;
                return this;
            }

            /**
             * OperationOrg.
             */
            public Builder operationOrg(String operationOrg) {
                this.operationOrg = operationOrg;
                return this;
            }

            /**
             * RegNo.
             */
            public Builder regNo(String regNo) {
                this.regNo = regNo;
                return this;
            }

            /**
             * RemovedDate.
             */
            public Builder removedDate(String removedDate) {
                this.removedDate = removedDate;
                return this;
            }

            /**
             * RemovedOrg.
             */
            public Builder removedOrg(String removedOrg) {
                this.removedOrg = removedOrg;
                return this;
            }

            /**
             * RemovedReason.
             */
            public Builder removedReason(String removedReason) {
                this.removedReason = removedReason;
                return this;
            }

            public RiskList build() {
                return new RiskList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("BizCode")
        private String bizCode;

        @NameInMap("RiskList")
        private java.util.List < RiskList> riskList;

        @NameInMap("Status")
        private String status;

        private Result(Builder builder) {
            this.bizCode = builder.bizCode;
            this.riskList = builder.riskList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return riskList
         */
        public java.util.List < RiskList> getRiskList() {
            return this.riskList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizCode; 
            private java.util.List < RiskList> riskList; 
            private String status; 

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * RiskList.
             */
            public Builder riskList(java.util.List < RiskList> riskList) {
                this.riskList = riskList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
