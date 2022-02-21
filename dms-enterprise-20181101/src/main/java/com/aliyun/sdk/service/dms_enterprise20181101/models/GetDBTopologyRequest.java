// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDBTopologyRequest} extends {@link RequestModel}
 *
 * <p>GetDBTopologyRequest</p>
 */
public class GetDBTopologyRequest extends Request {
    @Query
    @NameInMap("LogicDbId")
    @Validation(required = true, minimum = 1)
    private Long logicDbId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetDBTopologyRequest(Builder builder) {
        super(builder);
        this.logicDbId = builder.logicDbId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBTopologyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logicDbId
     */
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetDBTopologyRequest, Builder> {
        private Long logicDbId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetDBTopologyRequest response) {
            super(response);
            this.logicDbId = response.logicDbId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * LogicDbId.
         */
        public Builder logicDbId(Long logicDbId) {
            this.putQueryParameter("LogicDbId", logicDbId);
            this.logicDbId = logicDbId;
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
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetDBTopologyRequest build() {
            return new GetDBTopologyRequest(this);
        } 

    } 

}
