// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPairDrillRequest} extends {@link RequestModel}
 *
 * <p>StartPairDrillRequest</p>
 */
public class StartPairDrillRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("PairId")
    @Validation(required = true)
    private String pairId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private StartPairDrillRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.pairId = builder.pairId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPairDrillRequest create() {
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
     * @return pairId
     */
    public String getPairId() {
        return this.pairId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartPairDrillRequest, Builder> {
        private String clientToken; 
        private String pairId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartPairDrillRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.pairId = request.pairId;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the replication pair. You can call the [DescribeDiskReplicaPairs](~~354206~~) operation to query a list of replication pairs, including replication pair IDs.
         */
        public Builder pairId(String pairId) {
            this.putQueryParameter("PairId", pairId);
            this.pairId = pairId;
            return this;
        }

        /**
         * The region ID of the secondary disk in the replication pair. You can call the [DescribeDiskReplicaPairs](~~354206~~) operation to query the region in which the secondary disk of the replication pair resides.
         * <p>
         * 
         * >  You must enable the disaster recovery drill feature in the region in which the secondary site resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StartPairDrillRequest build() {
            return new StartPairDrillRequest(this);
        } 

    } 

}
