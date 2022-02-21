// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskReplicaGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskReplicaGroupRequest</p>
 */
public class ModifyDiskReplicaGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("RPO")
    private Long RPO;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaGroupId")
    @Validation(required = true)
    private String replicaGroupId;

    private ModifyDiskReplicaGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.RPO = builder.RPO;
        this.regionId = builder.regionId;
        this.replicaGroupId = builder.replicaGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskReplicaGroupRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return RPO
     */
    public Long getRPO() {
        return this.RPO;
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

    public static final class Builder extends Request.Builder<ModifyDiskReplicaGroupRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String groupName; 
        private Long RPO; 
        private String regionId; 
        private String replicaGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskReplicaGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.groupName = response.groupName;
            this.RPO = response.RPO;
            this.regionId = response.regionId;
            this.replicaGroupId = response.replicaGroupId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * RPO.
         */
        public Builder RPO(Long RPO) {
            this.putQueryParameter("RPO", RPO);
            this.RPO = RPO;
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
         * ReplicaGroupId.
         */
        public Builder replicaGroupId(String replicaGroupId) {
            this.putQueryParameter("ReplicaGroupId", replicaGroupId);
            this.replicaGroupId = replicaGroupId;
            return this;
        }

        @Override
        public ModifyDiskReplicaGroupRequest build() {
            return new ModifyDiskReplicaGroupRequest(this);
        } 

    } 

}
