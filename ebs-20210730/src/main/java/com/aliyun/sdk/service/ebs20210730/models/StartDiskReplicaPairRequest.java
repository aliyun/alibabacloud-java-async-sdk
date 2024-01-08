// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDiskReplicaPairRequest} extends {@link RequestModel}
 *
 * <p>StartDiskReplicaPairRequest</p>
 */
public class StartDiskReplicaPairRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OneShot")
    private Boolean oneShot;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaPairId")
    @Validation(required = true)
    private String replicaPairId;

    private StartDiskReplicaPairRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.oneShot = builder.oneShot;
        this.regionId = builder.regionId;
        this.replicaPairId = builder.replicaPairId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDiskReplicaPairRequest create() {
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
     * @return oneShot
     */
    public Boolean getOneShot() {
        return this.oneShot;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicaPairId
     */
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

    public static final class Builder extends Request.Builder<StartDiskReplicaPairRequest, Builder> {
        private String clientToken; 
        private Boolean oneShot; 
        private String regionId; 
        private String replicaPairId; 

        private Builder() {
            super();
        } 

        private Builder(StartDiskReplicaPairRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.oneShot = request.oneShot;
            this.regionId = request.regionId;
            this.replicaPairId = request.replicaPairId;
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
         * Specifies whether to immediately synchronize data. Valid values:
         * <p>
         * 
         * *   true: immediately synchronizes data.
         * *   false: synchronizes data based on the recovery point objective (RPO).
         * 
         * Default value: false.
         */
        public Builder oneShot(Boolean oneShot) {
            this.putQueryParameter("OneShot", oneShot);
            this.oneShot = oneShot;
            return this;
        }

        /**
         * The region ID of the primary or secondary disk in the replication pair. You can call the [DescribeDiskReplicaPairs](~~354206~~) operation to query the region information of replication pairs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the replication pair.
         */
        public Builder replicaPairId(String replicaPairId) {
            this.putQueryParameter("ReplicaPairId", replicaPairId);
            this.replicaPairId = replicaPairId;
            return this;
        }

        @Override
        public StartDiskReplicaPairRequest build() {
            return new StartDiskReplicaPairRequest(this);
        } 

    } 

}
