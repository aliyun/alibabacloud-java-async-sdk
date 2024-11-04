// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TransformerForView} extends {@link TeaModel}
 *
 * <p>TransformerForView</p>
 */
public class TransformerForView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actions")
    private java.util.List < TransformAction > actions;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("quitAfterMatch")
    private Boolean quitAfterMatch;

    @com.aliyun.core.annotation.NameInMap("sortId")
    private Integer sortId;

    @com.aliyun.core.annotation.NameInMap("transformerId")
    private String transformerId;

    @com.aliyun.core.annotation.NameInMap("transformerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transformerName;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private TransformerForView(Builder builder) {
        this.actions = builder.actions;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.enable = builder.enable;
        this.filterSetting = builder.filterSetting;
        this.quitAfterMatch = builder.quitAfterMatch;
        this.sortId = builder.sortId;
        this.transformerId = builder.transformerId;
        this.transformerName = builder.transformerName;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformerForView create() {
        return builder().build();
    }

    /**
     * @return actions
     */
    public java.util.List < TransformAction > getActions() {
        return this.actions;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return quitAfterMatch
     */
    public Boolean getQuitAfterMatch() {
        return this.quitAfterMatch;
    }

    /**
     * @return sortId
     */
    public Integer getSortId() {
        return this.sortId;
    }

    /**
     * @return transformerId
     */
    public String getTransformerId() {
        return this.transformerId;
    }

    /**
     * @return transformerName
     */
    public String getTransformerName() {
        return this.transformerName;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private java.util.List < TransformAction > actions; 
        private String createTime; 
        private String description; 
        private Boolean enable; 
        private FilterSetting filterSetting; 
        private Boolean quitAfterMatch; 
        private Integer sortId; 
        private String transformerId; 
        private String transformerName; 
        private String updateTime; 
        private String userId; 
        private String workspace; 

        /**
         * actions.
         */
        public Builder actions(java.util.List < TransformAction > actions) {
            this.actions = actions;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * filterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * quitAfterMatch.
         */
        public Builder quitAfterMatch(Boolean quitAfterMatch) {
            this.quitAfterMatch = quitAfterMatch;
            return this;
        }

        /**
         * sortId.
         */
        public Builder sortId(Integer sortId) {
            this.sortId = sortId;
            return this;
        }

        /**
         * transformerId.
         */
        public Builder transformerId(String transformerId) {
            this.transformerId = transformerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder transformerName(String transformerName) {
            this.transformerName = transformerName;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public TransformerForView build() {
            return new TransformerForView(this);
        } 

    } 

}
