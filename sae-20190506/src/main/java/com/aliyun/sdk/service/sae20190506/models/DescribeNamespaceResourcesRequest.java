// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeNamespaceResourcesRequest</p>
 */
public class DescribeNamespaceResourcesRequest extends Request {
    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    private DescribeNamespaceResourcesRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespaceResourcesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeNamespaceResourcesRequest, Builder> {
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNamespaceResourcesRequest response) {
            super(response);
            this.namespaceId = response.namespaceId;
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
        public DescribeNamespaceResourcesRequest build() {
            return new DescribeNamespaceResourcesRequest(this);
        } 

    } 

}
