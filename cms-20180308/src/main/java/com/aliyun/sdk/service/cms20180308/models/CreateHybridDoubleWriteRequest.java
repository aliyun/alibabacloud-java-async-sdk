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
 * {@link CreateHybridDoubleWriteRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridDoubleWriteRequest</p>
 */
public class CreateHybridDoubleWriteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceNamespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private CreateHybridDoubleWriteRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.sourceNamespace = builder.sourceNamespace;
        this.sourceUserId = builder.sourceUserId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHybridDoubleWriteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateHybridDoubleWriteRequest, Builder> {
        private String namespace; 
        private String sourceNamespace; 
        private Long sourceUserId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHybridDoubleWriteRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.sourceNamespace = request.sourceNamespace;
            this.sourceUserId = request.sourceUserId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-target</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12706766********</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateHybridDoubleWriteRequest build() {
            return new CreateHybridDoubleWriteRequest(this);
        } 

    } 

}
