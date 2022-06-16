// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDeployConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeployConfigRequest</p>
 */
public class DeleteDeployConfigRequest extends Request {
    @Query
    @NameInMap("SchemaId")
    @Validation(required = true)
    private Long schemaId;

    private DeleteDeployConfigRequest(Builder builder) {
        super(builder);
        this.schemaId = builder.schemaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeployConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return schemaId
     */
    public Long getSchemaId() {
        return this.schemaId;
    }

    public static final class Builder extends Request.Builder<DeleteDeployConfigRequest, Builder> {
        private Long schemaId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeployConfigRequest request) {
            super(request);
            this.schemaId = request.schemaId;
        } 

        /**
         * SchemaId.
         */
        public Builder schemaId(Long schemaId) {
            this.putQueryParameter("SchemaId", schemaId);
            this.schemaId = schemaId;
            return this;
        }

        @Override
        public DeleteDeployConfigRequest build() {
            return new DeleteDeployConfigRequest(this);
        } 

    } 

}
