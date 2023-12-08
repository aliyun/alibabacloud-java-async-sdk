// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationGroupResponse} extends {@link TeaModel}
 *
 * <p>GetApplicationGroupResponse</p>
 */
public class GetApplicationGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetApplicationGroupResponseBody body;

    private GetApplicationGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetApplicationGroupResponse create() {
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
    public GetApplicationGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApplicationGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetApplicationGroupResponseBody body);

        @Override
        GetApplicationGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApplicationGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetApplicationGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApplicationGroupResponse response) {
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
        public Builder body(GetApplicationGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApplicationGroupResponse build() {
            return new GetApplicationGroupResponse(this);
        } 

    } 

}
