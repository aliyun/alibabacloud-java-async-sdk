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
 * {@link CreateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateNamespaceRequest</p>
 */
public class CreateNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanPolicy")
    private String scanPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private CreateNamespaceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.scanPolicy = builder.scanPolicy;
        this.tags = builder.tags;
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

    public static final class Builder extends Request.Builder<CreateNamespaceRequest, Builder> {
        private String description; 
        private String name; 
        private String scanPolicy; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateNamespaceRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
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
        public CreateNamespaceRequest build() {
            return new CreateNamespaceRequest(this);
        } 

    } 

}
