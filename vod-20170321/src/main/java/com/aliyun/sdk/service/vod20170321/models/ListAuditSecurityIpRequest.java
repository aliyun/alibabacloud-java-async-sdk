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
 * {@link ListAuditSecurityIpRequest} extends {@link RequestModel}
 *
 * <p>ListAuditSecurityIpRequest</p>
 */
public class ListAuditSecurityIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
    private String securityGroupName;

    private ListAuditSecurityIpRequest(Builder builder) {
        super(builder);
        this.securityGroupName = builder.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuditSecurityIpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public static final class Builder extends Request.Builder<ListAuditSecurityIpRequest, Builder> {
        private String securityGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ListAuditSecurityIpRequest request) {
            super(request);
            this.securityGroupName = request.securityGroupName;
        } 

        /**
         * <p>The name of the review security group in which you want to query IP addresses. If you do not specify this parameter, IP addresses in all review security groups are queried.</p>
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
        public ListAuditSecurityIpRequest build() {
            return new ListAuditSecurityIpRequest(this);
        } 

    } 

}
