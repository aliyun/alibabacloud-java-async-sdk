// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseMergeRequestResponse} extends {@link TeaModel}
 *
 * <p>CloseMergeRequestResponse</p>
 */
public class CloseMergeRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseMergeRequestResponseBody body;

    private CloseMergeRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseMergeRequestResponse create() {
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
    public CloseMergeRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseMergeRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseMergeRequestResponseBody body);

        @Override
        CloseMergeRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseMergeRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseMergeRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseMergeRequestResponse response) {
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
        public Builder body(CloseMergeRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseMergeRequestResponse build() {
            return new CloseMergeRequestResponse(this);
        } 

    } 

}
