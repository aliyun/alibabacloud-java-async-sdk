// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelSceneItemDetailResponse} extends {@link TeaModel}
 *
 * <p>GetHotelSceneItemDetailResponse</p>
 */
public class GetHotelSceneItemDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelSceneItemDetailResponseBody body;

    private GetHotelSceneItemDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelSceneItemDetailResponse create() {
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
    public GetHotelSceneItemDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelSceneItemDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelSceneItemDetailResponseBody body);

        @Override
        GetHotelSceneItemDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelSceneItemDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelSceneItemDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelSceneItemDetailResponse response) {
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
        public Builder body(GetHotelSceneItemDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelSceneItemDetailResponse build() {
            return new GetHotelSceneItemDetailResponse(this);
        } 

    } 

}
