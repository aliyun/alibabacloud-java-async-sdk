// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOtaTaskByTaskIdResponse} extends {@link TeaModel}
 *
 * <p>GetOtaTaskByTaskIdResponse</p>
 */
public class GetOtaTaskByTaskIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOtaTaskByTaskIdResponseBody body;

    private GetOtaTaskByTaskIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOtaTaskByTaskIdResponse create() {
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
    public GetOtaTaskByTaskIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOtaTaskByTaskIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOtaTaskByTaskIdResponseBody body);

        @Override
        GetOtaTaskByTaskIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOtaTaskByTaskIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOtaTaskByTaskIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOtaTaskByTaskIdResponse response) {
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
        public Builder body(GetOtaTaskByTaskIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOtaTaskByTaskIdResponse build() {
            return new GetOtaTaskByTaskIdResponse(this);
        } 

    } 

}
