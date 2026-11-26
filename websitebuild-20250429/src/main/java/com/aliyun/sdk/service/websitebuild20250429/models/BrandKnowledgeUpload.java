// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BrandKnowledgeUpload} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeUpload</p>
 */
public class BrandKnowledgeUpload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DocumentId")
    private String documentId;

    @com.aliyun.core.annotation.NameInMap("ExpiresAt")
    private Long expiresAt;

    @com.aliyun.core.annotation.NameInMap("FormFields")
    private java.util.Map<String, String> formFields;

    @com.aliyun.core.annotation.NameInMap("Headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("Method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("UploadUrl")
    private String uploadUrl;

    private BrandKnowledgeUpload(Builder builder) {
        this.documentId = builder.documentId;
        this.expiresAt = builder.expiresAt;
        this.formFields = builder.formFields;
        this.headers = builder.headers;
        this.method = builder.method;
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeUpload create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * @return expiresAt
     */
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return formFields
     */
    public java.util.Map<String, String> getFormFields() {
        return this.formFields;
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static final class Builder {
        private String documentId; 
        private Long expiresAt; 
        private java.util.Map<String, String> formFields; 
        private java.util.Map<String, String> headers; 
        private String method; 
        private String uploadUrl; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeUpload model) {
            this.documentId = model.documentId;
            this.expiresAt = model.expiresAt;
            this.formFields = model.formFields;
            this.headers = model.headers;
            this.method = model.method;
            this.uploadUrl = model.uploadUrl;
        } 

        /**
         * <p>The knowledge base document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bkd_example001</p>
         */
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        /**
         * <p>The expiration time of the temporary URL, specified as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1795659000000</p>
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The fields that must be submitted as-is during form upload.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;example/document.pdf&quot;}</p>
         */
        public Builder formFields(java.util.Map<String, String> formFields) {
            this.formFields = formFields;
            return this;
        }

        /**
         * <p>The HTTP request headers included in the upload request.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Content-Type&quot;:&quot;application/pdf&quot;}</p>
         */
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The HTTP method used for uploading the original document.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The temporary destination URL for uploading the original document.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/upload">https://example.com/upload</a></p>
         */
        public Builder uploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }

        public BrandKnowledgeUpload build() {
            return new BrandKnowledgeUpload(this);
        } 

    } 

}
