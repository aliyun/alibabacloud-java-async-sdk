// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReprotectDiskReplicaGroupRequest} extends {@link RequestModel}
 *
 * <p>ReprotectDiskReplicaGroupRequest</p>
 */
public class ReprotectDiskReplicaGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicaGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String replicaGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReverseReplicate")
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
         * <p>The ID of the replication pair-consistent group. You can call the <a href="https://help.aliyun.com/document_detail/426614.html">DescribeDiskReplicaGroups</a> operation to query the IDs of replication pair-consistent groups.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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

        /**
         * <p>Specifies whether to enable the reverse replication sub-feature. Valid values: true and false. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
