// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateDatasetRequest</p>
 */
public class CreateDatasetRequest extends Request {
    @Body
    @NameInMap("Accessibility")
    private String accessibility;

    @Body
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Body
    @NameInMap("DataType")
    private String dataType;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Labels")
    private java.util.List < Label > labels;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Options")
    private String options;

    @Body
    @NameInMap("Property")
    @Validation(required = true)
    private String property;

    @Body
    @NameInMap("ProviderType")
    private String providerType;

    @Body
    @NameInMap("SourceId")
    private String sourceId;

    @Body
    @NameInMap("SourceType")
    private String sourceType;

    @Body
    @NameInMap("Uri")
    @Validation(required = true)
    private String uri;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateDatasetRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.dataSourceType = builder.dataSourceType;
        this.dataType = builder.dataType;
        this.description = builder.description;
        this.labels = builder.labels;
        this.name = builder.name;
        this.options = builder.options;
        this.property = builder.property;
        this.providerType = builder.providerType;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.uri = builder.uri;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDatasetRequest, Builder> {
        private String accessibility; 
        private String dataSourceType; 
        private String dataType; 
        private String description; 
        private java.util.List < Label > labels; 
        private String name; 
        private String options; 
        private String property; 
        private String providerType; 
        private String sourceId; 
        private String sourceType; 
        private String uri; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatasetRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.dataSourceType = request.dataSourceType;
            this.dataType = request.dataType;
            this.description = request.description;
            this.labels = request.labels;
            this.name = request.name;
            this.options = request.options;
            this.property = request.property;
            this.providerType = request.providerType;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.uri = request.uri;
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
         * DataSourceType.
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
         * Name.
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
         * Property.
         */
        public Builder property(String property) {
            this.putBodyParameter("Property", property);
            this.property = property;
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
         * Uri.
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
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
