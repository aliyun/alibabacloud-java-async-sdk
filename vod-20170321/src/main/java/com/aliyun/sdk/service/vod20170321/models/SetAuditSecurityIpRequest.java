// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The IP addresses that you want to add to the review security group. You can add a maximum of 100 IP addresses to a review security group. Separate multiple IP addresses with commas (,). You can add IP addresses in the following formats to review security groups:
         * <p>
         * 
         * *   IP address: 192.168.0.1
         * *   CIDR block: 192.168.0.1/24. /24 indicates that the prefix of the CIDR block is 24 bits in length. You can replace 24 with a value that ranges `from 1 to 32`.
         */
        public Builder ips(String ips) {
            this.putQueryParameter("Ips", ips);
            this.ips = ips;
            return this;
        }

        /**
         * The operation type. Valid values:
         * <p>
         * 
         * *   **Append** (default): adds the IP addresses to the original whitelist.
         * *   **Cover**: overwrites the original whitelist.
         * *   **Delete**: removes the IP addresses from the original whitelist.
         * 
         * >  If the value that you specify is invalid, the default value is used.
         */
        public Builder operateMode(String operateMode) {
            this.putQueryParameter("OperateMode", operateMode);
            this.operateMode = operateMode;
            return this;
        }

        /**
         * The name of the review security group. Default value: **Default**. You can specify a maximum of 10 review security groups.
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
