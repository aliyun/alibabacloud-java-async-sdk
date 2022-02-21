// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupDbsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupDbsRequest</p>
 */
public class DescribeBackupDbsRequest extends Request {
    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("PreferredRestoreTime")
    private String preferredRestoreTime;

    private DescribeBackupDbsRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.preferredRestoreTime = builder.preferredRestoreTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupDbsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return preferredRestoreTime
     */
    public String getPreferredRestoreTime() {
        return this.preferredRestoreTime;
    }

    public static final class Builder extends Request.Builder<DescribeBackupDbsRequest, Builder> {
        private String backupId; 
        private String drdsInstanceId; 
        private String preferredRestoreTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupDbsRequest response) {
            super(response);
            this.backupId = response.backupId;
            this.drdsInstanceId = response.drdsInstanceId;
            this.preferredRestoreTime = response.preferredRestoreTime;
        } 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * PreferredRestoreTime.
         */
        public Builder preferredRestoreTime(String preferredRestoreTime) {
            this.putQueryParameter("PreferredRestoreTime", preferredRestoreTime);
            this.preferredRestoreTime = preferredRestoreTime;
            return this;
        }

        @Override
        public DescribeBackupDbsRequest build() {
            return new DescribeBackupDbsRequest(this);
        } 

    } 

}
