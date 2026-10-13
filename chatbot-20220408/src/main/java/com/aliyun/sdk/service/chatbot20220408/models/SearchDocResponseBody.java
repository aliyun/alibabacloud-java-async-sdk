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
 * {@link SearchDocResponseBody} extends {@link TeaModel}
 *
 * <p>SearchDocResponseBody</p>
 */
public class SearchDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DocHits")
    private java.util.List<DocHits> docHits;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private SearchDocResponseBody(Builder builder) {
        this.docHits = builder.docHits;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDocResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return docHits
     */
    public java.util.List<DocHits> getDocHits() {
        return this.docHits;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DocHits> docHits; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(SearchDocResponseBody model) {
            this.docHits = model.docHits;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of documents.</p>
         */
        public Builder docHits(java.util.List<DocHits> docHits) {
            this.docHits = docHits;
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
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E3E5C779-A630-45AC-B0F2-A4506A4212F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>141</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchDocResponseBody build() {
            return new SearchDocResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchDocResponseBody} extends {@link TeaModel}
     *
     * <p>SearchDocResponseBody</p>
     */
    public static class DocTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultTag")
        private Boolean defaultTag;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private Long tagId;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private DocTags(Builder builder) {
            this.defaultTag = builder.defaultTag;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.tagId = builder.tagId;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocTags create() {
            return builder().build();
        }

        /**
         * @return defaultTag
         */
        public Boolean getDefaultTag() {
            return this.defaultTag;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return tagId
         */
        public Long getTagId() {
            return this.tagId;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private Boolean defaultTag; 
            private Long groupId; 
            private String groupName; 
            private Long tagId; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(DocTags model) {
                this.defaultTag = model.defaultTag;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.tagId = model.tagId;
                this.tagName = model.tagName;
            } 

            /**
             * <p>Indicates whether this is the default label that represents all labels.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultTag(Boolean defaultTag) {
                this.defaultTag = defaultTag;
                return this;
            }

            /**
             * <p>The label group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3610</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The label group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Article</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The label ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1201</p>
             */
            public Builder tagId(Long tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>Novel</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public DocTags build() {
                return new DocTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchDocResponseBody} extends {@link TeaModel}
     *
     * <p>SearchDocResponseBody</p>
     */
    public static class DocHits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private Long createUserId;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("DocName")
        private String docName;

        @com.aliyun.core.annotation.NameInMap("DocTags")
        private java.util.List<DocTags> docTags;

        @com.aliyun.core.annotation.NameInMap("EffectStatus")
        private Integer effectStatus;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("KnowledgeId")
        private Long knowledgeId;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private String meta;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUserId")
        private Long modifyUserId;

        @com.aliyun.core.annotation.NameInMap("ModifyUserName")
        private String modifyUserName;

        @com.aliyun.core.annotation.NameInMap("ProcessCanRetry")
        private Boolean processCanRetry;

        @com.aliyun.core.annotation.NameInMap("ProcessMessage")
        private String processMessage;

        @com.aliyun.core.annotation.NameInMap("ProcessStatus")
        private Integer processStatus;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private DocHits(Builder builder) {
            this.bizCode = builder.bizCode;
            this.categoryId = builder.categoryId;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.createUserName = builder.createUserName;
            this.docName = builder.docName;
            this.docTags = builder.docTags;
            this.effectStatus = builder.effectStatus;
            this.endDate = builder.endDate;
            this.knowledgeId = builder.knowledgeId;
            this.meta = builder.meta;
            this.modifyTime = builder.modifyTime;
            this.modifyUserId = builder.modifyUserId;
            this.modifyUserName = builder.modifyUserName;
            this.processCanRetry = builder.processCanRetry;
            this.processMessage = builder.processMessage;
            this.processStatus = builder.processStatus;
            this.startDate = builder.startDate;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocHits create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserId
         */
        public Long getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return docName
         */
        public String getDocName() {
            return this.docName;
        }

        /**
         * @return docTags
         */
        public java.util.List<DocTags> getDocTags() {
            return this.docTags;
        }

        /**
         * @return effectStatus
         */
        public Integer getEffectStatus() {
            return this.effectStatus;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return knowledgeId
         */
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return meta
         */
        public String getMeta() {
            return this.meta;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUserId
         */
        public Long getModifyUserId() {
            return this.modifyUserId;
        }

        /**
         * @return modifyUserName
         */
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        /**
         * @return processCanRetry
         */
        public Boolean getProcessCanRetry() {
            return this.processCanRetry;
        }

        /**
         * @return processMessage
         */
        public String getProcessMessage() {
            return this.processMessage;
        }

        /**
         * @return processStatus
         */
        public Integer getProcessStatus() {
            return this.processStatus;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String bizCode; 
            private Long categoryId; 
            private String config; 
            private String createTime; 
            private Long createUserId; 
            private String createUserName; 
            private String docName; 
            private java.util.List<DocTags> docTags; 
            private Integer effectStatus; 
            private String endDate; 
            private Long knowledgeId; 
            private String meta; 
            private String modifyTime; 
            private Long modifyUserId; 
            private String modifyUserName; 
            private Boolean processCanRetry; 
            private String processMessage; 
            private Integer processStatus; 
            private String startDate; 
            private Integer status; 
            private String url; 

            private Builder() {
            } 

            private Builder(DocHits model) {
                this.bizCode = model.bizCode;
                this.categoryId = model.categoryId;
                this.config = model.config;
                this.createTime = model.createTime;
                this.createUserId = model.createUserId;
                this.createUserName = model.createUserName;
                this.docName = model.docName;
                this.docTags = model.docTags;
                this.effectStatus = model.effectStatus;
                this.endDate = model.endDate;
                this.knowledgeId = model.knowledgeId;
                this.meta = model.meta;
                this.modifyTime = model.modifyTime;
                this.modifyUserId = model.modifyUserId;
                this.modifyUserName = model.modifyUserName;
                this.processCanRetry = model.processCanRetry;
                this.processMessage = model.processMessage;
                this.processStatus = model.processStatus;
                this.startDate = model.startDate;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * <p>The business code.</p>
             * 
             * <strong>example:</strong>
             * <p>cn_dytns</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30000135654</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The document parsing and chunking configuration.</p>
             * <p>Configuration item: Splitter
             * KEY: Splitter
             * Valid values:</p>
             * <ul>
             * <li>paragraphSplitter: hierarchy recognition (default)</li>
             * <li>treeSplitter: rule-based hierarchy</li>
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
             * <li>ocrTitle: OCR-recognized title (default)</li>
             * <li>docName: document name as title</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;docName&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-22T03:53:41Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>111111111</p>
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * <p>The document name.</p>
             * 
             * <strong>example:</strong>
             * <p>DocumentName</p>
             */
            public Builder docName(String docName) {
                this.docName = docName;
                return this;
            }

            /**
             * <p>The list of label details.</p>
             */
            public Builder docTags(java.util.List<DocTags> docTags) {
                this.docTags = docTags;
                return this;
            }

            /**
             * <p>The knowledge effective status, calculated based on StartDate and EndDate. Valid values:</p>
             * <ul>
             * <li>20: effective</li>
             * <li>21: expired</li>
             * <li>22: pending effective</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder effectStatus(Integer effectStatus) {
                this.effectStatus = effectStatus;
                return this;
            }

            /**
             * <p>The expiration time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2099-12-31T16:00:00Z</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The knowledge ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30002692007</p>
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * <p>The metadata associated with the document.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;code&quot;:&quot;xxx&quot;}</p>
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-25T02:27:42Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>222222222</p>
             */
            public Builder modifyUserId(Long modifyUserId) {
                this.modifyUserId = modifyUserId;
                return this;
            }

            /**
             * <p>The name of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>Jane</p>
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
                return this;
            }

            /**
             * <p>Indicates whether the task can be retried. Valid values:</p>
             * <ul>
             * <li>true: The task can be retried.</li>
             * <li>false: The task cannot be retried.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder processCanRetry(Boolean processCanRetry) {
                this.processCanRetry = processCanRetry;
                return this;
            }

            /**
             * <p>The task processing message.</p>
             * 
             * <strong>example:</strong>
             * <p>Task processing succeeded</p>
             */
            public Builder processMessage(String processMessage) {
                this.processMessage = processMessage;
                return this;
            }

            /**
             * <p>The task processing status. Valid values:</p>
             * <ul>
             * <li>-1: queued</li>
             * <li>0: succeeded</li>
             * <li>1: parsing</li>
             * <li>2: processing</li>
             * <li>3: processing failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder processStatus(Integer processStatus) {
                this.processStatus = processStatus;
                return this;
            }

            /**
             * <p>The effective period in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-28T11:40:18Z</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The editing status. Valid values:</p>
             * <ul>
             * <li>1: unpublished</li>
             * <li>2: published</li>
             * <li>3: updated but not published</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The OSS URL where the document is stored.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://doc2bot-bucket-cloud.oss-cn-shanghai.aliyuncs.com/doc2bot/input/%E6%96%87%E6%A1%A3%E9%97%AE%E7%AD%94%E8%AF%B4%E6%98%8E%E4%B9%A6_V1.pdf">https://doc2bot-bucket-cloud.oss-cn-shanghai.aliyuncs.com/doc2bot/input/文档问答说明书_V1.pdf</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public DocHits build() {
                return new DocHits(this);
            } 

        } 

    }
}
