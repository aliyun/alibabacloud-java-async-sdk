// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkipDataCorrectRowCheckResponse} extends {@link TeaModel}
 *
 * <p>SkipDataCorrectRowCheckResponse</p>
 */
public class SkipDataCorrectRowCheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SkipDataCorrectRowCheckResponseBody body;

    private SkipDataCorrectRowCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SkipDataCorrectRowCheckResponse create() {
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
    public SkipDataCorrectRowCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SkipDataCorrectRowCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SkipDataCorrectRowCheckResponseBody body);

        @Override
        SkipDataCorrectRowCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SkipDataCorrectRowCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SkipDataCorrectRowCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SkipDataCorrectRowCheckResponse response) {
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
        public Builder body(SkipDataCorrectRowCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SkipDataCorrectRowCheckResponse build() {
            return new SkipDataCorrectRowCheckResponse(this);
        } 

    } 

}
