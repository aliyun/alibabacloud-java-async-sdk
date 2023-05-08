// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryRaspAppInfoResponse} extends {@link TeaModel}
 *
 * <p>ListQueryRaspAppInfoResponse</p>
 */
public class ListQueryRaspAppInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQueryRaspAppInfoResponseBody body;

    private ListQueryRaspAppInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQueryRaspAppInfoResponse create() {
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
    public ListQueryRaspAppInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQueryRaspAppInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQueryRaspAppInfoResponseBody body);

        @Override
        ListQueryRaspAppInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQueryRaspAppInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQueryRaspAppInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQueryRaspAppInfoResponse response) {
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
        public Builder body(ListQueryRaspAppInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQueryRaspAppInfoResponse build() {
            return new ListQueryRaspAppInfoResponse(this);
        } 

    } 

}
