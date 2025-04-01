// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeNamespaceResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeNamespaceResourcesRequest</p>
 */
public class DescribeNamespaceResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameSpaceShortId")
    private String nameSpaceShortId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
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
         * <p>cn-shanghai:test</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai:test</p>
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
