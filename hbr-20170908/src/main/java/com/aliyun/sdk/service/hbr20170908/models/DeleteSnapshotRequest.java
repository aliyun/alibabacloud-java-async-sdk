// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnapshotRequest</p>
 */
public class DeleteSnapshotRequest extends Request {
    @Query
    @NameInMap("ClientId")
    private String clientId;

    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private String snapshotId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("Token")
    private String token;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private DeleteSnapshotRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.force = builder.force;
        this.instanceId = builder.instanceId;
        this.snapshotId = builder.snapshotId;
        this.sourceType = builder.sourceType;
        this.token = builder.token;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<DeleteSnapshotRequest, Builder> {
        private String clientId; 
        private Boolean force; 
        private String instanceId; 
        private String snapshotId; 
        private String sourceType; 
        private String token; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnapshotRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.force = request.force;
            this.instanceId = request.instanceId;
            this.snapshotId = request.snapshotId;
            this.sourceType = request.sourceType;
            this.token = request.token;
            this.vaultId = request.vaultId;
        } 

        /**
         * The ID of the backup client. If you delete a backup file for Elastic Compute Service (ECS) instances, you must set one of the **InstanceId** and ClientId parameters.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * Specifies whether to forcibly delete the most recent backup file. Valid values:
         * <p>
         * 
         * *   true: The system forcibly deletes the last backup file.
         * *   false: The system does not forcibly delete the last backup file. Default value: false.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The ID of the ECS instance. If you delete a backup file for Elastic Compute Service (ECS) instances, you must set one of the **ClientId** and InstanceId parameters.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the backup file.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The type of the backup source. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: indicates backup files for ECS instances.
         * *   **OSS**: indicates backup files for Object Storage Service (OSS) buckets.
         * *   **NAS**: indicates the backup files for Apsara File Storage NAS file systems.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * The ID of the backup vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public DeleteSnapshotRequest build() {
            return new DeleteSnapshotRequest(this);
        } 

    } 

}
