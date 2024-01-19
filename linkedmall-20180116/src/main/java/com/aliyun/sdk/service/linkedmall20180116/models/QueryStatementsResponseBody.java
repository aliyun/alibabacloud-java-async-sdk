// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStatementsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStatementsResponseBody</p>
 */
public class QueryStatementsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryStatementsResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStatementsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryStatementsResponseBody build() {
            return new QueryStatementsResponseBody(this);
        } 

    } 

    public static class StatementList extends TeaModel {
        @NameInMap("Attributes")
        private String attributes;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Currency")
        private String currency;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExtInfo")
        private String extInfo;

        @NameInMap("KpNoGenerateTime")
        private String kpNoGenerateTime;

        @NameInMap("ModifiedDate")
        private String modifiedDate;

        @NameInMap("PayeeAccountId")
        private String payeeAccountId;

        @NameInMap("PayeeAccountName")
        private String payeeAccountName;

        @NameInMap("PayeeAccountNo")
        private String payeeAccountNo;

        @NameInMap("PayeeId")
        private String payeeId;

        @NameInMap("PayeeName")
        private String payeeName;

        @NameInMap("SettleAmount")
        private String settleAmount;

        @NameInMap("SettleNo")
        private String settleNo;

        @NameInMap("SettleStatus")
        private String settleStatus;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StatusMessage")
        private String statusMessage;

        @NameInMap("TenantId")
        private String tenantId;

        private StatementList(Builder builder) {
            this.attributes = builder.attributes;
            this.createDate = builder.createDate;
            this.currency = builder.currency;
            this.endTime = builder.endTime;
            this.extInfo = builder.extInfo;
            this.kpNoGenerateTime = builder.kpNoGenerateTime;
            this.modifiedDate = builder.modifiedDate;
            this.payeeAccountId = builder.payeeAccountId;
            this.payeeAccountName = builder.payeeAccountName;
            this.payeeAccountNo = builder.payeeAccountNo;
            this.payeeId = builder.payeeId;
            this.payeeName = builder.payeeName;
            this.settleAmount = builder.settleAmount;
            this.settleNo = builder.settleNo;
            this.settleStatus = builder.settleStatus;
            this.startTime = builder.startTime;
            this.statusMessage = builder.statusMessage;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatementList create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return kpNoGenerateTime
         */
        public String getKpNoGenerateTime() {
            return this.kpNoGenerateTime;
        }

        /**
         * @return modifiedDate
         */
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        /**
         * @return payeeAccountId
         */
        public String getPayeeAccountId() {
            return this.payeeAccountId;
        }

        /**
         * @return payeeAccountName
         */
        public String getPayeeAccountName() {
            return this.payeeAccountName;
        }

        /**
         * @return payeeAccountNo
         */
        public String getPayeeAccountNo() {
            return this.payeeAccountNo;
        }

        /**
         * @return payeeId
         */
        public String getPayeeId() {
            return this.payeeId;
        }

        /**
         * @return payeeName
         */
        public String getPayeeName() {
            return this.payeeName;
        }

        /**
         * @return settleAmount
         */
        public String getSettleAmount() {
            return this.settleAmount;
        }

        /**
         * @return settleNo
         */
        public String getSettleNo() {
            return this.settleNo;
        }

        /**
         * @return settleStatus
         */
        public String getSettleStatus() {
            return this.settleStatus;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String attributes; 
            private String createDate; 
            private String currency; 
            private String endTime; 
            private String extInfo; 
            private String kpNoGenerateTime; 
            private String modifiedDate; 
            private String payeeAccountId; 
            private String payeeAccountName; 
            private String payeeAccountNo; 
            private String payeeId; 
            private String payeeName; 
            private String settleAmount; 
            private String settleNo; 
            private String settleStatus; 
            private String startTime; 
            private String statusMessage; 
            private String tenantId; 

            /**
             * Attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * KpNoGenerateTime.
             */
            public Builder kpNoGenerateTime(String kpNoGenerateTime) {
                this.kpNoGenerateTime = kpNoGenerateTime;
                return this;
            }

            /**
             * ModifiedDate.
             */
            public Builder modifiedDate(String modifiedDate) {
                this.modifiedDate = modifiedDate;
                return this;
            }

            /**
             * PayeeAccountId.
             */
            public Builder payeeAccountId(String payeeAccountId) {
                this.payeeAccountId = payeeAccountId;
                return this;
            }

            /**
             * PayeeAccountName.
             */
            public Builder payeeAccountName(String payeeAccountName) {
                this.payeeAccountName = payeeAccountName;
                return this;
            }

            /**
             * PayeeAccountNo.
             */
            public Builder payeeAccountNo(String payeeAccountNo) {
                this.payeeAccountNo = payeeAccountNo;
                return this;
            }

            /**
             * PayeeId.
             */
            public Builder payeeId(String payeeId) {
                this.payeeId = payeeId;
                return this;
            }

            /**
             * PayeeName.
             */
            public Builder payeeName(String payeeName) {
                this.payeeName = payeeName;
                return this;
            }

            /**
             * SettleAmount.
             */
            public Builder settleAmount(String settleAmount) {
                this.settleAmount = settleAmount;
                return this;
            }

            /**
             * SettleNo.
             */
            public Builder settleNo(String settleNo) {
                this.settleNo = settleNo;
                return this;
            }

            /**
             * SettleStatus.
             */
            public Builder settleStatus(String settleStatus) {
                this.settleStatus = settleStatus;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StatusMessage.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public StatementList build() {
                return new StatementList(this);
            } 

        } 

    }
    public static class Model extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("StatementList")
        private java.util.List < StatementList> statementList;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Model(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.statementList = builder.statementList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return statementList
         */
        public java.util.List < StatementList> getStatementList() {
            return this.statementList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < StatementList> statementList; 
            private Integer totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * StatementList.
             */
            public Builder statementList(java.util.List < StatementList> statementList) {
                this.statementList = statementList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
