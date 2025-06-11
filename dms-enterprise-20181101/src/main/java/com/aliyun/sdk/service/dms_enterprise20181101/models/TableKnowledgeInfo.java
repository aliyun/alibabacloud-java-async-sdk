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
 * {@link TableKnowledgeInfo} extends {@link TeaModel}
 *
 * <p>TableKnowledgeInfo</p>
 */
public class TableKnowledgeInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetDescription")
    private String assetDescription;

    @com.aliyun.core.annotation.NameInMap("AssetModifiedGmt")
    private String assetModifiedGmt;

    @com.aliyun.core.annotation.NameInMap("ColumnList")
    private java.util.List<ColumnKnowledgeInfo> columnList;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private TableKnowledgeInfo(Builder builder) {
        this.assetDescription = builder.assetDescription;
        this.assetModifiedGmt = builder.assetModifiedGmt;
        this.columnList = builder.columnList;
        this.description = builder.description;
        this.summary = builder.summary;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableKnowledgeInfo create() {
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
     * @return columnList
     */
    public java.util.List<ColumnKnowledgeInfo> getColumnList() {
        return this.columnList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private String assetDescription; 
        private String assetModifiedGmt; 
        private java.util.List<ColumnKnowledgeInfo> columnList; 
        private String description; 
        private String summary; 
        private String tableName; 

        private Builder() {
        } 

        private Builder(TableKnowledgeInfo model) {
            this.assetDescription = model.assetDescription;
            this.assetModifiedGmt = model.assetModifiedGmt;
            this.columnList = model.columnList;
            this.description = model.description;
            this.summary = model.summary;
            this.tableName = model.tableName;
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
         * ColumnList.
         */
        public Builder columnList(java.util.List<ColumnKnowledgeInfo> columnList) {
            this.columnList = columnList;
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
         * Summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public TableKnowledgeInfo build() {
            return new TableKnowledgeInfo(this);
        } 

    } 

}
