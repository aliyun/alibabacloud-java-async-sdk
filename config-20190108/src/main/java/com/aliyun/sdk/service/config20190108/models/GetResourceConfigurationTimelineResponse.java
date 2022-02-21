// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceConfigurationTimelineResponse} extends {@link TeaModel}
 *
 * <p>GetResourceConfigurationTimelineResponse</p>
 */
public class GetResourceConfigurationTimelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceConfigurationTimelineResponseBody body;

    private GetResourceConfigurationTimelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceConfigurationTimelineResponse create() {
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
    public GetResourceConfigurationTimelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceConfigurationTimelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceConfigurationTimelineResponseBody body);

        @Override
        GetResourceConfigurationTimelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceConfigurationTimelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceConfigurationTimelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceConfigurationTimelineResponse response) {
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
        public Builder body(GetResourceConfigurationTimelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceConfigurationTimelineResponse build() {
            return new GetResourceConfigurationTimelineResponse(this);
        } 

    } 

}
