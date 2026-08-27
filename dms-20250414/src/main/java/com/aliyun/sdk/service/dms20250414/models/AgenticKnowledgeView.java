// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link AgenticKnowledgeView} extends {@link TeaModel}
 *
 * <p>AgenticKnowledgeView</p>
 */
public class AgenticKnowledgeView extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("DatabaseUuid")
    private String databaseUuid;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("Extra")
    private java.util.Map<String, ?> extra;

    @com.aliyun.core.annotation.NameInMap("KnowledgeUuid")
    private String knowledgeUuid;

    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("Locked")
    private Boolean locked;

    @com.aliyun.core.annotation.NameInMap("LockedBy")
    private String lockedBy;

    @com.aliyun.core.annotation.NameInMap("LockedTime")
    private Long lockedTime;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("QualifiedName")
    private String qualifiedName;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("UnitCatalogUuid")
    private String unitCatalogUuid;

    @com.aliyun.core.annotation.NameInMap("UnitDatabaseUuid")
    private String unitDatabaseUuid;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private AgenticKnowledgeView(Builder builder) {
        this.catalogUuid = builder.catalogUuid;
        this.columnName = builder.columnName;
        this.createTime = builder.createTime;
        this.databaseUuid = builder.databaseUuid;
        this.description = builder.description;
        this.entityType = builder.entityType;
        this.extra = builder.extra;
        this.knowledgeUuid = builder.knowledgeUuid;
        this.level = builder.level;
        this.locked = builder.locked;
        this.lockedBy = builder.lockedBy;
        this.lockedTime = builder.lockedTime;
        this.modifyTime = builder.modifyTime;
        this.qualifiedName = builder.qualifiedName;
        this.source = builder.source;
        this.summary = builder.summary;
        this.title = builder.title;
        this.unitCatalogUuid = builder.unitCatalogUuid;
        this.unitDatabaseUuid = builder.unitDatabaseUuid;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgenticKnowledgeView create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return databaseUuid
     */
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return extra
     */
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    /**
     * @return knowledgeUuid
     */
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return locked
     */
    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * @return lockedBy
     */
    public String getLockedBy() {
        return this.lockedBy;
    }

    /**
     * @return lockedTime
     */
    public Long getLockedTime() {
        return this.lockedTime;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return unitCatalogUuid
     */
    public String getUnitCatalogUuid() {
        return this.unitCatalogUuid;
    }

    /**
     * @return unitDatabaseUuid
     */
    public String getUnitDatabaseUuid() {
        return this.unitDatabaseUuid;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String catalogUuid; 
        private String columnName; 
        private Long createTime; 
        private String databaseUuid; 
        private String description; 
        private String entityType; 
        private java.util.Map<String, ?> extra; 
        private String knowledgeUuid; 
        private String level; 
        private Boolean locked; 
        private String lockedBy; 
        private Long lockedTime; 
        private Long modifyTime; 
        private String qualifiedName; 
        private String source; 
        private String summary; 
        private String title; 
        private String unitCatalogUuid; 
        private String unitDatabaseUuid; 
        private String version; 

        private Builder() {
        } 

        private Builder(AgenticKnowledgeView model) {
            this.catalogUuid = model.catalogUuid;
            this.columnName = model.columnName;
            this.createTime = model.createTime;
            this.databaseUuid = model.databaseUuid;
            this.description = model.description;
            this.entityType = model.entityType;
            this.extra = model.extra;
            this.knowledgeUuid = model.knowledgeUuid;
            this.level = model.level;
            this.locked = model.locked;
            this.lockedBy = model.lockedBy;
            this.lockedTime = model.lockedTime;
            this.modifyTime = model.modifyTime;
            this.qualifiedName = model.qualifiedName;
            this.source = model.source;
            this.summary = model.summary;
            this.title = model.title;
            this.unitCatalogUuid = model.unitCatalogUuid;
            this.unitDatabaseUuid = model.unitDatabaseUuid;
            this.version = model.version;
        } 

        /**
         * CatalogUuid.
         */
        public Builder catalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * ColumnName.
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DatabaseUuid.
         */
        public Builder databaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
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
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * Extra.
         */
        public Builder extra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }

        /**
         * KnowledgeUuid.
         */
        public Builder knowledgeUuid(String knowledgeUuid) {
            this.knowledgeUuid = knowledgeUuid;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * Locked.
         */
        public Builder locked(Boolean locked) {
            this.locked = locked;
            return this;
        }

        /**
         * LockedBy.
         */
        public Builder lockedBy(String lockedBy) {
            this.lockedBy = lockedBy;
            return this;
        }

        /**
         * LockedTime.
         */
        public Builder lockedTime(Long lockedTime) {
            this.lockedTime = lockedTime;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
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
         * Summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
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
         * UnitCatalogUuid.
         */
        public Builder unitCatalogUuid(String unitCatalogUuid) {
            this.unitCatalogUuid = unitCatalogUuid;
            return this;
        }

        /**
         * UnitDatabaseUuid.
         */
        public Builder unitDatabaseUuid(String unitDatabaseUuid) {
            this.unitDatabaseUuid = unitDatabaseUuid;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public AgenticKnowledgeView build() {
            return new AgenticKnowledgeView(this);
        } 

    } 

}
