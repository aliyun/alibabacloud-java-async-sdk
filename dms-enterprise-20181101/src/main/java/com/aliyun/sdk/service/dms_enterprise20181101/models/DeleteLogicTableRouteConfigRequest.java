// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DeleteLogicTableRouteConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogicTableRouteConfigRequest</p>
 */
public class DeleteLogicTableRouteConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long tableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
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
         * <p>The unique key of the routing algorithm. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listlogictablerouteconfig">ListLogicTableRouteConfig</a> operation to query the unique key.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id-hash-mod15</p>
         */
        public Builder routeKey(String routeKey) {
            this.putQueryParameter("RouteKey", routeKey);
            this.routeKey = routeKey;
            return this;
        }

        /**
         * <p>The ID of the logical table. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listlogictables">ListLogicTables</a> operation to query the ID of the logical table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1****</p>
         */
        public Builder tableId(Long tableId) {
            this.putQueryParameter("TableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/getuseractivetenant">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
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
