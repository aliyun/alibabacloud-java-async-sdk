// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link DocumentTranslateRequest} extends {@link RequestModel}
 *
 * <p>DocumentTranslateRequest</p>
 */
public class DocumentTranslateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Glossary")
    private String glossary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private DocumentTranslateRequest(Builder builder) {
        super(builder);
        this.fileType = builder.fileType;
        this.glossary = builder.glossary;
        this.targetLanguage = builder.targetLanguage;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DocumentTranslateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return glossary
     */
    public String getGlossary() {
        return this.glossary;
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<DocumentTranslateRequest, Builder> {
        private String fileType; 
        private String glossary; 
        private String targetLanguage; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(DocumentTranslateRequest request) {
            super(request);
            this.fileType = request.fileType;
            this.glossary = request.glossary;
            this.targetLanguage = request.targetLanguage;
            this.url = request.url;
        } 

        /**
         * <p>The supported document types: PDF/Word.<br>Supported capacity limits:  </p>
         * <ul>
         * <li>word: 200 MB/100 pages </li>
         * <li>PDF: 200 MB/100 pages  </li>
         * <li>Maximum size per file: 200 MB</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PDF</p>
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The glossary ID. Specify this parameter when you need the glossary feature. Supports custom translation results, including do-not-translate (ABC-ABC), specified translation (ABC-DEF), and skip translation (ABC-empty value). This is commonly used for scenarios such as brand name protection.</p>
         * 
         * <strong>example:</strong>
         * <p>glossary_1</p>
         */
        public Builder glossary(String glossary) {
            this.putQueryParameter("Glossary", glossary);
            this.glossary = glossary;
            return this;
        }

        /**
         * <p>The target language. The language code uses the two-letter ISO 639-1 standard.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putQueryParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * <p>The OSS URL of the document to be translated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aib-innovation-oss.oss-accelerate.aliyuncs.com/AI_Business/38dao/testdemo.pdf?Expires=3356578313&OSSAccessKeyId=LTAI5tE8X3gEy66SRU1V8dig&Signature=8niQY2HtMQY7h05zmSUdyORML9E%3D">https://aib-innovation-oss.oss-accelerate.aliyuncs.com/AI_Business/38dao/testdemo.pdf?Expires=3356578313&amp;OSSAccessKeyId=LTAI5tE8X3gEy66SRU1V8dig&amp;Signature=8niQY2HtMQY7h05zmSUdyORML9E%3D</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public DocumentTranslateRequest build() {
            return new DocumentTranslateRequest(this);
        } 

    } 

}
