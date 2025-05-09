// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link TextTask} extends {@link TeaModel}
 *
 * <p>TextTask</p>
 */
public class TextTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("agentName")
    private String agentName;

    @com.aliyun.core.annotation.NameInMap("contentRequirement")
    private String contentRequirement;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("introduction")
    private String introduction;

    @com.aliyun.core.annotation.NameInMap("nums")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer nums;

    @com.aliyun.core.annotation.NameInMap("point")
    private String point;

    @com.aliyun.core.annotation.NameInMap("referenceTag")
    private ReferenceTag referenceTag;

    @com.aliyun.core.annotation.NameInMap("relatedRagIds")
    private java.util.List<Long> relatedRagIds;

    @com.aliyun.core.annotation.NameInMap("style")
    @com.aliyun.core.annotation.Validation(required = true)
    private String style;

    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    @com.aliyun.core.annotation.NameInMap("textIds")
    private java.util.List<Long> textIds;

    @com.aliyun.core.annotation.NameInMap("textModeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String textModeType;

    @com.aliyun.core.annotation.NameInMap("textTaskId")
    private Long textTaskId;

    @com.aliyun.core.annotation.NameInMap("textTaskStatus")
    private String textTaskStatus;

    @com.aliyun.core.annotation.NameInMap("texts")
    private java.util.List<Text> texts;

    @com.aliyun.core.annotation.NameInMap("theme")
    private String theme;

    @com.aliyun.core.annotation.NameInMap("themeDesc")
    private String themeDesc;

    private TextTask(Builder builder) {
        this.agentId = builder.agentId;
        this.agentName = builder.agentName;
        this.contentRequirement = builder.contentRequirement;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.introduction = builder.introduction;
        this.nums = builder.nums;
        this.point = builder.point;
        this.referenceTag = builder.referenceTag;
        this.relatedRagIds = builder.relatedRagIds;
        this.style = builder.style;
        this.target = builder.target;
        this.textIds = builder.textIds;
        this.textModeType = builder.textModeType;
        this.textTaskId = builder.textTaskId;
        this.textTaskStatus = builder.textTaskStatus;
        this.texts = builder.texts;
        this.theme = builder.theme;
        this.themeDesc = builder.themeDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return contentRequirement
     */
    public String getContentRequirement() {
        return this.contentRequirement;
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
     * @return introduction
     */
    public String getIntroduction() {
        return this.introduction;
    }

    /**
     * @return nums
     */
    public Integer getNums() {
        return this.nums;
    }

    /**
     * @return point
     */
    public String getPoint() {
        return this.point;
    }

    /**
     * @return referenceTag
     */
    public ReferenceTag getReferenceTag() {
        return this.referenceTag;
    }

    /**
     * @return relatedRagIds
     */
    public java.util.List<Long> getRelatedRagIds() {
        return this.relatedRagIds;
    }

    /**
     * @return style
     */
    public String getStyle() {
        return this.style;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return textIds
     */
    public java.util.List<Long> getTextIds() {
        return this.textIds;
    }

    /**
     * @return textModeType
     */
    public String getTextModeType() {
        return this.textModeType;
    }

    /**
     * @return textTaskId
     */
    public Long getTextTaskId() {
        return this.textTaskId;
    }

    /**
     * @return textTaskStatus
     */
    public String getTextTaskStatus() {
        return this.textTaskStatus;
    }

    /**
     * @return texts
     */
    public java.util.List<Text> getTexts() {
        return this.texts;
    }

    /**
     * @return theme
     */
    public String getTheme() {
        return this.theme;
    }

    /**
     * @return themeDesc
     */
    public String getThemeDesc() {
        return this.themeDesc;
    }

    public static final class Builder {
        private String agentId; 
        private String agentName; 
        private String contentRequirement; 
        private String gmtCreate; 
        private String gmtModified; 
        private String introduction; 
        private Integer nums; 
        private String point; 
        private ReferenceTag referenceTag; 
        private java.util.List<Long> relatedRagIds; 
        private String style; 
        private String target; 
        private java.util.List<Long> textIds; 
        private String textModeType; 
        private Long textTaskId; 
        private String textTaskStatus; 
        private java.util.List<Text> texts; 
        private String theme; 
        private String themeDesc; 

        private Builder() {
        } 

        private Builder(TextTask model) {
            this.agentId = model.agentId;
            this.agentName = model.agentName;
            this.contentRequirement = model.contentRequirement;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.introduction = model.introduction;
            this.nums = model.nums;
            this.point = model.point;
            this.referenceTag = model.referenceTag;
            this.relatedRagIds = model.relatedRagIds;
            this.style = model.style;
            this.target = model.target;
            this.textIds = model.textIds;
            this.textModeType = model.textModeType;
            this.textTaskId = model.textTaskId;
            this.textTaskStatus = model.textTaskStatus;
            this.texts = model.texts;
            this.theme = model.theme;
            this.themeDesc = model.themeDesc;
        } 

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
         * contentRequirement.
         */
        public Builder contentRequirement(String contentRequirement) {
            this.contentRequirement = contentRequirement;
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
         * introduction.
         */
        public Builder introduction(String introduction) {
            this.introduction = introduction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nums(Integer nums) {
            this.nums = nums;
            return this;
        }

        /**
         * point.
         */
        public Builder point(String point) {
            this.point = point;
            return this;
        }

        /**
         * referenceTag.
         */
        public Builder referenceTag(ReferenceTag referenceTag) {
            this.referenceTag = referenceTag;
            return this;
        }

        /**
         * relatedRagIds.
         */
        public Builder relatedRagIds(java.util.List<Long> relatedRagIds) {
            this.relatedRagIds = relatedRagIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder style(String style) {
            this.style = style;
            return this;
        }

        /**
         * target.
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        /**
         * textIds.
         */
        public Builder textIds(java.util.List<Long> textIds) {
            this.textIds = textIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder textModeType(String textModeType) {
            this.textModeType = textModeType;
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
         * textTaskStatus.
         */
        public Builder textTaskStatus(String textTaskStatus) {
            this.textTaskStatus = textTaskStatus;
            return this;
        }

        /**
         * texts.
         */
        public Builder texts(java.util.List<Text> texts) {
            this.texts = texts;
            return this;
        }

        /**
         * theme.
         */
        public Builder theme(String theme) {
            this.theme = theme;
            return this;
        }

        /**
         * themeDesc.
         */
        public Builder themeDesc(String themeDesc) {
            this.themeDesc = themeDesc;
            return this;
        }

        public TextTask build() {
            return new TextTask(this);
        } 

    } 

}
