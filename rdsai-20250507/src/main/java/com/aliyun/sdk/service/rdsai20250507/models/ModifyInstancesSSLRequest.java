// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ModifyInstancesSSLRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstancesSSLRequest</p>
 */
public class ModifyInstancesSSLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CAType")
    private String CAType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLEnabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer SSLEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCert")
    private String serverCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerKey")
    private String serverKey;

    private ModifyInstancesSSLRequest(Builder builder) {
        super(builder);
        this.CAType = builder.CAType;
        this.instanceNames = builder.instanceNames;
        this.regionId = builder.regionId;
        this.SSLEnabled = builder.SSLEnabled;
        this.serverCert = builder.serverCert;
        this.serverKey = builder.serverKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstancesSSLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CAType
     */
    public String getCAType() {
        return this.CAType;
    }

    /**
     * @return instanceNames
     */
    public java.util.List<String> getInstanceNames() {
        return this.instanceNames;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return SSLEnabled
     */
    public Integer getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * @return serverCert
     */
    public String getServerCert() {
        return this.serverCert;
    }

    /**
     * @return serverKey
     */
    public String getServerKey() {
        return this.serverKey;
    }

    public static final class Builder extends Request.Builder<ModifyInstancesSSLRequest, Builder> {
        private String CAType; 
        private java.util.List<String> instanceNames; 
        private String regionId; 
        private Integer SSLEnabled; 
        private String serverCert; 
        private String serverKey; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstancesSSLRequest request) {
            super(request);
            this.CAType = request.CAType;
            this.instanceNames = request.instanceNames;
            this.regionId = request.regionId;
            this.SSLEnabled = request.SSLEnabled;
            this.serverCert = request.serverCert;
            this.serverKey = request.serverKey;
        } 

        /**
         * CAType.
         */
        public Builder CAType(String CAType) {
            this.putQueryParameter("CAType", CAType);
            this.CAType = CAType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     &quot;ra-supabase-xxx&quot;,
         *     &quot;ra-supabase-xxx&quot;
         *   ]</p>
         */
        public Builder instanceNames(java.util.List<String> instanceNames) {
            String instanceNamesShrink = shrink(instanceNames, "InstanceNames", "json");
            this.putQueryParameter("InstanceNames", instanceNamesShrink);
            this.instanceNames = instanceNames;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder SSLEnabled(Integer SSLEnabled) {
            this.putQueryParameter("SSLEnabled", SSLEnabled);
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * ServerCert.
         */
        public Builder serverCert(String serverCert) {
            this.putQueryParameter("ServerCert", serverCert);
            this.serverCert = serverCert;
            return this;
        }

        /**
         * ServerKey.
         */
        public Builder serverKey(String serverKey) {
            this.putQueryParameter("ServerKey", serverKey);
            this.serverKey = serverKey;
            return this;
        }

        @Override
        public ModifyInstancesSSLRequest build() {
            return new ModifyInstancesSSLRequest(this);
        } 

    } 

}
