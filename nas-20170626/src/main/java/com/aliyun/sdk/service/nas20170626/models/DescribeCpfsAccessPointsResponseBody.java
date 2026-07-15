// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeCpfsAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCpfsAccessPointsResponseBody</p>
 */
public class DescribeCpfsAccessPointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPoints")
    private java.util.List<AccessPoints> accessPoints;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCpfsAccessPointsResponseBody(Builder builder) {
        this.accessPoints = builder.accessPoints;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCpfsAccessPointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPoints
     */
    public java.util.List<AccessPoints> getAccessPoints() {
        return this.accessPoints;
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
        private java.util.List<AccessPoints> accessPoints; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCpfsAccessPointsResponseBody model) {
            this.accessPoints = model.accessPoints;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AccessPoints.
         */
        public Builder accessPoints(java.util.List<AccessPoints> accessPoints) {
            this.accessPoints = accessPoints;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCpfsAccessPointsResponseBody build() {
            return new DescribeCpfsAccessPointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCpfsAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCpfsAccessPointsResponseBody</p>
     */
    public static class RootDirectory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RootPath")
        private String rootPath;

        @com.aliyun.core.annotation.NameInMap("RootPathStatus")
        private String rootPathStatus;

        private RootDirectory(Builder builder) {
            this.rootPath = builder.rootPath;
            this.rootPathStatus = builder.rootPathStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RootDirectory create() {
            return builder().build();
        }

        /**
         * @return rootPath
         */
        public String getRootPath() {
            return this.rootPath;
        }

        /**
         * @return rootPathStatus
         */
        public String getRootPathStatus() {
            return this.rootPathStatus;
        }

        public static final class Builder {
            private String rootPath; 
            private String rootPathStatus; 

            private Builder() {
            } 

            private Builder(RootDirectory model) {
                this.rootPath = model.rootPath;
                this.rootPathStatus = model.rootPathStatus;
            } 

            /**
             * RootPath.
             */
            public Builder rootPath(String rootPath) {
                this.rootPath = rootPath;
                return this;
            }

            /**
             * RootPathStatus.
             */
            public Builder rootPathStatus(String rootPathStatus) {
                this.rootPathStatus = rootPathStatus;
                return this;
            }

            public RootDirectory build() {
                return new RootDirectory(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCpfsAccessPointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCpfsAccessPointsResponseBody</p>
     */
    public static class AccessPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ARN")
        private String ARN;

        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RootDirectory")
        private RootDirectory rootDirectory;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AccessPoints(Builder builder) {
            this.ARN = builder.ARN;
            this.accessPointId = builder.accessPointId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.fileSystemId = builder.fileSystemId;
            this.modifyTime = builder.modifyTime;
            this.regionId = builder.regionId;
            this.rootDirectory = builder.rootDirectory;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPoints create() {
            return builder().build();
        }

        /**
         * @return ARN
         */
        public String getARN() {
            return this.ARN;
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return rootDirectory
         */
        public RootDirectory getRootDirectory() {
            return this.rootDirectory;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ARN; 
            private String accessPointId; 
            private String createTime; 
            private String description; 
            private String fileSystemId; 
            private String modifyTime; 
            private String regionId; 
            private RootDirectory rootDirectory; 
            private String status; 

            private Builder() {
            } 

            private Builder(AccessPoints model) {
                this.ARN = model.ARN;
                this.accessPointId = model.accessPointId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.fileSystemId = model.fileSystemId;
                this.modifyTime = model.modifyTime;
                this.regionId = model.regionId;
                this.rootDirectory = model.rootDirectory;
                this.status = model.status;
            } 

            /**
             * ARN.
             */
            public Builder ARN(String ARN) {
                this.ARN = ARN;
                return this;
            }

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RootDirectory.
             */
            public Builder rootDirectory(RootDirectory rootDirectory) {
                this.rootDirectory = rootDirectory;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AccessPoints build() {
                return new AccessPoints(this);
            } 

        } 

    }
}
