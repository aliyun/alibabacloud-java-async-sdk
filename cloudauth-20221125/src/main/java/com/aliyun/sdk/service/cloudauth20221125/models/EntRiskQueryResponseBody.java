// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

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
 * {@link EntRiskQueryResponseBody} extends {@link TeaModel}
 *
 * <p>EntRiskQueryResponseBody</p>
 */
public class EntRiskQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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

        private Builder() {
        } 

        private Builder(EntRiskQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Error code. For details about error codes, see <strong><a href="https://help.aliyun.com/document_detail/215420.html">Error Codes</a></strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response message for the request information.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public EntRiskQueryResponseBody build() {
            return new EntRiskQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EntRiskQueryResponseBody} extends {@link TeaModel}
     *
     * <p>EntRiskQueryResponseBody</p>
     */
    public static class RiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreditCode")
        private String creditCode;

        @com.aliyun.core.annotation.NameInMap("EntName")
        private String entName;

        @com.aliyun.core.annotation.NameInMap("ListedDate")
        private String listedDate;

        @com.aliyun.core.annotation.NameInMap("ListedReason")
        private String listedReason;

        @com.aliyun.core.annotation.NameInMap("OperationOrg")
        private String operationOrg;

        @com.aliyun.core.annotation.NameInMap("RegNo")
        private String regNo;

        @com.aliyun.core.annotation.NameInMap("RemovedDate")
        private String removedDate;

        @com.aliyun.core.annotation.NameInMap("RemovedOrg")
        private String removedOrg;

        @com.aliyun.core.annotation.NameInMap("RemovedReason")
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

            private Builder() {
            } 

            private Builder(RiskList model) {
                this.creditCode = model.creditCode;
                this.entName = model.entName;
                this.listedDate = model.listedDate;
                this.listedReason = model.listedReason;
                this.operationOrg = model.operationOrg;
                this.regNo = model.regNo;
                this.removedDate = model.removedDate;
                this.removedOrg = model.removedOrg;
                this.removedReason = model.removedReason;
            } 

            /**
             * <p>Unified Social Credit Code</p>
             * 
             * <strong>example:</strong>
             * <p>92500112MA5UHU****</p>
             */
            public Builder creditCode(String creditCode) {
                this.creditCode = creditCode;
                return this;
            }

            /**
             * <p>Company name.</p>
             * 
             * <strong>example:</strong>
             * <p>杭州****</p>
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * <p>Date listed as abnormal
             * Example: 2023-02-03</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-03</p>
             */
            public Builder listedDate(String listedDate) {
                this.listedDate = listedDate;
                return this;
            }

            /**
             * <p>Reason for being listed as abnormal</p>
             * 
             * <strong>example:</strong>
             * <p>未按照《个体工商户年度报告暂行办法》***</p>
             */
            public Builder listedReason(String listedReason) {
                this.listedReason = listedReason;
                return this;
            }

            /**
             * <p>Authority that handled the inclusion</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong>市场监督</strong></em></p>
             */
            public Builder operationOrg(String operationOrg) {
                this.operationOrg = operationOrg;
                return this;
            }

            /**
             * <p>Business registration number</p>
             * 
             * <strong>example:</strong>
             * <p>50011260996****</p>
             */
            public Builder regNo(String regNo) {
                this.regNo = regNo;
                return this;
            }

            /**
             * <p>Date removed from the abnormal list
             * Example: 2023-02-03</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-06</p>
             */
            public Builder removedDate(String removedDate) {
                this.removedDate = removedDate;
                return this;
            }

            /**
             * <p>Authority that handled the removal</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong>市场监督</strong></em></p>
             */
            public Builder removedOrg(String removedOrg) {
                this.removedOrg = removedOrg;
                return this;
            }

            /**
             * <p>Reason for being removed from the abnormal list</p>
             * 
             * <strong>example:</strong>
             * <p>根据《个体工商户年度报告暂行办法》第十三条的规定******</p>
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
    /**
     * 
     * {@link EntRiskQueryResponseBody} extends {@link TeaModel}
     *
     * <p>EntRiskQueryResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("RiskList")
        private java.util.List<RiskList> riskList;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<RiskList> getRiskList() {
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
            private java.util.List<RiskList> riskList; 
            private String status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.bizCode = model.bizCode;
                this.riskList = model.riskList;
                this.status = model.status;
            } 

            /**
             * <p>Query result
             * 0: Normal business operation
             * 1: Abnormal business operation
             * 2: Not found</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>List of abnormal information</p>
             */
            public Builder riskList(java.util.List<RiskList> riskList) {
                this.riskList = riskList;
                return this;
            }

            /**
             * <p>Business operation status.</p>
             * <ul>
             * <li>1: In operation (open)</li>
             * <li>2: Relocated</li>
             * <li>3: Deregistered</li>
             * <li>4: Revoked</li>
             * <li>5: Canceled</li>
             * <li>6: Suspended</li>
             * <li>0: Other</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
