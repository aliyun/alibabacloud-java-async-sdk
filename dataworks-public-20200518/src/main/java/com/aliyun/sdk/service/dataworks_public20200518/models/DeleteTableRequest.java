// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableRequest} extends {@link RequestModel}
 *
 * <p>DeleteTableRequest</p>
 */
public class DeleteTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppGuid")
    private String appGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Integer envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    private DeleteTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appGuid = builder.appGuid;
        this.envType = builder.envType;
        this.projectId = builder.projectId;
        this.schema = builder.schema;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTableRequest create() {
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
     * @return appGuid
     */
    public String getAppGuid() {
        return this.appGuid;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<DeleteTableRequest, Builder> {
        private String regionId; 
        private String appGuid; 
        private Integer envType; 
        private Long projectId; 
        private String schema; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appGuid = request.appGuid;
            this.envType = request.envType;
            this.projectId = request.projectId;
            this.schema = request.schema;
            this.tableName = request.tableName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The globally unique identifier (GUID) of the MaxCompute project. Specify the GUID in the odps.{projectName} format.
         */
        public Builder appGuid(String appGuid) {
            this.putQueryParameter("AppGuid", appGuid);
            this.appGuid = appGuid;
            return this;
        }

        /**
         * The type of the compute engine or data source. Valid values:
         * <p>
         * 
         * *   cdh
         * *   analyticdb_for_mysql
         * *   odps
         * *   emr
         * *   hadoop
         * *   holodb
         * *   hybriddb_for_postgresql
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The ID of the DataWorks workspace.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The schema information of the table. You need to enter the schema information of the table if you enable the table schema in MaxCompute.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * The name of the MaxCompute table.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public DeleteTableRequest build() {
            return new DeleteTableRequest(this);
        } 

    } 

}
