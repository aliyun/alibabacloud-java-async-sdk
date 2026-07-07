// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link PurchaseBotInstanceRequest} extends {@link RequestModel}
 *
 * <p>PurchaseBotInstanceRequest</p>
 */
public class PurchaseBotInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BotInstanceLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String botInstanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String siteInstanceId;

    private PurchaseBotInstanceRequest(Builder builder) {
        super(builder);
        this.botInstanceLevel = builder.botInstanceLevel;
        this.siteInstanceId = builder.siteInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseBotInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return botInstanceLevel
     */
    public String getBotInstanceLevel() {
        return this.botInstanceLevel;
    }

    /**
     * @return siteInstanceId
     */
    public String getSiteInstanceId() {
        return this.siteInstanceId;
    }

    public static final class Builder extends Request.Builder<PurchaseBotInstanceRequest, Builder> {
        private String botInstanceLevel; 
        private String siteInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(PurchaseBotInstanceRequest request) {
            super(request);
            this.botInstanceLevel = request.botInstanceLevel;
            this.siteInstanceId = request.siteInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>enterprise_bot</p>
         */
        public Builder botInstanceLevel(String botInstanceLevel) {
            this.putQueryParameter("BotInstanceLevel", botInstanceLevel);
            this.botInstanceLevel = botInstanceLevel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-23kde*****</p>
         */
        public Builder siteInstanceId(String siteInstanceId) {
            this.putQueryParameter("SiteInstanceId", siteInstanceId);
            this.siteInstanceId = siteInstanceId;
            return this;
        }

        @Override
        public PurchaseBotInstanceRequest build() {
            return new PurchaseBotInstanceRequest(this);
        } 

    } 

}
