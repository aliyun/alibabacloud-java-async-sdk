// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody</p>
 */
public class DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowedPrefixHistoryList")
    private java.util.List < AllowedPrefixHistoryList> allowedPrefixHistoryList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowedPrefixHistoryList = builder.allowedPrefixHistoryList;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowedPrefixHistoryList
     */
    public java.util.List < AllowedPrefixHistoryList> getAllowedPrefixHistoryList() {
        return this.allowedPrefixHistoryList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List < AllowedPrefixHistoryList> allowedPrefixHistoryList; 
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowedPrefixHistoryList.
         */
        public Builder allowedPrefixHistoryList(java.util.List < AllowedPrefixHistoryList> allowedPrefixHistoryList) {
            this.allowedPrefixHistoryList = allowedPrefixHistoryList;
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
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody build() {
            return new DescribeExpressConnectRouterAllowedPrefixHistoryResponseBody(this);
        } 

    } 

    public static class AllowedPrefixHistoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedPrefix")
        private java.util.List < String > allowedPrefix;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        private AllowedPrefixHistoryList(Builder builder) {
            this.allowedPrefix = builder.allowedPrefix;
            this.gmtCreate = builder.gmtCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllowedPrefixHistoryList create() {
            return builder().build();
        }

        /**
         * @return allowedPrefix
         */
        public java.util.List < String > getAllowedPrefix() {
            return this.allowedPrefix;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public static final class Builder {
            private java.util.List < String > allowedPrefix; 
            private String gmtCreate; 

            /**
             * AllowedPrefix.
             */
            public Builder allowedPrefix(java.util.List < String > allowedPrefix) {
                this.allowedPrefix = allowedPrefix;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            public AllowedPrefixHistoryList build() {
                return new AllowedPrefixHistoryList(this);
            } 

        } 

    }
}
