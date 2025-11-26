// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ExportApplicationConfigsRequest} extends {@link RequestModel}
 *
 * <p>ExportApplicationConfigsRequest</p>
 */
public class ExportApplicationConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationConfigFiles")
    private java.util.List<ApplicationConfigFile> applicationConfigFiles;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigScope")
    private String configScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportMode")
    private String exportMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileFormat")
    private String fileFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupIds")
    private java.util.List<String> nodeGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ExportApplicationConfigsRequest(Builder builder) {
        super(builder);
        this.applicationConfigFiles = builder.applicationConfigFiles;
        this.clusterId = builder.clusterId;
        this.configScope = builder.configScope;
        this.exportMode = builder.exportMode;
        this.fileFormat = builder.fileFormat;
        this.nodeGroupIds = builder.nodeGroupIds;
        this.nodeIds = builder.nodeIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportApplicationConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationConfigFiles
     */
    public java.util.List<ApplicationConfigFile> getApplicationConfigFiles() {
        return this.applicationConfigFiles;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configScope
     */
    public String getConfigScope() {
        return this.configScope;
    }

    /**
     * @return exportMode
     */
    public String getExportMode() {
        return this.exportMode;
    }

    /**
     * @return fileFormat
     */
    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * @return nodeGroupIds
     */
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ExportApplicationConfigsRequest, Builder> {
        private java.util.List<ApplicationConfigFile> applicationConfigFiles; 
        private String clusterId; 
        private String configScope; 
        private String exportMode; 
        private String fileFormat; 
        private java.util.List<String> nodeGroupIds; 
        private java.util.List<String> nodeIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ExportApplicationConfigsRequest request) {
            super(request);
            this.applicationConfigFiles = request.applicationConfigFiles;
            this.clusterId = request.clusterId;
            this.configScope = request.configScope;
            this.exportMode = request.exportMode;
            this.fileFormat = request.fileFormat;
            this.nodeGroupIds = request.nodeGroupIds;
            this.nodeIds = request.nodeIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>导出应用配置。</p>
         */
        public Builder applicationConfigFiles(java.util.List<ApplicationConfigFile> applicationConfigFiles) {
            this.putQueryParameter("ApplicationConfigFiles", applicationConfigFiles);
            this.applicationConfigFiles = applicationConfigFiles;
            return this;
        }

        /**
         * <p>集群ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ConfigScope.
         */
        public Builder configScope(String configScope) {
            this.putQueryParameter("ConfigScope", configScope);
            this.configScope = configScope;
            return this;
        }

        /**
         * ExportMode.
         */
        public Builder exportMode(String exportMode) {
            this.putQueryParameter("ExportMode", exportMode);
            this.exportMode = exportMode;
            return this;
        }

        /**
         * <p>导出应用配置的文件格式。</p>
         * 
         * <strong>example:</strong>
         * <p>XML</p>
         */
        public Builder fileFormat(String fileFormat) {
            this.putQueryParameter("FileFormat", fileFormat);
            this.fileFormat = fileFormat;
            return this;
        }

        /**
         * NodeGroupIds.
         */
        public Builder nodeGroupIds(java.util.List<String> nodeGroupIds) {
            this.putQueryParameter("NodeGroupIds", nodeGroupIds);
            this.nodeGroupIds = nodeGroupIds;
            return this;
        }

        /**
         * NodeIds.
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>区域ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ExportApplicationConfigsRequest build() {
            return new ExportApplicationConfigsRequest(this);
        } 

    } 

}
