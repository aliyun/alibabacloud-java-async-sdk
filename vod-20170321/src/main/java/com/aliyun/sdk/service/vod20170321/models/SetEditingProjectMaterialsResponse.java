// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetEditingProjectMaterialsResponse} extends {@link TeaModel}
 *
 * <p>SetEditingProjectMaterialsResponse</p>
 */
public class SetEditingProjectMaterialsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetEditingProjectMaterialsResponseBody body;

    private SetEditingProjectMaterialsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetEditingProjectMaterialsResponse create() {
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
    public SetEditingProjectMaterialsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetEditingProjectMaterialsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetEditingProjectMaterialsResponseBody body);

        @Override
        SetEditingProjectMaterialsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetEditingProjectMaterialsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetEditingProjectMaterialsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetEditingProjectMaterialsResponse response) {
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
        public Builder body(SetEditingProjectMaterialsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetEditingProjectMaterialsResponse build() {
            return new SetEditingProjectMaterialsResponse(this);
        } 

    } 

}
