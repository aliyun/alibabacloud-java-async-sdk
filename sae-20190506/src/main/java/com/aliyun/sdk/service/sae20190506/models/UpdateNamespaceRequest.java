// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceRequest</p>
 */
public class UpdateNamespaceRequest extends Request {
    @Query
    @NameInMap("NamespaceDescription")
    private String namespaceDescription;

    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    @Query
    @NameInMap("NamespaceName")
    @Validation(required = true)
    private String namespaceName;

    private UpdateNamespaceRequest(Builder builder) {
        super(builder);
        this.namespaceDescription = builder.namespaceDescription;
        this.namespaceId = builder.namespaceId;
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceDescription
     */
    public String getNamespaceDescription() {
        return this.namespaceDescription;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public static final class Builder extends Request.Builder<UpdateNamespaceRequest, Builder> {
        private String namespaceDescription; 
        private String namespaceId; 
        private String namespaceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNamespaceRequest request) {
            super(request);
            this.namespaceDescription = request.namespaceDescription;
            this.namespaceId = request.namespaceId;
            this.namespaceName = request.namespaceName;
        } 

        /**
         * NamespaceDescription.
         */
        public Builder namespaceDescription(String namespaceDescription) {
            this.putQueryParameter("NamespaceDescription", namespaceDescription);
            this.namespaceDescription = namespaceDescription;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        @Override
        public UpdateNamespaceRequest build() {
            return new UpdateNamespaceRequest(this);
        } 

    } 

}
