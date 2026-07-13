// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link UpdateAtiAlertSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateAtiAlertSettingsRequest</p>
 */
public class UpdateAtiAlertSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertConfig")
    private String alertConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertGroup")
    private String alertGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private UpdateAtiAlertSettingsRequest(Builder builder) {
        super(builder);
        this.alertConfig = builder.alertConfig;
        this.alertGroup = builder.alertGroup;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAtiAlertSettingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertConfig
     */
    public String getAlertConfig() {
        return this.alertConfig;
    }

    /**
     * @return alertGroup
     */
    public String getAlertGroup() {
        return this.alertGroup;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateAtiAlertSettingsRequest, Builder> {
        private String alertConfig; 
        private String alertGroup; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAtiAlertSettingsRequest request) {
            super(request);
            this.alertConfig = request.alertConfig;
            this.alertGroup = request.alertGroup;
            this.clientToken = request.clientToken;
        } 

        /**
         * AlertConfig.
         */
        public Builder alertConfig(String alertConfig) {
            this.putQueryParameter("AlertConfig", alertConfig);
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * AlertGroup.
         */
        public Builder alertGroup(String alertGroup) {
            this.putQueryParameter("AlertGroup", alertGroup);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateAtiAlertSettingsRequest build() {
            return new UpdateAtiAlertSettingsRequest(this);
        } 

    } 

}
