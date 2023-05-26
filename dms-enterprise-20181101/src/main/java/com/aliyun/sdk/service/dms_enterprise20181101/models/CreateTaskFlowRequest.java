// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskFlowRequest</p>
 */
public class CreateTaskFlowRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DagName")
    @Validation(required = true)
    private String dagName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ScenarioId")
    private Long scenarioId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private CreateTaskFlowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagName = builder.dagName;
        this.description = builder.description;
        this.scenarioId = builder.scenarioId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskFlowRequest create() {
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
     * @return dagName
     */
    public String getDagName() {
        return this.dagName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return scenarioId
     */
    public Long getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateTaskFlowRequest, Builder> {
        private String regionId; 
        private String dagName; 
        private String description; 
        private Long scenarioId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskFlowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagName = request.dagName;
            this.description = request.description;
            this.scenarioId = request.scenarioId;
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
         * The name of the task flow.
         */
        public Builder dagName(String dagName) {
            this.putQueryParameter("DagName", dagName);
            this.dagName = dagName;
            return this;
        }

        /**
         * The description of the task flow.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the scenario.
         */
        public Builder scenarioId(Long scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateTaskFlowRequest build() {
            return new CreateTaskFlowRequest(this);
        } 

    } 

}
