// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeBackupStorageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupStorageResponseBody</p>
 */
public class DescribeBackupStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FreeSize")
    private Long freeSize;

    @com.aliyun.core.annotation.NameInMap("FullStorageSize")
    private Long fullStorageSize;

    @com.aliyun.core.annotation.NameInMap("LogStorageSize")
    private Long logStorageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupStorageResponseBody(Builder builder) {
        this.freeSize = builder.freeSize;
        this.fullStorageSize = builder.fullStorageSize;
        this.logStorageSize = builder.logStorageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupStorageResponseBody create() {
        return builder().build();
    }

    /**
     * @return freeSize
     */
    public Long getFreeSize() {
        return this.freeSize;
    }

    /**
     * @return fullStorageSize
     */
    public Long getFullStorageSize() {
        return this.fullStorageSize;
    }

    /**
     * @return logStorageSize
     */
    public Long getLogStorageSize() {
        return this.logStorageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long freeSize; 
        private Long fullStorageSize; 
        private Long logStorageSize; 
        private String requestId; 

        /**
         * <p>The free quota for the storage capacity used for backup. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>42949672960</p>
         */
        public Builder freeSize(Long freeSize) {
            this.freeSize = freeSize;
            return this;
        }

        /**
         * <p>The storage capacity used for the full backup. Unit: bytes.</p>
         * <blockquote>
         * <p> Instances that use cloud disks support snapshot backup. The size of the storage used for the current full backup is the size of the snapshot chain.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>789221621</p>
         */
        public Builder fullStorageSize(Long fullStorageSize) {
            this.fullStorageSize = fullStorageSize;
            return this;
        }

        /**
         * <p>The storage capacity used for the log backup. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>7892216</p>
         */
        public Builder logStorageSize(Long logStorageSize) {
            this.logStorageSize = logStorageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D648B367-15B6-1B42-BD4B-4XXXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupStorageResponseBody build() {
            return new DescribeBackupStorageResponseBody(this);
        } 

    } 

}
