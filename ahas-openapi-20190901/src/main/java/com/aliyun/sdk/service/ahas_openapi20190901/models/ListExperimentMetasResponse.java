// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExperimentMetasResponse} extends {@link TeaModel}
 *
 * <p>ListExperimentMetasResponse</p>
 */
public class ListExperimentMetasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExperimentMetasResponseBody body;

    private ListExperimentMetasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExperimentMetasResponse create() {
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
    public ListExperimentMetasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExperimentMetasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExperimentMetasResponseBody body);

        @Override
        ListExperimentMetasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExperimentMetasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExperimentMetasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExperimentMetasResponse response) {
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
        public Builder body(ListExperimentMetasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExperimentMetasResponse build() {
            return new ListExperimentMetasResponse(this);
        } 

    } 

}
