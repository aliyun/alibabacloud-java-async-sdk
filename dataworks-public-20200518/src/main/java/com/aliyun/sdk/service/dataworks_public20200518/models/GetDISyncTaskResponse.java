// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDISyncTaskResponse} extends {@link TeaModel}
 *
 * <p>GetDISyncTaskResponse</p>
 */
public class GetDISyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDISyncTaskResponseBody body;

    private GetDISyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDISyncTaskResponse create() {
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
    public GetDISyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDISyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDISyncTaskResponseBody body);

        @Override
        GetDISyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDISyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDISyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDISyncTaskResponse response) {
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
        public Builder body(GetDISyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDISyncTaskResponse build() {
            return new GetDISyncTaskResponse(this);
        } 

    } 

}
