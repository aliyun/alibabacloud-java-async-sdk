// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartReplicaGroupDrillRequest} extends {@link RequestModel}
 *
 * <p>StartReplicaGroupDrillRequest</p>
 */
public class StartReplicaGroupDrillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private StartReplicaGroupDrillRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.groupId = builder.groupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartReplicaGroupDrillRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartReplicaGroupDrillRequest, Builder> {
        private String clientToken; 
        private String groupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartReplicaGroupDrillRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.groupId = request.groupId;
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
         * The ID of the replication pair-consistent group ID. You can call the [DescribeDiskReplicaGroups](~~426614~~) operation the most recent list of async replication pair-consistent groups, including group IDs.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the region where the secondary site in the replication pair-consistent group is located. You can call the [DescribeDiskReplicaGroups](~~426614~~) operation to query the region where the secondary site in the replication pair-consistent group is located.
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
        public StartReplicaGroupDrillRequest build() {
            return new StartReplicaGroupDrillRequest(this);
        } 

    } 

}
