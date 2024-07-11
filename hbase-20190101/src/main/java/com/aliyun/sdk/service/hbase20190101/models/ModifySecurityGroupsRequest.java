// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupsRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityGroupsRequest</p>
 */
public class ModifySecurityGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupIds;

    private ModifySecurityGroupsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.securityGroupIds = builder.securityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return securityGroupIds
     */
    public String getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static final class Builder extends Request.Builder<ModifySecurityGroupsRequest, Builder> {
        private String clusterId; 
        private String securityGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityGroupsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.securityGroupIds = request.securityGroupIds;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * SecurityGroupIds.
         */
        public Builder securityGroupIds(String securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        @Override
        public ModifySecurityGroupsRequest build() {
            return new ModifySecurityGroupsRequest(this);
        } 

    } 

}
