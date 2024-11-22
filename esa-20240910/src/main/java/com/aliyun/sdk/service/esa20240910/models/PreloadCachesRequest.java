// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PreloadCachesRequest} extends {@link RequestModel}
 *
 * <p>PreloadCachesRequest</p>
 */
public class PreloadCachesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List < String > content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private PreloadCachesRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.headers = builder.headers;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadCachesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List < String > getContent() {
        return this.content;
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<PreloadCachesRequest, Builder> {
        private java.util.List < String > content; 
        private java.util.Map < String, String > headers; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(PreloadCachesRequest request) {
            super(request);
            this.content = request.content;
            this.headers = request.headers;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The files to be prefetched.</p>
         */
        public Builder content(java.util.List < String > content) {
            String contentShrink = shrink(content, "Content", "json");
            this.putQueryParameter("Content", contentShrink);
            this.content = content;
            return this;
        }

        /**
         * <p>By default, prefetch requests include the Accept-Encoding:gzip header. If you want a prefetch request to include other headers or implement multi-replica prefetch, you can specify a custom prefetch header by configuring the Headers parameter.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            String headersShrink = shrink(headers, "Headers", "json");
            this.putQueryParameter("Headers", headersShrink);
            this.headers = headers;
            return this;
        }

        /**
         * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public PreloadCachesRequest build() {
            return new PreloadCachesRequest(this);
        } 

    } 

}
