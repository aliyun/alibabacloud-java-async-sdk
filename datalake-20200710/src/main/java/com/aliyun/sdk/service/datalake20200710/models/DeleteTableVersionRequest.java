// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteTableVersionRequest</p>
 */
public class DeleteTableVersionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("TableName")
    private String tableName;

    @Query
    @NameInMap("VersionId")
    private Integer versionId;

    private DeleteTableVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.tableName = builder.tableName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTableVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return versionId
     */
    public Integer getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DeleteTableVersionRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private String tableName; 
        private Integer versionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTableVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.tableName = request.tableName;
            this.versionId = request.versionId;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * table version id
         */
        public Builder versionId(Integer versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DeleteTableVersionRequest build() {
            return new DeleteTableVersionRequest(this);
        } 

    } 

}
