// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupListResponse} extends {@link TeaModel}
 *
 * <p>OnsGroupListResponse</p>
 */
public class OnsGroupListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsGroupListResponseBody body;

    private OnsGroupListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsGroupListResponse create() {
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
    public OnsGroupListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsGroupListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsGroupListResponseBody body);

        @Override
        OnsGroupListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsGroupListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsGroupListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsGroupListResponse response) {
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
        public Builder body(OnsGroupListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsGroupListResponse build() {
            return new OnsGroupListResponse(this);
        } 

    } 

}
