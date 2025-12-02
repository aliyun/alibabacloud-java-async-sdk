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
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
         * </blockquote>
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
         * <p>The export type. Valid values:</p>
         * <ul>
         * <li>SLS: Specifies that the export destination is SLS.</li>
         * <li>OSS: Specifies that the export destination is OSS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        public Builder exportType(String exportType) {
            this.putBodyParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * <p>The OSS configuration details if the destination is of the OSS type.</p>
         */
        public Builder ossInfo(OssInfo ossInfo) {
            String ossInfoShrink = shrink(ossInfo, "OssInfo", "json");
            this.putBodyParameter("OssInfo", ossInfoShrink);
            this.ossInfo = ossInfo;
            return this;
        }

        /**
         * <p>The ID of the region where the instance resides.</p>
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
         * <p>The SLS configuration details if the destination is of the SLS type.</p>
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
             * <p>The OSS path where the result sets are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://testBucketName/data_result</p>
             */
            public Builder exportBasePath(String exportBasePath) {
                this.exportBasePath = exportBasePath;
                return this;
            }

            /**
             * <p>The name of the resource group that runs the job.</p>
             * 
             * <strong>example:</strong>
             * <p>aps</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The expiration time of the OSS file. Unit: days. Minimum: 1 day, maximum: 30 days. Values outside this range will result in an error.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
             * <p>The expiration time of the Logstore temporarily generated during the result set export. Unit: days. The Logstore is automatically deleted after it expires. Minimum value: 1 day, maximum: 30 days. Values outside this range will result in an error.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder logstoreTtl(Integer logstoreTtl) {
                this.logstoreTtl = logstoreTtl;
                return this;
            }

            /**
             * <p>The name of the resource group that runs the job.</p>
             * 
             * <strong>example:</strong>
             * <p>aps</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The name of the SLS project.</p>
             * 
             * <strong>example:</strong>
             * <p>test-project</p>
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
