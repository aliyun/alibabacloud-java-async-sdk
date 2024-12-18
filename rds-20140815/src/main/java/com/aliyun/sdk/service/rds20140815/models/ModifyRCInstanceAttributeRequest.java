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
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reboot")
    private Boolean reboot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyRCInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.password = builder.password;
        this.reboot = builder.reboot;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<ModifyRCInstanceAttributeRequest, Builder> {
        private String hostName; 
        private String instanceId; 
        private String password; 
        private Boolean reboot; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCInstanceAttributeRequest request) {
            super(request);
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.password = request.password;
            this.reboot = request.reboot;
            this.regionId = request.regionId;
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

        @Override
        public ModifyRCInstanceAttributeRequest build() {
            return new ModifyRCInstanceAttributeRequest(this);
        } 

    } 

}
