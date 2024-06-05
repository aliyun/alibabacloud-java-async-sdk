// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProtocolMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtocolMountTargetResponseBody</p>
 */
public class DescribeProtocolMountTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProtocolMountTargets")
    private java.util.List < ProtocolMountTargets> protocolMountTargets;

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
    public java.util.List < ProtocolMountTargets> getProtocolMountTargets() {
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
        private java.util.List < ProtocolMountTargets> protocolMountTargets; 
        private String requestId; 

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The export directories of the protocol service.
         */
        public Builder protocolMountTargets(java.util.List < ProtocolMountTargets> protocolMountTargets) {
            this.protocolMountTargets = protocolMountTargets;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProtocolMountTargetResponseBody build() {
            return new DescribeProtocolMountTargetResponseBody(this);
        } 

    } 

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
             * The permission group that is associated with the export directory of the protocol service.
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * The time when the export directory of the protocol service was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the export directory for the protocol service.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the export directory for the protocol service.
             */
            public Builder exportId(String exportId) {
                this.exportId = exportId;
                return this;
            }

            /**
             * The fileset ID of the export directory for the protocol service.
             */
            public Builder fsetId(String fsetId) {
                this.fsetId = fsetId;
                return this;
            }

            /**
             * The export directory of the protocol service.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The domain name of the export directory for the protocol service.
             */
            public Builder protocolMountTargetDomain(String protocolMountTargetDomain) {
                this.protocolMountTargetDomain = protocolMountTargetDomain;
                return this;
            }

            /**
             * The ID of the protocol service.
             */
            public Builder protocolServiceId(String protocolServiceId) {
                this.protocolServiceId = protocolServiceId;
                return this;
            }

            /**
             * The protocol type supported by the protocol service.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The status of the mount target.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The vSwitch ID of the export directory for the protocol service.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The VPC ID of the export directory for the protocol service.
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
