// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListModelVersionsResponse</p>
 */
public class ListModelVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListModelVersionsResponseBody body;

    private ListModelVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListModelVersionsResponse create() {
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
    public ListModelVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListModelVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListModelVersionsResponseBody body);

        @Override
        ListModelVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListModelVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListModelVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListModelVersionsResponse response) {
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
        public Builder body(ListModelVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListModelVersionsResponse build() {
            return new ListModelVersionsResponse(this);
        } 

    } 

}
