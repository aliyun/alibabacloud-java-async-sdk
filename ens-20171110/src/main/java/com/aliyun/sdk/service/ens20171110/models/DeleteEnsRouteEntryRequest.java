// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DeleteEnsRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnsRouteEntryRequest</p>
 */
public class DeleteEnsRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeEntryId;

    private DeleteEnsRouteEntryRequest(Builder builder) {
        super(builder);
        this.routeEntryId = builder.routeEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnsRouteEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public static final class Builder extends Request.Builder<DeleteEnsRouteEntryRequest, Builder> {
        private String routeEntryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnsRouteEntryRequest request) {
            super(request);
            this.routeEntryId = request.routeEntryId;
        } 

        /**
         * <p>The ID of the route that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-8vbmb2890wiret5maqq25</p>
         */
        public Builder routeEntryId(String routeEntryId) {
            this.putQueryParameter("RouteEntryId", routeEntryId);
            this.routeEntryId = routeEntryId;
            return this;
        }

        @Override
        public DeleteEnsRouteEntryRequest build() {
            return new DeleteEnsRouteEntryRequest(this);
        } 

    } 

}
