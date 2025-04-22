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
 * {@link GetMountPointResponseBody} extends {@link TeaModel}
 *
 * <p>GetMountPointResponseBody</p>
 */
public class GetMountPointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountPoint")
    private MountPoint mountPoint;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMountPointResponseBody(Builder builder) {
        this.mountPoint = builder.mountPoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMountPointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mountPoint
     */
    public MountPoint getMountPoint() {
        return this.mountPoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MountPoint mountPoint; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMountPointResponseBody model) {
            this.mountPoint = model.mountPoint;
            this.requestId = model.requestId;
        } 

        /**
         * MountPoint.
         */
        public Builder mountPoint(MountPoint mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMountPointResponseBody build() {
            return new GetMountPointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMountPointResponseBody} extends {@link TeaModel}
     *
     * <p>GetMountPointResponseBody</p>
     */
    public static class MountPoint extends TeaModel {
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

        private MountPoint(Builder builder) {
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

        public static MountPoint create() {
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

            private Builder(MountPoint model) {
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

            public MountPoint build() {
                return new MountPoint(this);
            } 

        } 

    }
}
