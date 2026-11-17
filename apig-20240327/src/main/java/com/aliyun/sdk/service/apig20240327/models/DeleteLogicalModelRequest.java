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
 * {@link DeleteLogicalModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogicalModelRequest</p>
 */
public class DeleteLogicalModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logicalModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logicalModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expectedRevision")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedRevision;

    private DeleteLogicalModelRequest(Builder builder) {
        super(builder);
        this.logicalModelId = builder.logicalModelId;
        this.expectedRevision = builder.expectedRevision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogicalModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logicalModelId
     */
    public String getLogicalModelId() {
        return this.logicalModelId;
    }

    /**
     * @return expectedRevision
     */
    public Long getExpectedRevision() {
        return this.expectedRevision;
    }

    public static final class Builder extends Request.Builder<DeleteLogicalModelRequest, Builder> {
        private String logicalModelId; 
        private Long expectedRevision; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogicalModelRequest request) {
            super(request);
            this.logicalModelId = request.logicalModelId;
            this.expectedRevision = request.expectedRevision;
        } 

        /**
         * <p>The ID of the logical model, which starts with vm-.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vm-xxxxxxxx</p>
         */
        public Builder logicalModelId(String logicalModelId) {
            this.putPathParameter("logicalModelId", logicalModelId);
            this.logicalModelId = logicalModelId;
            return this;
        }

        /**
         * <p>The expected object version number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expectedRevision(Long expectedRevision) {
            this.putQueryParameter("expectedRevision", expectedRevision);
            this.expectedRevision = expectedRevision;
            return this;
        }

        @Override
        public DeleteLogicalModelRequest build() {
            return new DeleteLogicalModelRequest(this);
        } 

    } 

}
