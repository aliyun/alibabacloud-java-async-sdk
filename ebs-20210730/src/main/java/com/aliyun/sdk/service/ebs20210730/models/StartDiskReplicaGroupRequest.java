// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to immediately synchronize data once. Valid values:</p>
         * <ul>
         * <li>true: immediately synchronizes data once.</li>
         * <li>false: synchronizes data based on the RPO of the replication pair-consistent group.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder oneShot(Boolean oneShot) {
            this.putQueryParameter("OneShot", oneShot);
            this.oneShot = oneShot;
            return this;
        }

        /**
         * <p>The ID of the replication pair-consistent group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the replication pair-consistent group. You can call the <a href="https://help.aliyun.com/document_detail/426614.html">DescribeDiskReplicaGroups</a> operation to query the IDs of replication pair-consistent groups.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-myreplica****</p>
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
