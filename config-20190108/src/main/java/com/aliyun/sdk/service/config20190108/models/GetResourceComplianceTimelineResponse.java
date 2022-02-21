// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceComplianceTimelineResponse} extends {@link TeaModel}
 *
 * <p>GetResourceComplianceTimelineResponse</p>
 */
public class GetResourceComplianceTimelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceComplianceTimelineResponseBody body;

    private GetResourceComplianceTimelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceComplianceTimelineResponse create() {
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
    public GetResourceComplianceTimelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceComplianceTimelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceComplianceTimelineResponseBody body);

        @Override
        GetResourceComplianceTimelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceComplianceTimelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceComplianceTimelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceComplianceTimelineResponse response) {
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
        public Builder body(GetResourceComplianceTimelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceComplianceTimelineResponse build() {
            return new GetResourceComplianceTimelineResponse(this);
        } 

    } 

}
