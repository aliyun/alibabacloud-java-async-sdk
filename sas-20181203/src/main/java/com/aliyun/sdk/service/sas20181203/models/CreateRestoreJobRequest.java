// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRestoreJobRequest} extends {@link RequestModel}
 *
 * <p>CreateRestoreJobRequest</p>
 */
public class CreateRestoreJobRequest extends Request {
    @Query
    @NameInMap("Includes")
    @Validation(required = true)
    private String includes;

    @Query
    @NameInMap("SnapshotHash")
    @Validation(required = true)
    private String snapshotHash;

    @Query
    @NameInMap("SnapshotId")
    @Validation(required = true)
    private String snapshotId;

    @Query
    @NameInMap("SnapshotVersion")
    @Validation(required = true)
    private String snapshotVersion;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("Target")
    @Validation(required = true)
    private String target;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    @Query
    @NameInMap("VaultId")
    @Validation(required = true)
    private String vaultId;

    private CreateRestoreJobRequest(Builder builder) {
        super(builder);
        this.includes = builder.includes;
        this.snapshotHash = builder.snapshotHash;
        this.snapshotId = builder.snapshotId;
        this.snapshotVersion = builder.snapshotVersion;
        this.sourceType = builder.sourceType;
        this.target = builder.target;
        this.uuid = builder.uuid;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRestoreJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includes
     */
    public String getIncludes() {
        return this.includes;
    }

    /**
     * @return snapshotHash
     */
    public String getSnapshotHash() {
        return this.snapshotHash;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return snapshotVersion
     */
    public String getSnapshotVersion() {
        return this.snapshotVersion;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<CreateRestoreJobRequest, Builder> {
        private String includes; 
        private String snapshotHash; 
        private String snapshotId; 
        private String snapshotVersion; 
        private String sourceType; 
        private String target; 
        private String uuid; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRestoreJobRequest request) {
            super(request);
            this.includes = request.includes;
            this.snapshotHash = request.snapshotHash;
            this.snapshotId = request.snapshotId;
            this.snapshotVersion = request.snapshotVersion;
            this.sourceType = request.sourceType;
            this.target = request.target;
            this.uuid = request.uuid;
            this.vaultId = request.vaultId;
        } 

        /**
         * The directory in which the files included in the restoration task are located. This parameter is specified when you create the anti-ransomware policy. The value is a directory that requires protection.
         */
        public Builder includes(String includes) {
            this.putQueryParameter("Includes", includes);
            this.includes = includes;
            return this;
        }

        /**
         * The hash value of the snapshot.
         * <p>
         * 
         * > You can call the [DescribeSnapshots](~~DescribeSnapshots~~) operation to obtain the value of this parameter.
         */
        public Builder snapshotHash(String snapshotHash) {
            this.putQueryParameter("SnapshotHash", snapshotHash);
            this.snapshotHash = snapshotHash;
            return this;
        }

        /**
         * The ID of the snapshot that you want to use for restoration.
         * <p>
         * 
         * > You can call the [DescribeSnapshots](~~DescribeSnapshots~~) operation to obtain the value of this parameter.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * The version of the backup data.
         * <p>
         * 
         * > You can call the [DescribeSnapshots](~~DescribeSnapshots~~) operation to obtain the value of this parameter.
         */
        public Builder snapshotVersion(String snapshotVersion) {
            this.putQueryParameter("SnapshotVersion", snapshotVersion);
            this.snapshotVersion = snapshotVersion;
            return this;
        }

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: backup snapshots for Elastic Compute Service (ECS) files
         * *   **File**: backup snapshots for on-premises servers
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * The path to which you want to restore data.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * The UUID of the server whose data you want to restore.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        /**
         * The ID of the backup vault that is used in the restoration task.
         * <p>
         * 
         * > You can call the [DescribeSnapshots](~~DescribeSnapshots~~) operation to obtain the value of this parameter.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public CreateRestoreJobRequest build() {
            return new CreateRestoreJobRequest(this);
        } 

    } 

}
