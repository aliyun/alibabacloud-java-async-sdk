// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link UpdateApsWebhookRequest} extends {@link RequestModel}
 *
 * <p>UpdateApsWebhookRequest</p>
 */
public class UpdateApsWebhookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Webhook")
    private java.util.List<Webhook> webhook;

    private UpdateApsWebhookRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApsWebhookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return webhook
     */
    public java.util.List<Webhook> getWebhook() {
        return this.webhook;
    }

    public static final class Builder extends Request.Builder<UpdateApsWebhookRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private java.util.List<Webhook> webhook; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApsWebhookRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.webhook = request.webhook;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDBClusterId</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleRegionId</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The array of webhooks.</p>
         */
        public Builder webhook(java.util.List<Webhook> webhook) {
            String webhookShrink = shrink(webhook, "Webhook", "json");
            this.putBodyParameter("Webhook", webhookShrink);
            this.webhook = webhook;
            return this;
        }

        @Override
        public UpdateApsWebhookRequest build() {
            return new UpdateApsWebhookRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApsWebhookRequest} extends {@link TeaModel}
     *
     * <p>UpdateApsWebhookRequest</p>
     */
    public static class Webhook extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("WebhookId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long webhookId;

        @com.aliyun.core.annotation.NameInMap("WebhookType")
        private String webhookType;

        private Webhook(Builder builder) {
            this.key = builder.key;
            this.name = builder.name;
            this.url = builder.url;
            this.webhookId = builder.webhookId;
            this.webhookType = builder.webhookType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Webhook create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return webhookId
         */
        public Long getWebhookId() {
            return this.webhookId;
        }

        /**
         * @return webhookType
         */
        public String getWebhookType() {
            return this.webhookType;
        }

        public static final class Builder {
            private String key; 
            private String name; 
            private String url; 
            private Long webhookId; 
            private String webhookType; 

            private Builder() {
            } 

            private Builder(Webhook model) {
                this.key = model.key;
                this.name = model.name;
                this.url = model.url;
                this.webhookId = model.webhookId;
                this.webhookType = model.webhookType;
            } 

            /**
             * <p>Signed key.</p>
             * 
             * <strong>example:</strong>
             * <p>ABC**</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The name of the webhook.</p>
             * 
             * <strong>example:</strong>
             * <p>exampleWebhookName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The URL of the request.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/webhook">https://example.com/webhook</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The ID of the webhook.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><strong>355</strong>**</p>
             */
            public Builder webhookId(Long webhookId) {
                this.webhookId = webhookId;
                return this;
            }

            /**
             * <p>The notification method. Valid values: dingtalk. lark.</p>
             * 
             * <strong>example:</strong>
             * <p>dingtalk</p>
             */
            public Builder webhookType(String webhookType) {
                this.webhookType = webhookType;
                return this;
            }

            public Webhook build() {
                return new Webhook(this);
            } 

        } 

    }
}
