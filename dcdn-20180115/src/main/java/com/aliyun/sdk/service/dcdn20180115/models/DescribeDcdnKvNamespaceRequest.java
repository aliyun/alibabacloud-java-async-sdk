// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnKvNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnKvNamespaceRequest</p>
 */
public class DescribeDcdnKvNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    private DescribeDcdnKvNamespaceRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnKvNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnKvNamespaceRequest, Builder> {
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnKvNamespaceRequest request) {
            super(request);
            this.namespace = request.namespace;
        } 

        /**
         * <p>The name of the namespace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public DescribeDcdnKvNamespaceRequest build() {
            return new DescribeDcdnKvNamespaceRequest(this);
        } 

    } 

}
