// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginDetailsResponse} extends {@link TeaModel}
 *
 * <p>GetLoginDetailsResponse</p>
 */
public class GetLoginDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLoginDetailsResponseBody body;

    private GetLoginDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLoginDetailsResponse create() {
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
    public GetLoginDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLoginDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLoginDetailsResponseBody body);

        @Override
        GetLoginDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLoginDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLoginDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLoginDetailsResponse response) {
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
        public Builder body(GetLoginDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLoginDetailsResponse build() {
            return new GetLoginDetailsResponse(this);
        } 

    } 

}
