// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogicTableRouteConfigRequest} extends {@link RequestModel}
 *
 * <p>ListLogicTableRouteConfigRequest</p>
 */
public class ListLogicTableRouteConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TableId")
    @Validation(required = true)
    private Long tableId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
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

        private Builder(ListLogicTableRouteConfigRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.tableId = response.tableId;
            this.tid = response.tid;
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
        public ListLogicTableRouteConfigRequest build() {
            return new ListLogicTableRouteConfigRequest(this);
        } 

    } 

}
