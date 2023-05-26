// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateScenarioRequest} extends {@link RequestModel}
 *
 * <p>UpdateScenarioRequest</p>
 */
public class UpdateScenarioRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ScenarioId")
    @Validation(required = true)
    private String scenarioId;

    @Query
    @NameInMap("ScenarioName")
    @Validation(required = true)
    private String scenarioName;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private UpdateScenarioRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.scenarioId = builder.scenarioId;
        this.scenarioName = builder.scenarioName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScenarioRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return scenarioName
     */
    public String getScenarioName() {
        return this.scenarioName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateScenarioRequest, Builder> {
        private String regionId; 
        private String description; 
        private String scenarioId; 
        private String scenarioName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScenarioRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.scenarioId = request.scenarioId;
            this.scenarioName = request.scenarioName;
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
         * The description of the business scenario.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the business scenario.
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * The name of the business scenario.
         */
        public Builder scenarioName(String scenarioName) {
            this.putQueryParameter("ScenarioName", scenarioName);
            this.scenarioName = scenarioName;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > : To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateScenarioRequest build() {
            return new UpdateScenarioRequest(this);
        } 

    } 

}
