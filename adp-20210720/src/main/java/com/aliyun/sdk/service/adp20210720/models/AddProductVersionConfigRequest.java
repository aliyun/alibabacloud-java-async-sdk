// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProductVersionConfigRequest} extends {@link RequestModel}
 *
 * <p>AddProductVersionConfigRequest</p>
 */
public class AddProductVersionConfigRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Body
    @NameInMap("componentReleaseName")
    private String componentReleaseName;

    @Body
    @NameInMap("componentVersionUID")
    private String componentVersionUID;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("parentComponentReleaseName")
    private String parentComponentReleaseName;

    @Body
    @NameInMap("parentComponentVersionUID")
    private String parentComponentVersionUID;

    @Body
    @NameInMap("scope")
    private String scope;

    @Body
    @NameInMap("value")
    private String value;

    @Body
    @NameInMap("valueType")
    private String valueType;

    private AddProductVersionConfigRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.componentReleaseName = builder.componentReleaseName;
        this.componentVersionUID = builder.componentVersionUID;
        this.description = builder.description;
        this.name = builder.name;
        this.parentComponentReleaseName = builder.parentComponentReleaseName;
        this.parentComponentVersionUID = builder.parentComponentVersionUID;
        this.scope = builder.scope;
        this.value = builder.value;
        this.valueType = builder.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProductVersionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return componentReleaseName
     */
    public String getComponentReleaseName() {
        return this.componentReleaseName;
    }

    /**
     * @return componentVersionUID
     */
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentComponentReleaseName
     */
    public String getParentComponentReleaseName() {
        return this.parentComponentReleaseName;
    }

    /**
     * @return parentComponentVersionUID
     */
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    /**
     * @return scope
     */
    public String getScope() {
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

    public static final class Builder extends Request.Builder<AddProductVersionConfigRequest, Builder> {
        private String uid; 
        private String componentReleaseName; 
        private String componentVersionUID; 
        private String description; 
        private String name; 
        private String parentComponentReleaseName; 
        private String parentComponentVersionUID; 
        private String scope; 
        private String value; 
        private String valueType; 

        private Builder() {
            super();
        } 

        private Builder(AddProductVersionConfigRequest request) {
            super(request);
            this.uid = request.uid;
            this.componentReleaseName = request.componentReleaseName;
            this.componentVersionUID = request.componentVersionUID;
            this.description = request.description;
            this.name = request.name;
            this.parentComponentReleaseName = request.parentComponentReleaseName;
            this.parentComponentVersionUID = request.parentComponentVersionUID;
            this.scope = request.scope;
            this.value = request.value;
            this.valueType = request.valueType;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * componentReleaseName.
         */
        public Builder componentReleaseName(String componentReleaseName) {
            this.putBodyParameter("componentReleaseName", componentReleaseName);
            this.componentReleaseName = componentReleaseName;
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
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
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
         * parentComponentReleaseName.
         */
        public Builder parentComponentReleaseName(String parentComponentReleaseName) {
            this.putBodyParameter("parentComponentReleaseName", parentComponentReleaseName);
            this.parentComponentReleaseName = parentComponentReleaseName;
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
         * scope.
         */
        public Builder scope(String scope) {
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
        public AddProductVersionConfigRequest build() {
            return new AddProductVersionConfigRequest(this);
        } 

    } 

}
