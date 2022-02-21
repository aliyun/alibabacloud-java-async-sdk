// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCredentialsResponse} extends {@link TeaModel}
 *
 * <p>ListCredentialsResponse</p>
 */
public class ListCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCredentialsResponseBody body;

    private ListCredentialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCredentialsResponse create() {
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
    public ListCredentialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCredentialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCredentialsResponseBody body);

        @Override
        ListCredentialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCredentialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCredentialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCredentialsResponse response) {
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
        public Builder body(ListCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCredentialsResponse build() {
            return new ListCredentialsResponse(this);
        } 

    } 

}
