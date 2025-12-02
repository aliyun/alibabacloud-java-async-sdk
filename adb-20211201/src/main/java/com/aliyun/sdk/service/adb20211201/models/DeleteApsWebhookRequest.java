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
 * {@link DeleteApsWebhookRequest} extends {@link RequestModel}
 *
 * <p>DeleteApsWebhookRequest</p>
 */
public class DeleteApsWebhookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebhookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String webhookId;

    private DeleteApsWebhookRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.webhookId = builder.webhookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApsWebhookRequest create() {
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
     * @return webhookId
     */
    public String getWebhookId() {
        return this.webhookId;
    }

    public static final class Builder extends Request.Builder<DeleteApsWebhookRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private String webhookId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApsWebhookRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.webhookId = request.webhookId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-uf63i4ij56b***</p>
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
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the webhook to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>**<em>1</em>595*</p>
         */
        public Builder webhookId(String webhookId) {
            this.putBodyParameter("WebhookId", webhookId);
            this.webhookId = webhookId;
            return this;
        }

        @Override
        public DeleteApsWebhookRequest build() {
            return new DeleteApsWebhookRequest(this);
        } 

    } 

}
