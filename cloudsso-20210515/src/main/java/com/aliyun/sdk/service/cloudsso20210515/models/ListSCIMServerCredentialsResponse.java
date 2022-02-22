// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSCIMServerCredentialsResponse} extends {@link TeaModel}
 *
 * <p>ListSCIMServerCredentialsResponse</p>
 */
public class ListSCIMServerCredentialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSCIMServerCredentialsResponseBody body;

    private ListSCIMServerCredentialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSCIMServerCredentialsResponse create() {
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
    public ListSCIMServerCredentialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSCIMServerCredentialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSCIMServerCredentialsResponseBody body);

        @Override
        ListSCIMServerCredentialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSCIMServerCredentialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSCIMServerCredentialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSCIMServerCredentialsResponse response) {
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
        public Builder body(ListSCIMServerCredentialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSCIMServerCredentialsResponse build() {
            return new ListSCIMServerCredentialsResponse(this);
        } 

    } 

}
