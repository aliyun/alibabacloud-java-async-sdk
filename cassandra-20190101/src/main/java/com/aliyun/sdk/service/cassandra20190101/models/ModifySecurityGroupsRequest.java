// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupsRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityGroupsRequest</p>
 */
public class ModifySecurityGroupsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("SecurityGroupIds")
    @Validation(required = true)
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

        private Builder(ModifySecurityGroupsRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.securityGroupIds = response.securityGroupIds;
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
