// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDynamicRouteRequest} extends {@link RequestModel}
 *
 * <p>DeleteDynamicRouteRequest</p>
 */
public class DeleteDynamicRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicRouteId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-ca9fddfac7c6****</p>
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
