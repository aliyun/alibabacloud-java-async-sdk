// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeBackupStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupStatusResponseBody</p>
 */
public class DescribeBackupStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupStatus")
    private String backupStatus;

    @com.aliyun.core.annotation.NameInMap("BdsClusterId")
    private String bdsClusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupStatusResponseBody(Builder builder) {
        this.backupStatus = builder.backupStatus;
        this.bdsClusterId = builder.bdsClusterId;
        this.clusterId = builder.clusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupStatus
     */
    public String getBackupStatus() {
        return this.backupStatus;
    }

    /**
     * @return bdsClusterId
     */
    public String getBdsClusterId() {
        return this.bdsClusterId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String backupStatus; 
        private String bdsClusterId; 
        private String clusterId; 
        private String requestId; 

        /**
         * BackupStatus.
         */
        public Builder backupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }

        /**
         * BdsClusterId.
         */
        public Builder bdsClusterId(String bdsClusterId) {
            this.bdsClusterId = bdsClusterId;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupStatusResponseBody build() {
            return new DescribeBackupStatusResponseBody(this);
        } 

    } 

}
