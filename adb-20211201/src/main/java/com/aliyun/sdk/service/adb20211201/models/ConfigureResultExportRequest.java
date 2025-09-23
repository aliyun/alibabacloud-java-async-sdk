// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ConfigureResultExportRequest} extends {@link RequestModel}
 *
 * <p>ConfigureResultExportRequest</p>
 */
public class ConfigureResultExportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExportType")
    private String exportType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OssInfo")
    private OssInfo ossInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SlsInfo")
    private SlsInfo slsInfo;

    private ConfigureResultExportRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.exportType = builder.exportType;
        this.ossInfo = builder.ossInfo;
        this.regionId = builder.regionId;
        this.slsInfo = builder.slsInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureResultExportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return ossInfo
     */
    public OssInfo getOssInfo() {
        return this.ossInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return slsInfo
     */
    public SlsInfo getSlsInfo() {
        return this.slsInfo;
    }

    public static final class Builder extends Request.Builder<ConfigureResultExportRequest, Builder> {
        private String DBClusterId; 
        private String exportType; 
        private OssInfo ossInfo; 
        private String regionId; 
        private SlsInfo slsInfo; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureResultExportRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.exportType = request.exportType;
            this.ossInfo = request.ossInfo;
            this.regionId = request.regionId;
            this.slsInfo = request.slsInfo;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-wz9509beptiz****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * ExportType.
         */
        public Builder exportType(String exportType) {
            this.putBodyParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * OssInfo.
         */
        public Builder ossInfo(OssInfo ossInfo) {
            String ossInfoShrink = shrink(ossInfo, "OssInfo", "json");
            this.putBodyParameter("OssInfo", ossInfoShrink);
            this.ossInfo = ossInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SlsInfo.
         */
        public Builder slsInfo(SlsInfo slsInfo) {
            String slsInfoShrink = shrink(slsInfo, "SlsInfo", "json");
            this.putBodyParameter("SlsInfo", slsInfoShrink);
            this.slsInfo = slsInfo;
            return this;
        }

        @Override
        public ConfigureResultExportRequest build() {
            return new ConfigureResultExportRequest(this);
        } 

    } 

    /**
     * 
     * {@link ConfigureResultExportRequest} extends {@link TeaModel}
     *
     * <p>ConfigureResultExportRequest</p>
     */
    public static class OssInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExportBasePath")
        private String exportBasePath;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("ResultFileTtl")
        private Integer resultFileTtl;

        private OssInfo(Builder builder) {
            this.exportBasePath = builder.exportBasePath;
            this.resourceGroup = builder.resourceGroup;
            this.resultFileTtl = builder.resultFileTtl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssInfo create() {
            return builder().build();
        }

        /**
         * @return exportBasePath
         */
        public String getExportBasePath() {
            return this.exportBasePath;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return resultFileTtl
         */
        public Integer getResultFileTtl() {
            return this.resultFileTtl;
        }

        public static final class Builder {
            private String exportBasePath; 
            private String resourceGroup; 
            private Integer resultFileTtl; 

            private Builder() {
            } 

            private Builder(OssInfo model) {
                this.exportBasePath = model.exportBasePath;
                this.resourceGroup = model.resourceGroup;
                this.resultFileTtl = model.resultFileTtl;
            } 

            /**
             * ExportBasePath.
             */
            public Builder exportBasePath(String exportBasePath) {
                this.exportBasePath = exportBasePath;
                return this;
            }

            /**
             * ResourceGroup.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * ResultFileTtl.
             */
            public Builder resultFileTtl(Integer resultFileTtl) {
                this.resultFileTtl = resultFileTtl;
                return this;
            }

            public OssInfo build() {
                return new OssInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigureResultExportRequest} extends {@link TeaModel}
     *
     * <p>ConfigureResultExportRequest</p>
     */
    public static class SlsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogstoreTtl")
        private Integer logstoreTtl;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("SlsProject")
        private String slsProject;

        private SlsInfo(Builder builder) {
            this.logstoreTtl = builder.logstoreTtl;
            this.resourceGroup = builder.resourceGroup;
            this.slsProject = builder.slsProject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsInfo create() {
            return builder().build();
        }

        /**
         * @return logstoreTtl
         */
        public Integer getLogstoreTtl() {
            return this.logstoreTtl;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return slsProject
         */
        public String getSlsProject() {
            return this.slsProject;
        }

        public static final class Builder {
            private Integer logstoreTtl; 
            private String resourceGroup; 
            private String slsProject; 

            private Builder() {
            } 

            private Builder(SlsInfo model) {
                this.logstoreTtl = model.logstoreTtl;
                this.resourceGroup = model.resourceGroup;
                this.slsProject = model.slsProject;
            } 

            /**
             * LogstoreTtl.
             */
            public Builder logstoreTtl(Integer logstoreTtl) {
                this.logstoreTtl = logstoreTtl;
                return this;
            }

            /**
             * ResourceGroup.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * SlsProject.
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            public SlsInfo build() {
                return new SlsInfo(this);
            } 

        } 

    }
}
