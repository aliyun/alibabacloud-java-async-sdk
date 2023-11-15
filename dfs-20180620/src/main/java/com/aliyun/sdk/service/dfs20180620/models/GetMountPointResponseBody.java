// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMountPointResponseBody} extends {@link TeaModel}
 *
 * <p>GetMountPointResponseBody</p>
 */
public class GetMountPointResponseBody extends TeaModel {
    @NameInMap("MountPoint")
    private MountPoint mountPoint;

    @NameInMap("RequestId")
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

    public static class MountPoint extends TeaModel {
        @NameInMap("AccessGroupId")
        private String accessGroupId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("FileSystemId")
        private String fileSystemId;

        @NameInMap("MountPointDomain")
        private String mountPointDomain;

        @NameInMap("MountPointId")
        private String mountPointId;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private MountPoint(Builder builder) {
            this.accessGroupId = builder.accessGroupId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.fileSystemId = builder.fileSystemId;
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
            private String mountPointDomain; 
            private String mountPointId; 
            private String networkType; 
            private String regionId; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

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
