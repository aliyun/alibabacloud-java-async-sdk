// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ModifyInstanceIpWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceIpWhitelistRequest</p>
 */
public class ModifyInstanceIpWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpWhitelist")
    private String ipWhitelist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyInstanceIpWhitelistRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.groupName = builder.groupName;
        this.instanceName = builder.instanceName;
        this.ipWhitelist = builder.ipWhitelist;
        this.modifyMode = builder.modifyMode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceIpWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return ipWhitelist
     */
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceIpWhitelistRequest, Builder> {
        private String clientToken; 
        private String groupName; 
        private String instanceName; 
        private String ipWhitelist; 
        private String modifyMode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceIpWhitelistRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.groupName = request.groupName;
            this.instanceName = request.instanceName;
            this.ipWhitelist = request.ipWhitelist;
            this.modifyMode = request.modifyMode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The method that is used to modify the IP address whitelist. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong> (default): Uses the IP addresses and CIDR blocks that are specified in the <strong>IpWhitelist</strong> parameter to <strong>overwrite</strong> the existing ones in the current whitelist.</li>
         * <li><strong>Append</strong>: <strong>Appends</strong> the IP addresses and CIDR blocks that are specified in the <strong>IpWhitelist</strong> parameter to the current whitelist.</li>
         * <li><strong>Delete</strong>: <strong>Deletes</strong> the IP addresses and CIDR blocks that are specified in the <strong>IpWhitelist</strong> parameter from the current whitelist. You must retain at least one IP address or CIDR block.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The idempotency token. The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10.23.XXX.XXX</p>
         */
        public Builder ipWhitelist(String ipWhitelist) {
            this.putQueryParameter("IpWhitelist", ipWhitelist);
            this.ipWhitelist = ipWhitelist;
            return this;
        }

        /**
         * <p>The IP address whitelist. Before you modify the IP address whitelist, call the DescribeInstanceIpWhitelist operation to query the existing IP address whitelist of the instance.</p>
         * <p><strong>Configuration rules</strong></p>
         * <ul>
         * <li>You can configure IP addresses (such as 10.23.XXX.XXX) or CIDR blocks (such as 10.23.XXX.XXX/24).</li>
         * <li>Separate multiple IP addresses or CIDR blocks with commas (,) and do not add spaces preceding or following the commas.</li>
         * <li>You can configure up to 1,000 IP addresses and CIDR blocks in total for each instance. If you want to add a large number of IP addresses, we recommend that you merge the IP addresses into CIDR blocks, such as 10.23.XXX.XXX/24.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * <p>The operation that you want to perform. Set the value to <strong>ModifyInstanceIpWhitelist</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyInstanceIpWhitelistRequest build() {
            return new ModifyInstanceIpWhitelistRequest(this);
        } 

    } 

}
