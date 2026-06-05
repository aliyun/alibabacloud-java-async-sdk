// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link UpdateMiniAppBindingRequest} extends {@link RequestModel}
 *
 * <p>UpdateMiniAppBindingRequest</p>
 */
public class UpdateMiniAppBindingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SettingKey")
    private String settingKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SettingValue")
    private String settingValue;

    private UpdateMiniAppBindingRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.channel = builder.channel;
        this.settingKey = builder.settingKey;
        this.settingValue = builder.settingValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMiniAppBindingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return settingKey
     */
    public String getSettingKey() {
        return this.settingKey;
    }

    /**
     * @return settingValue
     */
    public String getSettingValue() {
        return this.settingValue;
    }

    public static final class Builder extends Request.Builder<UpdateMiniAppBindingRequest, Builder> {
        private String bizId; 
        private String channel; 
        private String settingKey; 
        private String settingValue; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMiniAppBindingRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.channel = request.channel;
            this.settingKey = request.settingKey;
            this.settingValue = request.settingValue;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putQueryParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * SettingKey.
         */
        public Builder settingKey(String settingKey) {
            this.putQueryParameter("SettingKey", settingKey);
            this.settingKey = settingKey;
            return this;
        }

        /**
         * SettingValue.
         */
        public Builder settingValue(String settingValue) {
            this.putQueryParameter("SettingValue", settingValue);
            this.settingValue = settingValue;
            return this;
        }

        @Override
        public UpdateMiniAppBindingRequest build() {
            return new UpdateMiniAppBindingRequest(this);
        } 

    } 

}
