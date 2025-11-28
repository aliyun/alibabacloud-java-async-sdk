// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link DeleteRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRouteRuleRequest</p>
 */
public class DeleteRouteRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeRuleId;

    private DeleteRouteRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.routeRuleId = builder.routeRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRouteRuleRequest create() {
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
     * @return routeRuleId
     */
    public String getRouteRuleId() {
        return this.routeRuleId;
    }

    public static final class Builder extends Request.Builder<DeleteRouteRuleRequest, Builder> {
        private String regionId; 
        private String routeRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRouteRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.routeRuleId = request.routeRuleId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder routeRuleId(String routeRuleId) {
            this.putQueryParameter("RouteRuleId", routeRuleId);
            this.routeRuleId = routeRuleId;
            return this;
        }

        @Override
        public DeleteRouteRuleRequest build() {
            return new DeleteRouteRuleRequest(this);
        } 

    } 

}
