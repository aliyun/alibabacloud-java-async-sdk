// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link UpdateNamespaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceRequest</p>
 */
public class UpdateNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    private String catalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 1)
    private String name;

    private UpdateNamespaceRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.clientToken = builder.clientToken;
        this.comment = builder.comment;
        this.name = builder.name;
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
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateNamespaceRequest, Builder> {
        private String catalog; 
        private String clientToken; 
        private String comment; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNamespaceRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.clientToken = request.clientToken;
            this.comment = request.comment;
            this.name = request.name;
        } 

        /**
         * <p>Data catalog</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>Idempotence token</p>
         * 
         * <strong>example:</strong>
         * <p>1e9b8f60-3a2c-4d7e-9f1b-8c3d5e7a2b4f</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Remark description</p>
         * 
         * <strong>example:</strong>
         * <p>更新后的备注</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>Namespace name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateNamespaceRequest build() {
            return new UpdateNamespaceRequest(this);
        } 

    } 

}
