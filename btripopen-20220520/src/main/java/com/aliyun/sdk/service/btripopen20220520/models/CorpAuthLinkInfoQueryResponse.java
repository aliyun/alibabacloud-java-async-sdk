// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CorpAuthLinkInfoQueryResponse} extends {@link TeaModel}
 *
 * <p>CorpAuthLinkInfoQueryResponse</p>
 */
public class CorpAuthLinkInfoQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CorpAuthLinkInfoQueryResponseBody body;

    private CorpAuthLinkInfoQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CorpAuthLinkInfoQueryResponse create() {
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
    public CorpAuthLinkInfoQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CorpAuthLinkInfoQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CorpAuthLinkInfoQueryResponseBody body);

        @Override
        CorpAuthLinkInfoQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CorpAuthLinkInfoQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CorpAuthLinkInfoQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CorpAuthLinkInfoQueryResponse response) {
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
        public Builder body(CorpAuthLinkInfoQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CorpAuthLinkInfoQueryResponse build() {
            return new CorpAuthLinkInfoQueryResponse(this);
        } 

    } 

}
