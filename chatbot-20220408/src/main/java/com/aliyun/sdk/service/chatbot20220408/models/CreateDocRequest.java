// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
    private java.util.List < DocMetadata> docMetadata;

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
    private java.util.List < Long > tagIds;

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
    public java.util.List < DocMetadata> getDocMetadata() {
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
    public java.util.List < Long > getTagIds() {
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
        private java.util.List < DocMetadata> docMetadata; 
        private String endDate; 
        private String meta; 
        private String startDate; 
        private java.util.List < Long > tagIds; 
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
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
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DocMetadata.
         */
        public Builder docMetadata(java.util.List < DocMetadata> docMetadata) {
            String docMetadataShrink = shrink(docMetadata, "DocMetadata", "json");
            this.putQueryParameter("DocMetadata", docMetadataShrink);
            this.docMetadata = docMetadata;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Meta.
         */
        public Builder meta(String meta) {
            this.putQueryParameter("Meta", meta);
            this.meta = meta;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * TagIds.
         */
        public Builder tagIds(java.util.List < Long > tagIds) {
            String tagIdsShrink = shrink(tagIds, "TagIds", "json");
            this.putQueryParameter("TagIds", tagIdsShrink);
            this.tagIds = tagIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Url.
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
        private java.util.List < MetaCellInfoDTOList> metaCellInfoDTOList;

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
        public java.util.List < MetaCellInfoDTOList> getMetaCellInfoDTOList() {
            return this.metaCellInfoDTOList;
        }

        public static final class Builder {
            private String businessViewId; 
            private String businessViewName; 
            private java.util.List < MetaCellInfoDTOList> metaCellInfoDTOList; 

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
            public Builder metaCellInfoDTOList(java.util.List < MetaCellInfoDTOList> metaCellInfoDTOList) {
                this.metaCellInfoDTOList = metaCellInfoDTOList;
                return this;
            }

            public DocMetadata build() {
                return new DocMetadata(this);
            } 

        } 

    }
}
