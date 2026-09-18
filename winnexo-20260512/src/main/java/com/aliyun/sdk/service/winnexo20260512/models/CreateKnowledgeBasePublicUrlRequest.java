// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateKnowledgeBasePublicUrlRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeBasePublicUrlRequest</p>
 */
public class CreateKnowledgeBasePublicUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("notes")
    private String notes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originalUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTags")
    private String sourceTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreateKnowledgeBasePublicUrlRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.name = builder.name;
        this.notes = builder.notes;
        this.operatingObjectName = builder.operatingObjectName;
        this.originalUrl = builder.originalUrl;
        this.sourceTags = builder.sourceTags;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBasePublicUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return originalUrl
     */
    public String getOriginalUrl() {
        return this.originalUrl;
    }

    /**
     * @return sourceTags
     */
    public String getSourceTags() {
        return this.sourceTags;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateKnowledgeBasePublicUrlRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String name; 
        private String notes; 
        private String operatingObjectName; 
        private String originalUrl; 
        private String sourceTags; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeBasePublicUrlRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.name = request.name;
            this.notes = request.notes;
            this.operatingObjectName = request.operatingObjectName;
            this.originalUrl = request.originalUrl;
            this.sourceTags = request.sourceTags;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The resource description.</p>
         * 
         * <strong>example:</strong>
         * <p>Project design document</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the destination folder in the enterprise knowledge base. This parameter is required. You must have knowledge base management permissions on the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_tenant_child</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The resource name. If not specified, the URL is used.</p>
         * 
         * <strong>example:</strong>
         * <p>Project Plan</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The analysis instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>Extract decisions and to-do items</p>
         */
        public Builder notes(String notes) {
            this.putBodyParameter("notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * <p>The name of the operating object.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Assistant</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>The URL of the public HTTP/HTTPS web page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        public Builder originalUrl(String originalUrl) {
            this.putBodyParameter("originalUrl", originalUrl);
            this.originalUrl = originalUrl;
            return this;
        }

        /**
         * <p>The list of resource tags as JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;R&amp;D&quot;]</p>
         */
        public Builder sourceTags(String sourceTags) {
            this.putBodyParameter("sourceTags", sourceTags);
            this.sourceTags = sourceTags;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateKnowledgeBasePublicUrlRequest build() {
            return new CreateKnowledgeBasePublicUrlRequest(this);
        } 

    } 

}
