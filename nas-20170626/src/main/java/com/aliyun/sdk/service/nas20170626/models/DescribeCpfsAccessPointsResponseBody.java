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
         * <p>The access point information.</p>
         */
        public Builder accessPoints(java.util.List<AccessPoints> accessPoints) {
            this.accessPoints = accessPoints;
            return this;
        }

        /**
         * <p>The page number of the list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of results per page.
         * Valid values: 1 to 100.<br>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A323836B-5BC6-45A6-8048-60675C23****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of access points.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
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
             * <p>The root directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/path</p>
             */
            public Builder rootPath(String rootPath) {
                this.rootPath = rootPath;
                return this;
            }

            /**
             * <p>The current status of the root directory.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Unknown: the root path status is unknown.</li>
             * <li>NotExist: the root path does not exist. It may have been deleted by the user.</li>
             * <li>Ready: the root path status is normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the CPFS access point tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the CPFS access point tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
            this.tags = builder.tags;
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

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
            private java.util.List<Tags> tags; 

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
                this.tags = model.tags;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:nas:cn-hangzhou:178321033379****:accesspoint/ap-ie15yd****</p>
             */
            public Builder ARN(String ARN) {
                this.ARN = ARN;
                return this;
            }

            /**
             * <p>The access point ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-ie15y*****</p>
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * <p>The time when the access point was created. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-28T06:32:14Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The file system ID.</p>
             * 
             * <strong>example:</strong>
             * <p>bmcpfs-290r9c75fnb0il8d8v1</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The time when the access point was last modified. The time follows the ISO 8601 standard in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-28T06:32:14Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The root directory information.</p>
             */
            public Builder rootDirectory(RootDirectory rootDirectory) {
                this.rootDirectory = rootDirectory;
                return this;
            }

            /**
             * <p>The current status of the access point.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Active: available.</li>
             * <li>Inactive: unavailable.</li>
             * <li>Pending: being created.</li>
             * <li>Deleting: being deleted.</li>
             * </ul>
             * <blockquote>
             * <p>You can mount the file system only when the status is Active.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of CPFS access point tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public AccessPoints build() {
                return new AccessPoints(this);
            } 

        } 

    }
}
