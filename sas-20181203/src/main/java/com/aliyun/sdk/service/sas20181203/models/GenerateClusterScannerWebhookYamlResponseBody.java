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
 * {@link GenerateClusterScannerWebhookYamlResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateClusterScannerWebhookYamlResponseBody</p>
 */
public class GenerateClusterScannerWebhookYamlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebhookOpen")
    private Integer webhookOpen;

    private GenerateClusterScannerWebhookYamlResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.webhookOpen = builder.webhookOpen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateClusterScannerWebhookYamlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webhookOpen
     */
    public Integer getWebhookOpen() {
        return this.webhookOpen;
    }

    public static final class Builder {
        private String clusterId; 
        private Long id; 
        private String requestId; 
        private Integer webhookOpen; 

        private Builder() {
        } 

        private Builder(GenerateClusterScannerWebhookYamlResponseBody model) {
            this.clusterId = model.clusterId;
            this.id = model.id;
            this.requestId = model.requestId;
            this.webhookOpen = model.webhookOpen;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
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
         * WebhookOpen.
         */
        public Builder webhookOpen(Integer webhookOpen) {
            this.webhookOpen = webhookOpen;
            return this;
        }

        public GenerateClusterScannerWebhookYamlResponseBody build() {
            return new GenerateClusterScannerWebhookYamlResponseBody(this);
        } 

    } 

}
