// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link SetWebAuthnConfigurationRequest} extends {@link RequestModel}
 *
 * <p>SetWebAuthnConfigurationRequest</p>
 */
public class SetWebAuthnConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Aaguids")
    private java.util.List<Aaguids> aaguids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAaguidVerification")
    private Boolean enableAaguidVerification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableMetadataServiceVerification")
    private Boolean enableMetadataServiceVerification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableUserSelfRegistration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableUserSelfRegistration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private SetWebAuthnConfigurationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aaguids = builder.aaguids;
        this.enableAaguidVerification = builder.enableAaguidVerification;
        this.enableMetadataServiceVerification = builder.enableMetadataServiceVerification;
        this.enableUserSelfRegistration = builder.enableUserSelfRegistration;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetWebAuthnConfigurationRequest create() {
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
     * @return aaguids
     */
    public java.util.List<Aaguids> getAaguids() {
        return this.aaguids;
    }

    /**
     * @return enableAaguidVerification
     */
    public Boolean getEnableAaguidVerification() {
        return this.enableAaguidVerification;
    }

    /**
     * @return enableMetadataServiceVerification
     */
    public Boolean getEnableMetadataServiceVerification() {
        return this.enableMetadataServiceVerification;
    }

    /**
     * @return enableUserSelfRegistration
     */
    public Boolean getEnableUserSelfRegistration() {
        return this.enableUserSelfRegistration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<SetWebAuthnConfigurationRequest, Builder> {
        private String regionId; 
        private java.util.List<Aaguids> aaguids; 
        private Boolean enableAaguidVerification; 
        private Boolean enableMetadataServiceVerification; 
        private Boolean enableUserSelfRegistration; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(SetWebAuthnConfigurationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aaguids = request.aaguids;
            this.enableAaguidVerification = request.enableAaguidVerification;
            this.enableMetadataServiceVerification = request.enableMetadataServiceVerification;
            this.enableUserSelfRegistration = request.enableUserSelfRegistration;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>AAGUID及其名称列表</p>
         */
        public Builder aaguids(java.util.List<Aaguids> aaguids) {
            this.putQueryParameter("Aaguids", aaguids);
            this.aaguids = aaguids;
            return this;
        }

        /**
         * <p>是否开启AAGUID校验</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAaguidVerification(Boolean enableAaguidVerification) {
            this.putQueryParameter("EnableAaguidVerification", enableAaguidVerification);
            this.enableAaguidVerification = enableAaguidVerification;
            return this;
        }

        /**
         * <p>是否开启WebAuthn认证器MDS校验</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableMetadataServiceVerification(Boolean enableMetadataServiceVerification) {
            this.putQueryParameter("EnableMetadataServiceVerification", enableMetadataServiceVerification);
            this.enableMetadataServiceVerification = enableMetadataServiceVerification;
            return this;
        }

        /**
         * <p>是否允许用户自注册WebAuthn认证器</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableUserSelfRegistration(Boolean enableUserSelfRegistration) {
            this.putQueryParameter("EnableUserSelfRegistration", enableUserSelfRegistration);
            this.enableUserSelfRegistration = enableUserSelfRegistration;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public SetWebAuthnConfigurationRequest build() {
            return new SetWebAuthnConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetWebAuthnConfigurationRequest} extends {@link TeaModel}
     *
     * <p>SetWebAuthnConfigurationRequest</p>
     */
    public static class Aaguids extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aaguid")
        private String aaguid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Aaguids(Builder builder) {
            this.aaguid = builder.aaguid;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aaguids create() {
            return builder().build();
        }

        /**
         * @return aaguid
         */
        public String getAaguid() {
            return this.aaguid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String aaguid; 
            private String name; 

            private Builder() {
            } 

            private Builder(Aaguids model) {
                this.aaguid = model.aaguid;
                this.name = model.name;
            } 

            /**
             * <p>AAGUID</p>
             * 
             * <strong>example:</strong>
             * <p>adce0002-35bc-c60a-648b-0b25f1f05503</p>
             */
            public Builder aaguid(String aaguid) {
                this.aaguid = aaguid;
                return this;
            }

            /**
             * <p>AAGUID名称</p>
             * 
             * <strong>example:</strong>
             * <p>Touch ID</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Aaguids build() {
                return new Aaguids(this);
            } 

        } 

    }
}
