// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DeleteAiModelSourceModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteAiModelSourceModelRequest</p>
 */
public class DeleteAiModelSourceModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelCardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelCardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expectedVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedVersion;

    private DeleteAiModelSourceModelRequest(Builder builder) {
        super(builder);
        this.modelCardId = builder.modelCardId;
        this.expectedVersion = builder.expectedVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAiModelSourceModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelCardId
     */
    public String getModelCardId() {
        return this.modelCardId;
    }

    /**
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public static final class Builder extends Request.Builder<DeleteAiModelSourceModelRequest, Builder> {
        private String modelCardId; 
        private Long expectedVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAiModelSourceModelRequest request) {
            super(request);
            this.modelCardId = request.modelCardId;
            this.expectedVersion = request.expectedVersion;
        } 

        /**
         * <p>The model identifier. For regular models, use the source model card ID. For logical model entries, use the vm- identifier.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>msc-d00000000000000000000</p>
         */
        public Builder modelCardId(String modelCardId) {
            this.putPathParameter("modelCardId", modelCardId);
            this.modelCardId = modelCardId;
            return this;
        }

        /**
         * <p>The expected object version. Use the version returned by the most recent query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expectedVersion(Long expectedVersion) {
            this.putQueryParameter("expectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        @Override
        public DeleteAiModelSourceModelRequest build() {
            return new DeleteAiModelSourceModelRequest(this);
        } 

    } 

}
