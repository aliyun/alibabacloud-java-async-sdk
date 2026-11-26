// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link UpdateMyAgenticNotificationChannelConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateMyAgenticNotificationChannelConfigRequest</p>
 */
public class UpdateMyAgenticNotificationChannelConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(maxLength = 16384)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    private UpdateMyAgenticNotificationChannelConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.channel = builder.channel;
        this.config = builder.config;
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMyAgenticNotificationChannelConfigRequest create() {
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
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static final class Builder extends Request.Builder<UpdateMyAgenticNotificationChannelConfigRequest, Builder> {
        private String regionId; 
        private String channel; 
        private String config; 
        private Boolean enabled; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMyAgenticNotificationChannelConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.channel = request.channel;
            this.config = request.config;
            this.enabled = request.enabled;
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
         * <p>The notification channel type. Currently, only FEISHU (Lark) is supported. Specifying other values results in a parameter error.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FEISHU</p>
         */
        public Builder channel(String channel) {
            this.putBodyParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>The channel configuration in the format of a JSON object string. This parameter is not required if you do not update the binding information. Supports mobile (phone number) or email. You can bind or rebind a Lark account by using one of them at a time. If the existing masked values of mobile or email are passed as ******, they are not modified. openId is a read-only field and cannot be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;email&quot;:&quot;<a href="mailto:user@example.com">user@example.com</a>&quot;}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>Specifies whether to enable the notification channel. If this parameter is not specified, the original value is retained. When you only modify the switch, the Config parameter is not required, and the existing binding information remains unchanged.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("Enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        @Override
        public UpdateMyAgenticNotificationChannelConfigRequest build() {
            return new UpdateMyAgenticNotificationChannelConfigRequest(this);
        } 

    } 

}
