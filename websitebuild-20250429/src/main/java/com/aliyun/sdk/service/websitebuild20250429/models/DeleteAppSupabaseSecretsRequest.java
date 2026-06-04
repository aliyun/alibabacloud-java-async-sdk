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
 * {@link DeleteAppSupabaseSecretsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppSupabaseSecretsRequest</p>
 */
public class DeleteAppSupabaseSecretsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeysJson")
    private String keysJson;

    private DeleteAppSupabaseSecretsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.keysJson = builder.keysJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppSupabaseSecretsRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return keysJson
     */
    public String getKeysJson() {
        return this.keysJson;
    }

    public static final class Builder extends Request.Builder<DeleteAppSupabaseSecretsRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String keysJson; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppSupabaseSecretsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.keysJson = request.keysJson;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * KeysJson.
         */
        public Builder keysJson(String keysJson) {
            this.putQueryParameter("KeysJson", keysJson);
            this.keysJson = keysJson;
            return this;
        }

        @Override
        public DeleteAppSupabaseSecretsRequest build() {
            return new DeleteAppSupabaseSecretsRequest(this);
        } 

    } 

}
