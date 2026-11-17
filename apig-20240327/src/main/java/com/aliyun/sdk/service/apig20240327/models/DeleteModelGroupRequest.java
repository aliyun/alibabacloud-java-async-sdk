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
 * {@link DeleteModelGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelGroupRequest</p>
 */
public class DeleteModelGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expectedVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedVersion;

    private DeleteModelGroupRequest(Builder builder) {
        super(builder);
        this.modelGroupId = builder.modelGroupId;
        this.expectedVersion = builder.expectedVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelGroupId
     */
    public String getModelGroupId() {
        return this.modelGroupId;
    }

    /**
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public static final class Builder extends Request.Builder<DeleteModelGroupRequest, Builder> {
        private String modelGroupId; 
        private Long expectedVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelGroupRequest request) {
            super(request);
            this.modelGroupId = request.modelGroupId;
            this.expectedVersion = request.expectedVersion;
        } 

        /**
         * <p>The model group ID. Use the modelGroupId returned by CreateModelGroup.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mg-d00000000000000000000</p>
         */
        public Builder modelGroupId(String modelGroupId) {
            this.putPathParameter("modelGroupId", modelGroupId);
            this.modelGroupId = modelGroupId;
            return this;
        }

        /**
         * <p>The expected version. Only this version is deleted. API saved-state references prevent deletion, and authorization references are cleared.</p>
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
        public DeleteModelGroupRequest build() {
            return new DeleteModelGroupRequest(this);
        } 

    } 

}
