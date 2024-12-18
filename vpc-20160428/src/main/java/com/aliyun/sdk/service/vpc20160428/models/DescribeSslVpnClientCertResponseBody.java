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

        /**
         * <p>The CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>CA certificate</p>
         */
        public Builder caCert(String caCert) {
            this.caCert = caCert;
            return this;
        }

        /**
         * <p>The client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Client certificate</p>
         */
        public Builder clientCert(String clientCert) {
            this.clientCert = clientCert;
            return this;
        }

        /**
         * <p>The client configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Client configuration</p>
         */
        public Builder clientConfig(String clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        /**
         * <p>The client key.</p>
         * 
         * <strong>example:</strong>
         * <p>The key of the client</p>
         */
        public Builder clientKey(String clientKey) {
            this.clientKey = clientKey;
            return this;
        }

        /**
         * <p>The timestamp that indicates when the SSL client certificate was created. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552550980000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The timestamp that indicates when the SSL client certificate expires. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>The ID of the region where the SSL client certificate is created.</p>
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
         * <p>The ID of the resource group to which the SSL client certificate belongs.</p>
         * <p>The SSL client certificate and the SSL server associated with the SSL client certificate belong to the same resource group. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
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
         * <p>The ID of the SSL server.</p>
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
         * <li><strong>expiring-soon</strong></li>
         * <li><strong>normal</strong></li>
         * <li><strong>expired</strong></li>
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
