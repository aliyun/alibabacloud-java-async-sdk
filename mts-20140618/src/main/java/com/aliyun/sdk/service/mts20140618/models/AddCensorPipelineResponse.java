// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCensorPipelineResponse} extends {@link TeaModel}
 *
 * <p>AddCensorPipelineResponse</p>
 */
public class AddCensorPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCensorPipelineResponseBody body;

    private AddCensorPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCensorPipelineResponse create() {
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
    public AddCensorPipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCensorPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCensorPipelineResponseBody body);

        @Override
        AddCensorPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCensorPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCensorPipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCensorPipelineResponse response) {
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
        public Builder body(AddCensorPipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCensorPipelineResponse build() {
            return new AddCensorPipelineResponse(this);
        } 

    } 

}
