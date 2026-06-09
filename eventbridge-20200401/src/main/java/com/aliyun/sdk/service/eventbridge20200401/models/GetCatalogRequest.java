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
 * {@link GetCatalogRequest} extends {@link RequestModel}
 *
 * <p>GetCatalogRequest</p>
 */
public class GetCatalogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 1)
    private String name;

    private GetCatalogRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetCatalogRequest, Builder> {
        private String clientToken; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.name = request.name;
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
         * <p>要查询的数据目录名称。可通过 ListCatalogs 接口获取已有目录列表</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetCatalogRequest build() {
            return new GetCatalogRequest(this);
        } 

    } 

}
