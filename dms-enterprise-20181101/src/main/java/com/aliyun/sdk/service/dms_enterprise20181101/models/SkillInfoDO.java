// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link SkillInfoDO} extends {@link TeaModel}
 *
 * <p>SkillInfoDO</p>
 */
public class SkillInfoDO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("Compatibility")
    private String compatibility;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("InstallCount")
    private String installCount;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.NameInMap("UpdatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private SkillInfoDO(Builder builder) {
        this.category = builder.category;
        this.compatibility = builder.compatibility;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.installCount = builder.installCount;
        this.name = builder.name;
        this.source = builder.source;
        this.sourceType = builder.sourceType;
        this.tags = builder.tags;
        this.updatedAt = builder.updatedAt;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkillInfoDO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return compatibility
     */
    public String getCompatibility() {
        return this.compatibility;
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
    public String getInstallCount() {
        return this.installCount;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String category; 
        private String compatibility; 
        private String description; 
        private String displayName; 
        private String installCount; 
        private String name; 
        private String source; 
        private String sourceType; 
        private String tags; 
        private String updatedAt; 
        private String version; 

        private Builder() {
        } 

        private Builder(SkillInfoDO model) {
            this.category = model.category;
            this.compatibility = model.compatibility;
            this.description = model.description;
            this.displayName = model.displayName;
            this.installCount = model.installCount;
            this.name = model.name;
            this.source = model.source;
            this.sourceType = model.sourceType;
            this.tags = model.tags;
            this.updatedAt = model.updatedAt;
            this.version = model.version;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Compatibility.
         */
        public Builder compatibility(String compatibility) {
            this.compatibility = compatibility;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * InstallCount.
         */
        public Builder installCount(String installCount) {
            this.installCount = installCount;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        /**
         * UpdatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public SkillInfoDO build() {
            return new SkillInfoDO(this);
        } 

    } 

}
