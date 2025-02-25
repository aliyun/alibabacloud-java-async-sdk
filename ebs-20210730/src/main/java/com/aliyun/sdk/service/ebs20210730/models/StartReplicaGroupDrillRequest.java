// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The ID of the replication pair-consistent group ID. You can call the <a href="https://help.aliyun.com/document_detail/426614.html">DescribeDiskReplicaGroups</a> operation the most recent list of async replication pair-consistent groups, including group IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxx</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the region where the secondary site in the replication pair-consistent group is located. You can call the <a href="https://help.aliyun.com/document_detail/426614.html">DescribeDiskReplicaGroups</a> operation to query the region where the secondary site in the replication pair-consistent group is located.</p>
         * <blockquote>
         * <p> You must enable the disaster recovery drill feature in the region in which the secondary site resides.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
