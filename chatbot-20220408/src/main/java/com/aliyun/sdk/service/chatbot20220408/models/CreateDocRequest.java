// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link CreateDocRequest} extends {@link RequestModel}
 *
 * <p>CreateDocRequest</p>
 */
public class CreateDocRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocMetadata")
    private java.util.List<DocMetadata> docMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Meta")
    private String meta;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<Long> tagIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private CreateDocRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.categoryId = builder.categoryId;
        this.config = builder.config;
        this.content = builder.content;
        this.docMetadata = builder.docMetadata;
        this.endDate = builder.endDate;
        this.meta = builder.meta;
        this.startDate = builder.startDate;
        this.tagIds = builder.tagIds;
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDocRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return docMetadata
     */
    public java.util.List<DocMetadata> getDocMetadata() {
        return this.docMetadata;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return meta
     */
    public String getMeta() {
        return this.meta;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return tagIds
     */
    public java.util.List<Long> getTagIds() {
        return this.tagIds;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateDocRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long categoryId; 
        private String config; 
        private String content; 
        private java.util.List<DocMetadata> docMetadata; 
        private String endDate; 
        private String meta; 
        private String startDate; 
        private java.util.List<Long> tagIds; 
        private String title; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateDocRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.categoryId = request.categoryId;
            this.config = request.config;
            this.content = request.content;
            this.docMetadata = request.docMetadata;
            this.endDate = request.endDate;
            this.meta = request.meta;
            this.startDate = request.startDate;
            this.tagIds = request.tagIds;
            this.title = request.title;
            this.url = request.url;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the primary account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The document category ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30000049006</p>
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The document parsing and chunking configuration.</p>
         * <p>Configuration item: Splitter
         * KEY: Splitter
         * Valid values:</p>
         * <ul>
         * <li>ParagraphSplitter: recognition-based hierarchy.</li>
         * <li>TreeSplitter: rule-based hierarchy.</li>
         * </ul>
         * <p>Configuration item: Document chunk size
         * KEY: ChunkSize
         * VALUE: Default value: 500. Value range: [200, 800].</p>
         * <p>Configuration item: Rule-based hierarchy
         * KEY: TreePatterns
         * VALUE: Default value: [].</p>
         * <p>Configuration item: Document title source
         * KEY: TitleSource
         * Valid values:</p>
         * <ul>
         * <li>ocrTitle: OCR-recognized title. This is the default value.</li>
         * <li>docName: the document name is used as the title.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;&quot;}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The document content. Specify either this parameter or URL.</p>
         * 
         * <strong>example:</strong>
         * <p>Test content</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DocMetadata.
         */
        public Builder docMetadata(java.util.List<DocMetadata> docMetadata) {
            String docMetadataShrink = shrink(docMetadata, "DocMetadata", "json");
            this.putQueryParameter("DocMetadata", docMetadataShrink);
            this.docMetadata = docMetadata;
            return this;
        }

        /**
         * <p>The effective end time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2032-05-25T16:28:36Z</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The document metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
         */
        public Builder meta(String meta) {
            this.putQueryParameter("Meta", meta);
            this.meta = meta;
            return this;
        }

        /**
         * <p>The effective start time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-25T16:28:36Z</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The list of tag IDs.</p>
         */
        public Builder tagIds(java.util.List<Long> tagIds) {
            String tagIdsShrink = shrink(tagIds, "TagIds", "json");
            this.putQueryParameter("TagIds", tagIdsShrink);
            this.tagIds = tagIds;
            return this;
        }

        /**
         * <p>The document title.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test title</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The URL of the document. Specify either this parameter or Content. Supported formats: txt, pdf, markdown, doc, and docx. Limits for a single file: up to 100 pages, txt files smaller than 200 KB, pdf files smaller than 100 MB, markdown files smaller than 200 KB, doc files smaller than 100 MB, and docx files smaller than 100 MB.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/example.pdf">https://example.com/example.pdf</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateDocRequest build() {
            return new CreateDocRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDocRequest} extends {@link TeaModel}
     *
     * <p>CreateDocRequest</p>
     */
    public static class MetaCellInfoDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldCode")
        private String fieldCode;

        @com.aliyun.core.annotation.NameInMap("FieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MetaCellInfoDTOList(Builder builder) {
            this.fieldCode = builder.fieldCode;
            this.fieldName = builder.fieldName;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaCellInfoDTOList create() {
            return builder().build();
        }

        /**
         * @return fieldCode
         */
        public String getFieldCode() {
            return this.fieldCode;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String fieldCode; 
            private String fieldName; 
            private String value; 

            private Builder() {
            } 

            private Builder(MetaCellInfoDTOList model) {
                this.fieldCode = model.fieldCode;
                this.fieldName = model.fieldName;
                this.value = model.value;
            } 

            /**
             * FieldCode.
             */
            public Builder fieldCode(String fieldCode) {
                this.fieldCode = fieldCode;
                return this;
            }

            /**
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MetaCellInfoDTOList build() {
                return new MetaCellInfoDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateDocRequest} extends {@link TeaModel}
     *
     * <p>CreateDocRequest</p>
     */
    public static class DocMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessViewId")
        private String businessViewId;

        @com.aliyun.core.annotation.NameInMap("BusinessViewName")
        private String businessViewName;

        @com.aliyun.core.annotation.NameInMap("MetaCellInfoDTOList")
        private java.util.List<MetaCellInfoDTOList> metaCellInfoDTOList;

        private DocMetadata(Builder builder) {
            this.businessViewId = builder.businessViewId;
            this.businessViewName = builder.businessViewName;
            this.metaCellInfoDTOList = builder.metaCellInfoDTOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocMetadata create() {
            return builder().build();
        }

        /**
         * @return businessViewId
         */
        public String getBusinessViewId() {
            return this.businessViewId;
        }

        /**
         * @return businessViewName
         */
        public String getBusinessViewName() {
            return this.businessViewName;
        }

        /**
         * @return metaCellInfoDTOList
         */
        public java.util.List<MetaCellInfoDTOList> getMetaCellInfoDTOList() {
            return this.metaCellInfoDTOList;
        }

        public static final class Builder {
            private String businessViewId; 
            private String businessViewName; 
            private java.util.List<MetaCellInfoDTOList> metaCellInfoDTOList; 

            private Builder() {
            } 

            private Builder(DocMetadata model) {
                this.businessViewId = model.businessViewId;
                this.businessViewName = model.businessViewName;
                this.metaCellInfoDTOList = model.metaCellInfoDTOList;
            } 

            /**
             * BusinessViewId.
             */
            public Builder businessViewId(String businessViewId) {
                this.businessViewId = businessViewId;
                return this;
            }

            /**
             * BusinessViewName.
             */
            public Builder businessViewName(String businessViewName) {
                this.businessViewName = businessViewName;
                return this;
            }

            /**
             * MetaCellInfoDTOList.
             */
            public Builder metaCellInfoDTOList(java.util.List<MetaCellInfoDTOList> metaCellInfoDTOList) {
                this.metaCellInfoDTOList = metaCellInfoDTOList;
                return this;
            }

            public DocMetadata build() {
                return new DocMetadata(this);
            } 

        } 

    }
}
