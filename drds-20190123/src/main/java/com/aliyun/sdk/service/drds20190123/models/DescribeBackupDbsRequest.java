// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeBackupDbsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupDbsRequest</p>
 */
public class DescribeBackupDbsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredRestoreTime")
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

        private Builder(DescribeBackupDbsRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.drdsInstanceId = request.drdsInstanceId;
            this.preferredRestoreTime = request.preferredRestoreTime;
        } 

        /**
         * <p>Query by backup set ID</p>
         * 
         * <strong>example:</strong>
         * <p>201908367</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The ID of a DRDS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds************</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>Query by restoration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1568632541236</p>
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
