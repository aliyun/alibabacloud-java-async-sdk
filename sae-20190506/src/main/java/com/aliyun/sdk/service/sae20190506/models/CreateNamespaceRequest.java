// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNamespaceRequest</p>
 */
public class CreateNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableMicroRegistration")
    private Boolean enableMicroRegistration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NameSpaceShortId")
    private String nameSpaceShortId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceDescription")
    private String namespaceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The trace ID that is used to query the details of the request.
         */
        public Builder nameSpaceShortId(String nameSpaceShortId) {
            this.putQueryParameter("NameSpaceShortId", nameSpaceShortId);
            this.nameSpaceShortId = nameSpaceShortId;
            return this;
        }

        /**
         * The message returned for the operation.
         */
        public Builder namespaceDescription(String namespaceDescription) {
            this.putQueryParameter("NamespaceDescription", namespaceDescription);
            this.namespaceDescription = namespaceDescription;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The ID of the request.
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
