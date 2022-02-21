// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPictureInfoWithVectorIdsResponse} extends {@link TeaModel}
 *
 * <p>GetPictureInfoWithVectorIdsResponse</p>
 */
public class GetPictureInfoWithVectorIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPictureInfoWithVectorIdsResponseBody body;

    private GetPictureInfoWithVectorIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPictureInfoWithVectorIdsResponse create() {
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
    public GetPictureInfoWithVectorIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPictureInfoWithVectorIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPictureInfoWithVectorIdsResponseBody body);

        @Override
        GetPictureInfoWithVectorIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPictureInfoWithVectorIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPictureInfoWithVectorIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPictureInfoWithVectorIdsResponse response) {
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
        public Builder body(GetPictureInfoWithVectorIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPictureInfoWithVectorIdsResponse build() {
            return new GetPictureInfoWithVectorIdsResponse(this);
        } 

    } 

}
