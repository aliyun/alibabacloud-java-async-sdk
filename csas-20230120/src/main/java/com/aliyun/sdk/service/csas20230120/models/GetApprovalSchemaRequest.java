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
 * {@link GetApprovalSchemaRequest} extends {@link RequestModel}
 *
 * <p>GetApprovalSchemaRequest</p>
 */
public class GetApprovalSchemaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String schemaId;

    private GetApprovalSchemaRequest(Builder builder) {
        super(builder);
        this.schemaId = builder.schemaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApprovalSchemaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return schemaId
     */
    public String getSchemaId() {
        return this.schemaId;
    }

    public static final class Builder extends Request.Builder<GetApprovalSchemaRequest, Builder> {
        private String schemaId; 

        private Builder() {
            super();
        } 

        private Builder(GetApprovalSchemaRequest request) {
            super(request);
            this.schemaId = request.schemaId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        public Builder schemaId(String schemaId) {
            this.putQueryParameter("SchemaId", schemaId);
            this.schemaId = schemaId;
            return this;
        }

        @Override
        public GetApprovalSchemaRequest build() {
            return new GetApprovalSchemaRequest(this);
        } 

    } 

}
