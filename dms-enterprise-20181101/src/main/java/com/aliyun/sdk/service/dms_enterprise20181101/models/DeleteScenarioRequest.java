// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScenarioRequest} extends {@link RequestModel}
 *
 * <p>DeleteScenarioRequest</p>
 */
public class DeleteScenarioRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long scenarioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private DeleteScenarioRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.scenarioId = builder.scenarioId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScenarioRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteScenarioRequest, Builder> {
        private String regionId; 
        private Long scenarioId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScenarioRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * The ID of the business scenario.
         */
        public Builder scenarioId(Long scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public DeleteScenarioRequest build() {
            return new DeleteScenarioRequest(this);
        } 

    } 

}
