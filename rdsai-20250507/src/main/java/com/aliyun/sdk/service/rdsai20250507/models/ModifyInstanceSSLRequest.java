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
         * <p>Enables or disables SSL. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables SSL.</li>
         * <li><strong>0</strong>: disables SSL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder CAType(String CAType) {
            this.putQueryParameter("CAType", CAType);
            this.CAType = CAType;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
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
         * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceSSL</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the RDS Supabase instance.</p>
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
         * <p>The certificate type. Only <strong>custom</strong> is supported.</p>
         * <blockquote>
         * <p> This parameter is required if <strong>SSLEnabled</strong> is set to <strong>1</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
         */
        public Builder serverCert(String serverCert) {
            this.putQueryParameter("ServerCert", serverCert);
            this.serverCert = serverCert;
            return this;
        }

        /**
         * <p>The content of the custom certificate.</p>
         * <blockquote>
         * <p> This parameter is required if <strong>CAType</strong> is set to <strong>custom</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
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
