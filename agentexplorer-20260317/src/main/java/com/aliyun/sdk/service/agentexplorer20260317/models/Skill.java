// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentexplorer20260317.models;

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
 * {@link Skill} extends {@link TeaModel}
 *
 * <p>Skill</p>
 */
public class Skill extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("categoryCode")
    private String categoryCode;

    @com.aliyun.core.annotation.NameInMap("categoryName")
    private String categoryName;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("installCount")
    private Integer installCount;

    @com.aliyun.core.annotation.NameInMap("likeCount")
    private Integer likeCount;

    @com.aliyun.core.annotation.NameInMap("skillName")
    private String skillName;

    @com.aliyun.core.annotation.NameInMap("subCategoryCode")
    private String subCategoryCode;

    @com.aliyun.core.annotation.NameInMap("subCategoryName")
    private String subCategoryName;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private Skill(Builder builder) {
        this.categoryCode = builder.categoryCode;
        this.categoryName = builder.categoryName;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.installCount = builder.installCount;
        this.likeCount = builder.likeCount;
        this.skillName = builder.skillName;
        this.subCategoryCode = builder.subCategoryCode;
        this.subCategoryName = builder.subCategoryName;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Skill create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryCode
     */
    public String getCategoryCode() {
        return this.categoryCode;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return installCount
     */
    public Integer getInstallCount() {
        return this.installCount;
    }

    /**
     * @return likeCount
     */
    public Integer getLikeCount() {
        return this.likeCount;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return subCategoryCode
     */
    public String getSubCategoryCode() {
        return this.subCategoryCode;
    }

    /**
     * @return subCategoryName
     */
    public String getSubCategoryName() {
        return this.subCategoryName;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String categoryCode; 
        private String categoryName; 
        private String createdAt; 
        private String description; 
        private String displayName; 
        private Integer installCount; 
        private Integer likeCount; 
        private String skillName; 
        private String subCategoryCode; 
        private String subCategoryName; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(Skill model) {
            this.categoryCode = model.categoryCode;
            this.categoryName = model.categoryName;
            this.createdAt = model.createdAt;
            this.description = model.description;
            this.displayName = model.displayName;
            this.installCount = model.installCount;
            this.likeCount = model.likeCount;
            this.skillName = model.skillName;
            this.subCategoryCode = model.subCategoryCode;
            this.subCategoryName = model.subCategoryName;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * categoryCode.
         */
        public Builder categoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }

        /**
         * categoryName.
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * installCount.
         */
        public Builder installCount(Integer installCount) {
            this.installCount = installCount;
            return this;
        }

        /**
         * likeCount.
         */
        public Builder likeCount(Integer likeCount) {
            this.likeCount = likeCount;
            return this;
        }

        /**
         * skillName.
         */
        public Builder skillName(String skillName) {
            this.skillName = skillName;
            return this;
        }

        /**
         * subCategoryCode.
         */
        public Builder subCategoryCode(String subCategoryCode) {
            this.subCategoryCode = subCategoryCode;
            return this;
        }

        /**
         * subCategoryName.
         */
        public Builder subCategoryName(String subCategoryName) {
            this.subCategoryName = subCategoryName;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Skill build() {
            return new Skill(this);
        } 

    } 

}
