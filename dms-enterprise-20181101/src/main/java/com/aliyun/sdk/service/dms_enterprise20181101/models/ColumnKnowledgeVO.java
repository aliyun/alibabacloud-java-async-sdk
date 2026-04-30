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
 * {@link ColumnKnowledgeVO} extends {@link TeaModel}
 *
 * <p>ColumnKnowledgeVO</p>
 */
public class ColumnKnowledgeVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetDescription")
    private String assetDescription;

    @com.aliyun.core.annotation.NameInMap("AssetModifiedGmt")
    private String assetModifiedGmt;

    @com.aliyun.core.annotation.NameInMap("AutoIncrement")
    private Boolean autoIncrement;

    @com.aliyun.core.annotation.NameInMap("ColumnId")
    private Long columnId;

    @com.aliyun.core.annotation.NameInMap("ColumnKeyType")
    private String columnKeyType;

    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.NameInMap("ColumnType")
    private String columnType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("HotLevel")
    private Integer hotLevel;

    @com.aliyun.core.annotation.NameInMap("Level")
    private Integer level;

    @com.aliyun.core.annotation.NameInMap("LevelType")
    private String levelType;

    @com.aliyun.core.annotation.NameInMap("Nullable")
    private Boolean nullable;

    @com.aliyun.core.annotation.NameInMap("Plain")
    private Boolean plain;

    @com.aliyun.core.annotation.NameInMap("Position")
    private Integer position;

    @com.aliyun.core.annotation.NameInMap("SecurityLevel")
    private String securityLevel;

    @com.aliyun.core.annotation.NameInMap("TableId")
    private Long tableId;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("UserSensitivityLevel")
    private String userSensitivityLevel;

    private ColumnKnowledgeVO(Builder builder) {
        this.assetDescription = builder.assetDescription;
        this.assetModifiedGmt = builder.assetModifiedGmt;
        this.autoIncrement = builder.autoIncrement;
        this.columnId = builder.columnId;
        this.columnKeyType = builder.columnKeyType;
        this.columnName = builder.columnName;
        this.columnType = builder.columnType;
        this.description = builder.description;
        this.hotLevel = builder.hotLevel;
        this.level = builder.level;
        this.levelType = builder.levelType;
        this.nullable = builder.nullable;
        this.plain = builder.plain;
        this.position = builder.position;
        this.securityLevel = builder.securityLevel;
        this.tableId = builder.tableId;
        this.title = builder.title;
        this.userSensitivityLevel = builder.userSensitivityLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColumnKnowledgeVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetDescription
     */
    public String getAssetDescription() {
        return this.assetDescription;
    }

    /**
     * @return assetModifiedGmt
     */
    public String getAssetModifiedGmt() {
        return this.assetModifiedGmt;
    }

    /**
     * @return autoIncrement
     */
    public Boolean getAutoIncrement() {
        return this.autoIncrement;
    }

    /**
     * @return columnId
     */
    public Long getColumnId() {
        return this.columnId;
    }

    /**
     * @return columnKeyType
     */
    public String getColumnKeyType() {
        return this.columnKeyType;
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return columnType
     */
    public String getColumnType() {
        return this.columnType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return hotLevel
     */
    public Integer getHotLevel() {
        return this.hotLevel;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return levelType
     */
    public String getLevelType() {
        return this.levelType;
    }

    /**
     * @return nullable
     */
    public Boolean getNullable() {
        return this.nullable;
    }

    /**
     * @return plain
     */
    public Boolean getPlain() {
        return this.plain;
    }

    /**
     * @return position
     */
    public Integer getPosition() {
        return this.position;
    }

    /**
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * @return tableId
     */
    public Long getTableId() {
        return this.tableId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userSensitivityLevel
     */
    public String getUserSensitivityLevel() {
        return this.userSensitivityLevel;
    }

    public static final class Builder {
        private String assetDescription; 
        private String assetModifiedGmt; 
        private Boolean autoIncrement; 
        private Long columnId; 
        private String columnKeyType; 
        private String columnName; 
        private String columnType; 
        private String description; 
        private Integer hotLevel; 
        private Integer level; 
        private String levelType; 
        private Boolean nullable; 
        private Boolean plain; 
        private Integer position; 
        private String securityLevel; 
        private Long tableId; 
        private String title; 
        private String userSensitivityLevel; 

        private Builder() {
        } 

        private Builder(ColumnKnowledgeVO model) {
            this.assetDescription = model.assetDescription;
            this.assetModifiedGmt = model.assetModifiedGmt;
            this.autoIncrement = model.autoIncrement;
            this.columnId = model.columnId;
            this.columnKeyType = model.columnKeyType;
            this.columnName = model.columnName;
            this.columnType = model.columnType;
            this.description = model.description;
            this.hotLevel = model.hotLevel;
            this.level = model.level;
            this.levelType = model.levelType;
            this.nullable = model.nullable;
            this.plain = model.plain;
            this.position = model.position;
            this.securityLevel = model.securityLevel;
            this.tableId = model.tableId;
            this.title = model.title;
            this.userSensitivityLevel = model.userSensitivityLevel;
        } 

        /**
         * AssetDescription.
         */
        public Builder assetDescription(String assetDescription) {
            this.assetDescription = assetDescription;
            return this;
        }

        /**
         * AssetModifiedGmt.
         */
        public Builder assetModifiedGmt(String assetModifiedGmt) {
            this.assetModifiedGmt = assetModifiedGmt;
            return this;
        }

        /**
         * AutoIncrement.
         */
        public Builder autoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }

        /**
         * ColumnId.
         */
        public Builder columnId(Long columnId) {
            this.columnId = columnId;
            return this;
        }

        /**
         * ColumnKeyType.
         */
        public Builder columnKeyType(String columnKeyType) {
            this.columnKeyType = columnKeyType;
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
         * ColumnType.
         */
        public Builder columnType(String columnType) {
            this.columnType = columnType;
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
         * HotLevel.
         */
        public Builder hotLevel(Integer hotLevel) {
            this.hotLevel = hotLevel;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * LevelType.
         */
        public Builder levelType(String levelType) {
            this.levelType = levelType;
            return this;
        }

        /**
         * Nullable.
         */
        public Builder nullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * Plain.
         */
        public Builder plain(Boolean plain) {
            this.plain = plain;
            return this;
        }

        /**
         * Position.
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        /**
         * SecurityLevel.
         */
        public Builder securityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        /**
         * TableId.
         */
        public Builder tableId(Long tableId) {
            this.tableId = tableId;
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
         * UserSensitivityLevel.
         */
        public Builder userSensitivityLevel(String userSensitivityLevel) {
            this.userSensitivityLevel = userSensitivityLevel;
            return this;
        }

        public ColumnKnowledgeVO build() {
            return new ColumnKnowledgeVO(this);
        } 

    } 

}
