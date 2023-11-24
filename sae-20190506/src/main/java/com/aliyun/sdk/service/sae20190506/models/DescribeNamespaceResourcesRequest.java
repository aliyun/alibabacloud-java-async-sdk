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
    @NameInMap("NameSpaceShortId")
    private String nameSpaceShortId;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    private DescribeNamespaceResourcesRequest(Builder builder) {
        super(builder);
        this.nameSpaceShortId = builder.nameSpaceShortId;
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
     * @return nameSpaceShortId
     */
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<DescribeNamespaceResourcesRequest, Builder> {
        private String nameSpaceShortId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNamespaceResourcesRequest request) {
            super(request);
            this.nameSpaceShortId = request.nameSpaceShortId;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * NameSpaceShortId.
         */
        public Builder nameSpaceShortId(String nameSpaceShortId) {
            this.putQueryParameter("NameSpaceShortId", nameSpaceShortId);
            this.nameSpaceShortId = nameSpaceShortId;
            return this;
        }

        /**
         * cn-shanghai:test
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
