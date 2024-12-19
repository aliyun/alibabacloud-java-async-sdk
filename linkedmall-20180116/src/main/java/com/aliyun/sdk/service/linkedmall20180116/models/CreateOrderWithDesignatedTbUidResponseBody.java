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
 * {@link CreateOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrderWithDesignatedTbUidResponseBody</p>
 */
public class CreateOrderWithDesignatedTbUidResponseBody extends TeaModel {
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

    private CreateOrderWithDesignatedTbUidResponseBody(Builder builder) {
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

    public static CreateOrderWithDesignatedTbUidResponseBody create() {
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
         * <p>pageSize</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

        public CreateOrderWithDesignatedTbUidResponseBody build() {
            return new CreateOrderWithDesignatedTbUidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllIdsMap")
        private java.util.Map<String, java.util.Map<String, ?>> allIdsMap;

        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("LmOrderIds")
        private java.util.List<String> lmOrderIds;

        @com.aliyun.core.annotation.NameInMap("OrderIds")
        private java.util.List<String> orderIds;

        @com.aliyun.core.annotation.NameInMap("PayTradeIds")
        private java.util.List<String> payTradeIds;

        @com.aliyun.core.annotation.NameInMap("RedirectUrl")
        private String redirectUrl;

        private Model(Builder builder) {
            this.allIdsMap = builder.allIdsMap;
            this.app = builder.app;
            this.lmOrderIds = builder.lmOrderIds;
            this.orderIds = builder.orderIds;
            this.payTradeIds = builder.payTradeIds;
            this.redirectUrl = builder.redirectUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return allIdsMap
         */
        public java.util.Map<String, java.util.Map<String, ?>> getAllIdsMap() {
            return this.allIdsMap;
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return lmOrderIds
         */
        public java.util.List<String> getLmOrderIds() {
            return this.lmOrderIds;
        }

        /**
         * @return orderIds
         */
        public java.util.List<String> getOrderIds() {
            return this.orderIds;
        }

        /**
         * @return payTradeIds
         */
        public java.util.List<String> getPayTradeIds() {
            return this.payTradeIds;
        }

        /**
         * @return redirectUrl
         */
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public static final class Builder {
            private java.util.Map<String, java.util.Map<String, ?>> allIdsMap; 
            private String app; 
            private java.util.List<String> lmOrderIds; 
            private java.util.List<String> orderIds; 
            private java.util.List<String> payTradeIds; 
            private String redirectUrl; 

            /**
             * AllIdsMap.
             */
            public Builder allIdsMap(java.util.Map<String, java.util.Map<String, ?>> allIdsMap) {
                this.allIdsMap = allIdsMap;
                return this;
            }

            /**
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * LmOrderIds.
             */
            public Builder lmOrderIds(java.util.List<String> lmOrderIds) {
                this.lmOrderIds = lmOrderIds;
                return this;
            }

            /**
             * OrderIds.
             */
            public Builder orderIds(java.util.List<String> orderIds) {
                this.orderIds = orderIds;
                return this;
            }

            /**
             * PayTradeIds.
             */
            public Builder payTradeIds(java.util.List<String> payTradeIds) {
                this.payTradeIds = payTradeIds;
                return this;
            }

            /**
             * RedirectUrl.
             */
            public Builder redirectUrl(String redirectUrl) {
                this.redirectUrl = redirectUrl;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
