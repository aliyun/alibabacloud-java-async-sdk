// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLogicTableRouteConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLogicTableRouteConfigRequest</p>
 */
public class AddLogicTableRouteConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RouteExpr")
    @Validation(required = true)
    private String routeExpr;

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

    private AddLogicTableRouteConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.routeExpr = builder.routeExpr;
        this.routeKey = builder.routeKey;
        this.tableId = builder.tableId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLogicTableRouteConfigRequest create() {
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
     * @return routeExpr
     */
    public String getRouteExpr() {
        return this.routeExpr;
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

    public static final class Builder extends Request.Builder<AddLogicTableRouteConfigRequest, Builder> {
        private String regionId; 
        private String routeExpr; 
        private String routeKey; 
        private Long tableId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(AddLogicTableRouteConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.routeExpr = request.routeExpr;
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
         * The routing algorithm expression. For more information about how to configure a routing algorithm expression, see [Configure a routing algorithm](https://www.alibabacloud.com/help/en/data-management-service/latest/configure-a-routing-algorithm).
         */
        public Builder routeExpr(String routeExpr) {
            this.putQueryParameter("RouteExpr", routeExpr);
            this.routeExpr = routeExpr;
            return this;
        }

        /**
         * The unique key of the routing algorithm. 
         * <p>
         * 
         * > - You can create a custom unique key for the routing algorithm. No requirements are imposed on custom unique keys.
         * - The unique key of the routing algorithm in the same logical table must be unique.
         */
        public Builder routeKey(String routeKey) {
            this.putQueryParameter("RouteKey", routeKey);
            this.routeKey = routeKey;
            return this;
        }

        /**
         * The ID of the logical table. You can call the [ListLogicTables](https://www.alibabacloud.com/help/en/data-management-service/latest/listlogictables) operation to query the ID of the logical table.
         */
        public Builder tableId(Long tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public AddLogicTableRouteConfigRequest build() {
            return new AddLogicTableRouteConfigRequest(this);
        } 

    } 

}
