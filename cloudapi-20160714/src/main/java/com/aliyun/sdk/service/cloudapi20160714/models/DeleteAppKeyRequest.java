// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAppKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppKeyRequest</p>
 */
public class DeleteAppKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appKey;

    private DeleteAppKeyRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appKey = builder.appKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppKeyRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAppKeyRequest, Builder> {
        private String appId; 
        private String appKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppKeyRequest request) {
            super(request);
            this.appId = request.appId;
            this.appKey = request.appKey;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>110840611</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The AppKey of the application. The AppKey is used for calling an API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>203708622</p>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        @Override
        public DeleteAppKeyRequest build() {
            return new DeleteAppKeyRequest(this);
        } 

    } 

}
