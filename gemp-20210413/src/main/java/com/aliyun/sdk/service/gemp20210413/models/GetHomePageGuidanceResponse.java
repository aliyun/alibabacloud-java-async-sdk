// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHomePageGuidanceResponse} extends {@link TeaModel}
 *
 * <p>GetHomePageGuidanceResponse</p>
 */
public class GetHomePageGuidanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHomePageGuidanceResponseBody body;

    private GetHomePageGuidanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHomePageGuidanceResponse create() {
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
    public GetHomePageGuidanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHomePageGuidanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHomePageGuidanceResponseBody body);

        @Override
        GetHomePageGuidanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHomePageGuidanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHomePageGuidanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHomePageGuidanceResponse response) {
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
        public Builder body(GetHomePageGuidanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHomePageGuidanceResponse build() {
            return new GetHomePageGuidanceResponse(this);
        } 

    } 

}
