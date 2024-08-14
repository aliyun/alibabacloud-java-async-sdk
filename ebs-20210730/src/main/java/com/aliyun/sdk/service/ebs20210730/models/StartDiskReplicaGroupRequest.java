// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDiskReplicaGroupRequest} extends {@link RequestModel}
 *
 * <p>StartDiskReplicaGroupRequest</p>
 */
public class StartDiskReplicaGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OneShot")
    private Boolean oneShot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicaGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String replicaGroupId;

    private StartDiskReplicaGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.oneShot = builder.oneShot;
        this.regionId = builder.regionId;
        this.replicaGroupId = builder.replicaGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDiskReplicaGroupRequest create() {
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
     * @return replicaGroupId
     */
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    public static final class Builder extends Request.Builder<StartDiskReplicaGroupRequest, Builder> {
        private String clientToken; 
        private Boolean oneShot; 
        private String regionId; 
        private String replicaGroupId; 

        private Builder() {
            super();
        } 

        private Builder(StartDiskReplicaGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.oneShot = request.oneShot;
            this.regionId = request.regionId;
            this.replicaGroupId = request.replicaGroupId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to immediately synchronize data once. Valid values:
         * <p>
         * 
         * *   true: immediately synchronizes data once.
         * *   false: synchronizes data based on the RPO of the replication pair-consistent group.
         * 
         * Default value: false.
         */
        public Builder oneShot(Boolean oneShot) {
            this.putQueryParameter("OneShot", oneShot);
            this.oneShot = oneShot;
            return this;
        }

        /**
         * The ID of the replication pair-consistent group.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the replication pair-consistent group. You can call the [DescribeDiskReplicaGroups](~~426614~~) operation to query the IDs of replication pair-consistent groups.
         */
        public Builder replicaGroupId(String replicaGroupId) {
            this.putQueryParameter("ReplicaGroupId", replicaGroupId);
            this.replicaGroupId = replicaGroupId;
            return this;
        }

        @Override
        public StartDiskReplicaGroupRequest build() {
            return new StartDiskReplicaGroupRequest(this);
        } 

    } 

}
