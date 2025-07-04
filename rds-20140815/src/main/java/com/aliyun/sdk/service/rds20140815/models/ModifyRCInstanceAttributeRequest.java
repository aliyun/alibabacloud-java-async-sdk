// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyRCInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCInstanceAttributeRequest</p>
 */
public class ModifyRCInstanceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reboot")
    private Boolean reboot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private java.util.List<String> securityGroupIds;

    private ModifyRCInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.deletionProtection = builder.deletionProtection;
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.instanceIds = builder.instanceIds;
        this.password = builder.password;
        this.reboot = builder.reboot;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.securityGroupIds = builder.securityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCInstanceAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return reboot
     */
    public Boolean getReboot() {
        return this.reboot;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static final class Builder extends Request.Builder<ModifyRCInstanceAttributeRequest, Builder> {
        private Boolean deletionProtection; 
        private String hostName; 
        private String instanceId; 
        private java.util.List<String> instanceIds; 
        private String password; 
        private Boolean reboot; 
        private String regionId; 
        private String securityGroupId; 
        private java.util.List<String> securityGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCInstanceAttributeRequest request) {
            super(request);
            this.deletionProtection = request.deletionProtection;
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.instanceIds = request.instanceIds;
            this.password = request.password;
            this.reboot = request.reboot;
            this.regionId = request.regionId;
            this.securityGroupId = request.securityGroupId;
            this.securityGroupIds = request.securityGroupIds;
        } 

        /**
         * <p>Specifies whether to enable the release protection feature for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the release protection feature.</li>
         * <li><strong>false</strong> (default): does not enable the release protection feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The hostname of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testHost1</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf62br2491p5l****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The new password of the instance.</p>
         * <ul>
         * <li>The value must be 8 to 30 characters in length.</li>
         * <li>The value must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>()</code> ~ ! @ # $ % ^ &amp; * - _ + = `</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2F9e9@a69c!e18b569c8</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Specifies whether to restart the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder reboot(Boolean reboot) {
            this.putQueryParameter("Reboot", reboot);
            this.reboot = reboot;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call the DescribeRegions operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the security group to which the instance is added.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-uf6av412xaxixu****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SecurityGroupIds.
         */
        public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
            String securityGroupIdsShrink = shrink(securityGroupIds, "SecurityGroupIds", "json");
            this.putQueryParameter("SecurityGroupIds", securityGroupIdsShrink);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        @Override
        public ModifyRCInstanceAttributeRequest build() {
            return new ModifyRCInstanceAttributeRequest(this);
        } 

    } 

}
