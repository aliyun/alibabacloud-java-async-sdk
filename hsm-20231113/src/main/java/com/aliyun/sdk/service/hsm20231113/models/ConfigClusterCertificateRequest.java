// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link ConfigClusterCertificateRequest} extends {@link RequestModel}
 *
 * <p>ConfigClusterCertificateRequest</p>
 */
public class ConfigClusterCertificateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterCertificate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterCertificate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IssuerCertificate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String issuerCertificate;

    private ConfigClusterCertificateRequest(Builder builder) {
        super(builder);
        this.clusterCertificate = builder.clusterCertificate;
        this.clusterId = builder.clusterId;
        this.issuerCertificate = builder.issuerCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigClusterCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterCertificate
     */
    public String getClusterCertificate() {
        return this.clusterCertificate;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return issuerCertificate
     */
    public String getIssuerCertificate() {
        return this.issuerCertificate;
    }

    public static final class Builder extends Request.Builder<ConfigClusterCertificateRequest, Builder> {
        private String clusterCertificate; 
        private String clusterId; 
        private String issuerCertificate; 

        private Builder() {
            super();
        } 

        private Builder(ConfigClusterCertificateRequest request) {
            super(request);
            this.clusterCertificate = request.clusterCertificate;
            this.clusterId = request.clusterId;
            this.issuerCertificate = request.issuerCertificate;
        } 

        /**
         * <p>The cluster certificate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIDaTCCAlECAQEwDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCY24xCzAJBgNV
         * BAgMAnpqMQswCQYDVQQHDAJoejEWMBQGA1UECgwNQWxpYmFiYSBDbG91ZDEUMBIG
         * A1UECwwLU2VjQ2xvdWRIc20wHhcNMjQwNzAzM****-----END CERTIFICATE-----</p>
         */
        public Builder clusterCertificate(String clusterCertificate) {
            this.putBodyParameter("ClusterCertificate", clusterCertificate);
            this.clusterCertificate = clusterCertificate;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-BqxX63Bsg****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The self-signed certificate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----
         * MIIDfTCCAmWgAwIBAgIJAMRqQMr5if66MA0GCSqGSIb3DQEBCwUAMFUxCzAJBgNV
         * BAYTAmNuMQswCQYDVQQIDAJ6ajELMAkGA1UEBwwCaHoxFjAUBgNVBAoMDUFsaWJh
         * YmEgQ2xvdWQxFDA****
         * -----END CERTIFICATE-----</p>
         */
        public Builder issuerCertificate(String issuerCertificate) {
            this.putBodyParameter("IssuerCertificate", issuerCertificate);
            this.issuerCertificate = issuerCertificate;
            return this;
        }

        @Override
        public ConfigClusterCertificateRequest build() {
            return new ConfigClusterCertificateRequest(this);
        } 

    } 

}
