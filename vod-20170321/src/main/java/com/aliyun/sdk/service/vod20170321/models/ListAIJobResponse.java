// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAIJobResponse} extends {@link TeaModel}
 *
 * <p>ListAIJobResponse</p>
 */
public class ListAIJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAIJobResponseBody body;

    private ListAIJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAIJobResponse create() {
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
    public ListAIJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAIJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAIJobResponseBody body);

        @Override
        ListAIJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAIJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAIJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAIJobResponse response) {
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
        public Builder body(ListAIJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAIJobResponse build() {
            return new ListAIJobResponse(this);
        } 

    } 

}
