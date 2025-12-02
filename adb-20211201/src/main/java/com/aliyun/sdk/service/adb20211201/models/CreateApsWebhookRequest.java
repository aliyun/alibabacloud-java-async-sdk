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
 * {@link CreateApsWebhookRequest} extends {@link RequestModel}
 *
 * <p>CreateApsWebhookRequest</p>
 */
public class CreateApsWebhookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Webhook")
    private java.util.List<Webhook> webhook;

    private CreateApsWebhookRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.jobType = builder.jobType;
        this.regionId = builder.regionId;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApsWebhookRequest create() {
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
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
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

    public static final class Builder extends Request.Builder<CreateApsWebhookRequest, Builder> {
        private String DBClusterId; 
        private String jobType; 
        private String regionId; 
        private java.util.List<Webhook> webhook; 

        private Builder() {
            super();
        } 

        private Builder(CreateApsWebhookRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.jobType = request.jobType;
            this.regionId = request.regionId;
            this.webhook = request.webhook;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The type of the task. Valid value: Task type. SLS or OSS Export Task: ResultExport.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ResultExport</p>
         */
        public Builder jobType(String jobType) {
            this.putBodyParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the dedicated block storage cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
        public CreateApsWebhookRequest build() {
            return new CreateApsWebhookRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateApsWebhookRequest} extends {@link TeaModel}
     *
     * <p>CreateApsWebhookRequest</p>
     */
    public static class Webhook extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true)
        private String url;

        @com.aliyun.core.annotation.NameInMap("WebhookType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String webhookType;

        private Webhook(Builder builder) {
            this.key = builder.key;
            this.name = builder.name;
            this.url = builder.url;
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
         * @return webhookType
         */
        public String getWebhookType() {
            return this.webhookType;
        }

        public static final class Builder {
            private String key; 
            private String name; 
            private String url; 
            private String webhookType; 

            private Builder() {
            } 

            private Builder(Webhook model) {
                this.key = model.key;
                this.name = model.name;
                this.url = model.url;
                this.webhookType = model.webhookType;
            } 

            /**
             * <p>Signed key.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The name of the webhook.</p>
             * 
             * <strong>example:</strong>
             * <p>MyWebhookName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The request path.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/webhook">https://example.com/webhook</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The notification method. Valid values: dingtalk. lark.</p>
             * <p>This parameter is required.</p>
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
