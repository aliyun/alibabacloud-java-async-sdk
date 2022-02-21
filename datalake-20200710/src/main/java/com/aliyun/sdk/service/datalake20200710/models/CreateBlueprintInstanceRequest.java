// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBlueprintInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateBlueprintInstanceRequest</p>
 */
public class CreateBlueprintInstanceRequest extends Request {
    @Body
    @NameInMap("BlueprintType")
    private String blueprintType;

    @Header
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DataSourceConfig")
    private String dataSourceConfig;

    @Body
    @NameInMap("ExecuteCapacity")
    private String executeCapacity;

    @Body
    @NameInMap("ExecuteParameters")
    private String executeParameters;

    @Body
    @NameInMap("ExecuteType")
    private String executeType;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PreProcessingConfig")
    private String preProcessingConfig;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleName")
    private String roleName;

    @Body
    @NameInMap("TargetDatabase")
    private String targetDatabase;

    @Body
    @NameInMap("TargetFormat")
    private String targetFormat;

    @Body
    @NameInMap("TargetLocationUri")
    private String targetLocationUri;

    @Body
    @NameInMap("TargetPartitions")
    private String targetPartitions;

    @Body
    @NameInMap("TargetTable")
    private String targetTable;

    private CreateBlueprintInstanceRequest(Builder builder) {
        super(builder);
        this.blueprintType = builder.blueprintType;
        this.clientToken = builder.clientToken;
        this.dataSourceConfig = builder.dataSourceConfig;
        this.executeCapacity = builder.executeCapacity;
        this.executeParameters = builder.executeParameters;
        this.executeType = builder.executeType;
        this.name = builder.name;
        this.preProcessingConfig = builder.preProcessingConfig;
        this.regionId = builder.regionId;
        this.roleName = builder.roleName;
        this.targetDatabase = builder.targetDatabase;
        this.targetFormat = builder.targetFormat;
        this.targetLocationUri = builder.targetLocationUri;
        this.targetPartitions = builder.targetPartitions;
        this.targetTable = builder.targetTable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBlueprintInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blueprintType
     */
    public String getBlueprintType() {
        return this.blueprintType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataSourceConfig
     */
    public String getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    /**
     * @return executeCapacity
     */
    public String getExecuteCapacity() {
        return this.executeCapacity;
    }

    /**
     * @return executeParameters
     */
    public String getExecuteParameters() {
        return this.executeParameters;
    }

    /**
     * @return executeType
     */
    public String getExecuteType() {
        return this.executeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return preProcessingConfig
     */
    public String getPreProcessingConfig() {
        return this.preProcessingConfig;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return targetDatabase
     */
    public String getTargetDatabase() {
        return this.targetDatabase;
    }

    /**
     * @return targetFormat
     */
    public String getTargetFormat() {
        return this.targetFormat;
    }

    /**
     * @return targetLocationUri
     */
    public String getTargetLocationUri() {
        return this.targetLocationUri;
    }

    /**
     * @return targetPartitions
     */
    public String getTargetPartitions() {
        return this.targetPartitions;
    }

    /**
     * @return targetTable
     */
    public String getTargetTable() {
        return this.targetTable;
    }

    public static final class Builder extends Request.Builder<CreateBlueprintInstanceRequest, Builder> {
        private String blueprintType; 
        private String clientToken; 
        private String dataSourceConfig; 
        private String executeCapacity; 
        private String executeParameters; 
        private String executeType; 
        private String name; 
        private String preProcessingConfig; 
        private String regionId; 
        private String roleName; 
        private String targetDatabase; 
        private String targetFormat; 
        private String targetLocationUri; 
        private String targetPartitions; 
        private String targetTable; 

        private Builder() {
            super();
        } 

        private Builder(CreateBlueprintInstanceRequest response) {
            super(response);
            this.blueprintType = response.blueprintType;
            this.clientToken = response.clientToken;
            this.dataSourceConfig = response.dataSourceConfig;
            this.executeCapacity = response.executeCapacity;
            this.executeParameters = response.executeParameters;
            this.executeType = response.executeType;
            this.name = response.name;
            this.preProcessingConfig = response.preProcessingConfig;
            this.regionId = response.regionId;
            this.roleName = response.roleName;
            this.targetDatabase = response.targetDatabase;
            this.targetFormat = response.targetFormat;
            this.targetLocationUri = response.targetLocationUri;
            this.targetPartitions = response.targetPartitions;
            this.targetTable = response.targetTable;
        } 

        /**
         * BlueprintType.
         */
        public Builder blueprintType(String blueprintType) {
            this.putBodyParameter("BlueprintType", blueprintType);
            this.blueprintType = blueprintType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putHeaderParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DataSourceConfig.
         */
        public Builder dataSourceConfig(String dataSourceConfig) {
            this.putBodyParameter("DataSourceConfig", dataSourceConfig);
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }

        /**
         * ExecuteCapacity.
         */
        public Builder executeCapacity(String executeCapacity) {
            this.putBodyParameter("ExecuteCapacity", executeCapacity);
            this.executeCapacity = executeCapacity;
            return this;
        }

        /**
         * ExecuteParameters.
         */
        public Builder executeParameters(String executeParameters) {
            this.putBodyParameter("ExecuteParameters", executeParameters);
            this.executeParameters = executeParameters;
            return this;
        }

        /**
         * ExecuteType.
         */
        public Builder executeType(String executeType) {
            this.putBodyParameter("ExecuteType", executeType);
            this.executeType = executeType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PreProcessingConfig.
         */
        public Builder preProcessingConfig(String preProcessingConfig) {
            this.putBodyParameter("PreProcessingConfig", preProcessingConfig);
            this.preProcessingConfig = preProcessingConfig;
            return this;
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
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * TargetDatabase.
         */
        public Builder targetDatabase(String targetDatabase) {
            this.putBodyParameter("TargetDatabase", targetDatabase);
            this.targetDatabase = targetDatabase;
            return this;
        }

        /**
         * TargetFormat.
         */
        public Builder targetFormat(String targetFormat) {
            this.putBodyParameter("TargetFormat", targetFormat);
            this.targetFormat = targetFormat;
            return this;
        }

        /**
         * TargetLocationUri.
         */
        public Builder targetLocationUri(String targetLocationUri) {
            this.putBodyParameter("TargetLocationUri", targetLocationUri);
            this.targetLocationUri = targetLocationUri;
            return this;
        }

        /**
         * TargetPartitions.
         */
        public Builder targetPartitions(String targetPartitions) {
            this.putBodyParameter("TargetPartitions", targetPartitions);
            this.targetPartitions = targetPartitions;
            return this;
        }

        /**
         * TargetTable.
         */
        public Builder targetTable(String targetTable) {
            this.putBodyParameter("TargetTable", targetTable);
            this.targetTable = targetTable;
            return this;
        }

        @Override
        public CreateBlueprintInstanceRequest build() {
            return new CreateBlueprintInstanceRequest(this);
        } 

    } 

}
