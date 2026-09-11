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
 * {@link CreateProtocolMountTargetRequest} extends {@link RequestModel}
 *
 * <p>CreateProtocolMountTargetRequest</p>
 */
public class CreateProtocolMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupName")
    private String accessGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsetId")
    private String fsetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(maxLength = 1024, minLength = 1)
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolServiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateProtocolMountTargetRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.fsetId = builder.fsetId;
        this.path = builder.path;
        this.protocolServiceId = builder.protocolServiceId;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchIds = builder.vSwitchIds;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProtocolMountTargetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroupName
     */
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
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
     * @return protocolServiceId
     */
    public String getProtocolServiceId() {
        return this.protocolServiceId;
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

    public static final class Builder extends Request.Builder<CreateProtocolMountTargetRequest, Builder> {
        private String accessGroupName; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private String fsetId; 
        private String path; 
        private String protocolServiceId; 
        private String vSwitchId; 
        private java.util.List<String> vSwitchIds; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProtocolMountTargetRequest request) {
            super(request);
            this.accessGroupName = request.accessGroupName;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.fsetId = request.fsetId;
            this.path = request.path;
            this.protocolServiceId = request.protocolServiceId;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchIds = request.vSwitchIds;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The name of the permission group.</p>
         * <p>Default value: DEFAULT_VPC_GROUP_NAME.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique across different requests.</p>
         * <p>ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the protocol service export directory. This is displayed as <strong>Export Directory Name</strong> in the console.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length and can contain letters and Chinese characters.</li>
         * <li>The description must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can contain digits, colons (:), underscores (_), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Description of this export directory</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run for this request. A dry run checks parameter validity and dependencies without actually creating the instance or incurring charges.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true: Sends a dry run request without creating the export directory. The check items include whether required parameters are specified, request format, and business limit dependencies. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned, but ExportId is empty.</p>
         * </li>
         * <li><p>false (default): Sends a normal request. After the check passes, the instance is directly created.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <blockquote>
         * <p>The target CPFS file system must be in the Running state before you call this operation. After creation, it takes approximately 20 to 40 minutes for the file system to reach the Running state. You can call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to poll the Status field (Running indicates ready).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The ID of the fileset to export.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The fileset must already exist.</li>
         * <li>Only one export directory can be created for each fileset.</li>
         * <li>You must specify one and only one of FsetId and Path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        public Builder fsetId(String fsetId) {
            this.putQueryParameter("FsetId", fsetId);
            this.fsetId = fsetId;
            return this;
        }

        /**
         * <p>The path of the CPFS directory to export.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The directory must already exist on the CPFS file system.</li>
         * <li>Only one export can be created for the same directory.</li>
         * <li>You must specify one and only one of FsetId and Path.</li>
         * </ul>
         * <p>Format:</p>
         * <ul>
         * <li>The path must be 1 to 1,024 characters in length.</li>
         * <li>The path must be encoded in UTF-8.</li>
         * <li>The path must start and end with a forward slash (/). The root directory is <code>/</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The ID of the protocol service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ptc-197ed6a00f2b****</p>
         */
        public Builder protocolServiceId(String protocolServiceId) {
            this.putQueryParameter("ProtocolServiceId", protocolServiceId);
            this.protocolServiceId = protocolServiceId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch for the protocol service export.</p>
         * <p>If the storage redundancy type of the file system is not zone-redundant storage (ZRS), this parameter is required when VpcId is specified.</p>
         * <blockquote>
         * <p>The vSwitch must be in the same zone as the target CPFS file system (the ZoneId values must match). You can call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to query the ZoneId field of the file system, and then select a vSwitch in the same zone.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-2vc3c2lybvdllxyq4****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The list of vSwitch IDs for the protocol service export.</p>
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.putQueryParameter("VSwitchIds", vSwitchIds);
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>The ID of the VPC for the protocol service export.</p>
         * <blockquote>
         * <p>The CIDR block of the selected VPC must not overlap with the VPC CIDR block of the target CPFS file system. You can call the DescribeVpcs operation of VPC to query the CidrBlock field of each VPC for comparison, and select a VPC that does not conflict and is in the same zone as the file system.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-2vct297b8157bth9z****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateProtocolMountTargetRequest build() {
            return new CreateProtocolMountTargetRequest(this);
        } 

    } 

}
