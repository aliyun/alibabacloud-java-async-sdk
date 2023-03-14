// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribleCertListResponse} extends {@link TeaModel}
 *
 * <p>DescribleCertListResponse</p>
 */
public class DescribleCertListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribleCertListResponseBody body;

    private DescribleCertListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribleCertListResponse create() {
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
    public DescribleCertListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribleCertListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribleCertListResponseBody body);

        @Override
        DescribleCertListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribleCertListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribleCertListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribleCertListResponse response) {
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
        public Builder body(DescribleCertListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribleCertListResponse build() {
            return new DescribleCertListResponse(this);
        } 

    } 

}
