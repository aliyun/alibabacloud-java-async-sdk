// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEndpointGroupsRequest} extends {@link RequestModel}
 *
 * <p>DeleteEndpointGroupsRequest</p>
 */
public class DeleteEndpointGroupsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EndpointGroupIds")
    @Validation(required = true)
    private java.util.List < String > endpointGroupIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteEndpointGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.endpointGroupIds = builder.endpointGroupIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEndpointGroupsRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpointGroupIds
     */
    public java.util.List < String > getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteEndpointGroupsRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < String > endpointGroupIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEndpointGroupsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.endpointGroupIds = response.endpointGroupIds;
            this.regionId = response.regionId;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EndpointGroupIds.
         */
        public Builder endpointGroupIds(java.util.List < String > endpointGroupIds) {
            this.putQueryParameter("EndpointGroupIds", endpointGroupIds);
            this.endpointGroupIds = endpointGroupIds;
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
        public DeleteEndpointGroupsRequest build() {
            return new DeleteEndpointGroupsRequest(this);
        } 

    } 

}
