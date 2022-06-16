// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppResourceAllocRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppResourceAllocRequest</p>
 */
public class DeleteAppResourceAllocRequest extends Request {
    @Query
    @NameInMap("AppEnvId")
    @Validation(required = true)
    private Long appEnvId;

    private DeleteAppResourceAllocRequest(Builder builder) {
        super(builder);
        this.appEnvId = builder.appEnvId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppResourceAllocRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appEnvId
     */
    public Long getAppEnvId() {
        return this.appEnvId;
    }

    public static final class Builder extends Request.Builder<DeleteAppResourceAllocRequest, Builder> {
        private Long appEnvId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppResourceAllocRequest request) {
            super(request);
            this.appEnvId = request.appEnvId;
        } 

        /**
         * AppEnvId.
         */
        public Builder appEnvId(Long appEnvId) {
            this.putQueryParameter("AppEnvId", appEnvId);
            this.appEnvId = appEnvId;
            return this;
        }

        @Override
        public DeleteAppResourceAllocRequest build() {
            return new DeleteAppResourceAllocRequest(this);
        } 

    } 

}
