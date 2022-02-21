// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrailStatusResponse} extends {@link TeaModel}
 *
 * <p>GetTrailStatusResponse</p>
 */
public class GetTrailStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrailStatusResponseBody body;

    private GetTrailStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrailStatusResponse create() {
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
    public GetTrailStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrailStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrailStatusResponseBody body);

        @Override
        GetTrailStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrailStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrailStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrailStatusResponse response) {
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
        public Builder body(GetTrailStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrailStatusResponse build() {
            return new GetTrailStatusResponse(this);
        } 

    } 

}
