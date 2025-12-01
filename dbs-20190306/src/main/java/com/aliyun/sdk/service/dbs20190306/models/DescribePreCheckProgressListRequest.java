// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link DescribePreCheckProgressListRequest} extends {@link RequestModel}
 *
 * <p>DescribePreCheckProgressListRequest</p>
 */
public class DescribePreCheckProgressListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTaskId")
    private String restoreTaskId;

    private DescribePreCheckProgressListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return restoreTaskId
     */
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

    public static final class Builder extends Request.Builder<DescribePreCheckProgressListRequest, Builder> {
        private String regionId; 
        private String backupPlanId; 
        private String clientToken; 
        private String ownerId; 
        private String restoreTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePreCheckProgressListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.restoreTaskId = request.restoreTaskId;
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
         * <p>The backup schedule ID.</p>
         * <blockquote>
         * <p> You must specify one of BackupPlanId and RestoreTaskId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dbstooi01XXXX</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
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
         * <p>The restoration task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dbasdsaXXXX</p>
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
