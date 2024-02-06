// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMountTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMountTargetsResponseBody</p>
 */
public class DescribeMountTargetsResponseBody extends TeaModel {
    @NameInMap("MountTargets")
    private java.util.List < MountTargets> mountTargets;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeMountTargetsResponseBody(Builder builder) {
        this.mountTargets = builder.mountTargets;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMountTargetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return mountTargets
     */
    public java.util.List < MountTargets> getMountTargets() {
        return this.mountTargets;
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
        private java.util.List < MountTargets> mountTargets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about mount targets.
         */
        public Builder mountTargets(java.util.List < MountTargets> mountTargets) {
            this.mountTargets = mountTargets;
            return this;
        }

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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of mount targets.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMountTargetsResponseBody build() {
            return new DescribeMountTargetsResponseBody(this);
        } 

    } 

    public static class MountTargets extends TeaModel {
        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @NameInMap("MountTargetName")
        private String mountTargetName;

        @NameInMap("NetWorkId")
        private String netWorkId;

        @NameInMap("Status")
        private String status;

        private MountTargets(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
            this.fileSystemId = builder.fileSystemId;
            this.mountTargetDomain = builder.mountTargetDomain;
            this.mountTargetName = builder.mountTargetName;
            this.netWorkId = builder.netWorkId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTargets create() {
            return builder().build();
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return mountTargetDomain
         */
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        /**
         * @return mountTargetName
         */
        public String getMountTargetName() {
            return this.mountTargetName;
        }

        /**
         * @return netWorkId
         */
        public String getNetWorkId() {
            return this.netWorkId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ensRegionId; 
            private String fileSystemId; 
            private String mountTargetDomain; 
            private String mountTargetName; 
            private String netWorkId; 
            private String status; 

            /**
             * The ID of the region.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The ID of the file system.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * The path of the mount target.
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * The name of the mount target.
             */
            public Builder mountTargetName(String mountTargetName) {
                this.mountTargetName = mountTargetName;
                return this;
            }

            /**
             * The ID of the network.
             */
            public Builder netWorkId(String netWorkId) {
                this.netWorkId = netWorkId;
                return this;
            }

            /**
             * The state of the mount target. Valid values:
             * <p>
             * 
             * *   active: The mount target is available.
             * *   inactive: The mount target is unavailable.
             * *   pending: A task is being queued for the mount target.
             * *   deleting: The mount target is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MountTargets build() {
                return new MountTargets(this);
            } 

        } 

    }
}
