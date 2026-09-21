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
 * {@link UpdatePageRequest} extends {@link RequestModel}
 *
 * <p>UpdatePageRequest</p>
 */
public class UpdatePageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteIds")
    private java.util.List<Long> siteIds;

    private UpdatePageRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.siteIds = builder.siteIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return siteIds
     */
    public java.util.List<Long> getSiteIds() {
        return this.siteIds;
    }

    public static final class Builder extends Request.Builder<UpdatePageRequest, Builder> {
        private String content; 
        private String contentType; 
        private String description; 
        private Long id; 
        private String name; 
        private java.util.List<Long> siteIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePageRequest request) {
            super(request);
            this.content = request.content;
            this.contentType = request.contentType;
            this.description = request.description;
            this.id = request.id;
            this.name = request.name;
            this.siteIds = request.siteIds;
        } 

        /**
         * <p>The BASE64-encoded page content, which must be consistent with <code>ContentType</code>.</p>
         * <p><strong>Encoding method</strong>:</p>
         * <ol>
         * <li>Convert the original page content to a UTF-8 byte string.</li>
         * <li>Encode the byte string using standard BASE64 encoding.</li>
         * </ol>
         * <p><strong>Example</strong>: <code>&lt;html&gt;hello page&lt;/html&gt;</code> → <code>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</code></p>
         * <blockquote>
         * <p>The maximum size limit is subject to the server-side custom page specification. If this parameter is not specified, the original page content is retained.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The MIME type of the page content, which is returned to the client as the HTTP <code>Content-Type</code> response header when a rule is matched.</p>
         * <p><strong>Common values</strong>:</p>
         * <ul>
         * <li><code>text/html</code>: HTML page</li>
         * <li><code>application/json</code>: JSON response</li>
         * </ul>
         * <blockquote>
         * <p>The complete set of supported values is subject to the server-side specification. The actual format of <code>Content</code> must match this field. A mismatch may cause browser rendering issues.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text/html</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The description of the page after the update. This is used to identify the purpose of the page in the console list. This is an optional field. If this parameter is not specified, the original description is retained. The maximum field length is subject to the server-side limit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom deny page</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the custom response page. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2850223.html">ListPages</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>50000001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the custom response page after the update.</p>
         * <p><strong>Naming suggestion</strong>: Use a combination of letters, digits, and underscores (such as <code>blocked_page_v2</code>) for easy reference in rules. The character set, maximum length, and uniqueness constraints are subject to the server-side naming conventions for custom pages. If this parameter is not specified, the original name is retained.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of site IDs associated with this page after the update. This parameter uses full overwrite semantics.</p>
         * <ul>
         * <li>You can obtain site IDs by calling the <code>ListSites</code> operation.</li>
         * <li>Passing an empty list dissociates all sites from the page.</li>
         * <li>Including a site ID that does not belong to your account returns an <code>InvalidParameter</code> error.</li>
         * </ul>
         */
        public Builder siteIds(java.util.List<Long> siteIds) {
            String siteIdsShrink = shrink(siteIds, "SiteIds", "json");
            this.putBodyParameter("SiteIds", siteIdsShrink);
            this.siteIds = siteIds;
            return this;
        }

        @Override
        public UpdatePageRequest build() {
            return new UpdatePageRequest(this);
        } 

    } 

}
