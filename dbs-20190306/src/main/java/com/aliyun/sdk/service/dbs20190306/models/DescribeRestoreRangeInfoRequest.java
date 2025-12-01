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
 * {@link DescribeRestoreRangeInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeRestoreRangeInfoRequest</p>
 */
public class DescribeRestoreRangeInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTimestampForRestore")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTimestampForRestore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestampForRestore")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTimestampForRestore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecentlyRestore")
    private Boolean recentlyRestore;

    private DescribeRestoreRangeInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupPlanId = builder.backupPlanId;
        this.beginTimestampForRestore = builder.beginTimestampForRestore;
        this.clientToken = builder.clientToken;
        this.endTimestampForRestore = builder.endTimestampForRestore;
        this.ownerId = builder.ownerId;
        this.recentlyRestore = builder.recentlyRestore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreRangeInfoRequest create() {
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
     * @return beginTimestampForRestore
     */
    public Long getBeginTimestampForRestore() {
        return this.beginTimestampForRestore;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endTimestampForRestore
     */
    public Long getEndTimestampForRestore() {
        return this.endTimestampForRestore;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return recentlyRestore
     */
    public Boolean getRecentlyRestore() {
        return this.recentlyRestore;
    }

    public static final class Builder extends Request.Builder<DescribeRestoreRangeInfoRequest, Builder> {
        private String regionId; 
        private String backupPlanId; 
        private Long beginTimestampForRestore; 
        private String clientToken; 
        private Long endTimestampForRestore; 
        private String ownerId; 
        private Boolean recentlyRestore; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestoreRangeInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupPlanId = request.backupPlanId;
            this.beginTimestampForRestore = request.beginTimestampForRestore;
            this.clientToken = request.clientToken;
            this.endTimestampForRestore = request.endTimestampForRestore;
            this.ownerId = request.ownerId;
            this.recentlyRestore = request.recentlyRestore;
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
         * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain it.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbssl67c7mx****</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The earliest point in time to which you can restore data. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the value of the parameter for each backup schedule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1646674092000</p>
         */
        public Builder beginTimestampForRestore(Long beginTimestampForRestore) {
            this.putQueryParameter("BeginTimestampForRestore", beginTimestampForRestore);
            this.beginTimestampForRestore = beginTimestampForRestore;
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
         * <p>The latest point in time to which you can restore data. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the value of the parameter for each backup schedule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1646846814000</p>
         */
        public Builder endTimestampForRestore(Long endTimestampForRestore) {
            this.putQueryParameter("EndTimestampForRestore", endTimestampForRestore);
            this.endTimestampForRestore = endTimestampForRestore;
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
         * <p>Specifies whether to query the most recent point in time to which you can restore data.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder recentlyRestore(Boolean recentlyRestore) {
            this.putQueryParameter("RecentlyRestore", recentlyRestore);
            this.recentlyRestore = recentlyRestore;
            return this;
        }

        @Override
        public DescribeRestoreRangeInfoRequest build() {
            return new DescribeRestoreRangeInfoRequest(this);
        } 

    } 

}
