// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Text} extends {@link TeaModel}
 *
 * <p>Text</p>
 */
public class Text extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("agentName")
    private String agentName;

    @com.aliyun.core.annotation.NameInMap("desc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desc;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("illustrationTaskIdList")
    private java.util.List < Long > illustrationTaskIdList;

    @com.aliyun.core.annotation.NameInMap("publishStatus")
    private String publishStatus;

    @com.aliyun.core.annotation.NameInMap("textContent")
    private String textContent;

    @com.aliyun.core.annotation.NameInMap("textId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long textId;

    @com.aliyun.core.annotation.NameInMap("textIllustrationTag")
    private Boolean textIllustrationTag;

    @com.aliyun.core.annotation.NameInMap("textModeType")
    private String textModeType;

    @com.aliyun.core.annotation.NameInMap("textStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String textStatus;

    @com.aliyun.core.annotation.NameInMap("textStyleType")
    private String textStyleType;

    @com.aliyun.core.annotation.NameInMap("textTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long textTaskId;

    @com.aliyun.core.annotation.NameInMap("textThemes")
    private java.util.List < String > textThemes;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("userNameCreate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userNameCreate;

    @com.aliyun.core.annotation.NameInMap("userNameModified")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userNameModified;

    private Text(Builder builder) {
        this.agentId = builder.agentId;
        this.agentName = builder.agentName;
        this.desc = builder.desc;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.illustrationTaskIdList = builder.illustrationTaskIdList;
        this.publishStatus = builder.publishStatus;
        this.textContent = builder.textContent;
        this.textId = builder.textId;
        this.textIllustrationTag = builder.textIllustrationTag;
        this.textModeType = builder.textModeType;
        this.textStatus = builder.textStatus;
        this.textStyleType = builder.textStyleType;
        this.textTaskId = builder.textTaskId;
        this.textThemes = builder.textThemes;
        this.title = builder.title;
        this.userNameCreate = builder.userNameCreate;
        this.userNameModified = builder.userNameModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Text create() {
        return builder().build();
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return illustrationTaskIdList
     */
    public java.util.List < Long > getIllustrationTaskIdList() {
        return this.illustrationTaskIdList;
    }

    /**
     * @return publishStatus
     */
    public String getPublishStatus() {
        return this.publishStatus;
    }

    /**
     * @return textContent
     */
    public String getTextContent() {
        return this.textContent;
    }

    /**
     * @return textId
     */
    public Long getTextId() {
        return this.textId;
    }

    /**
     * @return textIllustrationTag
     */
    public Boolean getTextIllustrationTag() {
        return this.textIllustrationTag;
    }

    /**
     * @return textModeType
     */
    public String getTextModeType() {
        return this.textModeType;
    }

    /**
     * @return textStatus
     */
    public String getTextStatus() {
        return this.textStatus;
    }

    /**
     * @return textStyleType
     */
    public String getTextStyleType() {
        return this.textStyleType;
    }

    /**
     * @return textTaskId
     */
    public Long getTextTaskId() {
        return this.textTaskId;
    }

    /**
     * @return textThemes
     */
    public java.util.List < String > getTextThemes() {
        return this.textThemes;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userNameCreate
     */
    public String getUserNameCreate() {
        return this.userNameCreate;
    }

    /**
     * @return userNameModified
     */
    public String getUserNameModified() {
        return this.userNameModified;
    }

    public static final class Builder {
        private String agentId; 
        private String agentName; 
        private String desc; 
        private String gmtCreate; 
        private String gmtModified; 
        private java.util.List < Long > illustrationTaskIdList; 
        private String publishStatus; 
        private String textContent; 
        private Long textId; 
        private Boolean textIllustrationTag; 
        private String textModeType; 
        private String textStatus; 
        private String textStyleType; 
        private Long textTaskId; 
        private java.util.List < String > textThemes; 
        private String title; 
        private String userNameCreate; 
        private String userNameModified; 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * agentName.
         */
        public Builder agentName(String agentName) {
            this.agentName = agentName;
            return this;
        }

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * illustrationTaskIdList.
         */
        public Builder illustrationTaskIdList(java.util.List < Long > illustrationTaskIdList) {
            this.illustrationTaskIdList = illustrationTaskIdList;
            return this;
        }

        /**
         * publishStatus.
         */
        public Builder publishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }

        /**
         * textContent.
         */
        public Builder textContent(String textContent) {
            this.textContent = textContent;
            return this;
        }

        /**
         * textId.
         */
        public Builder textId(Long textId) {
            this.textId = textId;
            return this;
        }

        /**
         * textIllustrationTag.
         */
        public Builder textIllustrationTag(Boolean textIllustrationTag) {
            this.textIllustrationTag = textIllustrationTag;
            return this;
        }

        /**
         * textModeType.
         */
        public Builder textModeType(String textModeType) {
            this.textModeType = textModeType;
            return this;
        }

        /**
         * textStatus.
         */
        public Builder textStatus(String textStatus) {
            this.textStatus = textStatus;
            return this;
        }

        /**
         * textStyleType.
         */
        public Builder textStyleType(String textStyleType) {
            this.textStyleType = textStyleType;
            return this;
        }

        /**
         * textTaskId.
         */
        public Builder textTaskId(Long textTaskId) {
            this.textTaskId = textTaskId;
            return this;
        }

        /**
         * textThemes.
         */
        public Builder textThemes(java.util.List < String > textThemes) {
            this.textThemes = textThemes;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * userNameCreate.
         */
        public Builder userNameCreate(String userNameCreate) {
            this.userNameCreate = userNameCreate;
            return this;
        }

        /**
         * userNameModified.
         */
        public Builder userNameModified(String userNameModified) {
            this.userNameModified = userNameModified;
            return this;
        }

        public Text build() {
            return new Text(this);
        } 

    } 

}
