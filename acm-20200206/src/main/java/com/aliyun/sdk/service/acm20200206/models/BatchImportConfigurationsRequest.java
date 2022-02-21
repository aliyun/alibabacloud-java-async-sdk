// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchImportConfigurationsRequest} extends {@link RequestModel}
 *
 * <p>BatchImportConfigurationsRequest</p>
 */
public class BatchImportConfigurationsRequest extends Request {
    @Body
    @NameInMap("FileUrl")
    @Validation(required = true)
    private String fileUrl;

    @Body
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    @Body
    @NameInMap("Policy")
    @Validation(required = true)
    private String policy;

    private BatchImportConfigurationsRequest(Builder builder) {
        super(builder);
        this.fileUrl = builder.fileUrl;
        this.namespaceId = builder.namespaceId;
        this.policy = builder.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchImportConfigurationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    public static final class Builder extends Request.Builder<BatchImportConfigurationsRequest, Builder> {
        private String fileUrl; 
        private String namespaceId; 
        private String policy; 

        private Builder() {
            super();
        } 

        private Builder(BatchImportConfigurationsRequest response) {
            super(response);
            this.fileUrl = response.fileUrl;
            this.namespaceId = response.namespaceId;
            this.policy = response.policy;
        } 

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putBodyParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        @Override
        public BatchImportConfigurationsRequest build() {
            return new BatchImportConfigurationsRequest(this);
        } 

    } 

}
