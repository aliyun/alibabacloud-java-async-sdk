// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizePictureGeneralResponse} extends {@link TeaModel}
 *
 * <p>RecognizePictureGeneralResponse</p>
 */
public class RecognizePictureGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizePictureGeneralResponseBody body;

    private RecognizePictureGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizePictureGeneralResponse create() {
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
    public RecognizePictureGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizePictureGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizePictureGeneralResponseBody body);

        @Override
        RecognizePictureGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizePictureGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizePictureGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizePictureGeneralResponse response) {
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
        public Builder body(RecognizePictureGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizePictureGeneralResponse build() {
            return new RecognizePictureGeneralResponse(this);
        } 

    } 

}
