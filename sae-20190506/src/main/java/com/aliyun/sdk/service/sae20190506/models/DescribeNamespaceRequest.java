// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DescribeNamespaceRequest</p>
 */
public class DescribeNamespaceRequest extends Request {
    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    private DescribeNamespaceRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespaceRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeNamespaceRequest, Builder> {
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNamespaceRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
        } 

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public DescribeNamespaceRequest build() {
            return new DescribeNamespaceRequest(this);
        } 

    } 

}
