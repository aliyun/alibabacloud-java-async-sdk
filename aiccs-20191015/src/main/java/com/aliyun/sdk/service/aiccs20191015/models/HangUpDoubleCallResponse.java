// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HangUpDoubleCallResponse} extends {@link TeaModel}
 *
 * <p>HangUpDoubleCallResponse</p>
 */
public class HangUpDoubleCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HangUpDoubleCallResponseBody body;

    private HangUpDoubleCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HangUpDoubleCallResponse create() {
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
    public HangUpDoubleCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HangUpDoubleCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HangUpDoubleCallResponseBody body);

        @Override
        HangUpDoubleCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HangUpDoubleCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HangUpDoubleCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HangUpDoubleCallResponse response) {
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
        public Builder body(HangUpDoubleCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HangUpDoubleCallResponse build() {
            return new HangUpDoubleCallResponse(this);
        } 

    } 

}
