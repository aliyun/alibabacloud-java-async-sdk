// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDocResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocResponseBody</p>
 */
public class DescribeDocResponseBody extends TeaModel {
    @NameInMap("BizCode")
    private String bizCode;

    @NameInMap("CategoryId")
    private Long categoryId;

    @NameInMap("Config")
    private String config;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateUserId")
    private Long createUserId;

    @NameInMap("CreateUserName")
    private String createUserName;

    @NameInMap("DocInfo")
    private DocInfo docInfo;

    @NameInMap("DocName")
    private String docName;

    @NameInMap("EffectStatus")
    private Integer effectStatus;

    @NameInMap("EndDate")
    private String endDate;

    @NameInMap("KnowledgeId")
    private Long knowledgeId;

    @NameInMap("Meta")
    private String meta;

    @NameInMap("ModifyTime")
    private String modifyTime;

    @NameInMap("ModifyUserId")
    private Long modifyUserId;

    @NameInMap("ModifyUserName")
    private String modifyUserName;

    @NameInMap("ProcessCanRetry")
    private Boolean processCanRetry;

    @NameInMap("ProcessMessage")
    private String processMessage;

    @NameInMap("ProcessStatus")
    private Integer processStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartDate")
    private String startDate;

    @NameInMap("Status")
    private Integer status;

    @NameInMap("Title")
    private String title;

    @NameInMap("Url")
    private String url;

    private DescribeDocResponseBody(Builder builder) {
        this.bizCode = builder.bizCode;
        this.categoryId = builder.categoryId;
        this.config = builder.config;
        this.createTime = builder.createTime;
        this.createUserId = builder.createUserId;
        this.createUserName = builder.createUserName;
        this.docInfo = builder.docInfo;
        this.docName = builder.docName;
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
     * @return docName
     */
    public String getDocName() {
        return this.docName;
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
        private String docName; 
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

        /**
         * BizCode.
         */
        public Builder bizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateUserId.
         */
        public Builder createUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }

        /**
         * CreateUserName.
         */
        public Builder createUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }

        /**
         * DocInfo.
         */
        public Builder docInfo(DocInfo docInfo) {
            this.docInfo = docInfo;
            return this;
        }

        /**
         * DocName.
         */
        public Builder docName(String docName) {
            this.docName = docName;
            return this;
        }

        /**
         * EffectStatus.
         */
        public Builder effectStatus(Integer effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * KnowledgeId.
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * Meta.
         */
        public Builder meta(String meta) {
            this.meta = meta;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * ModifyUserId.
         */
        public Builder modifyUserId(Long modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }

        /**
         * ModifyUserName.
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * ProcessCanRetry.
         */
        public Builder processCanRetry(Boolean processCanRetry) {
            this.processCanRetry = processCanRetry;
            return this;
        }

        /**
         * ProcessMessage.
         */
        public Builder processMessage(String processMessage) {
            this.processMessage = processMessage;
            return this;
        }

        /**
         * ProcessStatus.
         */
        public Builder processStatus(Integer processStatus) {
            this.processStatus = processStatus;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DescribeDocResponseBody build() {
            return new DescribeDocResponseBody(this);
        } 

    } 

    public static class DocParas extends TeaModel {
        @NameInMap("ParaLevel")
        private Integer paraLevel;

        @NameInMap("ParaNo")
        private Integer paraNo;

        @NameInMap("ParaText")
        private String paraText;

        @NameInMap("ParaType")
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

            /**
             * ParaLevel.
             */
            public Builder paraLevel(Integer paraLevel) {
                this.paraLevel = paraLevel;
                return this;
            }

            /**
             * ParaNo.
             */
            public Builder paraNo(Integer paraNo) {
                this.paraNo = paraNo;
                return this;
            }

            /**
             * ParaText.
             */
            public Builder paraText(String paraText) {
                this.paraText = paraText;
                return this;
            }

            /**
             * ParaType.
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
    public static class DocInfo extends TeaModel {
        @NameInMap("DocParas")
        private java.util.List < DocParas> docParas;

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
        public java.util.List < DocParas> getDocParas() {
            return this.docParas;
        }

        public static final class Builder {
            private java.util.List < DocParas> docParas; 

            /**
             * DocParas.
             */
            public Builder docParas(java.util.List < DocParas> docParas) {
                this.docParas = docParas;
                return this;
            }

            public DocInfo build() {
                return new DocInfo(this);
            } 

        } 

    }
}
