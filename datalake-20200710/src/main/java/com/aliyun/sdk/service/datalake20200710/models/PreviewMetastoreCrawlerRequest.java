// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewMetastoreCrawlerRequest} extends {@link RequestModel}
 *
 * <p>PreviewMetastoreCrawlerRequest</p>
 */
public class PreviewMetastoreCrawlerRequest extends Request {
    @Body
    @NameInMap("DatasourceExcludePath")
    private String datasourceExcludePath;

    @Body
    @NameInMap("DatasourcePath")
    private String datasourcePath;

    @Body
    @NameInMap("DatasourceType")
    private String datasourceType;

    @Body
    @NameInMap("FileFormat")
    private String fileFormat;

    @Body
    @NameInMap("FileFormatConfig")
    private String fileFormatConfig;

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
    @NameInMap("TargetDatabase")
    private String targetDatabase;

    @Body
    @NameInMap("TargetTablePrefix")
    private String targetTablePrefix;

    @Body
    @NameInMap("TargetUpdateStrategy")
    private String targetUpdateStrategy;

    private PreviewMetastoreCrawlerRequest(Builder builder) {
        super(builder);
        this.datasourceExcludePath = builder.datasourceExcludePath;
        this.datasourcePath = builder.datasourcePath;
        this.datasourceType = builder.datasourceType;
        this.fileFormat = builder.fileFormat;
        this.fileFormatConfig = builder.fileFormatConfig;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.roleName = builder.roleName;
        this.targetDatabase = builder.targetDatabase;
        this.targetTablePrefix = builder.targetTablePrefix;
        this.targetUpdateStrategy = builder.targetUpdateStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewMetastoreCrawlerRequest create() {
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
     * @return datasourcePath
     */
    public String getDatasourcePath() {
        return this.datasourcePath;
    }

    /**
     * @return datasourceType
     */
    public String getDatasourceType() {
        return this.datasourceType;
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
     * @return targetDatabase
     */
    public String getTargetDatabase() {
        return this.targetDatabase;
    }

    /**
     * @return targetTablePrefix
     */
    public String getTargetTablePrefix() {
        return this.targetTablePrefix;
    }

    /**
     * @return targetUpdateStrategy
     */
    public String getTargetUpdateStrategy() {
        return this.targetUpdateStrategy;
    }

    public static final class Builder extends Request.Builder<PreviewMetastoreCrawlerRequest, Builder> {
        private String datasourceExcludePath; 
        private String datasourcePath; 
        private String datasourceType; 
        private String fileFormat; 
        private String fileFormatConfig; 
        private String name; 
        private String regionId; 
        private String roleName; 
        private String targetDatabase; 
        private String targetTablePrefix; 
        private String targetUpdateStrategy; 

        private Builder() {
            super();
        } 

        private Builder(PreviewMetastoreCrawlerRequest response) {
            super(response);
            this.datasourceExcludePath = response.datasourceExcludePath;
            this.datasourcePath = response.datasourcePath;
            this.datasourceType = response.datasourceType;
            this.fileFormat = response.fileFormat;
            this.fileFormatConfig = response.fileFormatConfig;
            this.name = response.name;
            this.regionId = response.regionId;
            this.roleName = response.roleName;
            this.targetDatabase = response.targetDatabase;
            this.targetTablePrefix = response.targetTablePrefix;
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
         * DatasourcePath.
         */
        public Builder datasourcePath(String datasourcePath) {
            this.putBodyParameter("DatasourcePath", datasourcePath);
            this.datasourcePath = datasourcePath;
            return this;
        }

        /**
         * DatasourceType.
         */
        public Builder datasourceType(String datasourceType) {
            this.putBodyParameter("DatasourceType", datasourceType);
            this.datasourceType = datasourceType;
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
         * TargetDatabase.
         */
        public Builder targetDatabase(String targetDatabase) {
            this.putBodyParameter("TargetDatabase", targetDatabase);
            this.targetDatabase = targetDatabase;
            return this;
        }

        /**
         * TargetTablePrefix.
         */
        public Builder targetTablePrefix(String targetTablePrefix) {
            this.putBodyParameter("TargetTablePrefix", targetTablePrefix);
            this.targetTablePrefix = targetTablePrefix;
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
        public PreviewMetastoreCrawlerRequest build() {
            return new PreviewMetastoreCrawlerRequest(this);
        } 

    } 

}
