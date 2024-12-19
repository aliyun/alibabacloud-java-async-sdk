// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreateAppKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateAppKeyRequest</p>
 */
public class CreateAppKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppSecret")
    private String appSecret;

    private CreateAppKeyRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appKey = builder.appKey;
        this.appSecret = builder.appSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppKeyRequest create() {
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
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    public static final class Builder extends Request.Builder<CreateAppKeyRequest, Builder> {
        private String appId; 
        private String appKey; 
        private String appSecret; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppKeyRequest request) {
            super(request);
            this.appId = request.appId;
            this.appKey = request.appKey;
            this.appSecret = request.appSecret;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111053351</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application AppKey.</p>
         * 
         * <strong>example:</strong>
         * <p>204203237</p>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The application AppSecret.</p>
         * 
         * <strong>example:</strong>
         * <p>6f0a4ad7918a4b41a57fc087d5b066d0</p>
         */
        public Builder appSecret(String appSecret) {
            this.putQueryParameter("AppSecret", appSecret);
            this.appSecret = appSecret;
            return this;
        }

        @Override
        public CreateAppKeyRequest build() {
            return new CreateAppKeyRequest(this);
        } 

    } 

}
