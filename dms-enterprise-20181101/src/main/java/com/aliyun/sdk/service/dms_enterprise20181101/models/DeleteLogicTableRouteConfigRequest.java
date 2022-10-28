// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLogicTableRouteConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogicTableRouteConfigRequest</p>
 */
public class DeleteLogicTableRouteConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RouteKey")
    @Validation(required = true)
    private String routeKey;

    @Query
    @NameInMap("TableId")
    @Validation(required = true)
    private Long tableId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private DeleteLogicTableRouteConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.routeKey = builder.routeKey;
        this.tableId = builder.tableId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogicTableRouteConfigRequest create() {
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
     * @return routeKey
     */
    public String getRouteKey() {
        return this.routeKey;
    }

    /**
     * @return tableId
     */
    public Long getTableId() {
        return this.tableId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<DeleteLogicTableRouteConfigRequest, Builder> {
        private String regionId; 
        private String routeKey; 
        private Long tableId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogicTableRouteConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.routeKey = request.routeKey;
            this.tableId = request.tableId;
            this.tid = request.tid;
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
         * RouteKey.
         */
        public Builder routeKey(String routeKey) {
            this.putQueryParameter("RouteKey", routeKey);
            this.routeKey = routeKey;
            return this;
        }

        /**
         * TableId.
         */
        public Builder tableId(Long tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public DeleteLogicTableRouteConfigRequest build() {
            return new DeleteLogicTableRouteConfigRequest(this);
        } 

    } 

}
