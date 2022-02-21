// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpareIpsResponse} extends {@link TeaModel}
 *
 * <p>ListSpareIpsResponse</p>
 */
public class ListSpareIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSpareIpsResponseBody body;

    private ListSpareIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSpareIpsResponse create() {
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
    public ListSpareIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSpareIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSpareIpsResponseBody body);

        @Override
        ListSpareIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSpareIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSpareIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSpareIpsResponse response) {
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
        public Builder body(ListSpareIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSpareIpsResponse build() {
            return new ListSpareIpsResponse(this);
        } 

    } 

}
