// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGroupResponse} extends {@link TeaModel}
 *
 * <p>GetGroupResponse</p>
 */
public class GetGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetGroupResponseBody body;

    private GetGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetGroupResponse create() {
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
    public GetGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetGroupResponseBody body);

        @Override
        GetGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGroupResponse response) {
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
        public Builder body(GetGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGroupResponse build() {
            return new GetGroupResponse(this);
        } 

    } 

}
