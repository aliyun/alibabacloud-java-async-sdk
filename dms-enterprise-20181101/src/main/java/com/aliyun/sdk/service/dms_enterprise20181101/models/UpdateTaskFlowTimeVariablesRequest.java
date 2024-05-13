// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowTimeVariablesRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskFlowTimeVariablesRequest</p>
 */
public class UpdateTaskFlowTimeVariablesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeVariables")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeVariables;

    private UpdateTaskFlowTimeVariablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.tid = builder.tid;
        this.timeVariables = builder.timeVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskFlowTimeVariablesRequest create() {
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return timeVariables
     */
    public String getTimeVariables() {
        return this.timeVariables;
    }

    public static final class Builder extends Request.Builder<UpdateTaskFlowTimeVariablesRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Long tid; 
        private String timeVariables; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskFlowTimeVariablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.tid = request.tid;
            this.timeVariables = request.timeVariables;
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
         * The ID of the task node. You can call the [GetTaskInstanceRelation](~~424711~~) operation to query the node ID.
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

        /**
         * The time variables for the task flow.
         */
        public Builder timeVariables(String timeVariables) {
            this.putQueryParameter("TimeVariables", timeVariables);
            this.timeVariables = timeVariables;
            return this;
        }

        @Override
        public UpdateTaskFlowTimeVariablesRequest build() {
            return new UpdateTaskFlowTimeVariablesRequest(this);
        } 

    } 

}
