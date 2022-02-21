// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSslVpnClientCertResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientCertResponseBody</p>
 */
public class DescribeSslVpnClientCertResponseBody extends TeaModel {
    @NameInMap("CaCert")
    private String caCert;

    @NameInMap("ClientCert")
    private String clientCert;

    @NameInMap("ClientConfig")
    private String clientConfig;

    @NameInMap("ClientKey")
    private String clientKey;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SslVpnClientCertId")
    private String sslVpnClientCertId;

    @NameInMap("SslVpnServerId")
    private String sslVpnServerId;

    @NameInMap("Status")
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
        private String sslVpnClientCertId; 
        private String sslVpnServerId; 
        private String status; 

        /**
         * CaCert.
         */
        public Builder caCert(String caCert) {
            this.caCert = caCert;
            return this;
        }

        /**
         * ClientCert.
         */
        public Builder clientCert(String clientCert) {
            this.clientCert = clientCert;
            return this;
        }

        /**
         * ClientConfig.
         */
        public Builder clientConfig(String clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        /**
         * ClientKey.
         */
        public Builder clientKey(String clientKey) {
            this.clientKey = clientKey;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SslVpnClientCertId.
         */
        public Builder sslVpnClientCertId(String sslVpnClientCertId) {
            this.sslVpnClientCertId = sslVpnClientCertId;
            return this;
        }

        /**
         * SslVpnServerId.
         */
        public Builder sslVpnServerId(String sslVpnServerId) {
            this.sslVpnServerId = sslVpnServerId;
            return this;
        }

        /**
         * Status.
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
