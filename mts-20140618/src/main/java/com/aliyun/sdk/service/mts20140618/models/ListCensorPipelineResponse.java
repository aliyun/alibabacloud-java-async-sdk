// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCensorPipelineResponse} extends {@link TeaModel}
 *
 * <p>ListCensorPipelineResponse</p>
 */
public class ListCensorPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCensorPipelineResponseBody body;

    private ListCensorPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCensorPipelineResponse create() {
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
    public ListCensorPipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCensorPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCensorPipelineResponseBody body);

        @Override
        ListCensorPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCensorPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCensorPipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCensorPipelineResponse response) {
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
        public Builder body(ListCensorPipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCensorPipelineResponse build() {
            return new ListCensorPipelineResponse(this);
        } 

    } 

}
