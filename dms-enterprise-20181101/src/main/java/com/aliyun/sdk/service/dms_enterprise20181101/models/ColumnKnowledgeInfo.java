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
 * {@link ColumnKnowledgeInfo} extends {@link TeaModel}
 *
 * <p>ColumnKnowledgeInfo</p>
 */
public class ColumnKnowledgeInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetDescription")
    private String assetDescription;

    @com.aliyun.core.annotation.NameInMap("AssetModifiedGmt")
    private String assetModifiedGmt;

    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.NameInMap("ColumnType")
    private String columnType;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Level")
    private Integer level;

    @com.aliyun.core.annotation.NameInMap("Position")
    private Integer position;

    private ColumnKnowledgeInfo(Builder builder) {
        this.assetDescription = builder.assetDescription;
        this.assetModifiedGmt = builder.assetModifiedGmt;
        this.columnName = builder.columnName;
        this.columnType = builder.columnType;
        this.description = builder.description;
        this.level = builder.level;
        this.position = builder.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ColumnKnowledgeInfo create() {
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
     * @return level
     */
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @return position
     */
    public Integer getPosition() {
        return this.position;
    }

    public static final class Builder {
        private String assetDescription; 
        private String assetModifiedGmt; 
        private String columnName; 
        private String columnType; 
        private String description; 
        private Integer level; 
        private Integer position; 

        private Builder() {
        } 

        private Builder(ColumnKnowledgeInfo model) {
            this.assetDescription = model.assetDescription;
            this.assetModifiedGmt = model.assetModifiedGmt;
            this.columnName = model.columnName;
            this.columnType = model.columnType;
            this.description = model.description;
            this.level = model.level;
            this.position = model.position;
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
         * Level.
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * Position.
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        public ColumnKnowledgeInfo build() {
            return new ColumnKnowledgeInfo(this);
        } 

    } 

}
