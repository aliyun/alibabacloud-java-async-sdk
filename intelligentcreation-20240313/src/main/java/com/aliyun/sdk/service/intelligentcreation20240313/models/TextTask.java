// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TextTask} extends {@link TeaModel}
 *
 * <p>TextTask</p>
 */
public class TextTask extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("relatedRagId")
    private Integer relatedRagId;

    @com.aliyun.core.annotation.NameInMap("style")
    @com.aliyun.core.annotation.Validation(required = true)
    private String style;

    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    @com.aliyun.core.annotation.NameInMap("textIds")
    private java.util.List < Long > textIds;

    @com.aliyun.core.annotation.NameInMap("textModeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String textModeType;

    @com.aliyun.core.annotation.NameInMap("textTaskId")
    private Long textTaskId;

    @com.aliyun.core.annotation.NameInMap("textTaskStatus")
    private String textTaskStatus;

    @com.aliyun.core.annotation.NameInMap("theme")
    private String theme;

    @com.aliyun.core.annotation.NameInMap("themeDesc")
    private String themeDesc;

    private TextTask(Builder builder) {
        this.contentRequirement = builder.contentRequirement;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.introduction = builder.introduction;
        this.nums = builder.nums;
        this.point = builder.point;
        this.referenceTag = builder.referenceTag;
        this.relatedRagId = builder.relatedRagId;
        this.style = builder.style;
        this.target = builder.target;
        this.textIds = builder.textIds;
        this.textModeType = builder.textModeType;
        this.textTaskId = builder.textTaskId;
        this.textTaskStatus = builder.textTaskStatus;
        this.theme = builder.theme;
        this.themeDesc = builder.themeDesc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextTask create() {
        return builder().build();
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
     * @return relatedRagId
     */
    public Integer getRelatedRagId() {
        return this.relatedRagId;
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
    public java.util.List < Long > getTextIds() {
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
        private String contentRequirement; 
        private String gmtCreate; 
        private String gmtModified; 
        private String introduction; 
        private Integer nums; 
        private String point; 
        private ReferenceTag referenceTag; 
        private Integer relatedRagId; 
        private String style; 
        private String target; 
        private java.util.List < Long > textIds; 
        private String textModeType; 
        private Long textTaskId; 
        private String textTaskStatus; 
        private String theme; 
        private String themeDesc; 

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
         * nums.
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
         * relatedRagId.
         */
        public Builder relatedRagId(Integer relatedRagId) {
            this.relatedRagId = relatedRagId;
            return this;
        }

        /**
         * style.
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
        public Builder textIds(java.util.List < Long > textIds) {
            this.textIds = textIds;
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
