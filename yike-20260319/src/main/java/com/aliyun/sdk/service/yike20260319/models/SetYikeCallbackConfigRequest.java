// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link SetYikeCallbackConfigRequest} extends {@link RequestModel}
 *
 * <p>SetYikeCallbackConfigRequest</p>
 */
public class SetYikeCallbackConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callbackUrl;

    private SetYikeCallbackConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callbackConfig = builder.callbackConfig;
        this.callbackUrl = builder.callbackUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetYikeCallbackConfigRequest create() {
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
     * @return callbackConfig
     */
    public String getCallbackConfig() {
        return this.callbackConfig;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public static final class Builder extends Request.Builder<SetYikeCallbackConfigRequest, Builder> {
        private String regionId; 
        private String callbackConfig; 
        private String callbackUrl; 

        private Builder() {
            super();
        } 

        private Builder(SetYikeCallbackConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callbackConfig = request.callbackConfig;
            this.callbackUrl = request.callbackUrl;
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
         * 
         * <strong>example:</strong>
         * <p>{&quot;CallbackEventList&quot;:[{&quot;EventType&quot;:&quot;UserCreditAdded&quot;,&quot;UserData&quot;:&quot;{}&quot;}]}</p>
         */
        public Builder callbackConfig(String callbackConfig) {
            this.putQueryParameter("CallbackConfig", callbackConfig);
            this.callbackConfig = callbackConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http//example.com/callback</p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        @Override
        public SetYikeCallbackConfigRequest build() {
            return new SetYikeCallbackConfigRequest(this);
        } 

    } 

}
