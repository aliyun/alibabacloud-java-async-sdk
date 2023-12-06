// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutProductInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>PutProductInstanceConfigRequest</p>
 */
public class PutProductInstanceConfigRequest extends Request {
    @Body
    @NameInMap("componentUID")
    private String componentUID;

    @Body
    @NameInMap("componentVersionUID")
    private String componentVersionUID;

    @Body
    @NameInMap("configUID")
    private String configUID;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("environmentUID")
    private String environmentUID;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("parentComponentName")
    private String parentComponentName;

    @Body
    @NameInMap("parentComponentVersionUID")
    private String parentComponentVersionUID;

    @Body
    @NameInMap("productVersionUID")
    private String productVersionUID;

    @Body
    @NameInMap("releaseName")
    private String releaseName;

    @Body
    @NameInMap("scope")
    private java.util.List < String > scope;

    @Body
    @NameInMap("value")
    private String value;

    @Body
    @NameInMap("valueType")
    private String valueType;

    private PutProductInstanceConfigRequest(Builder builder) {
        super(builder);
        this.componentUID = builder.componentUID;
        this.componentVersionUID = builder.componentVersionUID;
        this.configUID = builder.configUID;
        this.description = builder.description;
        this.environmentUID = builder.environmentUID;
        this.name = builder.name;
        this.parentComponentName = builder.parentComponentName;
        this.parentComponentVersionUID = builder.parentComponentVersionUID;
        this.productVersionUID = builder.productVersionUID;
        this.releaseName = builder.releaseName;
        this.scope = builder.scope;
        this.value = builder.value;
        this.valueType = builder.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutProductInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentUID
     */
    public String getComponentUID() {
        return this.componentUID;
    }

    /**
     * @return componentVersionUID
     */
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    /**
     * @return configUID
     */
    public String getConfigUID() {
        return this.configUID;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environmentUID
     */
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentComponentName
     */
    public String getParentComponentName() {
        return this.parentComponentName;
    }

    /**
     * @return parentComponentVersionUID
     */
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
    }

    /**
     * @return scope
     */
    public java.util.List < String > getScope() {
        return this.scope;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return valueType
     */
    public String getValueType() {
        return this.valueType;
    }

    public static final class Builder extends Request.Builder<PutProductInstanceConfigRequest, Builder> {
        private String componentUID; 
        private String componentVersionUID; 
        private String configUID; 
        private String description; 
        private String environmentUID; 
        private String name; 
        private String parentComponentName; 
        private String parentComponentVersionUID; 
        private String productVersionUID; 
        private String releaseName; 
        private java.util.List < String > scope; 
        private String value; 
        private String valueType; 

        private Builder() {
            super();
        } 

        private Builder(PutProductInstanceConfigRequest request) {
            super(request);
            this.componentUID = request.componentUID;
            this.componentVersionUID = request.componentVersionUID;
            this.configUID = request.configUID;
            this.description = request.description;
            this.environmentUID = request.environmentUID;
            this.name = request.name;
            this.parentComponentName = request.parentComponentName;
            this.parentComponentVersionUID = request.parentComponentVersionUID;
            this.productVersionUID = request.productVersionUID;
            this.releaseName = request.releaseName;
            this.scope = request.scope;
            this.value = request.value;
            this.valueType = request.valueType;
        } 

        /**
         * componentUID.
         */
        public Builder componentUID(String componentUID) {
            this.putBodyParameter("componentUID", componentUID);
            this.componentUID = componentUID;
            return this;
        }

        /**
         * componentVersionUID.
         */
        public Builder componentVersionUID(String componentVersionUID) {
            this.putBodyParameter("componentVersionUID", componentVersionUID);
            this.componentVersionUID = componentVersionUID;
            return this;
        }

        /**
         * configUID.
         */
        public Builder configUID(String configUID) {
            this.putBodyParameter("configUID", configUID);
            this.configUID = configUID;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * environmentUID.
         */
        public Builder environmentUID(String environmentUID) {
            this.putBodyParameter("environmentUID", environmentUID);
            this.environmentUID = environmentUID;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * parentComponentName.
         */
        public Builder parentComponentName(String parentComponentName) {
            this.putBodyParameter("parentComponentName", parentComponentName);
            this.parentComponentName = parentComponentName;
            return this;
        }

        /**
         * parentComponentVersionUID.
         */
        public Builder parentComponentVersionUID(String parentComponentVersionUID) {
            this.putBodyParameter("parentComponentVersionUID", parentComponentVersionUID);
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putBodyParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        /**
         * releaseName.
         */
        public Builder releaseName(String releaseName) {
            this.putBodyParameter("releaseName", releaseName);
            this.releaseName = releaseName;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(java.util.List < String > scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.putBodyParameter("value", value);
            this.value = value;
            return this;
        }

        /**
         * valueType.
         */
        public Builder valueType(String valueType) {
            this.putBodyParameter("valueType", valueType);
            this.valueType = valueType;
            return this;
        }

        @Override
        public PutProductInstanceConfigRequest build() {
            return new PutProductInstanceConfigRequest(this);
        } 

    } 

}
