// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProblemEffectionServiceResponse} extends {@link TeaModel}
 *
 * <p>GetProblemEffectionServiceResponse</p>
 */
public class GetProblemEffectionServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProblemEffectionServiceResponseBody body;

    private GetProblemEffectionServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProblemEffectionServiceResponse create() {
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
    public GetProblemEffectionServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProblemEffectionServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProblemEffectionServiceResponseBody body);

        @Override
        GetProblemEffectionServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProblemEffectionServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProblemEffectionServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProblemEffectionServiceResponse response) {
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
        public Builder body(GetProblemEffectionServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProblemEffectionServiceResponse build() {
            return new GetProblemEffectionServiceResponse(this);
        } 

    } 

}
