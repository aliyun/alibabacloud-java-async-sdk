// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceCredentialsResponse} extends {@link TeaModel}
 *
 * <p>ListServiceCredentialsResponse</p>
 */
public class ListServiceCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceCredentialsResponseBody body;

    private ListServiceCredentialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceCredentialsResponse create() {
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
    public ListServiceCredentialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceCredentialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceCredentialsResponseBody body);

        @Override
        ListServiceCredentialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceCredentialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceCredentialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceCredentialsResponse response) {
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
        public Builder body(ListServiceCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceCredentialsResponse build() {
            return new ListServiceCredentialsResponse(this);
        } 

    } 

}
