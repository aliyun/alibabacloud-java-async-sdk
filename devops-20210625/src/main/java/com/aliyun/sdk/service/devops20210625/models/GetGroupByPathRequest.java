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
 * {@link GetGroupByPathRequest} extends {@link RequestModel}
 *
 * <p>GetGroupByPathRequest</p>
 */
public class GetGroupByPathRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("identity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private GetGroupByPathRequest(Builder builder) {
        super(builder);
        this.identity = builder.identity;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGroupByPathRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<GetGroupByPathRequest, Builder> {
        private String identity; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(GetGroupByPathRequest request) {
            super(request);
            this.identity = request.identity;
            this.organizationId = request.organizationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957/test-group</p>
         */
        public Builder identity(String identity) {
            this.putQueryParameter("identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60de7a6852743a5162b5f957</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public GetGroupByPathRequest build() {
            return new GetGroupByPathRequest(this);
        } 

    } 

}
