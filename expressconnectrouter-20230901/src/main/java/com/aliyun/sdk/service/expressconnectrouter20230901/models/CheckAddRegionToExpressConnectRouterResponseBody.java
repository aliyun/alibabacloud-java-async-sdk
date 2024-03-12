// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAddRegionToExpressConnectRouterResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAddRegionToExpressConnectRouterResponseBody</p>
 */
public class CheckAddRegionToExpressConnectRouterResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("AnyCrossBorderLink")
    private Boolean anyCrossBorderLink;

    @NameInMap("AnyInterRegionLink")
    private Boolean anyInterRegionLink;

    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("IsCdtCrossBorderEnabled")
    private Boolean isCdtCrossBorderEnabled;

    @NameInMap("IsCdtInterRegionEnabled")
    private Boolean isCdtInterRegionEnabled;

    @NameInMap("IsUserAllowedToCreateCrossBorderLink")
    private Boolean isUserAllowedToCreateCrossBorderLink;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CheckAddRegionToExpressConnectRouterResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.anyCrossBorderLink = builder.anyCrossBorderLink;
        this.anyInterRegionLink = builder.anyInterRegionLink;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.isCdtCrossBorderEnabled = builder.isCdtCrossBorderEnabled;
        this.isCdtInterRegionEnabled = builder.isCdtInterRegionEnabled;
        this.isUserAllowedToCreateCrossBorderLink = builder.isUserAllowedToCreateCrossBorderLink;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAddRegionToExpressConnectRouterResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return anyCrossBorderLink
     */
    public Boolean getAnyCrossBorderLink() {
        return this.anyCrossBorderLink;
    }

    /**
     * @return anyInterRegionLink
     */
    public Boolean getAnyInterRegionLink() {
        return this.anyInterRegionLink;
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
     * @return isCdtCrossBorderEnabled
     */
    public Boolean getIsCdtCrossBorderEnabled() {
        return this.isCdtCrossBorderEnabled;
    }

    /**
     * @return isCdtInterRegionEnabled
     */
    public Boolean getIsCdtInterRegionEnabled() {
        return this.isCdtInterRegionEnabled;
    }

    /**
     * @return isUserAllowedToCreateCrossBorderLink
     */
    public Boolean getIsUserAllowedToCreateCrossBorderLink() {
        return this.isUserAllowedToCreateCrossBorderLink;
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
        private Boolean anyCrossBorderLink; 
        private Boolean anyInterRegionLink; 
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private Boolean isCdtCrossBorderEnabled; 
        private Boolean isCdtInterRegionEnabled; 
        private Boolean isUserAllowedToCreateCrossBorderLink; 
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
         * AnyCrossBorderLink.
         */
        public Builder anyCrossBorderLink(Boolean anyCrossBorderLink) {
            this.anyCrossBorderLink = anyCrossBorderLink;
            return this;
        }

        /**
         * AnyInterRegionLink.
         */
        public Builder anyInterRegionLink(Boolean anyInterRegionLink) {
            this.anyInterRegionLink = anyInterRegionLink;
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
         * IsCdtCrossBorderEnabled.
         */
        public Builder isCdtCrossBorderEnabled(Boolean isCdtCrossBorderEnabled) {
            this.isCdtCrossBorderEnabled = isCdtCrossBorderEnabled;
            return this;
        }

        /**
         * IsCdtInterRegionEnabled.
         */
        public Builder isCdtInterRegionEnabled(Boolean isCdtInterRegionEnabled) {
            this.isCdtInterRegionEnabled = isCdtInterRegionEnabled;
            return this;
        }

        /**
         * IsUserAllowedToCreateCrossBorderLink.
         */
        public Builder isUserAllowedToCreateCrossBorderLink(Boolean isUserAllowedToCreateCrossBorderLink) {
            this.isUserAllowedToCreateCrossBorderLink = isUserAllowedToCreateCrossBorderLink;
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

        public CheckAddRegionToExpressConnectRouterResponseBody build() {
            return new CheckAddRegionToExpressConnectRouterResponseBody(this);
        } 

    } 

}
