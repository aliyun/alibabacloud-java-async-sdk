// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOrganizationMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateOrganizationMemberRequest</p>
 */
public class UpdateOrganizationMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("accountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationMemberName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationMemberName;

    private UpdateOrganizationMemberRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.accountId = builder.accountId;
        this.organizationMemberName = builder.organizationMemberName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOrganizationMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return organizationMemberName
     */
    public String getOrganizationMemberName() {
        return this.organizationMemberName;
    }

    public static final class Builder extends Request.Builder<UpdateOrganizationMemberRequest, Builder> {
        private String organizationId; 
        private String accountId; 
        private String organizationMemberName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOrganizationMemberRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.accountId = request.accountId;
            this.organizationMemberName = request.organizationMemberName;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putPathParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * organizationMemberName.
         */
        public Builder organizationMemberName(String organizationMemberName) {
            this.putQueryParameter("organizationMemberName", organizationMemberName);
            this.organizationMemberName = organizationMemberName;
            return this;
        }

        @Override
        public UpdateOrganizationMemberRequest build() {
            return new UpdateOrganizationMemberRequest(this);
        } 

    } 

}
