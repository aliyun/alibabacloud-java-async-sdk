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
 * {@link GetProtocolMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>GetProtocolMountTargetResponseBody</p>
 */
public class GetProtocolMountTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProtocolMountTarget")
    private ProtocolMountTarget protocolMountTarget;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProtocolMountTargetResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.protocolMountTarget = builder.protocolMountTarget;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProtocolMountTargetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return protocolMountTarget
     */
    public ProtocolMountTarget getProtocolMountTarget() {
        return this.protocolMountTarget;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private ProtocolMountTarget protocolMountTarget; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProtocolMountTargetResponseBody model) {
            this.nextToken = model.nextToken;
            this.protocolMountTarget = model.protocolMountTarget;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>M18xMA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Information of the export directory for the protocol service</p>
         */
        public Builder protocolMountTarget(ProtocolMountTarget protocolMountTarget) {
            this.protocolMountTarget = protocolMountTarget;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6299428C-3861-435D-AE54-9B330A00****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProtocolMountTargetResponseBody build() {
            return new GetProtocolMountTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProtocolMountTargetResponseBody} extends {@link TeaModel}
     *
     * <p>GetProtocolMountTargetResponseBody</p>
     */
    public static class ProtocolMountTarget extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ProtocolMountTarget(Builder builder) {
            this.accessGroupName = builder.accessGroupName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.exportId = builder.exportId;
            this.fsetId = builder.fsetId;
            this.path = builder.path;
            this.protocolMountTargetDomain = builder.protocolMountTargetDomain;
            this.protocolType = builder.protocolType;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolMountTarget create() {
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
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
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
            private String protocolType; 
            private String status; 
            private String vSwitchId; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(ProtocolMountTarget model) {
                this.accessGroupName = model.accessGroupName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.exportId = model.exportId;
                this.fsetId = model.fsetId;
                this.path = model.path;
                this.protocolMountTargetDomain = model.protocolMountTargetDomain;
                this.protocolType = model.protocolType;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The name of the permission group.</p>
             * <p>Default permission group: DEFAULT\_VPC\_GROUP\_NAME</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT_VPC_GROUP_NAME</p>
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * <p>The time when the export directory was created. Return format: yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-22 17:49:25</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the export directory.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the export directory.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the export directory.</p>
             * 
             * <strong>example:</strong>
             * <p>exp-19abf5beab8d****</p>
             */
            public Builder exportId(String exportId) {
                this.exportId = exportId;
                return this;
            }

            /**
             * <p>The fileset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fset-299b4ca04de8****</p>
             */
            public Builder fsetId(String fsetId) {
                this.fsetId = fsetId;
                return this;
            }

            /**
             * <p>The path of the CPFS directory that was queried.</p>
             * <p>Format:</p>
             * <ul>
             * <li>Must be 1 to 1,024 characters in length.</li>
             * <li>Must be encoded in UTF-8.</li>
             * <li>Must start and end with a forward slash (/). The root directory is <code>/</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The domain name of the export directory for the protocol service.</p>
             * 
             * <strong>example:</strong>
             * <p>cpfs-0229cb80bcc0****-x******.cn-*****.cpfs.aliyuncs.com</p>
             */
            public Builder protocolMountTargetDomain(String protocolMountTargetDomain) {
                this.protocolMountTargetDomain = protocolMountTargetDomain;
                return this;
            }

            /**
             * <p>The protocol type of the file system.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>NFS: Network File System (NFS)</li>
             * <li>SMB: Server Message Block (SMB)</li>
             * <li>cpfs: The protocol type supported by the CPFS file system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NFS</p>
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * <p>The status of the export directory. Valid values:</p>
             * <ul>
             * <li>CREATING: The export directory is being created.</li>
             * <li>AVAILABLE : The export directory is available.</li>
             * <li>MODIFYING: The export directory is being modified.</li>
             * <li>DELETING: The export directory is being deleted.</li>
             * <li>STOPPING: The export directory is being stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vSwitch ID of the export directory.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-8vb2qjnxs6hiobzve****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The vSwitch ID list of the export directory.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID of the export directory.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1h5mxoqfuo3xurf****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ProtocolMountTarget build() {
                return new ProtocolMountTarget(this);
            } 

        } 

    }
}
