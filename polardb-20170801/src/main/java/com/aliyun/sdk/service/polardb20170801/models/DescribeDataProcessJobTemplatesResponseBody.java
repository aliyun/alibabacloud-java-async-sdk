// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDataProcessJobTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataProcessJobTemplatesResponseBody</p>
 */
public class DescribeDataProcessJobTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDataProcessJobTemplatesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataProcessJobTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeDataProcessJobTemplatesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of data processing task templates.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of templates returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of templates that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDataProcessJobTemplatesResponseBody build() {
            return new DescribeDataProcessJobTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataProcessJobTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataProcessJobTemplatesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Captioning")
        private Boolean captioning;

        @com.aliyun.core.annotation.NameInMap("CaptioningPrompt")
        private String captioningPrompt;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Embedding")
        private Boolean embedding;

        @com.aliyun.core.annotation.NameInMap("EmbeddingDimension")
        private Integer embeddingDimension;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private String templateConfig;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        private Items(Builder builder) {
            this.captioning = builder.captioning;
            this.captioningPrompt = builder.captioningPrompt;
            this.creationTime = builder.creationTime;
            this.embedding = builder.embedding;
            this.embeddingDimension = builder.embeddingDimension;
            this.status = builder.status;
            this.templateConfig = builder.templateConfig;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return captioning
         */
        public Boolean getCaptioning() {
            return this.captioning;
        }

        /**
         * @return captioningPrompt
         */
        public String getCaptioningPrompt() {
            return this.captioningPrompt;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return embedding
         */
        public Boolean getEmbedding() {
            return this.embedding;
        }

        /**
         * @return embeddingDimension
         */
        public Integer getEmbeddingDimension() {
            return this.embeddingDimension;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private Boolean captioning; 
            private String captioningPrompt; 
            private String creationTime; 
            private Boolean embedding; 
            private Integer embeddingDimension; 
            private String status; 
            private String templateConfig; 
            private String templateId; 
            private String templateName; 
            private String templateType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.captioning = model.captioning;
                this.captioningPrompt = model.captioningPrompt;
                this.creationTime = model.creationTime;
                this.embedding = model.embedding;
                this.embeddingDimension = model.embeddingDimension;
                this.status = model.status;
                this.templateConfig = model.templateConfig;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateType = model.templateType;
            } 

            /**
             * <p>Specifies whether it is required to fetch the summary or video synopsis.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder captioning(Boolean captioning) {
                this.captioning = captioning;
                return this;
            }

            /**
             * <p>The prompt used when extracting captions.</p>
             * 
             * <strong>example:</strong>
             * <p>Summarize the image content</p>
             */
            public Builder captioningPrompt(String captioningPrompt) {
                this.captioningPrompt = captioningPrompt;
                return this;
            }

            /**
             * <p>The time when the task template was created, in RFC 3339 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01T00:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Specifies whether to convert content into vectors.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder embedding(Boolean embedding) {
                this.embedding = embedding;
                return this;
            }

            /**
             * <p>The output dimension of the vector.</p>
             * 
             * <strong>example:</strong>
             * <p>768</p>
             */
            public Builder embeddingDimension(Integer embeddingDimension) {
                this.embeddingDimension = embeddingDimension;
                return this;
            }

            /**
             * <p>The task template status.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The JSON configuration string of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ETL_TEMPLATE_STR&quot;:&quot;config&quot;}</p>
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The task template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tpl-123456</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The task template name.</p>
             * 
             * <strong>example:</strong>
             * <p>template1</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The node templatetype. Valid value: image.</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
