// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link GetNamespaceRequest} extends {@link RequestModel}
 *
 * <p>GetNamespaceRequest</p>
 */
public class GetNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    private GetNamespaceRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNamespaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<GetNamespaceRequest, Builder> {
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetNamespaceRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public GetNamespaceRequest build() {
            return new GetNamespaceRequest(this);
        } 

    } 

}
