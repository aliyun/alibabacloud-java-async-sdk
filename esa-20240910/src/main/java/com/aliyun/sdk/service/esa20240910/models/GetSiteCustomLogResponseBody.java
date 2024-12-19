// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetSiteCustomLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetSiteCustomLogResponseBody</p>
 */
public class GetSiteCustomLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("IsExist")
    private Boolean isExist;

    @com.aliyun.core.annotation.NameInMap("LogCustomField")
    private LogCustomField logCustomField;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private GetSiteCustomLogResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.isExist = builder.isExist;
        this.logCustomField = builder.logCustomField;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteCustomLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return isExist
     */
    public Boolean getIsExist() {
        return this.isExist;
    }

    /**
     * @return logCustomField
     */
    public LogCustomField getLogCustomField() {
        return this.logCustomField;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder {
        private Long configId; 
        private Boolean isExist; 
        private LogCustomField logCustomField; 
        private String requestId; 
        private Long siteId; 

        /**
         * <p>The ID of the custom log field configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>6befa4aa-2a94-4f51-a245-295787192d2c</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>Indicates whether the custom configuration exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isExist(Boolean isExist) {
            this.isExist = isExist;
            return this;
        }

        /**
         * <p>The custom fields.</p>
         */
        public Builder logCustomField(LogCustomField logCustomField) {
            this.logCustomField = logCustomField;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6befa4aa-2a94-4f51-a245-295787192d2c</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>167026711***</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        public GetSiteCustomLogResponseBody build() {
            return new GetSiteCustomLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSiteCustomLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetSiteCustomLogResponseBody</p>
     */
    public static class LogCustomField extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cookies")
        private java.util.List<String> cookies;

        @com.aliyun.core.annotation.NameInMap("RequestHeaders")
        private java.util.List<String> requestHeaders;

        @com.aliyun.core.annotation.NameInMap("ResponseHeaders")
        private java.util.List<String> responseHeaders;

        private LogCustomField(Builder builder) {
            this.cookies = builder.cookies;
            this.requestHeaders = builder.requestHeaders;
            this.responseHeaders = builder.responseHeaders;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogCustomField create() {
            return builder().build();
        }

        /**
         * @return cookies
         */
        public java.util.List<String> getCookies() {
            return this.cookies;
        }

        /**
         * @return requestHeaders
         */
        public java.util.List<String> getRequestHeaders() {
            return this.requestHeaders;
        }

        /**
         * @return responseHeaders
         */
        public java.util.List<String> getResponseHeaders() {
            return this.responseHeaders;
        }

        public static final class Builder {
            private java.util.List<String> cookies; 
            private java.util.List<String> requestHeaders; 
            private java.util.List<String> responseHeaders; 

            /**
             * <p>The cookie fields.</p>
             */
            public Builder cookies(java.util.List<String> cookies) {
                this.cookies = cookies;
                return this;
            }

            /**
             * <p>The request header fields.</p>
             */
            public Builder requestHeaders(java.util.List<String> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * <p>The response header fields.</p>
             */
            public Builder responseHeaders(java.util.List<String> responseHeaders) {
                this.responseHeaders = responseHeaders;
                return this;
            }

            public LogCustomField build() {
                return new LogCustomField(this);
            } 

        } 

    }
}
