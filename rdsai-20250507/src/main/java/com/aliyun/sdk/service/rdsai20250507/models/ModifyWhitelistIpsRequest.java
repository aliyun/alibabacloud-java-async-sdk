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
 * {@link ModifyWhitelistIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifyWhitelistIpsRequest</p>
 */
public class ModifyWhitelistIpsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpWhitelist")
    private String ipWhitelist;

    private ModifyWhitelistIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ipWhitelist = builder.ipWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWhitelistIpsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipWhitelist
     */
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public static final class Builder extends Request.Builder<ModifyWhitelistIpsRequest, Builder> {
        private String instanceId; 
        private String ipWhitelist; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWhitelistIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ipWhitelist = request.ipWhitelist;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-*********6</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP whitelist. Before you modify the IP whitelist, call the DescribeInstanceIpWhitelist operation to query the existing IP whitelist of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1,192.168.1.0/24</p>
         */
        public Builder ipWhitelist(String ipWhitelist) {
            this.putQueryParameter("IpWhitelist", ipWhitelist);
            this.ipWhitelist = ipWhitelist;
            return this;
        }

        @Override
        public ModifyWhitelistIpsRequest build() {
            return new ModifyWhitelistIpsRequest(this);
        } 

    } 

}
