// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotLinksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotLinksResponseBody</p>
 */
public class DescribeSnapshotLinksResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("SnapshotLinks")
    private SnapshotLinks snapshotLinks;

    private DescribeSnapshotLinksResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.snapshotLinks = builder.snapshotLinks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotLinksResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return snapshotLinks
     */
    public SnapshotLinks getSnapshotLinks() {
        return this.snapshotLinks;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private SnapshotLinks snapshotLinks; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number of the snapshot chain list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of snapshot chains.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A collection of snapshot chain information.
         */
        public Builder snapshotLinks(SnapshotLinks snapshotLinks) {
            this.snapshotLinks = snapshotLinks;
            return this;
        }

        public DescribeSnapshotLinksResponseBody build() {
            return new DescribeSnapshotLinksResponseBody(this);
        } 

    } 

    public static class SnapshotLink extends TeaModel {
        @NameInMap("InstantAccess")
        private Boolean instantAccess;

        @NameInMap("TotalSize")
        private Long totalSize;

        @NameInMap("SourceDiskName")
        private String sourceDiskName;

        @NameInMap("SourceDiskSize")
        private Integer sourceDiskSize;

        @NameInMap("SourceDiskType")
        private String sourceDiskType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("SnapshotLinkId")
        private String snapshotLinkId;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SourceDiskId")
        private String sourceDiskId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Category")
        private String category;

        private SnapshotLink(Builder builder) {
            this.instantAccess = builder.instantAccess;
            this.totalSize = builder.totalSize;
            this.sourceDiskName = builder.sourceDiskName;
            this.sourceDiskSize = builder.sourceDiskSize;
            this.sourceDiskType = builder.sourceDiskType;
            this.instanceId = builder.instanceId;
            this.snapshotLinkId = builder.snapshotLinkId;
            this.totalCount = builder.totalCount;
            this.regionId = builder.regionId;
            this.sourceDiskId = builder.sourceDiskId;
            this.instanceName = builder.instanceName;
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotLink create() {
            return builder().build();
        }

        /**
         * @return instantAccess
         */
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return snapshotLinkId
         */
        public String getSnapshotLinkId() {
            return this.snapshotLinkId;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sourceDiskId
         */
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private Boolean instantAccess; 
            private Long totalSize; 
            private String sourceDiskName; 
            private Integer sourceDiskSize; 
            private String sourceDiskType; 
            private String instanceId; 
            private String snapshotLinkId; 
            private Integer totalCount; 
            private String regionId; 
            private String sourceDiskId; 
            private String instanceName; 
            private String category; 

            /**
             * Indicates whether the snapshot extreme availability feature is enabled. Possible values:
             * <p>
             * 
             * -true: enabled. Only ESSDS support this feature.
             * -false: disabled. That is, a snapshot is a normal snapshot that is not enabled.
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
                return this;
            }

            /**
             * The size of all snapshots in the snapshot chain. Unit: bytes.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
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
             * The type of the source disk. Possible values:
             * <p>
             * 
             * -system: system disk
             * -data: data disk
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
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
             * The ID of the snapshot chain.
             */
            public Builder snapshotLinkId(String snapshotLinkId) {
                this.snapshotLinkId = snapshotLinkId;
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
             * The ID of the region to which the snapshot chain source disk belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the source disk. This field is retained if the source disk of the snapshot has been deleted.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
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
             * The type of the snapshot.
             * <p>
             * 
             * > This parameter will be deprecated soon. We recommend that you use the "InstantAccess" parameter to improve compatibility ".
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public SnapshotLink build() {
                return new SnapshotLink(this);
            } 

        } 

    }
    public static class SnapshotLinks extends TeaModel {
        @NameInMap("SnapshotLink")
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
