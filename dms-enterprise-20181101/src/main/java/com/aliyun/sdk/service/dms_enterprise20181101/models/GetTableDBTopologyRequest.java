// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableDBTopologyRequest} extends {@link RequestModel}
 *
 * <p>GetTableDBTopologyRequest</p>
 */
public class GetTableDBTopologyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetTableDBTopologyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tableGuid = builder.tableGuid;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableDBTopologyRequest create() {
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
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetTableDBTopologyRequest, Builder> {
        private String regionId; 
        private String tableGuid; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetTableDBTopologyRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.tableGuid = response.tableGuid;
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
         * TableGuid.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
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
        public GetTableDBTopologyRequest build() {
            return new GetTableDBTopologyRequest(this);
        } 

    } 

}
