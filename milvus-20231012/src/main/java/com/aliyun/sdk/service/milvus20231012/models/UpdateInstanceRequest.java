// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoBackup")
    private Boolean autoBackup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configuration")
    private String configuration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ha")
    private Boolean ha;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoBackup = builder.autoBackup;
        this.components = builder.components;
        this.configuration = builder.configuration;
        this.ha = builder.ha;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
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
     * @return autoBackup
     */
    public Boolean getAutoBackup() {
        return this.autoBackup;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return ha
     */
    public Boolean getHa() {
        return this.ha;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String regionId; 
        private Boolean autoBackup; 
        private java.util.List<Components> components; 
        private String configuration; 
        private Boolean ha; 
        private String instanceId; 
        private String instanceName; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoBackup = request.autoBackup;
            this.components = request.components;
            this.configuration = request.configuration;
            this.ha = request.ha;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.clientToken = request.clientToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * autoBackup.
         */
        public Builder autoBackup(Boolean autoBackup) {
            this.putBodyParameter("autoBackup", autoBackup);
            this.autoBackup = autoBackup;
            return this;
        }

        /**
         * components.
         */
        public Builder components(java.util.List<Components> components) {
            this.putBodyParameter("components", components);
            this.components = components;
            return this;
        }

        /**
         * configuration.
         */
        public Builder configuration(String configuration) {
            this.putBodyParameter("configuration", configuration);
            this.configuration = configuration;
            return this;
        }

        /**
         * ha.
         */
        public Builder ha(Boolean ha) {
            this.putBodyParameter("ha", ha);
            this.ha = ha;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cuNum")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer cuNum;

        @com.aliyun.core.annotation.NameInMap("replica")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Components(Builder builder) {
            this.cuNum = builder.cuNum;
            this.replica = builder.replica;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return cuNum
         */
        public Integer getCuNum() {
            return this.cuNum;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer cuNum; 
            private Integer replica; 
            private String type; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.cuNum = model.cuNum;
                this.replica = model.replica;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cuNum(Integer cuNum) {
                this.cuNum = cuNum;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>standalone</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
