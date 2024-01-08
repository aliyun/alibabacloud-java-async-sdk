// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReprotectDiskReplicaGroupRequest} extends {@link RequestModel}
 *
 * <p>ReprotectDiskReplicaGroupRequest</p>
 */
public class ReprotectDiskReplicaGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaGroupId")
    @Validation(required = true)
    private String replicaGroupId;

    @Query
    @NameInMap("ReverseReplicate")
    private Boolean reverseReplicate;

    private ReprotectDiskReplicaGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.replicaGroupId = builder.replicaGroupId;
        this.reverseReplicate = builder.reverseReplicate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReprotectDiskReplicaGroupRequest create() {
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

    /**
     * @return reverseReplicate
     */
    public Boolean getReverseReplicate() {
        return this.reverseReplicate;
    }

    public static final class Builder extends Request.Builder<ReprotectDiskReplicaGroupRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String replicaGroupId; 
        private Boolean reverseReplicate; 

        private Builder() {
            super();
        } 

        private Builder(ReprotectDiskReplicaGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.replicaGroupId = request.replicaGroupId;
            this.reverseReplicate = request.reverseReplicate;
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
         * The ID of the replication pair-consistent group. You can call the [DescribeDiskReplicaGroups](~~426614~~) operation to query the IDs of replication pair-consistent groups.
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

        /**
         * Specifies whether to enable the reverse replication sub-feature. Valid values: true and false. Default value: true.
         */
        public Builder reverseReplicate(Boolean reverseReplicate) {
            this.putQueryParameter("ReverseReplicate", reverseReplicate);
            this.reverseReplicate = reverseReplicate;
            return this;
        }

        @Override
        public ReprotectDiskReplicaGroupRequest build() {
            return new ReprotectDiskReplicaGroupRequest(this);
        } 

    } 

}
