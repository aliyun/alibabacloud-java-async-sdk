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
 * {@link CreateMountTargetRequest} extends {@link RequestModel}
 *
 * <p>CreateMountTargetRequest</p>
 */
public class CreateMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupName")
    private String accessGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIpv6")
    private Boolean enableIpv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateMountTargetRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.dryRun = builder.dryRun;
        this.enableIpv6 = builder.enableIpv6;
        this.fileSystemId = builder.fileSystemId;
        this.networkType = builder.networkType;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMountTargetRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableIpv6
     */
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
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

    public static final class Builder extends Request.Builder<CreateMountTargetRequest, Builder> {
        private String accessGroupName; 
        private Boolean dryRun; 
        private Boolean enableIpv6; 
        private String fileSystemId; 
        private String networkType; 
        private String securityGroupId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMountTargetRequest request) {
            super(request);
            this.accessGroupName = request.accessGroupName;
            this.dryRun = request.dryRun;
            this.enableIpv6 = request.enableIpv6;
            this.fileSystemId = request.fileSystemId;
            this.networkType = request.networkType;
            this.securityGroupId = request.securityGroupId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The name of the permission group.</p>
         * <p>This parameter is required when the target file system is a General-purpose NAS file system or an Extreme NAS file system.</p>
         * <p>Default permission group: DEFAULT_VPC_GROUP_NAME (the default permission group for VPCs).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-test</p>
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run to check for existing mount targets. Only CPFS file systems are supported.</p>
         * <p>A dry run checks the validity of parameters and inventory without actually creating a mount target or incurring fees.</p>
         * <ul>
         * <li>true: Perform a dry run. No mount target is created. The system checks whether required parameters are specified, the request format, service limits, and CPFS inventory. If the dry run fails, the corresponding error is returned. If the dry run succeeds, the HTTP status code <code>200</code> is returned, but <code>MountTargetDomain</code> is empty.</li>
         * <li>false: Perform a standard request. If the check succeeds, a mount target is directly created. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to create an IPv6 mount target.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Create an IPv6 mount target.</li>
         * <li>false: Do not create an IPv6 mount target. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>Currently, IPv6 is supported only for Extreme NAS file systems in regions in the Chinese mainland, and the IPv6 feature must be enabled for the file system.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            this.putQueryParameter("EnableIpv6", enableIpv6);
            this.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li><p>General-purpose NAS file system: 31a8e4****.</p>
         * </li>
         * <li><p>Extreme NAS file system: The ID must start with <code>extreme-</code>, for example, extreme-0015****.</p>
         * </li>
         * <li><p>Cloud Parallel File Storage (CPFS): The ID must start with <code>cpfs-</code>, for example, cpfs-125487****.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174494****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The network type of the mount target. Set the value to <strong>Vpc</strong>, which indicates a virtual private cloud (VPC).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Vpc</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1fg655nh68xyz9****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * <p>This parameter is required and valid only when the network type is VPC.
         * Example:
         * When NetworkType is set to VPC, VSwitchId is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zevmwkwyztjuoffg****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * <p>This parameter is required and valid only when the network type is VPC.
         * Example:
         * When NetworkType is set to VPC, VpcId is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zesj9afh3y518k9o****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateMountTargetRequest build() {
            return new CreateMountTargetRequest(this);
        } 

    } 

}
