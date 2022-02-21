// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotspotTagResponse} extends {@link TeaModel}
 *
 * <p>GetHotspotTagResponse</p>
 */
public class GetHotspotTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotspotTagResponseBody body;

    private GetHotspotTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotspotTagResponse create() {
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
    public GetHotspotTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotspotTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotspotTagResponseBody body);

        @Override
        GetHotspotTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotspotTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotspotTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotspotTagResponse response) {
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
        public Builder body(GetHotspotTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotspotTagResponse build() {
            return new GetHotspotTagResponse(this);
        } 

    } 

}
