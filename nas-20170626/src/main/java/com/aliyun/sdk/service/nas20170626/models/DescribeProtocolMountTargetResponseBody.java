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
 * {@link DescribeProtocolMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtocolMountTargetResponseBody</p>
 */
public class DescribeProtocolMountTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProtocolMountTargets")
    private java.util.List<ProtocolMountTargets> protocolMountTargets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProtocolMountTargetResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.protocolMountTargets = builder.protocolMountTargets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtocolMountTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return protocolMountTargets
     */
    public java.util.List<ProtocolMountTargets> getProtocolMountTargets() {
        return this.protocolMountTargets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<ProtocolMountTargets> protocolMountTargets; 
        private String requestId; 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>aBcdeg==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The export directories of the protocol service.</p>
         */
        public Builder protocolMountTargets(java.util.List<ProtocolMountTargets> protocolMountTargets) {
            this.protocolMountTargets = protocolMountTargets;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProtocolMountTargetResponseBody build() {
            return new DescribeProtocolMountTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProtocolMountTargetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProtocolMountTargetResponseBody</p>
     */
    public static class ProtocolMountTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroupName")
        private String accessGroupName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExportId")
        private String exportId;

        @com.aliyun.core.annotation.NameInMap("FsetId")
        private String fsetId;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("ProtocolMountTargetDomain")
        private String protocolMountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("ProtocolServiceId")
        private String protocolServiceId;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ProtocolMountTargets(Builder builder) {
            this.accessGroupName = builder.accessGroupName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.exportId = builder.exportId;
            this.fsetId = builder.fsetId;
            this.path = builder.path;
            this.protocolMountTargetDomain = builder.protocolMountTargetDomain;
            this.protocolServiceId = builder.protocolServiceId;
            this.protocolType = builder.protocolType;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolMountTargets create() {
            return builder().build();
        }

        /**
         * @return accessGroupName
         */
        public String getAccessGroupName() {
            return this.accessGroupName;
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
         * @return exportId
         */
        public String getExportId() {
            return this.exportId;
        }

        /**
         * @return fsetId
         */
        public String getFsetId() {
            return this.fsetId;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return protocolMountTargetDomain
         */
        public String getProtocolMountTargetDomain() {
            return this.protocolMountTargetDomain;
        }

        /**
         * @return protocolServiceId
         */
        public String getProtocolServiceId() {
            return this.protocolServiceId;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
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
            private String accessGroupName; 
            private String createTime; 
            private String description; 
            private String exportId; 
            private String fsetId; 
            private String path; 
            private String protocolMountTargetDomain; 
            private String protocolServiceId; 
            private String protocolType; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * <p>The permission group that is associated with the export directory of the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_VPC_GROUP_NAME</p>
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * <p>The time when the export directory of the protocol service was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-12T07:28:38Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the export directory for the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the export directory for the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>exp-19abf5beab8d****</p>
             */
            public Builder exportId(String exportId) {
                this.exportId = exportId;
                return this;
            }

            /**
             * <p>The fileset ID of the export directory for the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>fset-1902718ea0ae****</p>
             */
            public Builder fsetId(String fsetId) {
                this.fsetId = fsetId;
                return this;
            }

            /**
             * <p>The export directory of the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>/path/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The domain name of the export directory for the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>cpfs-123****.cn-hangzhou.cpfs.aliyuncs.com</p>
             */
            public Builder protocolMountTargetDomain(String protocolMountTargetDomain) {
                this.protocolMountTargetDomain = protocolMountTargetDomain;
                return this;
            }

            /**
             * <p>The ID of the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>ptc-123****</p>
             */
            public Builder protocolServiceId(String protocolServiceId) {
                this.protocolServiceId = protocolServiceId;
                return this;
            }

            /**
             * <p>The protocol type supported by the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>NFS</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The status of the mount target.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch ID of the export directory for the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2vc3c2lybvdllxyq4****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID of the export directory for the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2vct297b8157bth9z****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ProtocolMountTargets build() {
                return new ProtocolMountTargets(this);
            } 

        } 

    }
}
