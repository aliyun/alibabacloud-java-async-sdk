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
 * {@link CreatePageRequest} extends {@link RequestModel}
 *
 * <p>CreatePageRequest</p>
 */
public class CreatePageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteIds")
    private java.util.List<Long> siteIds;

    private CreatePageRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.description = builder.description;
        this.name = builder.name;
        this.siteIds = builder.siteIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePageRequest create() {
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

    public static final class Builder extends Request.Builder<CreatePageRequest, Builder> {
        private String content; 
        private String contentType; 
        private String description; 
        private String name; 
        private java.util.List<Long> siteIds; 

        private Builder() {
            super();
        } 

        private Builder(CreatePageRequest request) {
            super(request);
            this.content = request.content;
            this.contentType = request.contentType;
            this.description = request.description;
            this.name = request.name;
            this.siteIds = request.siteIds;
        } 

        /**
         * <p>The BASE64-encoded page content. The actual content format must match the value of <code>ContentType</code>.</p>
         * <p><strong>Encoding method</strong>:</p>
         * <ol>
         * <li>Encode the original page content into a byte string by using UTF-8 encoding.</li>
         * <li>Apply standard BASE64 encoding to the byte string.</li>
         * </ol>
         * <p><strong>Example</strong>:</p>
         * <ul>
         * <li>Original content: <code>&lt;html&gt;hello page&lt;/html&gt;</code></li>
         * <li>BASE64: <code>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</code></li>
         * </ul>
         * <blockquote>
         * <p>The maximum size, supported character sets, and security filtering rules are subject to the server-side custom page specifications.</p>
         * </blockquote>
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
         * <p>The MIME type of the page content. This value is returned to the client as the HTTP <code>Content-Type</code> response header after a match.</p>
         * <p><strong>Common values</strong>:</p>
         * <ul>
         * <li><code>text/html</code>: HTML page. The <code>Content</code> parameter must be set to the BASE64-encoded value of UTF-8 HTML text.</li>
         * <li><code>application/json</code>: JSON response. The <code>Content</code> parameter must be set to the BASE64-encoded value of a valid JSON string.</li>
         * <li><code>text/plain</code>: plain text. The <code>Content</code> parameter must be set to the BASE64-encoded value of plain text content.</li>
         * </ul>
         * <blockquote>
         * <p>Note: The complete list of supported ContentType values is subject to the server-side specifications. If the specified <code>ContentType</code> does not match the actual format of <code>Content</code>, the client may fail to render the page properly.</p>
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
         * <p>The description of the page, used to identify the purpose of the page in the console list.</p>
         * <p><strong>Suggested content</strong>: Use the scenarios and identity information of the page, such as &quot;CC protection block page - Chinese version&quot;. This is an optional field. If not specified, the value is empty by default.</p>
         * <blockquote>
         * <p>The maximum field length is subject to the server-side specifications.</p>
         * </blockquote>
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
         * <p>The name of the custom page.</p>
         * <p><strong>Naming suggestions</strong>: Use a short name that consists of letters, digits, and underscores, such as <code>blocked_page_v1</code>, for easy reference in rules. The specific character set, maximum length, uniqueness, and other constraints are <strong>subject to the server-side custom page naming specifications</strong>.</p>
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
         * <p>The list of website IDs to associate with this custom page.</p>
         * <ul>
         * <li>You can obtain website IDs by calling the <code>ListSites</code> operation.</li>
         * <li>If you pass an empty list (no websites are associated), the page is still created but does not take effect. You can call the <code>UpdatePage</code> operation later to associate websites.</li>
         * <li>If the list contains a website ID that does not belong to the current account, an <code>InvalidParameter</code> error is returned.</li>
         * </ul>
         */
        public Builder siteIds(java.util.List<Long> siteIds) {
            String siteIdsShrink = shrink(siteIds, "SiteIds", "json");
            this.putBodyParameter("SiteIds", siteIdsShrink);
            this.siteIds = siteIds;
            return this;
        }

        @Override
        public CreatePageRequest build() {
            return new CreatePageRequest(this);
        } 

    } 

}
