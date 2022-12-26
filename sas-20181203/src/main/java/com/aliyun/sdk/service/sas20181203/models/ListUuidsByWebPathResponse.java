// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUuidsByWebPathResponse} extends {@link TeaModel}
 *
 * <p>ListUuidsByWebPathResponse</p>
 */
public class ListUuidsByWebPathResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUuidsByWebPathResponseBody body;

    private ListUuidsByWebPathResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUuidsByWebPathResponse create() {
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
    public ListUuidsByWebPathResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUuidsByWebPathResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUuidsByWebPathResponseBody body);

        @Override
        ListUuidsByWebPathResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUuidsByWebPathResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUuidsByWebPathResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUuidsByWebPathResponse response) {
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
        public Builder body(ListUuidsByWebPathResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUuidsByWebPathResponse build() {
            return new ListUuidsByWebPathResponse(this);
        } 

    } 

}
