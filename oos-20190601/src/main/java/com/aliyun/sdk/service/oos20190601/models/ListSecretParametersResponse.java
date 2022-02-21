// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretParametersResponse} extends {@link TeaModel}
 *
 * <p>ListSecretParametersResponse</p>
 */
public class ListSecretParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSecretParametersResponseBody body;

    private ListSecretParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSecretParametersResponse create() {
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
    public ListSecretParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSecretParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSecretParametersResponseBody body);

        @Override
        ListSecretParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSecretParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSecretParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSecretParametersResponse response) {
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
        public Builder body(ListSecretParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSecretParametersResponse build() {
            return new ListSecretParametersResponse(this);
        } 

    } 

}
