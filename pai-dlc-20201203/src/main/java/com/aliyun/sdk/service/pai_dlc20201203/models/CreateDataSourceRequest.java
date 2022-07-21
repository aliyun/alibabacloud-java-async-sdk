// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceRequest</p>
 */
public class CreateDataSourceRequest extends Request {
    @Body
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Body
    @NameInMap("Endpoint")
    private String endpoint;

    @Body
    @NameInMap("FileSystemId")
    private String fileSystemId;

    @Body
    @NameInMap("MountPath")
    @Validation(required = true)
    private String mountPath;

    @Body
    @NameInMap("Options")
    private String options;

    @Body
    @NameInMap("Path")
    private String path;

    private CreateDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceType = builder.dataSourceType;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.endpoint = builder.endpoint;
        this.fileSystemId = builder.fileSystemId;
        this.mountPath = builder.mountPath;
        this.options = builder.options;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return mountPath
     */
    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<CreateDataSourceRequest, Builder> {
        private String dataSourceType; 
        private String description; 
        private String displayName; 
        private String endpoint; 
        private String fileSystemId; 
        private String mountPath; 
        private String options; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceRequest request) {
            super(request);
            this.dataSourceType = request.dataSourceType;
            this.description = request.description;
            this.displayName = request.displayName;
            this.endpoint = request.endpoint;
            this.fileSystemId = request.fileSystemId;
            this.mountPath = request.mountPath;
            this.options = request.options;
            this.path = request.path;
        } 

        /**
         * 数据源类型
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * 数据源描述
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 数据源显示名称
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * 阿里云OSS文件系统服务端点
         */
        public Builder endpoint(String endpoint) {
            this.putBodyParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * 阿里云NAS文件系统Id
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putBodyParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * 本地挂载目录
         */
        public Builder mountPath(String mountPath) {
            this.putBodyParameter("MountPath", mountPath);
            this.mountPath = mountPath;
            return this;
        }

        /**
         * 阿里云OSS文件系统配置选项
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * 阿里云OSS文件系统路径
         */
        public Builder path(String path) {
            this.putBodyParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public CreateDataSourceRequest build() {
            return new CreateDataSourceRequest(this);
        } 

    } 

}
