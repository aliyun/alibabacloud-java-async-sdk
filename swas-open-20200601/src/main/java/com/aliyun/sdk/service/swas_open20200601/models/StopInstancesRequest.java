// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInstancesRequest} extends {@link RequestModel}
 *
 * <p>StopInstancesRequest</p>
 */
public class StopInstancesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ForceStop")
    private Boolean forceStop;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private StopInstancesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.forceStop = builder.forceStop;
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return forceStop
     */
    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopInstancesRequest, Builder> {
        private String clientToken; 
        private Boolean forceStop; 
        private String instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopInstancesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.forceStop = request.forceStop;
            this.instanceIds = request.instanceIds;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ForceStop.
         */
        public Builder forceStop(Boolean forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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

        @Override
        public StopInstancesRequest build() {
            return new StopInstancesRequest(this);
        } 

    } 

}
