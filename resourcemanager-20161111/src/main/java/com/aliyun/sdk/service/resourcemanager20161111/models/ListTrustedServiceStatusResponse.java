// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrustedServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>ListTrustedServiceStatusResponse</p>
 */
public class ListTrustedServiceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTrustedServiceStatusResponseBody body;

    private ListTrustedServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTrustedServiceStatusResponse create() {
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
    public ListTrustedServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTrustedServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTrustedServiceStatusResponseBody body);

        @Override
        ListTrustedServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTrustedServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTrustedServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTrustedServiceStatusResponse response) {
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
        public Builder body(ListTrustedServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTrustedServiceStatusResponse build() {
            return new ListTrustedServiceStatusResponse(this);
        } 

    } 

}
