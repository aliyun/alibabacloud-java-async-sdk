// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetClusterScannerYamlResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterScannerYamlResponseBody</p>
 */
public class GetClusterScannerYamlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaCertBase64")
    private String caCertBase64;

    @com.aliyun.core.annotation.NameInMap("ClusterEnvInfo")
    private String clusterEnvInfo;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TlsCertBase64")
    private String tlsCertBase64;

    @com.aliyun.core.annotation.NameInMap("TlsKeyBase64")
    private String tlsKeyBase64;

    @com.aliyun.core.annotation.NameInMap("WebhookOpen")
    private Integer webhookOpen;

    private GetClusterScannerYamlResponseBody(Builder builder) {
        this.caCertBase64 = builder.caCertBase64;
        this.clusterEnvInfo = builder.clusterEnvInfo;
        this.clusterId = builder.clusterId;
        this.image = builder.image;
        this.requestId = builder.requestId;
        this.tlsCertBase64 = builder.tlsCertBase64;
        this.tlsKeyBase64 = builder.tlsKeyBase64;
        this.webhookOpen = builder.webhookOpen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterScannerYamlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caCertBase64
     */
    public String getCaCertBase64() {
        return this.caCertBase64;
    }

    /**
     * @return clusterEnvInfo
     */
    public String getClusterEnvInfo() {
        return this.clusterEnvInfo;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tlsCertBase64
     */
    public String getTlsCertBase64() {
        return this.tlsCertBase64;
    }

    /**
     * @return tlsKeyBase64
     */
    public String getTlsKeyBase64() {
        return this.tlsKeyBase64;
    }

    /**
     * @return webhookOpen
     */
    public Integer getWebhookOpen() {
        return this.webhookOpen;
    }

    public static final class Builder {
        private String caCertBase64; 
        private String clusterEnvInfo; 
        private String clusterId; 
        private String image; 
        private String requestId; 
        private String tlsCertBase64; 
        private String tlsKeyBase64; 
        private Integer webhookOpen; 

        private Builder() {
        } 

        private Builder(GetClusterScannerYamlResponseBody model) {
            this.caCertBase64 = model.caCertBase64;
            this.clusterEnvInfo = model.clusterEnvInfo;
            this.clusterId = model.clusterId;
            this.image = model.image;
            this.requestId = model.requestId;
            this.tlsCertBase64 = model.tlsCertBase64;
            this.tlsKeyBase64 = model.tlsKeyBase64;
            this.webhookOpen = model.webhookOpen;
        } 

        /**
         * CaCertBase64.
         */
        public Builder caCertBase64(String caCertBase64) {
            this.caCertBase64 = caCertBase64;
            return this;
        }

        /**
         * ClusterEnvInfo.
         */
        public Builder clusterEnvInfo(String clusterEnvInfo) {
            this.clusterEnvInfo = clusterEnvInfo;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Image.
         */
        public Builder image(String image) {
            this.image = image;
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
         * TlsCertBase64.
         */
        public Builder tlsCertBase64(String tlsCertBase64) {
            this.tlsCertBase64 = tlsCertBase64;
            return this;
        }

        /**
         * TlsKeyBase64.
         */
        public Builder tlsKeyBase64(String tlsKeyBase64) {
            this.tlsKeyBase64 = tlsKeyBase64;
            return this;
        }

        /**
         * WebhookOpen.
         */
        public Builder webhookOpen(Integer webhookOpen) {
            this.webhookOpen = webhookOpen;
            return this;
        }

        public GetClusterScannerYamlResponseBody build() {
            return new GetClusterScannerYamlResponseBody(this);
        } 

    } 

}
