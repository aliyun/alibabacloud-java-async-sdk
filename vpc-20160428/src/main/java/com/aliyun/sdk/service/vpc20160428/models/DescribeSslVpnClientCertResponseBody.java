// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeSslVpnClientCertResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientCertResponseBody</p>
 */
public class DescribeSslVpnClientCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaCert")
    private String caCert;

    @com.aliyun.core.annotation.NameInMap("ClientCert")
    private String clientCert;

    @com.aliyun.core.annotation.NameInMap("ClientConfig")
    private String clientConfig;

    @com.aliyun.core.annotation.NameInMap("ClientKey")
    private String clientKey;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SslVpnClientCertId")
    private String sslVpnClientCertId;

    @com.aliyun.core.annotation.NameInMap("SslVpnServerId")
    private String sslVpnServerId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeSslVpnClientCertResponseBody(Builder builder) {
        this.caCert = builder.caCert;
        this.clientCert = builder.clientCert;
        this.clientConfig = builder.clientConfig;
        this.clientKey = builder.clientKey;
        this.createTime = builder.createTime;
        this.endTime = builder.endTime;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sslVpnClientCertId = builder.sslVpnClientCertId;
        this.sslVpnServerId = builder.sslVpnServerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSslVpnClientCertResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCert
     */
    public String getCaCert() {
        return this.caCert;
    }

    /**
     * @return clientCert
     */
    public String getClientCert() {
        return this.clientCert;
    }

    /**
     * @return clientConfig
     */
    public String getClientConfig() {
        return this.clientConfig;
    }

    /**
     * @return clientKey
     */
    public String getClientKey() {
        return this.clientKey;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sslVpnClientCertId
     */
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    /**
     * @return sslVpnServerId
     */
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String caCert; 
        private String clientCert; 
        private String clientConfig; 
        private String clientKey; 
        private Long createTime; 
        private Long endTime; 
        private String name; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String sslVpnClientCertId; 
        private String sslVpnServerId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeSslVpnClientCertResponseBody model) {
            this.caCert = model.caCert;
            this.clientCert = model.clientCert;
            this.clientConfig = model.clientConfig;
            this.clientKey = model.clientKey;
            this.createTime = model.createTime;
            this.endTime = model.endTime;
            this.name = model.name;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.sslVpnClientCertId = model.sslVpnClientCertId;
            this.sslVpnServerId = model.sslVpnServerId;
            this.status = model.status;
        } 

        /**
         * <p>The CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIID****r4w=
         * -----END CERTIFICATE-----</p>
         */
        public Builder caCert(String caCert) {
            this.caCert = caCert;
            return this;
        }

        /**
         * <p>The client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIDR****A==
         * -----END CERTIFICATE-----</p>
         */
        public Builder clientCert(String clientCert) {
            this.clientCert = clientCert;
            return this;
        }

        /**
         * <p>The client configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>client
         * dev tun
         * proto tcp
         * remote 120.XX.XX.33 1194
         * resolv-retry infinite
         * nobind
         * persist-key
         * persist-tun
         * ca ca.crt
         * cert vsc-bp15t7****.crt
         * key vsc-bp15t7****.key
         * cipher AES-128-CBC
         * ;comp-lzo
         * verb 4</p>
         */
        public Builder clientConfig(String clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        /**
         * <p>The client key.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY-----
         * MIIEpAI****ZzNFhuM/za==
         * -----END RSA PRIVATE KEY-----</p>
         */
        public Builder clientKey(String clientKey) {
            this.clientKey = clientKey;
            return this;
        }

        /**
         * <p>The timestamp when the SSL client certificate was created. Unit: milliseconds.</p>
         * <p>The timestamp is in the Unix format, which represents the total number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC, to the time when the SSL client certificate was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1552550980000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The timestamp when the SSL client certificate expires. Unit: milliseconds.</p>
         * <p>The timestamp is in the Unix format, which represents the total number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC, to the time when the SSL client certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1647158980000</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5BE01CD7-5A50-472D-AC14-CA181C5C03BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID of the SSL client certificate.</p>
         * <p>The SSL client certificate belongs to the same resource group as its associated SSL server. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource group information.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-bp13k5mp4tg8v3z9b****</p>
         */
        public Builder sslVpnClientCertId(String sslVpnClientCertId) {
            this.sslVpnClientCertId = sslVpnClientCertId;
            return this;
        }

        /**
         * <p>The SSL server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vss-bp155e9yclsg1xgq4****</p>
         */
        public Builder sslVpnServerId(String sslVpnServerId) {
            this.sslVpnServerId = sslVpnServerId;
            return this;
        }

        /**
         * <p>The status of the SSL client certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>expiring-soon</strong>: The certificate will expire within one week.</p>
         * </li>
         * <li><p><strong>normal</strong>: Normal. </p>
         * </li>
         * <li><p><strong>expired</strong>: Expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeSslVpnClientCertResponseBody build() {
            return new DescribeSslVpnClientCertResponseBody(this);
        } 

    } 

}
