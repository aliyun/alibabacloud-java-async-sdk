// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link ListMountPointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMountPointsResponseBody</p>
 */
public class ListMountPointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountPoints")
    private java.util.List<MountPoints> mountPoints;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListMountPointsResponseBody(Builder builder) {
        this.mountPoints = builder.mountPoints;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMountPointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mountPoints
     */
    public java.util.List<MountPoints> getMountPoints() {
        return this.mountPoints;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<MountPoints> mountPoints; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMountPointsResponseBody model) {
            this.mountPoints = model.mountPoints;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The mount point information.</p>
         */
        public Builder mountPoints(java.util.List<MountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        /**
         * <p>The token for the next page.</p>
         * <p>If a query does not return all results, a non-empty NextToken is returned. You can include the NextToken in a subsequent query to retrieve the remaining results.</p>
         * 
         * <strong>example:</strong>
         * <p>MYR6sz6qkmauspAy8oxjHP-tOLtD4KSv3DzI7G6iywTx1ZCExO50GtSuiTB9z0JppvYQ2iUa8s4HbcFanMQfDIlds4da87_Ax4UJMva****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of mount points.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMountPointsResponseBody build() {
            return new ListMountPointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMountPointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMountPointsResponseBody</p>
     */
    public static class MountPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroupId")
        private String accessGroupId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("MountPointAlias")
        private String mountPointAlias;

        @com.aliyun.core.annotation.NameInMap("MountPointDomain")
        private String mountPointDomain;

        @com.aliyun.core.annotation.NameInMap("MountPointId")
        private String mountPointId;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private MountPoints(Builder builder) {
            this.accessGroupId = builder.accessGroupId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.fileSystemId = builder.fileSystemId;
            this.mountPointAlias = builder.mountPointAlias;
            this.mountPointDomain = builder.mountPointDomain;
            this.mountPointId = builder.mountPointId;
            this.networkType = builder.networkType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountPoints create() {
            return builder().build();
        }

        /**
         * @return accessGroupId
         */
        public String getAccessGroupId() {
            return this.accessGroupId;
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
         * @return mountPointAlias
         */
        public String getMountPointAlias() {
            return this.mountPointAlias;
        }

        /**
         * @return mountPointDomain
         */
        public String getMountPointDomain() {
            return this.mountPointDomain;
        }

        /**
         * @return mountPointId
         */
        public String getMountPointId() {
            return this.mountPointId;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String accessGroupId; 
            private String createTime; 
            private String description; 
            private String fileSystemId; 
            private String mountPointAlias; 
            private String mountPointDomain; 
            private String mountPointId; 
            private String networkType; 
            private String regionId; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(MountPoints model) {
                this.accessGroupId = model.accessGroupId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.fileSystemId = model.fileSystemId;
                this.mountPointAlias = model.mountPointAlias;
                this.mountPointDomain = model.mountPointDomain;
                this.mountPointId = model.mountPointId;
                this.networkType = model.networkType;
                this.regionId = model.regionId;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The permission group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
             */
            public Builder accessGroupId(String accessGroupId) {
                this.accessGroupId = accessGroupId;
                return this;
            }

            /**
             * <p>The time when the mount point was created. The time is displayed in UTC and follows the ISO 8601 standard. Example: 2022-09-19T03:22:32.550267Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-19T03:22:32.550267Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the mount point.</p>
             * 
             * <strong>example:</strong>
             * <p>Mount the production DFS to a vSwitch in the VPC log cluster</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The file system ID.</p>
             * 
             * <strong>example:</strong>
             * <p>37af8f42-2abc-4e74-889d-664f5163****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The alias of the mount point.</p>
             * 
             * <strong>example:</strong>
             * <p>hdfs1</p>
             */
            public Builder mountPointAlias(String mountPointAlias) {
                this.mountPointAlias = mountPointAlias;
                return this;
            }

            /**
             * <p>The domain name of the mount point.</p>
             * <p>You can use this domain name to access the Apsara File Storage for HDFS file system within the CIDR block of the VPC to which the mount point is attached.</p>
             * 
             * <strong>example:</strong>
             * <p>f-37af8f42f****.cn-hangzhou.dfs.aliyuncs.com</p>
             */
            public Builder mountPointDomain(String mountPointDomain) {
                this.mountPointDomain = mountPointDomain;
                return this;
            }

            /**
             * <p>The mount point ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f-37af8f42f****.cn-hangzhou.dfs.aliyuncs.com</p>
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * <p>The network type of the mount point.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
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
             * <p>The status of the mount point.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Inactive: The mount point is disabled.</li>
             * <li>Active: The mount point is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Inactive</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-iq8fymi327krd14mt****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-iq8hhsk3ymzv9m4wn****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public MountPoints build() {
                return new MountPoints(this);
            } 

        } 

    }
}
