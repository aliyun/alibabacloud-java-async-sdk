// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotLinksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotLinksResponseBody</p>
 */
public class DescribeSnapshotLinksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotLinks")
    private SnapshotLinks snapshotLinks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSnapshotLinksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snapshotLinks = builder.snapshotLinks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotLinksResponseBody create() {
        return builder().build();
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
     * @return snapshotLinks
     */
    public SnapshotLinks getSnapshotLinks() {
        return this.snapshotLinks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SnapshotLinks snapshotLinks; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
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
         * The details of the snapshot chains.
         */
        public Builder snapshotLinks(SnapshotLinks snapshotLinks) {
            this.snapshotLinks = snapshotLinks;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnapshotLinksResponseBody build() {
            return new DescribeSnapshotLinksResponseBody(this);
        } 

    } 

    public static class SnapshotLink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstantAccess")
        private Boolean instantAccess;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SnapshotLinkId")
        private String snapshotLinkId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskId")
        private String sourceDiskId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskName")
        private String sourceDiskName;

        @com.aliyun.core.annotation.NameInMap("SourceDiskSize")
        private Integer sourceDiskSize;

        @com.aliyun.core.annotation.NameInMap("SourceDiskType")
        private String sourceDiskType;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private SnapshotLink(Builder builder) {
            this.category = builder.category;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instantAccess = builder.instantAccess;
            this.regionId = builder.regionId;
            this.snapshotLinkId = builder.snapshotLinkId;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceDiskName = builder.sourceDiskName;
            this.sourceDiskSize = builder.sourceDiskSize;
            this.sourceDiskType = builder.sourceDiskType;
            this.totalCount = builder.totalCount;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotLink create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return instantAccess
         */
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return snapshotLinkId
         */
        public String getSnapshotLinkId() {
            return this.snapshotLinkId;
        }

        /**
         * @return sourceDiskId
         */
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        /**
         * @return sourceDiskName
         */
        public String getSourceDiskName() {
            return this.sourceDiskName;
        }

        /**
         * @return sourceDiskSize
         */
        public Integer getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        /**
         * @return sourceDiskType
         */
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String category; 
            private String instanceId; 
            private String instanceName; 
            private Boolean instantAccess; 
            private String regionId; 
            private String snapshotLinkId; 
            private String sourceDiskId; 
            private String sourceDiskName; 
            private Integer sourceDiskSize; 
            private String sourceDiskType; 
            private Integer totalCount; 
            private Long totalSize; 

            /**
             * The category of the snapshot.
             */
            public Builder category(String category) {
                this.category = category;
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
             * Indicates whether the instant access feature is enabled. Valid values:
             * <p>
             * 
             * *   true: The instant access feature is enabled. This feature can be enabled only for enhanced SSDs (ESSDs).
             * *   false: The instant access feature is disabled. The snapshot is a normal snapshot for which the instant access feature is disabled.
             * 
             * >  This parameter is no longer used. By default, new normal snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see [Use the instant access feature](~~193667~~).
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * The region ID of the source disk.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the snapshot chain.
             */
            public Builder snapshotLinkId(String snapshotLinkId) {
                this.snapshotLinkId = snapshotLinkId;
                return this;
            }

            /**
             * The ID of the source disk. This parameter is retained even if the source disk is deleted.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * The name of the source disk.
             */
            public Builder sourceDiskName(String sourceDiskName) {
                this.sourceDiskName = sourceDiskName;
                return this;
            }

            /**
             * The capacity of the source disk. Unit: GiB.
             */
            public Builder sourceDiskSize(Integer sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
                return this;
            }

            /**
             * The type of the source disk. Valid values:
             * <p>
             * 
             * *   system: system disk
             * *   data: data disk
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * The total number of snapshots.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The total size of all snapshots in the snapshot chain. Unit: byte.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public SnapshotLink build() {
                return new SnapshotLink(this);
            } 

        } 

    }
    public static class SnapshotLinks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnapshotLink")
        private java.util.List < SnapshotLink> snapshotLink;

        private SnapshotLinks(Builder builder) {
            this.snapshotLink = builder.snapshotLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotLinks create() {
            return builder().build();
        }

        /**
         * @return snapshotLink
         */
        public java.util.List < SnapshotLink> getSnapshotLink() {
            return this.snapshotLink;
        }

        public static final class Builder {
            private java.util.List < SnapshotLink> snapshotLink; 

            /**
             * SnapshotLink.
             */
            public Builder snapshotLink(java.util.List < SnapshotLink> snapshotLink) {
                this.snapshotLink = snapshotLink;
                return this;
            }

            public SnapshotLinks build() {
                return new SnapshotLinks(this);
            } 

        } 

    }
}
