// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateRecommendParametersResponse} extends {@link TeaModel}
 *
 * <p>GetTemplateRecommendParametersResponse</p>
 */
public class GetTemplateRecommendParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTemplateRecommendParametersResponseBody body;

    private GetTemplateRecommendParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTemplateRecommendParametersResponse create() {
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
    public GetTemplateRecommendParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTemplateRecommendParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTemplateRecommendParametersResponseBody body);

        @Override
        GetTemplateRecommendParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTemplateRecommendParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTemplateRecommendParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTemplateRecommendParametersResponse response) {
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
        public Builder body(GetTemplateRecommendParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTemplateRecommendParametersResponse build() {
            return new GetTemplateRecommendParametersResponse(this);
        } 

    } 

}
