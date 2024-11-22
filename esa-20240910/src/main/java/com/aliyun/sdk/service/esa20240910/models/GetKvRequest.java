// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetKvRequest} extends {@link RequestModel}
 *
 * <p>GetKvRequest</p>
 */
public class GetKvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Base64")
    private Boolean base64;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private GetKvRequest(Builder builder) {
        super(builder);
        this.base64 = builder.base64;
        this.key = builder.key;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return base64
     */
    public Boolean getBase64() {
        return this.base64;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<GetKvRequest, Builder> {
        private Boolean base64; 
        private String key; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(GetKvRequest request) {
            super(request);
            this.base64 = request.base64;
            this.key = request.key;
            this.namespace = request.namespace;
        } 

        /**
         * <p>Specifies whether to decode the value by using Base 64. If you call the <a href="https://help.aliyun.com/document_detail/2850482.html">PutKv</a> operation and set the Base64 parameter to true, set this parameter to true to read the original content.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder base64(Boolean base64) {
            this.putQueryParameter("Base64", base64);
            this.base64 = base64;
            return this;
        }

        /**
         * <p>The key name for the query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_key</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The name of the namespace that you specify when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public GetKvRequest build() {
            return new GetKvRequest(this);
        } 

    } 

}
