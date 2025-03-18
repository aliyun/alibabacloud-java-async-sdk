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
 * {@link ModifyEnsRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyEnsRouteEntryRequest</p>
 */
public class ModifyEnsRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256, minLength = 1)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteEntryName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String routeEntryName;

    private ModifyEnsRouteEntryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.routeEntryId = builder.routeEntryId;
        this.routeEntryName = builder.routeEntryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEnsRouteEntryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    /**
     * @return routeEntryName
     */
    public String getRouteEntryName() {
        return this.routeEntryName;
    }

    public static final class Builder extends Request.Builder<ModifyEnsRouteEntryRequest, Builder> {
        private String description; 
        private String routeEntryId; 
        private String routeEntryName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEnsRouteEntryRequest request) {
            super(request);
            this.description = request.description;
            this.routeEntryId = request.routeEntryId;
            this.routeEntryName = request.routeEntryName;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-5****</p>
         */
        public Builder routeEntryId(String routeEntryId) {
            this.putQueryParameter("RouteEntryId", routeEntryId);
            this.routeEntryId = routeEntryId;
            return this;
        }

        /**
         * RouteEntryName.
         */
        public Builder routeEntryName(String routeEntryName) {
            this.putQueryParameter("RouteEntryName", routeEntryName);
            this.routeEntryName = routeEntryName;
            return this;
        }

        @Override
        public ModifyEnsRouteEntryRequest build() {
            return new ModifyEnsRouteEntryRequest(this);
        } 

    } 

}
