// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuditSecurityIpRequest} extends {@link RequestModel}
 *
 * <p>ListAuditSecurityIpRequest</p>
 */
public class ListAuditSecurityIpRequest extends Request {
    @Query
    @NameInMap("SecurityGroupName")
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
         * The time when the review security group was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
