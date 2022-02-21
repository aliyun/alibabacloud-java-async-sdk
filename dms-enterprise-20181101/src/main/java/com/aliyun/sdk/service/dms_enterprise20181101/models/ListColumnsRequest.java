// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListColumnsRequest} extends {@link RequestModel}
 *
 * <p>ListColumnsRequest</p>
 */
public class ListColumnsRequest extends Request {
    @Query
    @NameInMap("Logic")
    private Boolean logic;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TableId")
    @Validation(required = true)
    private String tableId;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private ListColumnsRequest(Builder builder) {
        super(builder);
        this.logic = builder.logic;
        this.regionId = builder.regionId;
        this.tableId = builder.tableId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListColumnsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
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
    public String getTableId() {
        return this.tableId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListColumnsRequest, Builder> {
        private Boolean logic; 
        private String regionId; 
        private String tableId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListColumnsRequest response) {
            super(response);
            this.logic = response.logic;
            this.regionId = response.regionId;
            this.tableId = response.tableId;
            this.tid = response.tid;
        } 

        /**
         * Logic.
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
            return this;
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
        public Builder tableId(String tableId) {
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
        public ListColumnsRequest build() {
            return new ListColumnsRequest(this);
        } 

    } 

}
