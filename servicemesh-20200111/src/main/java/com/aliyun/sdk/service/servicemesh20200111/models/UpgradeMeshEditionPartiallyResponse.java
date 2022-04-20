// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeMeshEditionPartiallyResponse} extends {@link TeaModel}
 *
 * <p>UpgradeMeshEditionPartiallyResponse</p>
 */
public class UpgradeMeshEditionPartiallyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeMeshEditionPartiallyResponseBody body;

    private UpgradeMeshEditionPartiallyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeMeshEditionPartiallyResponse create() {
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
    public UpgradeMeshEditionPartiallyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeMeshEditionPartiallyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeMeshEditionPartiallyResponseBody body);

        @Override
        UpgradeMeshEditionPartiallyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeMeshEditionPartiallyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeMeshEditionPartiallyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeMeshEditionPartiallyResponse response) {
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
        public Builder body(UpgradeMeshEditionPartiallyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeMeshEditionPartiallyResponse build() {
            return new UpgradeMeshEditionPartiallyResponse(this);
        } 

    } 

}
