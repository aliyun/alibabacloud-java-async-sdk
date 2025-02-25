// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeMountTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMountTargetsResponseBody</p>
 */
public class DescribeMountTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountTargets")
    private java.util.List<MountTargets> mountTargets;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<MountTargets> getMountTargets() {
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
        private java.util.List<MountTargets> mountTargets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about mount targets.</p>
         */
        public Builder mountTargets(java.util.List<MountTargets> mountTargets) {
            this.mountTargets = mountTargets;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>762DD527-358B-1E48-8005-CCE3ED4EB9E0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of mount targets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMountTargetsResponseBody build() {
            return new DescribeMountTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMountTargetsResponseBody</p>
     */
    public static class MountTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("MountTargetName")
        private String mountTargetName;

        @com.aliyun.core.annotation.NameInMap("NetWorkId")
        private String netWorkId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-cmcc</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>c50f8*****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The path of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>LB:/fileSystemName/mountTargetName</p>
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * <p>The name of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>TestMountPath</p>
             */
            public Builder mountTargetName(String mountTargetName) {
                this.mountTargetName = mountTargetName;
                return this;
            }

            /**
             * <p>The ID of the network.</p>
             * 
             * <strong>example:</strong>
             * <p>n-***</p>
             */
            public Builder netWorkId(String netWorkId) {
                this.netWorkId = netWorkId;
                return this;
            }

            /**
             * <p>The state of the mount target. Valid values:</p>
             * <ul>
             * <li>active: The mount target is available.</li>
             * <li>inactive: The mount target is unavailable.</li>
             * <li>pending: A task is being queued for the mount target.</li>
             * <li>deleting: The mount target is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
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
