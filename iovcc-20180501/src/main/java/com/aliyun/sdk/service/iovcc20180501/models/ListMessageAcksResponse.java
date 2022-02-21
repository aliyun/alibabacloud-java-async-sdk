// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageAcksResponse} extends {@link TeaModel}
 *
 * <p>ListMessageAcksResponse</p>
 */
public class ListMessageAcksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMessageAcksResponseBody body;

    private ListMessageAcksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMessageAcksResponse create() {
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
    public ListMessageAcksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMessageAcksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMessageAcksResponseBody body);

        @Override
        ListMessageAcksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMessageAcksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMessageAcksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMessageAcksResponse response) {
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
        public Builder body(ListMessageAcksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMessageAcksResponse build() {
            return new ListMessageAcksResponse(this);
        } 

    } 

}
