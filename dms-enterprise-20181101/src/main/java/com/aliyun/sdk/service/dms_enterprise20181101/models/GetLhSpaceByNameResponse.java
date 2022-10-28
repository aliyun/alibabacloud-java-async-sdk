// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLhSpaceByNameResponse} extends {@link TeaModel}
 *
 * <p>GetLhSpaceByNameResponse</p>
 */
public class GetLhSpaceByNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLhSpaceByNameResponseBody body;

    private GetLhSpaceByNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLhSpaceByNameResponse create() {
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
    public GetLhSpaceByNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLhSpaceByNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLhSpaceByNameResponseBody body);

        @Override
        GetLhSpaceByNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLhSpaceByNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLhSpaceByNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLhSpaceByNameResponse response) {
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
        public Builder body(GetLhSpaceByNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLhSpaceByNameResponse build() {
            return new GetLhSpaceByNameResponse(this);
        } 

    } 

}
