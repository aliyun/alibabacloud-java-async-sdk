// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link CheckDeveloperRoleRequest} extends {@link RequestModel}
 *
 * <p>CheckDeveloperRoleRequest</p>
 */
public class CheckDeveloperRoleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleName")
    private String roleName;

    private CheckDeveloperRoleRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.companyId = builder.companyId;
        this.platform = builder.platform;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDeveloperRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<CheckDeveloperRoleRequest, Builder> {
        private String accountId; 
        private Long companyId; 
        private String platform; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(CheckDeveloperRoleRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.companyId = request.companyId;
            this.platform = request.platform;
            this.roleName = request.roleName;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.putBodyParameter("companyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * roleName.
         */
        public Builder roleName(String roleName) {
            this.putBodyParameter("roleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public CheckDeveloperRoleRequest build() {
            return new CheckDeveloperRoleRequest(this);
        } 

    } 

}
