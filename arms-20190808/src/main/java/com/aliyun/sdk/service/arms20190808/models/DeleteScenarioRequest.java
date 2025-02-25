// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteScenarioRequest} extends {@link RequestModel}
 *
 * <p>DeleteScenarioRequest</p>
 */
public class DeleteScenarioRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long scenarioId;

    private DeleteScenarioRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.scenarioId = builder.scenarioId;
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

    public static final class Builder extends Request.Builder<DeleteScenarioRequest, Builder> {
        private String regionId; 
        private Long scenarioId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScenarioRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.scenarioId = request.scenarioId;
        } 

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjaikou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the business monitoring job. You can obtain the ID by calling the ListScenario operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder scenarioId(Long scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        @Override
        public DeleteScenarioRequest build() {
            return new DeleteScenarioRequest(this);
        } 

    } 

}
