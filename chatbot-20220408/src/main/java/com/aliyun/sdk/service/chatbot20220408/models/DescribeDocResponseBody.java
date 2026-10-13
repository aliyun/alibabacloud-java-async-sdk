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
 * {@link DescribeDocResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocResponseBody</p>
 */
public class DescribeDocResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("DocInfo")
    private DocInfo docInfo;

    @com.aliyun.core.annotation.NameInMap("DocMetadata")
    private java.util.List<DocMetadata> docMetadata;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private DescribeDocResponseBody(Builder builder) {
        this.bizCode = builder.bizCode;
        this.categoryId = builder.categoryId;
        this.config = builder.config;
        this.createTime = builder.createTime;
        this.createUserId = builder.createUserId;
        this.createUserName = builder.createUserName;
        this.docInfo = builder.docInfo;
        this.docMetadata = builder.docMetadata;
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
        this.requestId = builder.requestId;
        this.startDate = builder.startDate;
        this.status = builder.status;
        this.title = builder.title;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return docInfo
     */
    public DocInfo getDocInfo() {
        return this.docInfo;
    }

    /**
     * @return docMetadata
     */
    public java.util.List<DocMetadata> getDocMetadata() {
        return this.docMetadata;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String bizCode; 
        private Long categoryId; 
        private String config; 
        private String createTime; 
        private Long createUserId; 
        private String createUserName; 
        private DocInfo docInfo; 
        private java.util.List<DocMetadata> docMetadata; 
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
        private String requestId; 
        private String startDate; 
        private Integer status; 
        private String title; 
        private String url; 

        private Builder() {
        } 

        private Builder(DescribeDocResponseBody model) {
            this.bizCode = model.bizCode;
            this.categoryId = model.categoryId;
            this.config = model.config;
            this.createTime = model.createTime;
            this.createUserId = model.createUserId;
            this.createUserName = model.createUserName;
            this.docInfo = model.docInfo;
            this.docMetadata = model.docMetadata;
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
            this.requestId = model.requestId;
            this.startDate = model.startDate;
            this.status = model.status;
            this.title = model.title;
            this.url = model.url;
        } 

        /**
         * <p>The business code.</p>
         * 
         * <strong>example:</strong>
         * <p>bizcode123</p>
         */
        public Builder bizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000049006</p>
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The document parsing and chunking configuration items:</p>
         * <p>Chunker KEY: Splitter. Valid values: paragraphSplitter - hierarchy recognition (default). treeSplitter - rule-based hierarchy.</p>
         * <p>Document chunk size KEY: ChunkSize. VALUE: default 500. Range: [200, 800].</p>
         * <p>Rule-based hierarchy KEY: TreePatterns. VALUE: default [].</p>
         * <p>Document title source KEY: TitleSource. Valid values: ocrTitle - OCR-recognized title (default). docName - document name as title.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Splitter&quot;:&quot;treeSplitter&quot;,&quot;ChunkSize&quot;:500,&quot;TreePatterns&quot;:[&quot;^# .<em>&quot;,&quot;^## .</em>&quot;,&quot;^### .<em>&quot;,&quot;^#### .</em>&quot;],&quot;TitleSource&quot;:&quot;docName&quot;}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-12T06:30:17Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the user who created the document.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        public Builder createUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * <p>The name of the user who created the document.</p>
         * 
         * <strong>example:</strong>
         * <p>Jane</p>
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * <p>The document details.</p>
         */
        public Builder docInfo(DocInfo docInfo) {
            this.docInfo = docInfo;
            return this;
        }

        /**
         * DocMetadata.
         */
        public Builder docMetadata(java.util.List<DocMetadata> docMetadata) {
            this.docMetadata = docMetadata;
            return this;
        }

        /**
         * <p>The document name.</p>
         * 
         * <strong>example:</strong>
         * <p>Document name</p>
         */
        public Builder docName(String docName) {
            this.docName = docName;
            return this;
        }

        /**
         * <p>The list of tag details.</p>
         */
        public Builder docTags(java.util.List<DocTags> docTags) {
            this.docTags = docTags;
            return this;
        }

        /**
         * <p>The effective status, which is calculated based on StartDate and EndDate. Valid values:</p>
         * <ul>
         * <li>20: Effective.</li>
         * <li>21: Expired.</li>
         * <li>22: Pending effective.</li>
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
         * <p>The expiration time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-27T06:08:54Z</p>
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The knowledge ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001979424</p>
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
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-25T08:56:55Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The ID of the user who last modified the document.</p>
         * 
         * <strong>example:</strong>
         * <p>2222222222</p>
         */
        public Builder modifyUserId(Long modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }

        /**
         * <p>The name of the user who last modified the document.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
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
         * <p>Task processed successfully</p>
         */
        public Builder processMessage(String processMessage) {
            this.processMessage = processMessage;
            return this;
        }

        /**
         * <p>The task processing status. Valid values:</p>
         * <ul>
         * <li>-1: Queued.</li>
         * <li>0: Succeeded.</li>
         * <li>1: Parsing.</li>
         * <li>2: Processing.</li>
         * <li>3: Failed.</li>
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7F132693-212A-40A9-8A81-11E7694E478B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The effective period (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>1979-12-31T16:00:00Z</p>
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The editing status. Valid values:</p>
         * <ul>
         * <li>1: Unpublished.</li>
         * <li>2: Published.</li>
         * <li>3: Updated but not published.</li>
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
         * <p>The document title.</p>
         * 
         * <strong>example:</strong>
         * <p>Test title</p>
         */
        public Builder title(String title) {
            this.title = title;
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

        public DescribeDocResponseBody build() {
            return new DescribeDocResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDocResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDocResponseBody</p>
     */
    public static class DocParas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParaLevel")
        private Integer paraLevel;

        @com.aliyun.core.annotation.NameInMap("ParaNo")
        private Integer paraNo;

        @com.aliyun.core.annotation.NameInMap("ParaText")
        private String paraText;

        @com.aliyun.core.annotation.NameInMap("ParaType")
        private String paraType;

        private DocParas(Builder builder) {
            this.paraLevel = builder.paraLevel;
            this.paraNo = builder.paraNo;
            this.paraText = builder.paraText;
            this.paraType = builder.paraType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocParas create() {
            return builder().build();
        }

        /**
         * @return paraLevel
         */
        public Integer getParaLevel() {
            return this.paraLevel;
        }

        /**
         * @return paraNo
         */
        public Integer getParaNo() {
            return this.paraNo;
        }

        /**
         * @return paraText
         */
        public String getParaText() {
            return this.paraText;
        }

        /**
         * @return paraType
         */
        public String getParaType() {
            return this.paraType;
        }

        public static final class Builder {
            private Integer paraLevel; 
            private Integer paraNo; 
            private String paraText; 
            private String paraType; 

            private Builder() {
            } 

            private Builder(DocParas model) {
                this.paraLevel = model.paraLevel;
                this.paraNo = model.paraNo;
                this.paraText = model.paraText;
                this.paraType = model.paraType;
            } 

            /**
             * <p>The paragraph level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder paraLevel(Integer paraLevel) {
                this.paraLevel = paraLevel;
                return this;
            }

            /**
             * <p>The paragraph sequence number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder paraNo(Integer paraNo) {
                this.paraNo = paraNo;
                return this;
            }

            /**
             * <p>The paragraph content (plain text, OCR content for images, or Markdown representation for tables).</p>
             * 
             * <strong>example:</strong>
             * <p>Content</p>
             */
            public Builder paraText(String paraText) {
                this.paraText = paraText;
                return this;
            }

            /**
             * <p>The paragraph content type. Valid values:</p>
             * <ul>
             * <li>text: Text.</li>
             * <li>figure: Image.</li>
             * <li>table: Table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder paraType(String paraType) {
                this.paraType = paraType;
                return this;
            }

            public DocParas build() {
                return new DocParas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDocResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDocResponseBody</p>
     */
    public static class DocInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocParas")
        private java.util.List<DocParas> docParas;

        private DocInfo(Builder builder) {
            this.docParas = builder.docParas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocInfo create() {
            return builder().build();
        }

        /**
         * @return docParas
         */
        public java.util.List<DocParas> getDocParas() {
            return this.docParas;
        }

        public static final class Builder {
            private java.util.List<DocParas> docParas; 

            private Builder() {
            } 

            private Builder(DocInfo model) {
                this.docParas = model.docParas;
            } 

            /**
             * <p>The document paragraph information.</p>
             */
            public Builder docParas(java.util.List<DocParas> docParas) {
                this.docParas = docParas;
                return this;
            }

            public DocInfo build() {
                return new DocInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDocResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDocResponseBody</p>
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
     * {@link DescribeDocResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDocResponseBody</p>
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
             * <p>The tag name.</p>
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
    /**
     * 
     * {@link DescribeDocResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDocResponseBody</p>
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
             * <p>Indicates whether this is the default &quot;all tags&quot; label.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultTag(Boolean defaultTag) {
                this.defaultTag = defaultTag;
                return this;
            }

            /**
             * <p>The tag group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3610</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The tag group name.</p>
             * 
             * <strong>example:</strong>
             * <p>Article</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1201</p>
             */
            public Builder tagId(Long tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The tag name.</p>
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
}
