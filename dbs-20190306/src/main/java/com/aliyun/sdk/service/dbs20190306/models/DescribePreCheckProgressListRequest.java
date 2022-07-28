// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreCheckProgressListRequest} extends {@link RequestModel}
 *
 * <p>DescribePreCheckProgressListRequest</p>
 */
public class DescribePreCheckProgressListRequest extends Request {
    @Query
    @NameInMap("BackupPlanId")
    private String backupPlanId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RestoreTaskId")
    private String restoreTaskId;

    private DescribePreCheckProgressListRequest(Builder builder) {
        super(builder);
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.restoreTaskId = builder.restoreTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePreCheckProgressListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return restoreTaskId
     */
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

    public static final class Builder extends Request.Builder<DescribePreCheckProgressListRequest, Builder> {
        private String backupPlanId; 
        private String clientToken; 
        private String ownerId; 
        private String regionId; 
        private String restoreTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePreCheckProgressListRequest request) {
            super(request);
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.restoreTaskId = request.restoreTaskId;
        } 

        /**
         * BackupPlanId.
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RestoreTaskId.
         */
        public Builder restoreTaskId(String restoreTaskId) {
            this.putQueryParameter("RestoreTaskId", restoreTaskId);
            this.restoreTaskId = restoreTaskId;
            return this;
        }

        @Override
        public DescribePreCheckProgressListRequest build() {
            return new DescribePreCheckProgressListRequest(this);
        } 

    } 

}
