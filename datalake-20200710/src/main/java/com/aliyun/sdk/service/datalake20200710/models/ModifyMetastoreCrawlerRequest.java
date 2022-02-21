// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMetastoreCrawlerRequest} extends {@link RequestModel}
 *
 * <p>ModifyMetastoreCrawlerRequest</p>
 */
public class ModifyMetastoreCrawlerRequest extends Request {
    @Body
    @NameInMap("DatasourceExcludePath")
    private String datasourceExcludePath;

    @Body
    @NameInMap("ExecuteCron")
    private String executeCron;

    @Body
    @NameInMap("ExecuteType")
    private String executeType;

    @Body
    @NameInMap("FileFormat")
    private String fileFormat;

    @Body
    @NameInMap("FileFormatConfig")
    private String fileFormatConfig;

    @Body
    @NameInMap("Id")
    private String id;

    @Body
    @NameInMap("ImmediatelyRun")
    private Boolean immediatelyRun;

    @Body
    @NameInMap("Name")
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleName")
    private String roleName;

    @Body
    @NameInMap("TargetUpdateStrategy")
    private String targetUpdateStrategy;

    private ModifyMetastoreCrawlerRequest(Builder builder) {
        super(builder);
        this.datasourceExcludePath = builder.datasourceExcludePath;
        this.executeCron = builder.executeCron;
        this.executeType = builder.executeType;
        this.fileFormat = builder.fileFormat;
        this.fileFormatConfig = builder.fileFormatConfig;
        this.id = builder.id;
        this.immediatelyRun = builder.immediatelyRun;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.roleName = builder.roleName;
        this.targetUpdateStrategy = builder.targetUpdateStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMetastoreCrawlerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasourceExcludePath
     */
    public String getDatasourceExcludePath() {
        return this.datasourceExcludePath;
    }

    /**
     * @return executeCron
     */
    public String getExecuteCron() {
        return this.executeCron;
    }

    /**
     * @return executeType
     */
    public String getExecuteType() {
        return this.executeType;
    }

    /**
     * @return fileFormat
     */
    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * @return fileFormatConfig
     */
    public String getFileFormatConfig() {
        return this.fileFormatConfig;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return immediatelyRun
     */
    public Boolean getImmediatelyRun() {
        return this.immediatelyRun;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return targetUpdateStrategy
     */
    public String getTargetUpdateStrategy() {
        return this.targetUpdateStrategy;
    }

    public static final class Builder extends Request.Builder<ModifyMetastoreCrawlerRequest, Builder> {
        private String datasourceExcludePath; 
        private String executeCron; 
        private String executeType; 
        private String fileFormat; 
        private String fileFormatConfig; 
        private String id; 
        private Boolean immediatelyRun; 
        private String name; 
        private String regionId; 
        private String roleName; 
        private String targetUpdateStrategy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMetastoreCrawlerRequest response) {
            super(response);
            this.datasourceExcludePath = response.datasourceExcludePath;
            this.executeCron = response.executeCron;
            this.executeType = response.executeType;
            this.fileFormat = response.fileFormat;
            this.fileFormatConfig = response.fileFormatConfig;
            this.id = response.id;
            this.immediatelyRun = response.immediatelyRun;
            this.name = response.name;
            this.regionId = response.regionId;
            this.roleName = response.roleName;
            this.targetUpdateStrategy = response.targetUpdateStrategy;
        } 

        /**
         * DatasourceExcludePath.
         */
        public Builder datasourceExcludePath(String datasourceExcludePath) {
            this.putBodyParameter("DatasourceExcludePath", datasourceExcludePath);
            this.datasourceExcludePath = datasourceExcludePath;
            return this;
        }

        /**
         * ExecuteCron.
         */
        public Builder executeCron(String executeCron) {
            this.putBodyParameter("ExecuteCron", executeCron);
            this.executeCron = executeCron;
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
         * FileFormat.
         */
        public Builder fileFormat(String fileFormat) {
            this.putBodyParameter("FileFormat", fileFormat);
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * FileFormatConfig.
         */
        public Builder fileFormatConfig(String fileFormatConfig) {
            this.putBodyParameter("FileFormatConfig", fileFormatConfig);
            this.fileFormatConfig = fileFormatConfig;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * ImmediatelyRun.
         */
        public Builder immediatelyRun(Boolean immediatelyRun) {
            this.putBodyParameter("ImmediatelyRun", immediatelyRun);
            this.immediatelyRun = immediatelyRun;
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
         * TargetUpdateStrategy.
         */
        public Builder targetUpdateStrategy(String targetUpdateStrategy) {
            this.putBodyParameter("TargetUpdateStrategy", targetUpdateStrategy);
            this.targetUpdateStrategy = targetUpdateStrategy;
            return this;
        }

        @Override
        public ModifyMetastoreCrawlerRequest build() {
            return new ModifyMetastoreCrawlerRequest(this);
        } 

    } 

}
