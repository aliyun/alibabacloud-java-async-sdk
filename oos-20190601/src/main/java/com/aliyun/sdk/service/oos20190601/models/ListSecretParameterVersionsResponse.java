// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretParameterVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListSecretParameterVersionsResponse</p>
 */
public class ListSecretParameterVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSecretParameterVersionsResponseBody body;

    private ListSecretParameterVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSecretParameterVersionsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ListSecretParameterVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSecretParameterVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSecretParameterVersionsResponseBody body);

        @Override
        ListSecretParameterVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSecretParameterVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSecretParameterVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSecretParameterVersionsResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ListSecretParameterVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSecretParameterVersionsResponse build() {
            return new ListSecretParameterVersionsResponse(this);
        } 

    } 

}
