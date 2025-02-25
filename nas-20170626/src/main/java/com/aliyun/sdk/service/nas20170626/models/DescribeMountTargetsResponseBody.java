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
 * {@link DescribeMountTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMountTargetsResponseBody</p>
 */
public class DescribeMountTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountTargets")
    private MountTargets mountTargets;

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
    public MountTargets getMountTargets() {
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
        private MountTargets mountTargets; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about mount targets.</p>
         */
        public Builder mountTargets(MountTargets mountTargets) {
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
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3BAB90FD-B4A0-48DA-9F09-2B963510****</p>
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
    public static class ClientMasterNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultPasswd")
        private String defaultPasswd;

        @com.aliyun.core.annotation.NameInMap("EcsId")
        private String ecsId;

        @com.aliyun.core.annotation.NameInMap("EcsIp")
        private String ecsIp;

        private ClientMasterNode(Builder builder) {
            this.defaultPasswd = builder.defaultPasswd;
            this.ecsId = builder.ecsId;
            this.ecsIp = builder.ecsIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientMasterNode create() {
            return builder().build();
        }

        /**
         * @return defaultPasswd
         */
        public String getDefaultPasswd() {
            return this.defaultPasswd;
        }

        /**
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
        }

        /**
         * @return ecsIp
         */
        public String getEcsIp() {
            return this.ecsIp;
        }

        public static final class Builder {
            private String defaultPasswd; 
            private String ecsId; 
            private String ecsIp; 

            /**
             * <p>The default logon password of the ECS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12****</p>
             */
            public Builder defaultPasswd(String defaultPasswd) {
                this.defaultPasswd = defaultPasswd;
                return this;
            }

            /**
             * <p>The ID of the ECS instance on the client management node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hp3i3odi5ory1buo****</p>
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * <p>The IP address of the ECS instance on the client management node.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.0</p>
             */
            public Builder ecsIp(String ecsIp) {
                this.ecsIp = ecsIp;
                return this;
            }

            public ClientMasterNode build() {
                return new ClientMasterNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMountTargetsResponseBody</p>
     */
    public static class ClientMasterNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientMasterNode")
        private java.util.List<ClientMasterNode> clientMasterNode;

        private ClientMasterNodes(Builder builder) {
            this.clientMasterNode = builder.clientMasterNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientMasterNodes create() {
            return builder().build();
        }

        /**
         * @return clientMasterNode
         */
        public java.util.List<ClientMasterNode> getClientMasterNode() {
            return this.clientMasterNode;
        }

        public static final class Builder {
            private java.util.List<ClientMasterNode> clientMasterNode; 

            /**
             * ClientMasterNode.
             */
            public Builder clientMasterNode(java.util.List<ClientMasterNode> clientMasterNode) {
                this.clientMasterNode = clientMasterNode;
                return this;
            }

            public ClientMasterNodes build() {
                return new ClientMasterNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMountTargetsResponseBody</p>
     */
    public static class MountTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroup")
        private String accessGroup;

        @com.aliyun.core.annotation.NameInMap("ClientMasterNodes")
        private ClientMasterNodes clientMasterNodes;

        @com.aliyun.core.annotation.NameInMap("DualStackMountTargetDomain")
        private String dualStackMountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("IPVersion")
        private String IPVersion;

        @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
        private String mountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswId")
        private String vswId;

        private MountTarget(Builder builder) {
            this.accessGroup = builder.accessGroup;
            this.clientMasterNodes = builder.clientMasterNodes;
            this.dualStackMountTargetDomain = builder.dualStackMountTargetDomain;
            this.IPVersion = builder.IPVersion;
            this.mountTargetDomain = builder.mountTargetDomain;
            this.networkType = builder.networkType;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vswId = builder.vswId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTarget create() {
            return builder().build();
        }

        /**
         * @return accessGroup
         */
        public String getAccessGroup() {
            return this.accessGroup;
        }

        /**
         * @return clientMasterNodes
         */
        public ClientMasterNodes getClientMasterNodes() {
            return this.clientMasterNodes;
        }

        /**
         * @return dualStackMountTargetDomain
         */
        public String getDualStackMountTargetDomain() {
            return this.dualStackMountTargetDomain;
        }

        /**
         * @return IPVersion
         */
        public String getIPVersion() {
            return this.IPVersion;
        }

        /**
         * @return mountTargetDomain
         */
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswId
         */
        public String getVswId() {
            return this.vswId;
        }

        public static final class Builder {
            private String accessGroup; 
            private ClientMasterNodes clientMasterNodes; 
            private String dualStackMountTargetDomain; 
            private String IPVersion; 
            private String mountTargetDomain; 
            private String networkType; 
            private String status; 
            private String vpcId; 
            private String vswId; 

            /**
             * <p>The name of the permission group that is attached to the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_VPC_GROUP_NAME</p>
             */
            public Builder accessGroup(String accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            /**
             * <p>The information about client management nodes.</p>
             */
            public Builder clientMasterNodes(ClientMasterNodes clientMasterNodes) {
                this.clientMasterNodes = clientMasterNodes;
                return this;
            }

            /**
             * <p>The dual-stack (IPv4 and IPv6) domain name of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>174494b666-x****.dualstack.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder dualStackMountTargetDomain(String dualStackMountTargetDomain) {
                this.dualStackMountTargetDomain = dualStackMountTargetDomain;
                return this;
            }

            /**
             * <p>The type of the mount target.</p>
             * <ul>
             * <li>IPv4: an IPv4 mount target</li>
             * <li>DualStack: a dual-stack mount target</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder IPVersion(String IPVersion) {
                this.IPVersion = IPVersion;
                return this;
            }

            /**
             * <p>The IPv4 domain name of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>1ca404a666-w****.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * <p>The network type. Valid value: <strong>Vpc</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The status of the mount target.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Active: The mount target is available.</li>
             * <li>Inactive: The mount target is unavailable.</li>
             * <li>Pending: The mount target is being created or modified.</li>
             * <li>Deleting: The mount target is being deleted.</li>
             * <li>Hibernating: The mount target is being hibernated.</li>
             * <li>Hibernated: The mount target is hibernated.</li>
             * </ul>
             * <blockquote>
             * <p>You can mount a file system only when the mount target of the file system is in the Active state.</p>
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
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zesj9afh3y518k9o****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zevmwkwyztjuoffg****</p>
             */
            public Builder vswId(String vswId) {
                this.vswId = vswId;
                return this;
            }

            public MountTarget build() {
                return new MountTarget(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMountTargetsResponseBody</p>
     */
    public static class MountTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountTarget")
        private java.util.List<MountTarget> mountTarget;

        private MountTargets(Builder builder) {
            this.mountTarget = builder.mountTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountTargets create() {
            return builder().build();
        }

        /**
         * @return mountTarget
         */
        public java.util.List<MountTarget> getMountTarget() {
            return this.mountTarget;
        }

        public static final class Builder {
            private java.util.List<MountTarget> mountTarget; 

            /**
             * MountTarget.
             */
            public Builder mountTarget(java.util.List<MountTarget> mountTarget) {
                this.mountTarget = mountTarget;
                return this;
            }

            public MountTargets build() {
                return new MountTargets(this);
            } 

        } 

    }
}
