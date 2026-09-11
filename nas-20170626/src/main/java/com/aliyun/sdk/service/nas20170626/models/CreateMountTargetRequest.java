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
         * <p>This parameter is required if the file system is a General-purpose NAS or Extreme NAS file system.</p>
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
         * <p>Specifies whether to check for existing mount targets. Only CPFS file systems are supported.</p>
         * <p>A dry run checks parameter validity and inventory without actually creating a mount target or incurring fees.</p>
         * <ul>
         * <li>true: sends a dry run request without creating a mount target. The check items include required parameters, request format, business limits, and CPFS inventory. If the check fails, the corresponding error is returned. If the check passes, <code>200 HttpCode</code> is returned, but <code>MountTargetDomain</code> is empty.</li>
         * <li>false (default): sends a normal request. After the check passes, a mount target is created.</li>
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
         * <li>true: creates an IPv6 mount target.</li>
         * <li>false (default): does not create an IPv6 mount target.</li>
         * </ul>
         * <blockquote>
         * <p>IPv6 is supported only by Extreme NAS file systems in all regions in the Chinese mainland. The file system must have IPv6 enabled.</p>
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
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>General-purpose NAS: 31a8e4\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>Extreme NAS: The ID must start with <code>extreme-</code>, such as extreme-0015\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>Cloud Parallel File Storage (CPFS): The ID must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
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
         * <p>The security group ID.</p>
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
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required and valid only when the network type is VPC.
         * For example:
         * If NetworkType is set to VPC, VSwitchId is required.</p>
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
         * <p>The VPC ID.</p>
         * <p>This parameter is required and valid only when the network type is VPC.
         * For example:
         * If NetworkType is set to VPC, VpcId is required.</p>
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
