// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisksResponseBody</p>
 */
public class DescribeDisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Disks")
    private Disks disks;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDisksResponseBody(Builder builder) {
        this.code = builder.code;
        this.disks = builder.disks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return disks
     */
    public Disks getDisks() {
        return this.disks;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private Disks disks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The returned service code. 0 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the disks.
         */
        public Builder disks(Disks disks) {
            this.disks = disks;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned pages.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDisksResponseBody build() {
            return new DescribeDisksResponseBody(this);
        } 

    } 

    public static class DisksDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DiskChargeType")
        private String diskChargeType;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("EncryptedKeyId")
        private String encryptedKeyId;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Portable")
        private Boolean portable;

        @com.aliyun.core.annotation.NameInMap("SerialId")
        private String serialId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DisksDisks(Builder builder) {
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.diskChargeType = builder.diskChargeType;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.encrypted = builder.encrypted;
            this.encryptedKeyId = builder.encryptedKeyId;
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.portable = builder.portable;
            this.serialId = builder.serialId;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisksDisks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return diskChargeType
         */
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return encryptedKeyId
         */
        public String getEncryptedKeyId() {
            return this.encryptedKeyId;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return portable
         */
        public Boolean getPortable() {
            return this.portable;
        }

        /**
         * @return serialId
         */
        public String getSerialId() {
            return this.serialId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String category; 
            private String creationTime; 
            private String diskChargeType; 
            private String diskId; 
            private String diskName; 
            private Boolean encrypted; 
            private String encryptedKeyId; 
            private String ensRegionId; 
            private String instanceId; 
            private String instanceName; 
            private Boolean portable; 
            private String serialId; 
            private Integer size; 
            private String snapshotId; 
            private String status; 
            private String type; 

            /**
             * The category of the disk.
             * <p>
             * 
             * *   cloud_efficiency: ultra disk.
             * *   cloud_ssd: all-flash disk.
             * *   local_hdd: local HDD.
             * *   local_ssd: local SSD.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the disk was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The billing method of the cloud disk or local disk. Valid values:
             * <p>
             * 
             * *   **prepaid**: subscription.
             * *   **postpaid**: pay-as-you-go.
             */
            public Builder diskChargeType(String diskChargeType) {
                this.diskChargeType = diskChargeType;
                return this;
            }

            /**
             * The ID of the disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The name of the disk.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * Indicates whether the cloud disk is encrypted. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * The ID of the Key Management Service (KMS) key that is used for the cloud disk.
             */
            public Builder encryptedKeyId(String encryptedKeyId) {
                this.encryptedKeyId = encryptedKeyId;
                return this;
            }

            /**
             * The ID of the edge node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Indicates whether the cloud disk or local disk is removable. Valid values:
             * <p>
             * 
             * *   true: The disk is removable. A removable disk can independently exist and can be attached to or detached from an instance within the same zone.
             * *   false: The disk is not removable. A disk that is not removable cannot independently exist or be attached to or detached from an instance within the same zone.
             * 
             * If disks are of the following categories or types, the **Portable** value is **false** and the disks have the same lifecycle as their attached instances:
             * 
             * *   Local HDDs
             * *   Local SSDs
             * *   Data disks that use the subscription billing method
             */
            public Builder portable(Boolean portable) {
                this.portable = portable;
                return this;
            }

            /**
             * The serial number.
             */
            public Builder serialId(String serialId) {
                this.serialId = serialId;
                return this;
            }

            /**
             * The size of the disk. Unit: MiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the snapshot.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The status of the disk. Valid values:
             * <p>
             * 
             * *   In-use: The disk is in use.
             * *   Available: The disk can be attached.
             * *   Attaching: The disk is being attached.
             * *   Detaching: The disk is being detached.
             * *   Creating: The disk is being created.
             * *   ReIniting: The disk is being reset.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the cloud disk or local disk. Valid values:
             * <p>
             * 
             * *   1: system disk.
             * *   2: data disk.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DisksDisks build() {
                return new DisksDisks(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List < DisksDisks> disks;

        private Disks(Builder builder) {
            this.disks = builder.disks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return disks
         */
        public java.util.List < DisksDisks> getDisks() {
            return this.disks;
        }

        public static final class Builder {
            private java.util.List < DisksDisks> disks; 

            /**
             * The information about the disks.
             */
            public Builder disks(java.util.List < DisksDisks> disks) {
                this.disks = disks;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
}
