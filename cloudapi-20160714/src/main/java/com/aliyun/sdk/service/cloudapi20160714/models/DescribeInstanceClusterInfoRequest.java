// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeInstanceClusterInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceClusterInfoRequest</p>
 */
public class DescribeInstanceClusterInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClusterName")
    private String instanceClusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeInstanceClusterInfoRequest(Builder builder) {
        super(builder);
        this.instanceClusterName = builder.instanceClusterName;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceClusterInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceClusterName
     */
    public String getInstanceClusterName() {
        return this.instanceClusterName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceClusterInfoRequest, Builder> {
        private String instanceClusterName; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceClusterInfoRequest request) {
            super(request);
            this.instanceClusterName = request.instanceClusterName;
            this.securityToken = request.securityToken;
        } 

        /**
         * <p>The name of the dedicated instance cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>testvpc</p>
         */
        public Builder instanceClusterName(String instanceClusterName) {
            this.putQueryParameter("InstanceClusterName", instanceClusterName);
            this.instanceClusterName = instanceClusterName;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeInstanceClusterInfoRequest build() {
            return new DescribeInstanceClusterInfoRequest(this);
        } 

    } 

}
