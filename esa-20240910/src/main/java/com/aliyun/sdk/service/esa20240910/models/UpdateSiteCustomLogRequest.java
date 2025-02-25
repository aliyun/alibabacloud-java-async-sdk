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
 * {@link UpdateSiteCustomLogRequest} extends {@link RequestModel}
 *
 * <p>UpdateSiteCustomLogRequest</p>
 */
public class UpdateSiteCustomLogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cookies")
    private java.util.List<String> cookies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestHeaders")
    private java.util.List<String> requestHeaders;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseHeaders")
    private java.util.List<String> responseHeaders;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private UpdateSiteCustomLogRequest(Builder builder) {
        super(builder);
        this.cookies = builder.cookies;
        this.requestHeaders = builder.requestHeaders;
        this.responseHeaders = builder.responseHeaders;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSiteCustomLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateSiteCustomLogRequest, Builder> {
        private java.util.List<String> cookies; 
        private java.util.List<String> requestHeaders; 
        private java.util.List<String> responseHeaders; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSiteCustomLogRequest request) {
            super(request);
            this.cookies = request.cookies;
            this.requestHeaders = request.requestHeaders;
            this.responseHeaders = request.responseHeaders;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The cookie fields.</p>
         */
        public Builder cookies(java.util.List<String> cookies) {
            String cookiesShrink = shrink(cookies, "Cookies", "json");
            this.putBodyParameter("Cookies", cookiesShrink);
            this.cookies = cookies;
            return this;
        }

        /**
         * <p>The request header fields.</p>
         */
        public Builder requestHeaders(java.util.List<String> requestHeaders) {
            String requestHeadersShrink = shrink(requestHeaders, "RequestHeaders", "json");
            this.putBodyParameter("RequestHeaders", requestHeadersShrink);
            this.requestHeaders = requestHeaders;
            return this;
        }

        /**
         * <p>The response header fields.</p>
         */
        public Builder responseHeaders(java.util.List<String> responseHeaders) {
            String responseHeadersShrink = shrink(responseHeaders, "ResponseHeaders", "json");
            this.putBodyParameter("ResponseHeaders", responseHeadersShrink);
            this.responseHeaders = responseHeaders;
            return this;
        }

        /**
         * <p>site id</p>
         * 
         * <strong>example:</strong>
         * <p>11223****</p>
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateSiteCustomLogRequest build() {
            return new UpdateSiteCustomLogRequest(this);
        } 

    } 

}
