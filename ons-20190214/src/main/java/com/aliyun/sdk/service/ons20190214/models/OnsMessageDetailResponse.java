// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessageDetailResponse} extends {@link TeaModel}
 *
 * <p>OnsMessageDetailResponse</p>
 */
public class OnsMessageDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsMessageDetailResponseBody body;

    private OnsMessageDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsMessageDetailResponse create() {
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
    public OnsMessageDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsMessageDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsMessageDetailResponseBody body);

        @Override
        OnsMessageDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsMessageDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsMessageDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsMessageDetailResponse response) {
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
        public Builder body(OnsMessageDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsMessageDetailResponse build() {
            return new OnsMessageDetailResponse(this);
        } 

    } 

}
