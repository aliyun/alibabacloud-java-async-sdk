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
 * {@link EnableOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
 *
 * <p>EnableOrderWithDesignatedTbUidResponseBody</p>
 */
public class EnableOrderWithDesignatedTbUidResponseBody extends TeaModel {
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

    private EnableOrderWithDesignatedTbUidResponseBody(Builder builder) {
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

    public static EnableOrderWithDesignatedTbUidResponseBody create() {
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
         * <p>1</p>
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

        public EnableOrderWithDesignatedTbUidResponseBody build() {
            return new EnableOrderWithDesignatedTbUidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnableOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>EnableOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class LmOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtJson")
        private java.util.Map<String, String> extJson;

        @com.aliyun.core.annotation.NameInMap("LmOrderId")
        private String lmOrderId;

        @com.aliyun.core.annotation.NameInMap("SubLmOrderIdList")
        private java.util.List<String> subLmOrderIdList;

        private LmOrderList(Builder builder) {
            this.extJson = builder.extJson;
            this.lmOrderId = builder.lmOrderId;
            this.subLmOrderIdList = builder.subLmOrderIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LmOrderList create() {
            return builder().build();
        }

        /**
         * @return extJson
         */
        public java.util.Map<String, String> getExtJson() {
            return this.extJson;
        }

        /**
         * @return lmOrderId
         */
        public String getLmOrderId() {
            return this.lmOrderId;
        }

        /**
         * @return subLmOrderIdList
         */
        public java.util.List<String> getSubLmOrderIdList() {
            return this.subLmOrderIdList;
        }

        public static final class Builder {
            private java.util.Map<String, String> extJson; 
            private String lmOrderId; 
            private java.util.List<String> subLmOrderIdList; 

            /**
             * ExtJson.
             */
            public Builder extJson(java.util.Map<String, String> extJson) {
                this.extJson = extJson;
                return this;
            }

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(String lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            /**
             * SubLmOrderIdList.
             */
            public Builder subLmOrderIdList(java.util.List<String> subLmOrderIdList) {
                this.subLmOrderIdList = subLmOrderIdList;
                return this;
            }

            public LmOrderList build() {
                return new LmOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnableOrderWithDesignatedTbUidResponseBody} extends {@link TeaModel}
     *
     * <p>EnableOrderWithDesignatedTbUidResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LmOrderList")
        private java.util.List<LmOrderList> lmOrderList;

        @com.aliyun.core.annotation.NameInMap("OrderIds")
        private java.util.List<String> orderIds;

        @com.aliyun.core.annotation.NameInMap("PayTradeIds")
        private java.util.List<String> payTradeIds;

        @com.aliyun.core.annotation.NameInMap("RedirectUrl")
        private String redirectUrl;

        private Model(Builder builder) {
            this.lmOrderList = builder.lmOrderList;
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
         * @return lmOrderList
         */
        public java.util.List<LmOrderList> getLmOrderList() {
            return this.lmOrderList;
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
            private java.util.List<LmOrderList> lmOrderList; 
            private java.util.List<String> orderIds; 
            private java.util.List<String> payTradeIds; 
            private String redirectUrl; 

            /**
             * LmOrderList.
             */
            public Builder lmOrderList(java.util.List<LmOrderList> lmOrderList) {
                this.lmOrderList = lmOrderList;
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
