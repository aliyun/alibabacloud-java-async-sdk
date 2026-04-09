// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateParameterRequest} extends {@link RequestModel}
 *
 * <p>CreateParameterRequest</p>
 */
public class CreateParameterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Properties")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Properties> properties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateParameterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.name = builder.name;
        this.owner = builder.owner;
        this.projectId = builder.projectId;
        this.properties = builder.properties;
        this.scope = builder.scope;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateParameterRequest create() {
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return properties
     */
    public java.util.List<Properties> getProperties() {
        return this.properties;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateParameterRequest, Builder> {
        private String regionId; 
        private String description; 
        private String name; 
        private String owner; 
        private Long projectId; 
        private java.util.List<Properties> properties; 
        private String scope; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateParameterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.name = request.name;
            this.owner = request.owner;
            this.projectId = request.projectId;
            this.properties = request.properties;
            this.scope = request.scope;
            this.type = request.type;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace.para</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder properties(java.util.List<Properties> properties) {
            String propertiesShrink = shrink(properties, "Properties", "json");
            this.putBodyParameter("Properties", propertiesShrink);
            this.properties = properties;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PlainConstant</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateParameterRequest build() {
            return new CreateParameterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateParameterRequest} extends {@link TeaModel}
     *
     * <p>CreateParameterRequest</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.envType = builder.envType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String envType; 
            private String value; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.envType = model.envType;
                this.value = model.value;
            } 

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
}
