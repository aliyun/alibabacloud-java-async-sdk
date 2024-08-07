// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DescribeNamespaceRequest</p>
 */
public class DescribeNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameSpaceShortId")
    private String nameSpaceShortId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    private DescribeNamespaceRequest(Builder builder) {
        super(builder);
        this.nameSpaceShortId = builder.nameSpaceShortId;
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

    public static final class Builder extends Request.Builder<DescribeNamespaceRequest, Builder> {
        private String nameSpaceShortId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNamespaceRequest request) {
            super(request);
            this.nameSpaceShortId = request.nameSpaceShortId;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * The short ID of the namespace. You do not need to specify a region ID. The value of this parameter can be up to 20 characters in length and can contain only lowercase letters and digits.
         */
        public Builder nameSpaceShortId(String nameSpaceShortId) {
            this.putQueryParameter("NameSpaceShortId", nameSpaceShortId);
            this.nameSpaceShortId = nameSpaceShortId;
            return this;
        }

        /**
         * The ID of the namespace. The information about the default namespace cannot be queried or modified. The default namespace cannot be deleted.
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
