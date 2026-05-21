// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link BindLeaderInstanceRequest} extends {@link RequestModel}
 *
 * <p>BindLeaderInstanceRequest</p>
 */
public class BindLeaderInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("leaderInstanceId")
    private String leaderInstanceId;

    private BindLeaderInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.leaderInstanceId = builder.leaderInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindLeaderInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return leaderInstanceId
     */
    public String getLeaderInstanceId() {
        return this.leaderInstanceId;
    }

    public static final class Builder extends Request.Builder<BindLeaderInstanceRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String leaderInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BindLeaderInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.leaderInstanceId = request.leaderInstanceId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * leaderInstanceId.
         */
        public Builder leaderInstanceId(String leaderInstanceId) {
            this.putBodyParameter("leaderInstanceId", leaderInstanceId);
            this.leaderInstanceId = leaderInstanceId;
            return this;
        }

        @Override
        public BindLeaderInstanceRequest build() {
            return new BindLeaderInstanceRequest(this);
        } 

    } 

}
