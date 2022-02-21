// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppSecretRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppSecretRequest</p>
 */
public class DeleteAppSecretRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AppSecretId")
    @Validation(required = true)
    private String appSecretId;

    private DeleteAppSecretRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appSecretId = builder.appSecretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppSecretRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAppSecretRequest, Builder> {
        private String appId; 
        private String appSecretId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppSecretRequest response) {
            super(response);
            this.appId = response.appId;
            this.appSecretId = response.appSecretId;
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
         * AppSecretId.
         */
        public Builder appSecretId(String appSecretId) {
            this.putQueryParameter("AppSecretId", appSecretId);
            this.appSecretId = appSecretId;
            return this;
        }

        @Override
        public DeleteAppSecretRequest build() {
            return new DeleteAppSecretRequest(this);
        } 

    } 

}
