// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateEaiJupyterRequest} extends {@link RequestModel}
 *
 * <p>CreateEaiJupyterRequest</p>
 */
public class CreateEaiJupyterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EaisName")
    private String eaisName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EaisType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eaisType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentVar")
    private java.util.List < EnvironmentVar> environmentVar;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    private CreateEaiJupyterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.eaisName = builder.eaisName;
        this.eaisType = builder.eaisType;
        this.environmentVar = builder.environmentVar;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEaiJupyterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return eaisName
     */
    public String getEaisName() {
        return this.eaisName;
    }

    /**
     * @return eaisType
     */
    public String getEaisType() {
        return this.eaisType;
    }

    /**
     * @return environmentVar
     */
    public java.util.List < EnvironmentVar> getEnvironmentVar() {
        return this.environmentVar;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateEaiJupyterRequest, Builder> {
        private String clientToken; 
        private String eaisName; 
        private String eaisType; 
        private java.util.List < EnvironmentVar> environmentVar; 
        private String regionId; 
        private String resourceGroupId; 
        private String securityGroupId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEaiJupyterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.eaisName = request.eaisName;
            this.eaisType = request.eaisType;
            this.environmentVar = request.environmentVar;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EaisName.
         */
        public Builder eaisName(String eaisName) {
            this.putQueryParameter("EaisName", eaisName);
            this.eaisName = eaisName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eais.ei-a6.2xlarge</p>
         */
        public Builder eaisType(String eaisType) {
            this.putQueryParameter("EaisType", eaisType);
            this.eaisType = eaisType;
            return this;
        }

        /**
         * EnvironmentVar.
         */
        public Builder environmentVar(java.util.List < EnvironmentVar> environmentVar) {
            String environmentVarShrink = shrink(environmentVar, "EnvironmentVar", "json");
            this.putQueryParameter("EnvironmentVar", environmentVarShrink);
            this.environmentVar = environmentVar;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf66jeqopgqa9hdn****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6h3rbwbm90urjwa****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateEaiJupyterRequest build() {
            return new CreateEaiJupyterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEaiJupyterRequest} extends {@link TeaModel}
     *
     * <p>CreateEaiJupyterRequest</p>
     */
    public static class EnvironmentVar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EnvironmentVar(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentVar create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EnvironmentVar build() {
                return new EnvironmentVar(this);
            } 

        } 

    }
}
