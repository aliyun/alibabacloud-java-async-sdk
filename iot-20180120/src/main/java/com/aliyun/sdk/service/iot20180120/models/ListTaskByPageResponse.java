// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskByPageResponse} extends {@link TeaModel}
 *
 * <p>ListTaskByPageResponse</p>
 */
public class ListTaskByPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTaskByPageResponseBody body;

    private ListTaskByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTaskByPageResponse create() {
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
    public ListTaskByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTaskByPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTaskByPageResponseBody body);

        @Override
        ListTaskByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTaskByPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTaskByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTaskByPageResponse response) {
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
        public Builder body(ListTaskByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTaskByPageResponse build() {
            return new ListTaskByPageResponse(this);
        } 

    } 

}
