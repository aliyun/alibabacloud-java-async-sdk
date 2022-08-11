// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableIntroWikiResponse} extends {@link TeaModel}
 *
 * <p>GetMetaTableIntroWikiResponse</p>
 */
public class GetMetaTableIntroWikiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaTableIntroWikiResponseBody body;

    private GetMetaTableIntroWikiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaTableIntroWikiResponse create() {
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
    public GetMetaTableIntroWikiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaTableIntroWikiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaTableIntroWikiResponseBody body);

        @Override
        GetMetaTableIntroWikiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaTableIntroWikiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaTableIntroWikiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaTableIntroWikiResponse response) {
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
        public Builder body(GetMetaTableIntroWikiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaTableIntroWikiResponse build() {
            return new GetMetaTableIntroWikiResponse(this);
        } 

    } 

}
