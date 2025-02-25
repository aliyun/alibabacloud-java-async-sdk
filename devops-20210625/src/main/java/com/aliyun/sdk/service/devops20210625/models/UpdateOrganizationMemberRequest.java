// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>243721251830762xxx</p>
         */
        public Builder accountId(String accountId) {
            this.putPathParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
