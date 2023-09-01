// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Dataset} extends {@link TeaModel}
 *
 * <p>Dataset</p>
 */
public class Dataset extends TeaModel {
    @NameInMap("Accessibility")
    private String accessibility;

    @NameInMap("DataSourceType")
    private String dataSourceType;

    @NameInMap("DataType")
    private String dataType;

    @NameInMap("DatasetId")
    private String datasetId;

    @NameInMap("Description")
    private String description;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("Labels")
    private java.util.List < Label > labels;

    @NameInMap("Name")
    private String name;

    @NameInMap("Options")
    private String options;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("Property")
    private String property;

    @NameInMap("ProviderType")
    private String providerType;

    @NameInMap("SourceId")
    private String sourceId;

    @NameInMap("SourceType")
    private String sourceType;

    @NameInMap("Uri")
    private String uri;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    private Dataset(Builder builder) {
        this.accessibility = builder.accessibility;
        this.dataSourceType = builder.dataSourceType;
        this.dataType = builder.dataType;
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labels = builder.labels;
        this.name = builder.name;
        this.options = builder.options;
        this.ownerId = builder.ownerId;
        this.property = builder.property;
        this.providerType = builder.providerType;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.uri = builder.uri;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Dataset create() {
        return builder().build();
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
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
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return property
     */
    public String getProperty() {
        return this.property;
    }

    /**
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String dataSourceType; 
        private String dataType; 
        private String datasetId; 
        private String description; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List < Label > labels; 
        private String name; 
        private String options; 
        private String ownerId; 
        private String property; 
        private String providerType; 
        private String sourceId; 
        private String sourceType; 
        private String uri; 
        private String userId; 
        private String workspaceId; 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Property.
         */
        public Builder property(String property) {
            this.property = property;
            return this;
        }

        /**
         * ProviderType.
         */
        public Builder providerType(String providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Dataset build() {
            return new Dataset(this);
        } 

    } 

}
