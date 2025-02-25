// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link StopExperimentRequest} extends {@link RequestModel}
 *
 * <p>StopExperimentRequest</p>
 */
public class StopExperimentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    private Long experimentId;

    private StopExperimentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.experimentId = builder.experimentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopExperimentRequest create() {
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
     * @return experimentId
     */
    public Long getExperimentId() {
        return this.experimentId;
    }

    public static final class Builder extends Request.Builder<StopExperimentRequest, Builder> {
        private String regionId; 
        private Long experimentId; 

        private Builder() {
            super();
        } 

        private Builder(StopExperimentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.experimentId = request.experimentId;
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
         * ExperimentId.
         */
        public Builder experimentId(Long experimentId) {
            this.putQueryParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        @Override
        public StopExperimentRequest build() {
            return new StopExperimentRequest(this);
        } 

    } 

}
