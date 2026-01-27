// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DeleteAppRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppRequest</p>
 */
public class DeleteAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.owner = builder.owner;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAppRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private String owner; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.owner = request.owner;
            this.regionId = request.regionId;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteAppRequest build() {
            return new DeleteAppRequest(this);
        } 

    } 

}
