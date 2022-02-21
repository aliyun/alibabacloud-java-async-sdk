// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotspotSceneDataResponse} extends {@link TeaModel}
 *
 * <p>GetHotspotSceneDataResponse</p>
 */
public class GetHotspotSceneDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotspotSceneDataResponseBody body;

    private GetHotspotSceneDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotspotSceneDataResponse create() {
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
    public GetHotspotSceneDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotspotSceneDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotspotSceneDataResponseBody body);

        @Override
        GetHotspotSceneDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotspotSceneDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotspotSceneDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotspotSceneDataResponse response) {
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
        public Builder body(GetHotspotSceneDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotspotSceneDataResponse build() {
            return new GetHotspotSceneDataResponse(this);
        } 

    } 

}
