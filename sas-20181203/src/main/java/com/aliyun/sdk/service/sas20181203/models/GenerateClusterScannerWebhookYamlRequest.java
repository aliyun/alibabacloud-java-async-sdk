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
 * {@link GenerateClusterScannerWebhookYamlRequest} extends {@link RequestModel}
 *
 * <p>GenerateClusterScannerWebhookYamlRequest</p>
 */
public class GenerateClusterScannerWebhookYamlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebhookOpen")
    private Integer webhookOpen;

    private GenerateClusterScannerWebhookYamlRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.webhookOpen = builder.webhookOpen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateClusterScannerWebhookYamlRequest create() {
        return builder().build();
    }

@Override
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
     * @return webhookOpen
     */
    public Integer getWebhookOpen() {
        return this.webhookOpen;
    }

    public static final class Builder extends Request.Builder<GenerateClusterScannerWebhookYamlRequest, Builder> {
        private String clusterId; 
        private Integer webhookOpen; 

        private Builder() {
            super();
        } 

        private Builder(GenerateClusterScannerWebhookYamlRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.webhookOpen = request.webhookOpen;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c3aaf6c8085f84791882eef200cd2****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * WebhookOpen.
         */
        public Builder webhookOpen(Integer webhookOpen) {
            this.putQueryParameter("WebhookOpen", webhookOpen);
            this.webhookOpen = webhookOpen;
            return this;
        }

        @Override
        public GenerateClusterScannerWebhookYamlRequest build() {
            return new GenerateClusterScannerWebhookYamlRequest(this);
        } 

    } 

}
