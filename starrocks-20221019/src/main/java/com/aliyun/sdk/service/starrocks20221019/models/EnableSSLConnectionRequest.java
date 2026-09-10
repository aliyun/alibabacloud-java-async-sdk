// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link EnableSSLConnectionRequest} extends {@link RequestModel}
 *
 * <p>EnableSSLConnectionRequest</p>
 */
public class EnableSSLConnectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomSSLCertificate")
    private String customSSLCertificate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableCustom")
    private Boolean enableCustom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Renewal")
    private Boolean renewal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SslKeyPassword")
    private String sslKeyPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SslKeystorePassword")
    private String sslKeystorePassword;

    private EnableSSLConnectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customSSLCertificate = builder.customSSLCertificate;
        this.enableCustom = builder.enableCustom;
        this.instanceId = builder.instanceId;
        this.renewal = builder.renewal;
        this.sslKeyPassword = builder.sslKeyPassword;
        this.sslKeystorePassword = builder.sslKeystorePassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSSLConnectionRequest create() {
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
     * @return customSSLCertificate
     */
    public String getCustomSSLCertificate() {
        return this.customSSLCertificate;
    }

    /**
     * @return enableCustom
     */
    public Boolean getEnableCustom() {
        return this.enableCustom;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return renewal
     */
    public Boolean getRenewal() {
        return this.renewal;
    }

    /**
     * @return sslKeyPassword
     */
    public String getSslKeyPassword() {
        return this.sslKeyPassword;
    }

    /**
     * @return sslKeystorePassword
     */
    public String getSslKeystorePassword() {
        return this.sslKeystorePassword;
    }

    public static final class Builder extends Request.Builder<EnableSSLConnectionRequest, Builder> {
        private String regionId; 
        private String customSSLCertificate; 
        private Boolean enableCustom; 
        private String instanceId; 
        private Boolean renewal; 
        private String sslKeyPassword; 
        private String sslKeystorePassword; 

        private Builder() {
            super();
        } 

        private Builder(EnableSSLConnectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customSSLCertificate = request.customSSLCertificate;
            this.enableCustom = request.enableCustom;
            this.instanceId = request.instanceId;
            this.renewal = request.renewal;
            this.sslKeyPassword = request.sslKeyPassword;
            this.sslKeystorePassword = request.sslKeystorePassword;
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
         * <p>Custom SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>MIIP0wIBAzCCD4wGCSqGSIb3DQEHAaCCD30Egg95MIIPdTCCBbwGCSqGSIb3DQEHAaCCBa0EggWpMIIFpTCCBaEGCyqGSIb3DQEMCgECoIIFQDCCBTwwZgYJKoZIhvcNAQUNMFkwOAYJKoZIhvcNAQUMMCsEFHkQJTDaeFabOsRTB4Q7hgW6if7hAgInEAIBIDAMBggqhkiG9w0CCQU</p>
         */
        public Builder customSSLCertificate(String customSSLCertificate) {
            this.putBodyParameter("CustomSSLCertificate", customSSLCertificate);
            this.customSSLCertificate = customSSLCertificate;
            return this;
        }

        /**
         * <p>Specifies whether to use a custom certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableCustom(Boolean enableCustom) {
            this.putBodyParameter("EnableCustom", enableCustom);
            this.enableCustom = enableCustom;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-0104730e9de40215</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether this request renews an existing certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder renewal(Boolean renewal) {
            this.putBodyParameter("Renewal", renewal);
            this.renewal = renewal;
            return this;
        }

        /**
         * <p>Key password.</p>
         * 
         * <strong>example:</strong>
         * <p>KoZ13vcNAQ</p>
         */
        public Builder sslKeyPassword(String sslKeyPassword) {
            this.putBodyParameter("SslKeyPassword", sslKeyPassword);
            this.sslKeyPassword = sslKeyPassword;
            return this;
        }

        /**
         * <p>Keystore password.</p>
         * 
         * <strong>example:</strong>
         * <p>21esSd9Ao</p>
         */
        public Builder sslKeystorePassword(String sslKeystorePassword) {
            this.putBodyParameter("SslKeystorePassword", sslKeystorePassword);
            this.sslKeystorePassword = sslKeystorePassword;
            return this;
        }

        @Override
        public EnableSSLConnectionRequest build() {
            return new EnableSSLConnectionRequest(this);
        } 

    } 

}
