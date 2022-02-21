// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListProjectTemplatesResponse</p>
 */
public class ListProjectTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProjectTemplatesResponseBody body;

    private ListProjectTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProjectTemplatesResponse create() {
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
    public ListProjectTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProjectTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProjectTemplatesResponseBody body);

        @Override
        ListProjectTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProjectTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProjectTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProjectTemplatesResponse response) {
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
        public Builder body(ListProjectTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProjectTemplatesResponse build() {
            return new ListProjectTemplatesResponse(this);
        } 

    } 

}
