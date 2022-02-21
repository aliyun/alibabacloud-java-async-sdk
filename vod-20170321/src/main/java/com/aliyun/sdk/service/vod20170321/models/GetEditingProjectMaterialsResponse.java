// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEditingProjectMaterialsResponse} extends {@link TeaModel}
 *
 * <p>GetEditingProjectMaterialsResponse</p>
 */
public class GetEditingProjectMaterialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEditingProjectMaterialsResponseBody body;

    private GetEditingProjectMaterialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEditingProjectMaterialsResponse create() {
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
    public GetEditingProjectMaterialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEditingProjectMaterialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEditingProjectMaterialsResponseBody body);

        @Override
        GetEditingProjectMaterialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEditingProjectMaterialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEditingProjectMaterialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEditingProjectMaterialsResponse response) {
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
        public Builder body(GetEditingProjectMaterialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEditingProjectMaterialsResponse build() {
            return new GetEditingProjectMaterialsResponse(this);
        } 

    } 

}
