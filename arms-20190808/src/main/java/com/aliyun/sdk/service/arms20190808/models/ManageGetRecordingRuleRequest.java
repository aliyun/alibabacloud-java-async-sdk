// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageGetRecordingRuleRequest} extends {@link RequestModel}
 *
 * <p>ManageGetRecordingRuleRequest</p>
 */
public class ManageGetRecordingRuleRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("QueryUserId")
    @Validation(required = true)
    private String queryUserId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ManageGetRecordingRuleRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.queryUserId = builder.queryUserId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageGetRecordingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return queryUserId
     */
    public String getQueryUserId() {
        return this.queryUserId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ManageGetRecordingRuleRequest, Builder> {
        private String clusterId; 
        private String queryUserId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ManageGetRecordingRuleRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.queryUserId = request.queryUserId;
            this.regionId = request.regionId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The user ID.
         */
        public Builder queryUserId(String queryUserId) {
            this.putQueryParameter("QueryUserId", queryUserId);
            this.queryUserId = queryUserId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ManageGetRecordingRuleRequest build() {
            return new ManageGetRecordingRuleRequest(this);
        } 

    } 

}
