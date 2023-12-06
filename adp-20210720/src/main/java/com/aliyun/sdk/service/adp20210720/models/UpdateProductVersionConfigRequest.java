// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductVersionConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductVersionConfigRequest</p>
 */
public class UpdateProductVersionConfigRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("configUID")
    @Validation(required = true)
    private String configUID;

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
    @NameInMap("parentComponentVersionUID")
    private String parentComponentVersionUID;

    @Body
    @NameInMap("value")
    private String value;

    @Body
    @NameInMap("valueType")
    private String valueType;

    private UpdateProductVersionConfigRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.configUID = builder.configUID;
        this.componentVersionUID = builder.componentVersionUID;
        this.description = builder.description;
        this.name = builder.name;
        this.parentComponentVersionUID = builder.parentComponentVersionUID;
        this.value = builder.value;
        this.valueType = builder.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductVersionConfigRequest create() {
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
     * @return configUID
     */
    public String getConfigUID() {
        return this.configUID;
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
     * @return parentComponentVersionUID
     */
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
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

    public static final class Builder extends Request.Builder<UpdateProductVersionConfigRequest, Builder> {
        private String uid; 
        private String configUID; 
        private String componentVersionUID; 
        private String description; 
        private String name; 
        private String parentComponentVersionUID; 
        private String value; 
        private String valueType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductVersionConfigRequest request) {
            super(request);
            this.uid = request.uid;
            this.configUID = request.configUID;
            this.componentVersionUID = request.componentVersionUID;
            this.description = request.description;
            this.name = request.name;
            this.parentComponentVersionUID = request.parentComponentVersionUID;
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
         * configUID.
         */
        public Builder configUID(String configUID) {
            this.putPathParameter("configUID", configUID);
            this.configUID = configUID;
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
         * parentComponentVersionUID.
         */
        public Builder parentComponentVersionUID(String parentComponentVersionUID) {
            this.putBodyParameter("parentComponentVersionUID", parentComponentVersionUID);
            this.parentComponentVersionUID = parentComponentVersionUID;
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
        public UpdateProductVersionConfigRequest build() {
            return new UpdateProductVersionConfigRequest(this);
        } 

    } 

}
