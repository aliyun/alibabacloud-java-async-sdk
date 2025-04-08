// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GrantRoleToUsersRequest} extends {@link RequestModel}
 *
 * <p>GrantRoleToUsersRequest</p>
 */
public class GrantRoleToUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userArns")
    private java.util.List<String> userArns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GrantRoleToUsersRequest(Builder builder) {
        super(builder);
        this.roleArn = builder.roleArn;
        this.userArns = builder.userArns;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantRoleToUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return userArns
     */
    public java.util.List<String> getUserArns() {
        return this.userArns;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GrantRoleToUsersRequest, Builder> {
        private String roleArn; 
        private java.util.List<String> userArns; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GrantRoleToUsersRequest request) {
            super(request);
            this.roleArn = request.roleArn;
            this.userArns = request.userArns;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:emr::w-975bcfda9625****:role/Owner</p>
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("roleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The user ARNs.</p>
         */
        public Builder userArns(java.util.List<String> userArns) {
            this.putBodyParameter("userArns", userArns);
            this.userArns = userArns;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GrantRoleToUsersRequest build() {
            return new GrantRoleToUsersRequest(this);
        } 

    } 

}
