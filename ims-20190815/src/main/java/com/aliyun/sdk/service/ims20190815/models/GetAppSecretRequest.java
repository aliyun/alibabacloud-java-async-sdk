// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppSecretRequest} extends {@link RequestModel}
 *
 * <p>GetAppSecretRequest</p>
 */
public class GetAppSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppSecretId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appSecretId;

    private GetAppSecretRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appSecretId = builder.appSecretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppSecretRequest create() {
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
     * @return appSecretId
     */
    public String getAppSecretId() {
        return this.appSecretId;
    }

    public static final class Builder extends Request.Builder<GetAppSecretRequest, Builder> {
        private String appId; 
        private String appSecretId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppSecretRequest request) {
            super(request);
            this.appId = request.appId;
            this.appSecretId = request.appSecretId;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the application secret.
         */
        public Builder appSecretId(String appSecretId) {
            this.putQueryParameter("AppSecretId", appSecretId);
            this.appSecretId = appSecretId;
            return this;
        }

        @Override
        public GetAppSecretRequest build() {
            return new GetAppSecretRequest(this);
        } 

    } 

}
