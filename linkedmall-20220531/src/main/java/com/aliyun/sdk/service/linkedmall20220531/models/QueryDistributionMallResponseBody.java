// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDistributionMallResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDistributionMallResponseBody</p>
 */
public class QueryDistributionMallResponseBody extends TeaModel {
    @NameInMap("BizViewData")
    private java.util.Map < String, ? > bizViewData;

    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

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

    private QueryDistributionMallResponseBody(Builder builder) {
        this.bizViewData = builder.bizViewData;
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDistributionMallResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizViewData
     */
    public java.util.Map < String, ? > getBizViewData() {
        return this.bizViewData;
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
        private java.util.Map < String, ? > bizViewData; 
        private String code; 
        private String logsId; 
        private String message; 
        private Model model; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * BizViewData.
         */
        public Builder bizViewData(java.util.Map < String, ? > bizViewData) {
            this.bizViewData = bizViewData;
            return this;
        }

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
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(Long pageSize) {
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

        public QueryDistributionMallResponseBody build() {
            return new QueryDistributionMallResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("ChannelSupplierId")
        private String channelSupplierId;

        @NameInMap("DistributionMallId")
        private String distributionMallId;

        @NameInMap("DistributionMallName")
        private String distributionMallName;

        @NameInMap("DistributionMallType")
        private String distributionMallType;

        @NameInMap("DistributorId")
        private String distributorId;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Status")
        private String status;

        private Model(Builder builder) {
            this.channelSupplierId = builder.channelSupplierId;
            this.distributionMallId = builder.distributionMallId;
            this.distributionMallName = builder.distributionMallName;
            this.distributionMallType = builder.distributionMallType;
            this.distributorId = builder.distributorId;
            this.endDate = builder.endDate;
            this.startDate = builder.startDate;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return channelSupplierId
         */
        public String getChannelSupplierId() {
            return this.channelSupplierId;
        }

        /**
         * @return distributionMallId
         */
        public String getDistributionMallId() {
            return this.distributionMallId;
        }

        /**
         * @return distributionMallName
         */
        public String getDistributionMallName() {
            return this.distributionMallName;
        }

        /**
         * @return distributionMallType
         */
        public String getDistributionMallType() {
            return this.distributionMallType;
        }

        /**
         * @return distributorId
         */
        public String getDistributorId() {
            return this.distributorId;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String channelSupplierId; 
            private String distributionMallId; 
            private String distributionMallName; 
            private String distributionMallType; 
            private String distributorId; 
            private String endDate; 
            private String startDate; 
            private String status; 

            /**
             * ChannelSupplierId.
             */
            public Builder channelSupplierId(String channelSupplierId) {
                this.channelSupplierId = channelSupplierId;
                return this;
            }

            /**
             * DistributionMallId.
             */
            public Builder distributionMallId(String distributionMallId) {
                this.distributionMallId = distributionMallId;
                return this;
            }

            /**
             * DistributionMallName.
             */
            public Builder distributionMallName(String distributionMallName) {
                this.distributionMallName = distributionMallName;
                return this;
            }

            /**
             * DistributionMallType.
             */
            public Builder distributionMallType(String distributionMallType) {
                this.distributionMallType = distributionMallType;
                return this;
            }

            /**
             * DistributorId.
             */
            public Builder distributorId(String distributorId) {
                this.distributorId = distributorId;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
