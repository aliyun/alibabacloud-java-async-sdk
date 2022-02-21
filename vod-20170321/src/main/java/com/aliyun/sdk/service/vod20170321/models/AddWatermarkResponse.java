// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWatermarkResponse} extends {@link TeaModel}
 *
 * <p>AddWatermarkResponse</p>
 */
public class AddWatermarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddWatermarkResponseBody body;

    private AddWatermarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddWatermarkResponse create() {
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
    public AddWatermarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddWatermarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddWatermarkResponseBody body);

        @Override
        AddWatermarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddWatermarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddWatermarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddWatermarkResponse response) {
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
        public Builder body(AddWatermarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddWatermarkResponse build() {
            return new AddWatermarkResponse(this);
        } 

    } 

}
