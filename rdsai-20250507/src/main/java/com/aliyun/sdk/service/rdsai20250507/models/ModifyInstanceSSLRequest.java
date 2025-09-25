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
 * {@link ModifyInstanceSSLRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceSSLRequest</p>
 */
public class ModifyInstanceSSLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CAType")
    private String CAType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

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

    private ModifyInstanceSSLRequest(Builder builder) {
        super(builder);
        this.CAType = builder.CAType;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
        this.SSLEnabled = builder.SSLEnabled;
        this.serverCert = builder.serverCert;
        this.serverKey = builder.serverKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceSSLRequest create() {
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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

    public static final class Builder extends Request.Builder<ModifyInstanceSSLRequest, Builder> {
        private String CAType; 
        private String instanceName; 
        private String regionId; 
        private Integer SSLEnabled; 
        private String serverCert; 
        private String serverKey; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceSSLRequest request) {
            super(request);
            this.CAType = request.CAType;
            this.instanceName = request.instanceName;
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
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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
        public ModifyInstanceSSLRequest build() {
            return new ModifyInstanceSSLRequest(this);
        } 

    } 

}
