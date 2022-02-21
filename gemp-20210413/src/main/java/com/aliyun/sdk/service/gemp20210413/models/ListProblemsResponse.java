// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemsResponse} extends {@link TeaModel}
 *
 * <p>ListProblemsResponse</p>
 */
public class ListProblemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProblemsResponseBody body;

    private ListProblemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProblemsResponse create() {
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
    public ListProblemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProblemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProblemsResponseBody body);

        @Override
        ListProblemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProblemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProblemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProblemsResponse response) {
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
        public Builder body(ListProblemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProblemsResponse build() {
            return new ListProblemsResponse(this);
        } 

    } 

}
