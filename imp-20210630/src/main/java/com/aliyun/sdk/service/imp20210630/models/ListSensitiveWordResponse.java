// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitiveWordResponse} extends {@link TeaModel}
 *
 * <p>ListSensitiveWordResponse</p>
 */
public class ListSensitiveWordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSensitiveWordResponseBody body;

    private ListSensitiveWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSensitiveWordResponse create() {
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
    public ListSensitiveWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSensitiveWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSensitiveWordResponseBody body);

        @Override
        ListSensitiveWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSensitiveWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSensitiveWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSensitiveWordResponse response) {
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
        public Builder body(ListSensitiveWordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSensitiveWordResponse build() {
            return new ListSensitiveWordResponse(this);
        } 

    } 

}
