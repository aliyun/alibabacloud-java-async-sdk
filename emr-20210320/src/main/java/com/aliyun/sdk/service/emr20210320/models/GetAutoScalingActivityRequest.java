// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link GetAutoScalingActivityRequest} extends {@link RequestModel}
 *
 * <p>GetAutoScalingActivityRequest</p>
 */
public class GetAutoScalingActivityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingActivityId;

    private GetAutoScalingActivityRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoScalingActivityRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static final class Builder extends Request.Builder<GetAutoScalingActivityRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String scalingActivityId; 

        private Builder() {
            super();
        } 

        private Builder(GetAutoScalingActivityRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.scalingActivityId = request.scalingActivityId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the scaling activity.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-36373b084d6b4b13aa50f4129a9e****</p>
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.putQueryParameter("ScalingActivityId", scalingActivityId);
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        @Override
        public GetAutoScalingActivityRequest build() {
            return new GetAutoScalingActivityRequest(this);
        } 

    } 

}
