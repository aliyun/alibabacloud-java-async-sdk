// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNamespaceRequest</p>
 */
public class CreateNamespaceRequest extends Request {
    @Query
    @NameInMap("EnableMicroRegistration")
    private Boolean enableMicroRegistration;

    @Query
    @NameInMap("NameSpaceShortId")
    private String nameSpaceShortId;

    @Query
    @NameInMap("NamespaceDescription")
    private String namespaceDescription;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("NamespaceName")
    @Validation(required = true)
    private String namespaceName;

    private CreateNamespaceRequest(Builder builder) {
        super(builder);
        this.enableMicroRegistration = builder.enableMicroRegistration;
        this.nameSpaceShortId = builder.nameSpaceShortId;
        this.namespaceDescription = builder.namespaceDescription;
        this.namespaceId = builder.namespaceId;
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableMicroRegistration
     */
    public Boolean getEnableMicroRegistration() {
        return this.enableMicroRegistration;
    }

    /**
     * @return nameSpaceShortId
     */
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
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

    public static final class Builder extends Request.Builder<CreateNamespaceRequest, Builder> {
        private Boolean enableMicroRegistration; 
        private String nameSpaceShortId; 
        private String namespaceDescription; 
        private String namespaceId; 
        private String namespaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateNamespaceRequest request) {
            super(request);
            this.enableMicroRegistration = request.enableMicroRegistration;
            this.nameSpaceShortId = request.nameSpaceShortId;
            this.namespaceDescription = request.namespaceDescription;
            this.namespaceId = request.namespaceId;
            this.namespaceName = request.namespaceName;
        } 

        /**
         * EnableMicroRegistration.
         */
        public Builder enableMicroRegistration(Boolean enableMicroRegistration) {
            this.putQueryParameter("EnableMicroRegistration", enableMicroRegistration);
            this.enableMicroRegistration = enableMicroRegistration;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder nameSpaceShortId(String nameSpaceShortId) {
            this.putQueryParameter("NameSpaceShortId", nameSpaceShortId);
            this.nameSpaceShortId = nameSpaceShortId;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespaceDescription(String namespaceDescription) {
            this.putQueryParameter("NamespaceDescription", namespaceDescription);
            this.namespaceDescription = namespaceDescription;
            return this;
        }

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * cn-beijing:test
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        @Override
        public CreateNamespaceRequest build() {
            return new CreateNamespaceRequest(this);
        } 

    } 

}
