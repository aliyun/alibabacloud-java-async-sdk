// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DeleteVaultReplicationRequest} extends {@link RequestModel}
 *
 * <p>DeleteVaultReplicationRequest</p>
 */
public class DeleteVaultReplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationSourceRegionId")
    private String replicationSourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationSourceVaultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String replicationSourceVaultId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationTargetVaultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String replicationTargetVaultId;

    private DeleteVaultReplicationRequest(Builder builder) {
        super(builder);
        this.replicationSourceRegionId = builder.replicationSourceRegionId;
        this.replicationSourceVaultId = builder.replicationSourceVaultId;
        this.replicationTargetVaultId = builder.replicationTargetVaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVaultReplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return replicationSourceRegionId
     */
    public String getReplicationSourceRegionId() {
        return this.replicationSourceRegionId;
    }

    /**
     * @return replicationSourceVaultId
     */
    public String getReplicationSourceVaultId() {
        return this.replicationSourceVaultId;
    }

    /**
     * @return replicationTargetVaultId
     */
    public String getReplicationTargetVaultId() {
        return this.replicationTargetVaultId;
    }

    public static final class Builder extends Request.Builder<DeleteVaultReplicationRequest, Builder> {
        private String replicationSourceRegionId; 
        private String replicationSourceVaultId; 
        private String replicationTargetVaultId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVaultReplicationRequest request) {
            super(request);
            this.replicationSourceRegionId = request.replicationSourceRegionId;
            this.replicationSourceVaultId = request.replicationSourceVaultId;
            this.replicationTargetVaultId = request.replicationTargetVaultId;
        } 

        /**
         * ReplicationSourceRegionId.
         */
        public Builder replicationSourceRegionId(String replicationSourceRegionId) {
            this.putQueryParameter("ReplicationSourceRegionId", replicationSourceRegionId);
            this.replicationSourceRegionId = replicationSourceRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v-*********************</p>
         */
        public Builder replicationSourceVaultId(String replicationSourceVaultId) {
            this.putQueryParameter("ReplicationSourceVaultId", replicationSourceVaultId);
            this.replicationSourceVaultId = replicationSourceVaultId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-*********************</p>
         */
        public Builder replicationTargetVaultId(String replicationTargetVaultId) {
            this.putQueryParameter("ReplicationTargetVaultId", replicationTargetVaultId);
            this.replicationTargetVaultId = replicationTargetVaultId;
            return this;
        }

        @Override
        public DeleteVaultReplicationRequest build() {
            return new DeleteVaultReplicationRequest(this);
        } 

    } 

}
