// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataCount")
    @com.aliyun.core.annotation.Validation(maximum = 999999999999D, minimum = 1)
    private Long dataCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSize")
    @com.aliyun.core.annotation.Validation(maximum = 999999999999D, minimum = 1)
    private Long dataSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Label > labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Property")
    @com.aliyun.core.annotation.Validation(required = true)
    private String property;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderType")
    private String providerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceDatasetId")
    private String sourceDatasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceDatasetVersion")
    private String sourceDatasetVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionLabels")
    private java.util.List < Label > versionLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.dataCount = builder.dataCount;
        this.dataSize = builder.dataSize;
        this.dataSourceType = builder.dataSourceType;
        this.dataType = builder.dataType;
        this.description = builder.description;
        this.labels = builder.labels;
        this.name = builder.name;
        this.options = builder.options;
        this.property = builder.property;
        this.provider = builder.provider;
        this.providerType = builder.providerType;
        this.sourceDatasetId = builder.sourceDatasetId;
        this.sourceDatasetVersion = builder.sourceDatasetVersion;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.uri = builder.uri;
        this.userId = builder.userId;
        this.versionDescription = builder.versionDescription;
        this.versionLabels = builder.versionLabels;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatasetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return dataCount
     */
    public Long getDataCount() {
        return this.dataCount;
    }

    /**
     * @return dataSize
     */
    public Long getDataSize() {
        return this.dataSize;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return labels
     */
    public java.util.List < Label > getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return property
     */
    public String getProperty() {
        return this.property;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
    }

    /**
     * @return sourceDatasetId
     */
    public String getSourceDatasetId() {
        return this.sourceDatasetId;
    }

    /**
     * @return sourceDatasetVersion
     */
    public String getSourceDatasetVersion() {
        return this.sourceDatasetVersion;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return versionLabels
     */
    public java.util.List < Label > getVersionLabels() {
        return this.versionLabels;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String accessibility; 
        private Long dataCount; 
        private Long dataSize; 
        private String dataSourceType; 
        private String dataType; 
        private String description; 
        private java.util.List < Label > labels; 
        private String name; 
        private String options; 
        private String property; 
        private String provider; 
        private String providerType; 
        private String sourceDatasetId; 
        private String sourceDatasetVersion; 
        private String sourceId; 
        private String sourceType; 
        private String uri; 
        private String userId; 
        private String versionDescription; 
        private java.util.List < Label > versionLabels; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.dataCount = request.dataCount;
            this.dataSize = request.dataSize;
            this.dataSourceType = request.dataSourceType;
            this.dataType = request.dataType;
            this.description = request.description;
            this.labels = request.labels;
            this.name = request.name;
            this.options = request.options;
            this.property = request.property;
            this.provider = request.provider;
            this.providerType = request.providerType;
            this.sourceDatasetId = request.sourceDatasetId;
            this.sourceDatasetVersion = request.sourceDatasetVersion;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.uri = request.uri;
            this.userId = request.userId;
            this.versionDescription = request.versionDescription;
            this.versionLabels = request.versionLabels;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * DataCount.
         */
        public Builder dataCount(Long dataCount) {
            this.putBodyParameter("DataCount", dataCount);
            this.dataCount = dataCount;
            return this;
        }

        /**
         * DataSize.
         */
        public Builder dataSize(Long dataSize) {
            this.putBodyParameter("DataSize", dataSize);
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putBodyParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DIRECTORY</p>
         */
        public Builder property(String property) {
            this.putBodyParameter("Property", property);
            this.property = property;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.putBodyParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * ProviderType.
         */
        public Builder providerType(String providerType) {
            this.putBodyParameter("ProviderType", providerType);
            this.providerType = providerType;
            return this;
        }

        /**
         * SourceDatasetId.
         */
        public Builder sourceDatasetId(String sourceDatasetId) {
            this.putBodyParameter("SourceDatasetId", sourceDatasetId);
            this.sourceDatasetId = sourceDatasetId;
            return this;
        }

        /**
         * SourceDatasetVersion.
         */
        public Builder sourceDatasetVersion(String sourceDatasetVersion) {
            this.putBodyParameter("SourceDatasetVersion", sourceDatasetVersion);
            this.sourceDatasetVersion = sourceDatasetVersion;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nas://09f****f2.cn-hangzhou/</p>
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * VersionDescription.
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("VersionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * VersionLabels.
         */
        public Builder versionLabels(java.util.List < Label > versionLabels) {
            this.putBodyParameter("VersionLabels", versionLabels);
            this.versionLabels = versionLabels;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDatasetRequest build() {
            return new CreateDatasetRequest(this);
        } 

    } 

}
