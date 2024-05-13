// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowCooperatorsRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowCooperatorsRequest</p>
 */
public class UpdateTaskFlowCooperatorsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CooperatorIds")
    private java.util.List < String > cooperatorIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private UpdateTaskFlowCooperatorsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cooperatorIds = builder.cooperatorIds;
        this.dagId = builder.dagId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskFlowCooperatorsRequest create() {
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
     * @return cooperatorIds
     */
    public java.util.List < String > getCooperatorIds() {
        return this.cooperatorIds;
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateTaskFlowCooperatorsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > cooperatorIds; 
        private Long dagId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskFlowCooperatorsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cooperatorIds = request.cooperatorIds;
            this.dagId = request.dagId;
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
         * The IDs of the users who are involved in the task flow to be updated.
         */
        public Builder cooperatorIds(java.util.List < String > cooperatorIds) {
            String cooperatorIdsShrink = shrink(cooperatorIds, "CooperatorIds", "json");
            this.putQueryParameter("CooperatorIds", cooperatorIdsShrink);
            this.cooperatorIds = cooperatorIds;
            return this;
        }

        /**
         * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > :To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateTaskFlowCooperatorsRequest build() {
            return new UpdateTaskFlowCooperatorsRequest(this);
        } 

    } 

}
