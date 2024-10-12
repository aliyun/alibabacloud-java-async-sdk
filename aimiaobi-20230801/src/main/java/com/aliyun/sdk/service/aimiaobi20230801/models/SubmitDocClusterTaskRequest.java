// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitDocClusterTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitDocClusterTaskRequest</p>
 */
public class SubmitDocClusterTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Documents")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Documents> documents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SummaryLength")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer summaryLength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TitleLength")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer titleLength;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopicCount")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer topicCount;

    private SubmitDocClusterTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.documents = builder.documents;
        this.summaryLength = builder.summaryLength;
        this.titleLength = builder.titleLength;
        this.topicCount = builder.topicCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDocClusterTaskRequest create() {
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
     * @return documents
     */
    public java.util.List < Documents> getDocuments() {
        return this.documents;
    }

    /**
     * @return summaryLength
     */
    public Integer getSummaryLength() {
        return this.summaryLength;
    }

    /**
     * @return titleLength
     */
    public Integer getTitleLength() {
        return this.titleLength;
    }

    /**
     * @return topicCount
     */
    public Integer getTopicCount() {
        return this.topicCount;
    }

    public static final class Builder extends Request.Builder<SubmitDocClusterTaskRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private java.util.List < Documents> documents; 
        private Integer summaryLength; 
        private Integer titleLength; 
        private Integer topicCount; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDocClusterTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.documents = request.documents;
            this.summaryLength = request.summaryLength;
            this.titleLength = request.titleLength;
            this.topicCount = request.topicCount;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder documents(java.util.List < Documents> documents) {
            String documentsShrink = shrink(documents, "Documents", "json");
            this.putBodyParameter("Documents", documentsShrink);
            this.documents = documents;
            return this;
        }

        /**
         * SummaryLength.
         */
        public Builder summaryLength(Integer summaryLength) {
            this.putBodyParameter("SummaryLength", summaryLength);
            this.summaryLength = summaryLength;
            return this;
        }

        /**
         * TitleLength.
         */
        public Builder titleLength(Integer titleLength) {
            this.putBodyParameter("TitleLength", titleLength);
            this.titleLength = titleLength;
            return this;
        }

        /**
         * TopicCount.
         */
        public Builder topicCount(Integer topicCount) {
            this.putBodyParameter("TopicCount", topicCount);
            this.topicCount = topicCount;
            return this;
        }

        @Override
        public SubmitDocClusterTaskRequest build() {
            return new SubmitDocClusterTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitDocClusterTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitDocClusterTaskRequest</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 3000, minLength = 1)
        private String content;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("Title")
        @com.aliyun.core.annotation.Validation(maxLength = 100)
        private String title;

        private Documents(Builder builder) {
            this.content = builder.content;
            this.docId = builder.docId;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String docId; 
            private String title; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>文档内容</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
}
