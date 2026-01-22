// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteAlertWebhooksRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertWebhooksRequest</p>
 */
public class DeleteAlertWebhooksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("webhookIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> webhookIds;

    private DeleteAlertWebhooksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.webhookIds = builder.webhookIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertWebhooksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return webhookIds
     */
    public java.util.List<String> getWebhookIds() {
        return this.webhookIds;
    }

    public static final class Builder extends Request.Builder<DeleteAlertWebhooksRequest, Builder> {
        private String regionId; 
        private java.util.List<String> webhookIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertWebhooksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.webhookIds = request.webhookIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder webhookIds(java.util.List<String> webhookIds) {
            String webhookIdsShrink = shrink(webhookIds, "webhookIds", "json");
            this.putQueryParameter("webhookIds", webhookIdsShrink);
            this.webhookIds = webhookIds;
            return this;
        }

        @Override
        public DeleteAlertWebhooksRequest build() {
            return new DeleteAlertWebhooksRequest(this);
        } 

    } 

}
