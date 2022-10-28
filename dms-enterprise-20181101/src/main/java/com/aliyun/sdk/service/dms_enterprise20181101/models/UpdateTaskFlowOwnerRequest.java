// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowOwnerRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowOwnerRequest</p>
 */
public class UpdateTaskFlowOwnerRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("NewOwnerId")
    @Validation(required = true)
    private String newOwnerId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private UpdateTaskFlowOwnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.newOwnerId = builder.newOwnerId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskFlowOwnerRequest create() {
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
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return newOwnerId
     */
    public String getNewOwnerId() {
        return this.newOwnerId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateTaskFlowOwnerRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private String newOwnerId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskFlowOwnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.newOwnerId = request.newOwnerId;
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
         * DagId.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * NewOwnerId.
         */
        public Builder newOwnerId(String newOwnerId) {
            this.putQueryParameter("NewOwnerId", newOwnerId);
            this.newOwnerId = newOwnerId;
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
        public UpdateTaskFlowOwnerRequest build() {
            return new UpdateTaskFlowOwnerRequest(this);
        } 

    } 

}
