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
         * MountPoints.
         */
        public Builder mountPoints(java.util.List<MountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
             * AccessGroupId.
             */
            public Builder accessGroupId(String accessGroupId) {
                this.accessGroupId = accessGroupId;
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
             * MountPointAlias.
             */
            public Builder mountPointAlias(String mountPointAlias) {
                this.mountPointAlias = mountPointAlias;
                return this;
            }

            /**
             * MountPointDomain.
             */
            public Builder mountPointDomain(String mountPointDomain) {
                this.mountPointDomain = mountPointDomain;
                return this;
            }

            /**
             * MountPointId.
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
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
