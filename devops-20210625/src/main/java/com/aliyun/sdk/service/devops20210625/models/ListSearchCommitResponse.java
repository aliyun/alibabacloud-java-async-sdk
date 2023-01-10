// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchCommitResponse} extends {@link TeaModel}
 *
 * <p>ListSearchCommitResponse</p>
 */
public class ListSearchCommitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSearchCommitResponseBody body;

    private ListSearchCommitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSearchCommitResponse create() {
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
    public ListSearchCommitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSearchCommitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSearchCommitResponseBody body);

        @Override
        ListSearchCommitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSearchCommitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSearchCommitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSearchCommitResponse response) {
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
        public Builder body(ListSearchCommitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSearchCommitResponse build() {
            return new ListSearchCommitResponse(this);
        } 

    } 

}
