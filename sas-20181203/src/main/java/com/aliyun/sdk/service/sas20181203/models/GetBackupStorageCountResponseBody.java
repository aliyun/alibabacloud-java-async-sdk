// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetBackupStorageCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetBackupStorageCountResponseBody</p>
 */
public class GetBackupStorageCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupStorageCount")
    private BackupStorageCount backupStorageCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBackupStorageCountResponseBody(Builder builder) {
        this.backupStorageCount = builder.backupStorageCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBackupStorageCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupStorageCount
     */
    public BackupStorageCount getBackupStorageCount() {
        return this.backupStorageCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BackupStorageCount backupStorageCount; 
        private String requestId; 

        /**
         * <p>The details about the anti-ransomware capacity.</p>
         */
        public Builder backupStorageCount(BackupStorageCount backupStorageCount) {
            this.backupStorageCount = backupStorageCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>33C2CCFF-4BF8-5F88-9B5C-22F932F80E5A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBackupStorageCountResponseBody build() {
            return new GetBackupStorageCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBackupStorageCountResponseBody} extends {@link TeaModel}
     *
     * <p>GetBackupStorageCountResponseBody</p>
     */
    public static class BackupStorageCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuyStorageByte")
        private Long buyStorageByte;

        @com.aliyun.core.annotation.NameInMap("EcsUsageStorageByte")
        private Long ecsUsageStorageByte;

        @com.aliyun.core.annotation.NameInMap("Overflow")
        private Integer overflow;

        @com.aliyun.core.annotation.NameInMap("UniUsageStorageByte")
        private Long uniUsageStorageByte;

        @com.aliyun.core.annotation.NameInMap("UsageStorageByte")
        private Long usageStorageByte;

        private BackupStorageCount(Builder builder) {
            this.buyStorageByte = builder.buyStorageByte;
            this.ecsUsageStorageByte = builder.ecsUsageStorageByte;
            this.overflow = builder.overflow;
            this.uniUsageStorageByte = builder.uniUsageStorageByte;
            this.usageStorageByte = builder.usageStorageByte;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupStorageCount create() {
            return builder().build();
        }

        /**
         * @return buyStorageByte
         */
        public Long getBuyStorageByte() {
            return this.buyStorageByte;
        }

        /**
         * @return ecsUsageStorageByte
         */
        public Long getEcsUsageStorageByte() {
            return this.ecsUsageStorageByte;
        }

        /**
         * @return overflow
         */
        public Integer getOverflow() {
            return this.overflow;
        }

        /**
         * @return uniUsageStorageByte
         */
        public Long getUniUsageStorageByte() {
            return this.uniUsageStorageByte;
        }

        /**
         * @return usageStorageByte
         */
        public Long getUsageStorageByte() {
            return this.usageStorageByte;
        }

        public static final class Builder {
            private Long buyStorageByte; 
            private Long ecsUsageStorageByte; 
            private Integer overflow; 
            private Long uniUsageStorageByte; 
            private Long usageStorageByte; 

            /**
             * <p>The anti-ransomware capacity that you purchased. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2276332666880</p>
             */
            public Builder buyStorageByte(Long buyStorageByte) {
                this.buyStorageByte = buyStorageByte;
                return this;
            }

            /**
             * <p>The storage capacity that is occupied by the backup data of your servers. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>817262417803</p>
             */
            public Builder ecsUsageStorageByte(Long ecsUsageStorageByte) {
                this.ecsUsageStorageByte = ecsUsageStorageByte;
                return this;
            }

            /**
             * <p>Indicates whether the anti-ransomware capacity that is used exceeds the anti-ransomware capacity that you purchased. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder overflow(Integer overflow) {
                this.overflow = overflow;
                return this;
            }

            /**
             * <p>The storage capacity that is occupied by the backup data of your databases. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>7453049350</p>
             */
            public Builder uniUsageStorageByte(Long uniUsageStorageByte) {
                this.uniUsageStorageByte = uniUsageStorageByte;
                return this;
            }

            /**
             * <p>The total anti-ransomware capacity that is used. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>839621565853</p>
             */
            public Builder usageStorageByte(Long usageStorageByte) {
                this.usageStorageByte = usageStorageByte;
                return this;
            }

            public BackupStorageCount build() {
                return new BackupStorageCount(this);
            } 

        } 

    }
}
