// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ModifyRefundWithDesignatedTbUidResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRefundWithDesignatedTbUidResponseBody</p>
 */
public class ModifyRefundWithDesignatedTbUidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ModifyRefundWithDesignatedTbUidResponseBody(Builder builder) {
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

    public static ModifyRefundWithDesignatedTbUidResponseBody create() {
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
         * PageSize.
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

        public ModifyRefundWithDesignatedTbUidResponseBody build() {
            return new ModifyRefundWithDesignatedTbUidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyRefundWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyRefundWithDesignatedTbUidResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisputeId")
        private Long disputeId;

        @com.aliyun.core.annotation.NameInMap("DisputeStatus")
        private Integer disputeStatus;

        @com.aliyun.core.annotation.NameInMap("DisputeType")
        private Integer disputeType;

        @com.aliyun.core.annotation.NameInMap("SubLmOrderId")
        private String subLmOrderId;

        private Model(Builder builder) {
            this.disputeId = builder.disputeId;
            this.disputeStatus = builder.disputeStatus;
            this.disputeType = builder.disputeType;
            this.subLmOrderId = builder.subLmOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return disputeId
         */
        public Long getDisputeId() {
            return this.disputeId;
        }

        /**
         * @return disputeStatus
         */
        public Integer getDisputeStatus() {
            return this.disputeStatus;
        }

        /**
         * @return disputeType
         */
        public Integer getDisputeType() {
            return this.disputeType;
        }

        /**
         * @return subLmOrderId
         */
        public String getSubLmOrderId() {
            return this.subLmOrderId;
        }

        public static final class Builder {
            private Long disputeId; 
            private Integer disputeStatus; 
            private Integer disputeType; 
            private String subLmOrderId; 

            /**
             * DisputeId.
             */
            public Builder disputeId(Long disputeId) {
                this.disputeId = disputeId;
                return this;
            }

            /**
             * DisputeStatus.
             */
            public Builder disputeStatus(Integer disputeStatus) {
                this.disputeStatus = disputeStatus;
                return this;
            }

            /**
             * DisputeType.
             */
            public Builder disputeType(Integer disputeType) {
                this.disputeType = disputeType;
                return this;
            }

            /**
             * SubLmOrderId.
             */
            public Builder subLmOrderId(String subLmOrderId) {
                this.subLmOrderId = subLmOrderId;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
