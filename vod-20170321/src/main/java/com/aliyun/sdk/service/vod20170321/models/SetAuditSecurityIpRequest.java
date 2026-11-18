// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SetAuditSecurityIpRequest} extends {@link RequestModel}
 *
 * <p>SetAuditSecurityIpRequest</p>
 */
public class SetAuditSecurityIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ips")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ips;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateMode")
    private String operateMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
    private String securityGroupName;

    private SetAuditSecurityIpRequest(Builder builder) {
        super(builder);
        this.ips = builder.ips;
        this.operateMode = builder.operateMode;
        this.securityGroupName = builder.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAuditSecurityIpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ips
     */
    public String getIps() {
        return this.ips;
    }

    /**
     * @return operateMode
     */
    public String getOperateMode() {
        return this.operateMode;
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public static final class Builder extends Request.Builder<SetAuditSecurityIpRequest, Builder> {
        private String ips; 
        private String operateMode; 
        private String securityGroupName; 

        private Builder() {
            super();
        } 

        private Builder(SetAuditSecurityIpRequest request) {
            super(request);
            this.ips = request.ips;
            this.operateMode = request.operateMode;
            this.securityGroupName = request.securityGroupName;
        } 

        /**
         * <p>The list of security IP addresses for review. Each group supports a maximum of 100 IP addresses. Separate multiple IP addresses with commas (,). The following formats are supported:</p>
         * <ul>
         * <li>Exact IP address: 192.168.0.1</li>
         * <li>CIDR block: 192.168.0.1/24 (Classless Inter-Domain Routing. /24 specifies the length of the prefix in the address. Valid values: <code>[1,32]</code>.)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        public Builder ips(String ips) {
            this.putQueryParameter("Ips", ips);
            this.ips = ips;
            return this;
        }

        /**
         * <p>The operation mode. Valid values:</p>
         * <ul>
         * <li><strong>Append</strong>: default value. Appends IP addresses to the IP address whitelist.</li>
         * <li><strong>Cover</strong>: overwrites the existing IP address whitelist.</li>
         * <li><strong>Delete</strong>: deletes IP addresses from the IP address whitelist.<blockquote>
         * <p>If the specified value is not within the valid values, the default value (Append) is used.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder operateMode(String operateMode) {
            this.putQueryParameter("OperateMode", operateMode);
            this.operateMode = operateMode;
            return this;
        }

        /**
         * <p>The name of the security group for review. Default value: <strong>Default</strong>. A maximum of 10 security groups are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        @Override
        public SetAuditSecurityIpRequest build() {
            return new SetAuditSecurityIpRequest(this);
        } 

    } 

}
