// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationClientSecretsResponse} extends {@link TeaModel}
 *
 * <p>ListApplicationClientSecretsResponse</p>
 */
public class ListApplicationClientSecretsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApplicationClientSecretsResponseBody body;

    private ListApplicationClientSecretsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApplicationClientSecretsResponse create() {
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
    public ListApplicationClientSecretsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApplicationClientSecretsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApplicationClientSecretsResponseBody body);

        @Override
        ListApplicationClientSecretsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApplicationClientSecretsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApplicationClientSecretsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApplicationClientSecretsResponse response) {
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
        public Builder body(ListApplicationClientSecretsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApplicationClientSecretsResponse build() {
            return new ListApplicationClientSecretsResponse(this);
        } 

    } 

}
