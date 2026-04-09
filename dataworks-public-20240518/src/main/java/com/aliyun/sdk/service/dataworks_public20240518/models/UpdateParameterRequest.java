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
 * {@link UpdateParameterRequest} extends {@link RequestModel}
 *
 * <p>UpdateParameterRequest</p>
 */
public class UpdateParameterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.List<Properties> properties;

    private UpdateParameterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.id = builder.id;
        this.owner = builder.owner;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateParameterRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return properties
     */
    public java.util.List<Properties> getProperties() {
        return this.properties;
    }

    public static final class Builder extends Request.Builder<UpdateParameterRequest, Builder> {
        private String regionId; 
        private String description; 
        private Long id; 
        private String owner; 
        private java.util.List<Properties> properties; 

        private Builder() {
            super();
        } 

        private Builder(UpdateParameterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.id = request.id;
            this.owner = request.owner;
            this.properties = request.properties;
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
         * <p>12345</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(java.util.List<Properties> properties) {
            String propertiesShrink = shrink(properties, "Properties", "json");
            this.putBodyParameter("Properties", propertiesShrink);
            this.properties = properties;
            return this;
        }

        @Override
        public UpdateParameterRequest build() {
            return new UpdateParameterRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateParameterRequest} extends {@link TeaModel}
     *
     * <p>UpdateParameterRequest</p>
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
