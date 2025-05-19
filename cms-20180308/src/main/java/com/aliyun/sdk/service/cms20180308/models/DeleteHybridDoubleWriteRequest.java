// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DeleteHybridDoubleWriteRequest} extends {@link RequestModel}
 *
 * <p>DeleteHybridDoubleWriteRequest</p>
 */
public class DeleteHybridDoubleWriteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceNamespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceUserId;

    private DeleteHybridDoubleWriteRequest(Builder builder) {
        super(builder);
        this.sourceNamespace = builder.sourceNamespace;
        this.sourceUserId = builder.sourceUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHybridDoubleWriteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceNamespace
     */
    public String getSourceNamespace() {
        return this.sourceNamespace;
    }

    /**
     * @return sourceUserId
     */
    public Long getSourceUserId() {
        return this.sourceUserId;
    }

    public static final class Builder extends Request.Builder<DeleteHybridDoubleWriteRequest, Builder> {
        private String sourceNamespace; 
        private Long sourceUserId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHybridDoubleWriteRequest request) {
            super(request);
            this.sourceNamespace = request.sourceNamespace;
            this.sourceUserId = request.sourceUserId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-source</p>
         */
        public Builder sourceNamespace(String sourceNamespace) {
            this.putQueryParameter("SourceNamespace", sourceNamespace);
            this.sourceNamespace = sourceNamespace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12706766********</p>
         */
        public Builder sourceUserId(Long sourceUserId) {
            this.putQueryParameter("SourceUserId", sourceUserId);
            this.sourceUserId = sourceUserId;
            return this;
        }

        @Override
        public DeleteHybridDoubleWriteRequest build() {
            return new DeleteHybridDoubleWriteRequest(this);
        } 

    } 

}
