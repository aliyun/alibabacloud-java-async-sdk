// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupSubDetailResponse} extends {@link TeaModel}
 *
 * <p>OnsGroupSubDetailResponse</p>
 */
public class OnsGroupSubDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OnsGroupSubDetailResponseBody body;

    private OnsGroupSubDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OnsGroupSubDetailResponse create() {
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
    public OnsGroupSubDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OnsGroupSubDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OnsGroupSubDetailResponseBody body);

        @Override
        OnsGroupSubDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OnsGroupSubDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OnsGroupSubDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OnsGroupSubDetailResponse response) {
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
        public Builder body(OnsGroupSubDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OnsGroupSubDetailResponse build() {
            return new OnsGroupSubDetailResponse(this);
        } 

    } 

}
