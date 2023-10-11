// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartReplicaGroupDrillRequest} extends {@link RequestModel}
 *
 * <p>StartReplicaGroupDrillRequest</p>
 */
public class StartReplicaGroupDrillRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
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
        public StartReplicaGroupDrillRequest build() {
            return new StartReplicaGroupDrillRequest(this);
        } 

    } 

}
