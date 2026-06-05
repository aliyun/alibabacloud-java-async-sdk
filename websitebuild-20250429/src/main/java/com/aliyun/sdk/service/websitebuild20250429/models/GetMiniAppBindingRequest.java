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
 * {@link GetMiniAppBindingRequest} extends {@link RequestModel}
 *
 * <p>GetMiniAppBindingRequest</p>
 */
public class GetMiniAppBindingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SettingKeys")
    private java.util.List<String> settingKeys;

    private GetMiniAppBindingRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.channel = builder.channel;
        this.settingKeys = builder.settingKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMiniAppBindingRequest create() {
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
     * @return settingKeys
     */
    public java.util.List<String> getSettingKeys() {
        return this.settingKeys;
    }

    public static final class Builder extends Request.Builder<GetMiniAppBindingRequest, Builder> {
        private String bizId; 
        private String channel; 
        private java.util.List<String> settingKeys; 

        private Builder() {
            super();
        } 

        private Builder(GetMiniAppBindingRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.channel = request.channel;
            this.settingKeys = request.settingKeys;
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
         * SettingKeys.
         */
        public Builder settingKeys(java.util.List<String> settingKeys) {
            String settingKeysShrink = shrink(settingKeys, "SettingKeys", "json");
            this.putQueryParameter("SettingKeys", settingKeysShrink);
            this.settingKeys = settingKeys;
            return this;
        }

        @Override
        public GetMiniAppBindingRequest build() {
            return new GetMiniAppBindingRequest(this);
        } 

    } 

}
