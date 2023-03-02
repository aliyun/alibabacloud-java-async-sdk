// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBusinessOpportunityResponse} extends {@link TeaModel}
 *
 * <p>CreateBusinessOpportunityResponse</p>
 */
public class CreateBusinessOpportunityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBusinessOpportunityResponseBody body;

    private CreateBusinessOpportunityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBusinessOpportunityResponse create() {
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
    public CreateBusinessOpportunityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBusinessOpportunityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBusinessOpportunityResponseBody body);

        @Override
        CreateBusinessOpportunityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBusinessOpportunityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBusinessOpportunityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBusinessOpportunityResponse response) {
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
        public Builder body(CreateBusinessOpportunityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBusinessOpportunityResponse build() {
            return new CreateBusinessOpportunityResponse(this);
        } 

    } 

}
