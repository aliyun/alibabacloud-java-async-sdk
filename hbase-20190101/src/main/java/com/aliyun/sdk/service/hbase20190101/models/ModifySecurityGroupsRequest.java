// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-bp16f1441y6p2kv**</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-t4ng4yyc916o81nu****,sg-x4gg4dyc9d6w********</p>
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
