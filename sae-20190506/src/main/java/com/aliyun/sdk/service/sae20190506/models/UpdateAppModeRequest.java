// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateAppModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppModeRequest</p>
 */
public class UpdateAppModeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIdle")
    private Boolean enableIdle;

    private UpdateAppModeRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.enableIdle = builder.enableIdle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppModeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return enableIdle
     */
    public Boolean getEnableIdle() {
        return this.enableIdle;
    }

    public static final class Builder extends Request.Builder<UpdateAppModeRequest, Builder> {
        private String appId; 
        private Boolean enableIdle; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppModeRequest request) {
            super(request);
            this.appId = request.appId;
            this.enableIdle = request.enableIdle;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EnableIdle.
         */
        public Builder enableIdle(Boolean enableIdle) {
            this.putQueryParameter("EnableIdle", enableIdle);
            this.enableIdle = enableIdle;
            return this;
        }

        @Override
        public UpdateAppModeRequest build() {
            return new UpdateAppModeRequest(this);
        } 

    } 

}
