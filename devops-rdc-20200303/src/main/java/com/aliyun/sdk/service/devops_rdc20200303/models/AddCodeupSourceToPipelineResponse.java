// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCodeupSourceToPipelineResponse} extends {@link TeaModel}
 *
 * <p>AddCodeupSourceToPipelineResponse</p>
 */
public class AddCodeupSourceToPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCodeupSourceToPipelineResponseBody body;

    private AddCodeupSourceToPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCodeupSourceToPipelineResponse create() {
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
    public AddCodeupSourceToPipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCodeupSourceToPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCodeupSourceToPipelineResponseBody body);

        @Override
        AddCodeupSourceToPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCodeupSourceToPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCodeupSourceToPipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCodeupSourceToPipelineResponse response) {
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
        public Builder body(AddCodeupSourceToPipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCodeupSourceToPipelineResponse build() {
            return new AddCodeupSourceToPipelineResponse(this);
        } 

    } 

}
