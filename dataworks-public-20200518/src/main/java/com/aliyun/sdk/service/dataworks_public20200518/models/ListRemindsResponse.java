// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemindsResponse} extends {@link TeaModel}
 *
 * <p>ListRemindsResponse</p>
 */
public class ListRemindsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRemindsResponseBody body;

    private ListRemindsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRemindsResponse create() {
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
    public ListRemindsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRemindsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRemindsResponseBody body);

        @Override
        ListRemindsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRemindsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRemindsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRemindsResponse response) {
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
        public Builder body(ListRemindsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRemindsResponse build() {
            return new ListRemindsResponse(this);
        } 

    } 

}
