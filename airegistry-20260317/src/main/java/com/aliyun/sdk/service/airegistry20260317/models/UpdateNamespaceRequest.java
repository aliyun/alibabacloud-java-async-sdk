// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link UpdateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceRequest</p>
 */
public class UpdateNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanPolicy")
    private String scanPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private UpdateNamespaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.namespaceId = builder.namespaceId;
        this.scanPolicy = builder.scanPolicy;
        this.tags = builder.tags;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return scanPolicy
     */
    public String getScanPolicy() {
        return this.scanPolicy;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateNamespaceRequest, Builder> {
        private String description; 
        private String name; 
        private String namespaceId; 
        private String scanPolicy; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNamespaceRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.namespaceId = request.namespaceId;
            this.scanPolicy = request.scanPolicy;
            this.tags = request.tags;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * ScanPolicy.
         */
        public Builder scanPolicy(String scanPolicy) {
            this.putQueryParameter("ScanPolicy", scanPolicy);
            this.scanPolicy = scanPolicy;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateNamespaceRequest build() {
            return new UpdateNamespaceRequest(this);
        } 

    } 

}
