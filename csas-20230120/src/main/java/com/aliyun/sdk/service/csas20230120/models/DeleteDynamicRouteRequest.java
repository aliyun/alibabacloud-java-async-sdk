// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDynamicRouteRequest} extends {@link RequestModel}
 *
 * <p>DeleteDynamicRouteRequest</p>
 */
public class DeleteDynamicRouteRequest extends Request {
    @Query
    @NameInMap("DynamicRouteId")
    @Validation(required = true)
    private String dynamicRouteId;

    private DeleteDynamicRouteRequest(Builder builder) {
        super(builder);
        this.dynamicRouteId = builder.dynamicRouteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDynamicRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicRouteId
     */
    public String getDynamicRouteId() {
        return this.dynamicRouteId;
    }

    public static final class Builder extends Request.Builder<DeleteDynamicRouteRequest, Builder> {
        private String dynamicRouteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDynamicRouteRequest request) {
            super(request);
            this.dynamicRouteId = request.dynamicRouteId;
        } 

        /**
         * DynamicRouteId.
         */
        public Builder dynamicRouteId(String dynamicRouteId) {
            this.putQueryParameter("DynamicRouteId", dynamicRouteId);
            this.dynamicRouteId = dynamicRouteId;
            return this;
        }

        @Override
        public DeleteDynamicRouteRequest build() {
            return new DeleteDynamicRouteRequest(this);
        } 

    } 

}
