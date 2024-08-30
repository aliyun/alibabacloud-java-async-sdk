// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigMapRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigMapRequest</p>
 */
public class CreateConfigMapRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    private CreateConfigMapRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigMapRequest create() {
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

    public static final class Builder extends Request.Builder<CreateConfigMapRequest, Builder> {
        private String description; 
        private String name; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigMapRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * The key-value pairs of the ConfigMap in the JSON format. Format:
         * <p>
         * 
         * {"Data":"{"k1":"v1", "k2":"v2"}"}
         * 
         * k specifies a key and v specifies a value. For more information, see [Manage a Kubernetes ConfigMap](~~171326~~).
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the ConfigMap. The name can contain digits, letters, and underscores (_). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the namespace to which the ConfigMap instance belongs.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public CreateConfigMapRequest build() {
            return new CreateConfigMapRequest(this);
        } 

    } 

}
