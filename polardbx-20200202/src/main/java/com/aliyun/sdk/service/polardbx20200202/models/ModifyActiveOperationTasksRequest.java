// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActiveOperationTasksRequest} extends {@link RequestModel}
 *
 * <p>ModifyActiveOperationTasksRequest</p>
 */
public class ModifyActiveOperationTasksRequest extends Request {
    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private String ids;

    @Query
    @NameInMap("ImmediateStart")
    private Long immediateStart;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SwitchTime")
    private String switchTime;

    private ModifyActiveOperationTasksRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.immediateStart = builder.immediateStart;
        this.regionId = builder.regionId;
        this.switchTime = builder.switchTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActiveOperationTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return immediateStart
     */
    public Long getImmediateStart() {
        return this.immediateStart;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    public static final class Builder extends Request.Builder<ModifyActiveOperationTasksRequest, Builder> {
        private String ids; 
        private Long immediateStart; 
        private String regionId; 
        private String switchTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyActiveOperationTasksRequest request) {
            super(request);
            this.ids = request.ids;
            this.immediateStart = request.immediateStart;
            this.regionId = request.regionId;
            this.switchTime = request.switchTime;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * ImmediateStart.
         */
        public Builder immediateStart(Long immediateStart) {
            this.putQueryParameter("ImmediateStart", immediateStart);
            this.immediateStart = immediateStart;
            return this;
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
         * SwitchTime.
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        @Override
        public ModifyActiveOperationTasksRequest build() {
            return new ModifyActiveOperationTasksRequest(this);
        } 

    } 

}
