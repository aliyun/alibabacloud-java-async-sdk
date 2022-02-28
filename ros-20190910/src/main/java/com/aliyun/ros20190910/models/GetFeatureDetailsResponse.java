// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFeatureDetailsResponse} extends {@link TeaModel}
 *
 * <p>GetFeatureDetailsResponse</p>
 */
public class GetFeatureDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFeatureDetailsResponseBody body;

    private GetFeatureDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFeatureDetailsResponse create() {
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
    public GetFeatureDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFeatureDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFeatureDetailsResponseBody body);

        @Override
        GetFeatureDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFeatureDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFeatureDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFeatureDetailsResponse response) {
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
        public Builder body(GetFeatureDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFeatureDetailsResponse build() {
            return new GetFeatureDetailsResponse(this);
        } 

    } 

}
