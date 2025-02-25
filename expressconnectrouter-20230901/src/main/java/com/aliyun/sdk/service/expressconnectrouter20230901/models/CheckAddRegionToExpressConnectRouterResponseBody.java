// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

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
 * {@link CheckAddRegionToExpressConnectRouterResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAddRegionToExpressConnectRouterResponseBody</p>
 */
public class CheckAddRegionToExpressConnectRouterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AnyCrossBorderLink")
    private Boolean anyCrossBorderLink;

    @com.aliyun.core.annotation.NameInMap("AnyInterRegionLink")
    private Boolean anyInterRegionLink;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("IsCdtCrossBorderEnabled")
    private Boolean isCdtCrossBorderEnabled;

    @com.aliyun.core.annotation.NameInMap("IsCdtInterRegionEnabled")
    private Boolean isCdtInterRegionEnabled;

    @com.aliyun.core.annotation.NameInMap("IsUserAllowedToCreateCrossBorderLink")
    private Boolean isUserAllowedToCreateCrossBorderLink;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>Authentication is failed for ****</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether the ECR is used to establish connections between regions in the Chinese mainland and regions outside China. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder anyCrossBorderLink(Boolean anyCrossBorderLink) {
            this.anyCrossBorderLink = anyCrossBorderLink;
            return this;
        }

        /**
         * <p>Indicates whether the ECR is used to establish connections between regions in the Chinese mainland. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder anyInterRegionLink(Boolean anyInterRegionLink) {
            this.anyInterRegionLink = anyInterRegionLink;
            return this;
        }

        /**
         * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed. For more information, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>IllegalParamFormat.EcrId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the <code>%s</code> variable in <strong>ErrMessage</strong>.</p>
         * <blockquote>
         * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsInstanceId</strong>, the request parameter <strong>DtsInstanceId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>The param format of EcrId **** is illegal.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Indicates whether the cross-border CDT service is activated for the account to which the ECR belongs. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isCdtCrossBorderEnabled(Boolean isCdtCrossBorderEnabled) {
            this.isCdtCrossBorderEnabled = isCdtCrossBorderEnabled;
            return this;
        }

        /**
         * <p>Indicates whether the CDT service is activated for the account to which the ECR belongs. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isCdtInterRegionEnabled(Boolean isCdtInterRegionEnabled) {
            this.isCdtInterRegionEnabled = isCdtInterRegionEnabled;
            return this;
        }

        /**
         * <p>Indicates whether the account to which the ECR belongs can create cross-border connections. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isUserAllowedToCreateCrossBorderLink(Boolean isUserAllowedToCreateCrossBorderLink) {
            this.isUserAllowedToCreateCrossBorderLink = isUserAllowedToCreateCrossBorderLink;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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
