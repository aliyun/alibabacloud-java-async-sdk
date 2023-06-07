// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootInstancesRequest} extends {@link RequestModel}
 *
 * <p>RebootInstancesRequest</p>
 */
public class RebootInstancesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ForceReboot")
    private Boolean forceReboot;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private RebootInstancesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.forceReboot = builder.forceReboot;
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootInstancesRequest create() {
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
     * @return forceReboot
     */
    public Boolean getForceReboot() {
        return this.forceReboot;
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

    public static final class Builder extends Request.Builder<RebootInstancesRequest, Builder> {
        private String clientToken; 
        private Boolean forceReboot; 
        private String instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RebootInstancesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.forceReboot = request.forceReboot;
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
         * ForceReboot.
         */
        public Builder forceReboot(Boolean forceReboot) {
            this.putQueryParameter("ForceReboot", forceReboot);
            this.forceReboot = forceReboot;
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
        public RebootInstancesRequest build() {
            return new RebootInstancesRequest(this);
        } 

    } 

}
