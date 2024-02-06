// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisksResponseBody</p>
 */
public class DescribeDisksResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Disks")
    private Disks disks;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
        @NameInMap("Category")
        private String category;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DiskChargeType")
        private String diskChargeType;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("Encrypted")
        private Boolean encrypted;

        @NameInMap("EncryptedKeyId")
        private String encryptedKeyId;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Portable")
        private Boolean portable;

        @NameInMap("SerialId")
        private String serialId;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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
             * Indicates whether the cloud disk is encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * EncryptedKeyId.
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
             * Specifies whether the cloud disk or the local disk is removable. Valid values:
             * <p>
             * 
             * *   true: The disk is removable. A removable disk can independently exist and can be attached to or detached from an instance within the same zone.
             * *   false: The disk is not removable. A disk that is not removable cannot independently exist or be attached to or detached from an instance within the same zone.
             * 
             * The **Portable** attribute of the following disks is **false**, and these disks share the same lifecycle with their associated instances:
             * 
             * *   Local HDD.
             * *   Local SSD.
             * *   Data disk that uses the subscription billing method.
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
             * *   Creating: The image is being created.
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
        @NameInMap("Disks")
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
