// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeBackupLogDownloadLinksRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupLogDownloadLinksRequest</p>
 */
public class DescribeBackupLogDownloadLinksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupLogIds")
    private String backupLogIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireHours")
    private Integer expireHours;

    private DescribeBackupLogDownloadLinksRequest(Builder builder) {
        super(builder);
        this.backupLogIds = builder.backupLogIds;
        this.DBClusterId = builder.DBClusterId;
        this.expireHours = builder.expireHours;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupLogDownloadLinksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupLogIds
     */
    public String getBackupLogIds() {
        return this.backupLogIds;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return expireHours
     */
    public Integer getExpireHours() {
        return this.expireHours;
    }

    public static final class Builder extends Request.Builder<DescribeBackupLogDownloadLinksRequest, Builder> {
        private String backupLogIds; 
        private String DBClusterId; 
        private Integer expireHours; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupLogDownloadLinksRequest request) {
            super(request);
            this.backupLogIds = request.backupLogIds;
            this.DBClusterId = request.DBClusterId;
            this.expireHours = request.expireHours;
        } 

        /**
         * <p>The IDs of the redo log backups.</p>
         * 
         * <strong>example:</strong>
         * <p>78167430</p>
         */
        public Builder backupLogIds(String backupLogIds) {
            this.putQueryParameter("BackupLogIds", backupLogIds);
            this.backupLogIds = backupLogIds;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The validity period of the download links in hours. Valid values: 1 to 596523.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder expireHours(Integer expireHours) {
            this.putQueryParameter("ExpireHours", expireHours);
            this.expireHours = expireHours;
            return this;
        }

        @Override
        public DescribeBackupLogDownloadLinksRequest build() {
            return new DescribeBackupLogDownloadLinksRequest(this);
        } 

    } 

}
