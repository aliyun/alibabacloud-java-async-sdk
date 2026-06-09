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
 * {@link GetTableRequest} extends {@link RequestModel}
 *
 * <p>GetTableRequest</p>
 */
public class GetTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    private String catalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    private GetTableRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.clientToken = builder.clientToken;
        this.name = builder.name;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<GetTableRequest, Builder> {
        private String catalog; 
        private String clientToken; 
        private String name; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(GetTableRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.clientToken = request.clientToken;
            this.name = request.name;
            this.namespace = request.namespace;
        } 

        /**
         * <p>表所属的数据目录名称。可通过 ListCatalogs 获取</p>
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
         * <p>用于保证请求幂等性的Token。建议使用 UUID</p>
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
         * <p>要查询的事件表名称。需同时指定所属 Catalog 和 Namespace。可通过 ListTables 获取已有表列表</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_table</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>表所属的命名空间名称。可通过 ListNamespaces 获取</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public GetTableRequest build() {
            return new GetTableRequest(this);
        } 

    } 

}
