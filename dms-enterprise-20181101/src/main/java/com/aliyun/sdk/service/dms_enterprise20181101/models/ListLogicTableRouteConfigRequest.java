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
 * {@link ListLogicTableRouteConfigRequest} extends {@link RequestModel}
 *
 * <p>ListLogicTableRouteConfigRequest</p>
 */
public class ListLogicTableRouteConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long tableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListLogicTableRouteConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tableId = builder.tableId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogicTableRouteConfigRequest create() {
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

    public static final class Builder extends Request.Builder<ListLogicTableRouteConfigRequest, Builder> {
        private String regionId; 
        private Long tableId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListLogicTableRouteConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public ListLogicTableRouteConfigRequest build() {
            return new ListLogicTableRouteConfigRequest(this);
        } 

    } 

}
