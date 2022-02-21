// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSprintsResponse} extends {@link TeaModel}
 *
 * <p>ListSprintsResponse</p>
 */
public class ListSprintsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSprintsResponseBody body;

    private ListSprintsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSprintsResponse create() {
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
    public ListSprintsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSprintsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSprintsResponseBody body);

        @Override
        ListSprintsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSprintsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSprintsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSprintsResponse response) {
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
        public Builder body(ListSprintsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSprintsResponse build() {
            return new ListSprintsResponse(this);
        } 

    } 

}
