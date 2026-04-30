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
 * {@link TableInstructionsVO} extends {@link TeaModel}
 *
 * <p>TableInstructionsVO</p>
 */
public class TableInstructionsVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetCreatedGmt")
    private String assetCreatedGmt;

    @com.aliyun.core.annotation.NameInMap("AssetDescription")
    private String assetDescription;

    @com.aliyun.core.annotation.NameInMap("AssetModifiedGmt")
    private String assetModifiedGmt;

    @com.aliyun.core.annotation.NameInMap("DbId")
    private Integer dbId;

    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private TableInstructionsVO(Builder builder) {
        this.assetCreatedGmt = builder.assetCreatedGmt;
        this.assetDescription = builder.assetDescription;
        this.assetModifiedGmt = builder.assetModifiedGmt;
        this.dbId = builder.dbId;
        this.dbType = builder.dbType;
        this.summary = builder.summary;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableInstructionsVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetCreatedGmt
     */
    public String getAssetCreatedGmt() {
        return this.assetCreatedGmt;
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
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
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
        private String assetCreatedGmt; 
        private String assetDescription; 
        private String assetModifiedGmt; 
        private Integer dbId; 
        private String dbType; 
        private String summary; 
        private String tableName; 

        private Builder() {
        } 

        private Builder(TableInstructionsVO model) {
            this.assetCreatedGmt = model.assetCreatedGmt;
            this.assetDescription = model.assetDescription;
            this.assetModifiedGmt = model.assetModifiedGmt;
            this.dbId = model.dbId;
            this.dbType = model.dbType;
            this.summary = model.summary;
            this.tableName = model.tableName;
        } 

        /**
         * AssetCreatedGmt.
         */
        public Builder assetCreatedGmt(String assetCreatedGmt) {
            this.assetCreatedGmt = assetCreatedGmt;
            return this;
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
         * DbId.
         */
        public Builder dbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.dbType = dbType;
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

        public TableInstructionsVO build() {
            return new TableInstructionsVO(this);
        } 

    } 

}
