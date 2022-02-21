// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpreateConstantsResponse} extends {@link TeaModel}
 *
 * <p>OpreateConstantsResponse</p>
 */
public class OpreateConstantsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpreateConstantsResponseBody body;

    private OpreateConstantsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpreateConstantsResponse create() {
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
    public OpreateConstantsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpreateConstantsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpreateConstantsResponseBody body);

        @Override
        OpreateConstantsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpreateConstantsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpreateConstantsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpreateConstantsResponse response) {
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
        public Builder body(OpreateConstantsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpreateConstantsResponse build() {
            return new OpreateConstantsResponse(this);
        } 

    } 

}
