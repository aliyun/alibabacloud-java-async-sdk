// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link AddConnectorRequest} extends {@link RequestModel}
 *
 * <p>AddConnectorRequest</p>
 */
public class AddConnectorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectorName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 20, minLength = 1)
    private String connectorName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectorType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 200, minLength = 1)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileConnectorConfig")
    private FileConnectorConfig fileConnectorConfig;

    private AddConnectorRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.connectorName = builder.connectorName;
        this.connectorType = builder.connectorType;
        this.description = builder.description;
        this.fileConnectorConfig = builder.fileConnectorConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddConnectorRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return connectorName
     */
    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * @return connectorType
     */
    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileConnectorConfig
     */
    public FileConnectorConfig getFileConnectorConfig() {
        return this.fileConnectorConfig;
    }

    public static final class Builder extends Request.Builder<AddConnectorRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String connectorName; 
        private String connectorType; 
        private String description; 
        private FileConnectorConfig fileConnectorConfig; 

        private Builder() {
            super();
        } 

        private Builder(AddConnectorRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.connectorName = request.connectorName;
            this.connectorType = request.connectorType;
            this.description = request.description;
            this.fileConnectorConfig = request.fileConnectorConfig;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3shx2gu255oxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-connector</p>
         */
        public Builder connectorName(String connectorName) {
            this.putBodyParameter("ConnectorName", connectorName);
            this.connectorName = connectorName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE</p>
         */
        public Builder connectorType(String connectorType) {
            this.putBodyParameter("ConnectorType", connectorType);
            this.connectorType = connectorType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FileConnectorConfig.
         */
        public Builder fileConnectorConfig(FileConnectorConfig fileConnectorConfig) {
            String fileConnectorConfigShrink = shrink(fileConnectorConfig, "FileConnectorConfig", "json");
            this.putBodyParameter("FileConnectorConfig", fileConnectorConfigShrink);
            this.fileConnectorConfig = fileConnectorConfig;
            return this;
        }

        @Override
        public AddConnectorRequest build() {
            return new AddConnectorRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddConnectorRequest} extends {@link TeaModel}
     *
     * <p>AddConnectorRequest</p>
     */
    public static class FileConnectorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private FileConnectorConfig(Builder builder) {
            this.bucketName = builder.bucketName;
            this.regionId = builder.regionId;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileConnectorConfig create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String bucketName; 
            private String regionId; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(FileConnectorConfig model) {
                this.bucketName = model.bucketName;
                this.regionId = model.regionId;
                this.storageType = model.storageType;
            } 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public FileConnectorConfig build() {
                return new FileConnectorConfig(this);
            } 

        } 

    }
}
