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
 * {@link DeleteAiModelSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteAiModelSourceRequest</p>
 */
public class DeleteAiModelSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expectedVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedVersion;

    private DeleteAiModelSourceRequest(Builder builder) {
        super(builder);
        this.modelSourceId = builder.modelSourceId;
        this.expectedVersion = builder.expectedVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAiModelSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelSourceId
     */
    public String getModelSourceId() {
        return this.modelSourceId;
    }

    /**
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public static final class Builder extends Request.Builder<DeleteAiModelSourceRequest, Builder> {
        private String modelSourceId; 
        private Long expectedVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAiModelSourceRequest request) {
            super(request);
            this.modelSourceId = request.modelSourceId;
            this.expectedVersion = request.expectedVersion;
        } 

        /**
         * <p>The ID of the model source. Use the modelSourceId returned by CreateAiModelSource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-d00000000000000000000</p>
         */
        public Builder modelSourceId(String modelSourceId) {
            this.putPathParameter("modelSourceId", modelSourceId);
            this.modelSourceId = modelSourceId;
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
        public DeleteAiModelSourceRequest build() {
            return new DeleteAiModelSourceRequest(this);
        } 

    } 

}
