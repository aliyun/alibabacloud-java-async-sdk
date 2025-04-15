// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListApprovalProcessesForApprovalSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListApprovalProcessesForApprovalSchemasRequest</p>
 */
public class ListApprovalProcessesForApprovalSchemasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> schemaIds;

    private ListApprovalProcessesForApprovalSchemasRequest(Builder builder) {
        super(builder);
        this.schemaIds = builder.schemaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalProcessesForApprovalSchemasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return schemaIds
     */
    public java.util.List<String> getSchemaIds() {
        return this.schemaIds;
    }

    public static final class Builder extends Request.Builder<ListApprovalProcessesForApprovalSchemasRequest, Builder> {
        private java.util.List<String> schemaIds; 

        private Builder() {
            super();
        } 

        private Builder(ListApprovalProcessesForApprovalSchemasRequest request) {
            super(request);
            this.schemaIds = request.schemaIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder schemaIds(java.util.List<String> schemaIds) {
            this.putQueryParameter("SchemaIds", schemaIds);
            this.schemaIds = schemaIds;
            return this;
        }

        @Override
        public ListApprovalProcessesForApprovalSchemasRequest build() {
            return new ListApprovalProcessesForApprovalSchemasRequest(this);
        } 

    } 

}
