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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeMountTargetsResponseBody model) {
            this.mountTargets = model.mountTargets;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MountTargets.
         */
        public Builder mountTargets(MountTargets mountTargets) {
            this.mountTargets = mountTargets;
            return this;
        }

        /**
         * <p>The page number of the file system list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of mount targets on each page when paging is used.</p>
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

            private Builder() {
            } 

            private Builder(ClientMasterNode model) {
                this.defaultPasswd = model.defaultPasswd;
                this.ecsId = model.ecsId;
                this.ecsIp = model.ecsIp;
            } 

            /**
             * DefaultPasswd.
             */
            public Builder defaultPasswd(String defaultPasswd) {
                this.defaultPasswd = defaultPasswd;
                return this;
            }

            /**
             * EcsId.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            /**
             * EcsIp.
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

            private Builder() {
            } 

            private Builder(ClientMasterNodes model) {
                this.clientMasterNode = model.clientMasterNode;
            } 

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
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMountTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMountTargetsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
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

        @com.aliyun.core.annotation.NameInMap("AccessPointAccessOnly")
        private Boolean accessPointAccessOnly;

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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswId")
        private String vswId;

        private MountTarget(Builder builder) {
            this.accessGroup = builder.accessGroup;
            this.accessPointAccessOnly = builder.accessPointAccessOnly;
            this.clientMasterNodes = builder.clientMasterNodes;
            this.dualStackMountTargetDomain = builder.dualStackMountTargetDomain;
            this.IPVersion = builder.IPVersion;
            this.mountTargetDomain = builder.mountTargetDomain;
            this.networkType = builder.networkType;
            this.status = builder.status;
            this.tags = builder.tags;
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
         * @return accessPointAccessOnly
         */
        public Boolean getAccessPointAccessOnly() {
            return this.accessPointAccessOnly;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
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
            private Boolean accessPointAccessOnly; 
            private ClientMasterNodes clientMasterNodes; 
            private String dualStackMountTargetDomain; 
            private String IPVersion; 
            private String mountTargetDomain; 
            private String networkType; 
            private String status; 
            private Tags tags; 
            private String vpcId; 
            private String vswId; 

            private Builder() {
            } 

            private Builder(MountTarget model) {
                this.accessGroup = model.accessGroup;
                this.accessPointAccessOnly = model.accessPointAccessOnly;
                this.clientMasterNodes = model.clientMasterNodes;
                this.dualStackMountTargetDomain = model.dualStackMountTargetDomain;
                this.IPVersion = model.IPVersion;
                this.mountTargetDomain = model.mountTargetDomain;
                this.networkType = model.networkType;
                this.status = model.status;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
                this.vswId = model.vswId;
            } 

            /**
             * AccessGroup.
             */
            public Builder accessGroup(String accessGroup) {
                this.accessGroup = accessGroup;
                return this;
            }

            /**
             * AccessPointAccessOnly.
             */
            public Builder accessPointAccessOnly(Boolean accessPointAccessOnly) {
                this.accessPointAccessOnly = accessPointAccessOnly;
                return this;
            }

            /**
             * ClientMasterNodes.
             */
            public Builder clientMasterNodes(ClientMasterNodes clientMasterNodes) {
                this.clientMasterNodes = clientMasterNodes;
                return this;
            }

            /**
             * DualStackMountTargetDomain.
             */
            public Builder dualStackMountTargetDomain(String dualStackMountTargetDomain) {
                this.dualStackMountTargetDomain = dualStackMountTargetDomain;
                return this;
            }

            /**
             * IPVersion.
             */
            public Builder IPVersion(String IPVersion) {
                this.IPVersion = IPVersion;
                return this;
            }

            /**
             * MountTargetDomain.
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswId.
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

            private Builder() {
            } 

            private Builder(MountTargets model) {
                this.mountTarget = model.mountTarget;
            } 

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
