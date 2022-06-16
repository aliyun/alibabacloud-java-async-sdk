// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppDetailRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppDetailRequest</p>
 */
public class DeleteAppDetailRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("Force")
    @Validation(required = true)
    private Boolean force;

    private DeleteAppDetailRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<DeleteAppDetailRequest, Builder> {
        private Long appId; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppDetailRequest request) {
            super(request);
            this.appId = request.appId;
            this.force = request.force;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        @Override
        public DeleteAppDetailRequest build() {
            return new DeleteAppDetailRequest(this);
        } 

    } 

}
