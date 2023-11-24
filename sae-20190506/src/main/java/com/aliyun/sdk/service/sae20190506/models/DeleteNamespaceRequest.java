// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteNamespaceRequest</p>
 */
public class DeleteNamespaceRequest extends Request {
    @Query
    @NameInMap("NameSpaceShortId")
    private String nameSpaceShortId;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    private DeleteNamespaceRequest(Builder builder) {
        super(builder);
        this.nameSpaceShortId = builder.nameSpaceShortId;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNamespaceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteNamespaceRequest, Builder> {
        private String nameSpaceShortId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNamespaceRequest request) {
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
         * cn-beijing:test
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public DeleteNamespaceRequest build() {
            return new DeleteNamespaceRequest(this);
        } 

    } 

}
