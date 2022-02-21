// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrganizationMemberRequest} extends {@link RequestModel}
 *
 * <p>GetOrganizationMemberRequest</p>
 */
public class GetOrganizationMemberRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    private GetOrganizationMemberRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationMemberRequest create() {
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

    public static final class Builder extends Request.Builder<GetOrganizationMemberRequest, Builder> {
        private String organizationId; 
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(GetOrganizationMemberRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.accountId = response.accountId;
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

        @Override
        public GetOrganizationMemberRequest build() {
            return new GetOrganizationMemberRequest(this);
        } 

    } 

}
