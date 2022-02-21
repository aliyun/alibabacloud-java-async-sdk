// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeInstanceAzoneResponse} extends {@link TeaModel}
 *
 * <p>ChangeInstanceAzoneResponse</p>
 */
public class ChangeInstanceAzoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeInstanceAzoneResponseBody body;

    private ChangeInstanceAzoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeInstanceAzoneResponse create() {
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
    public ChangeInstanceAzoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeInstanceAzoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeInstanceAzoneResponseBody body);

        @Override
        ChangeInstanceAzoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeInstanceAzoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeInstanceAzoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeInstanceAzoneResponse response) {
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
        public Builder body(ChangeInstanceAzoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeInstanceAzoneResponse build() {
            return new ChangeInstanceAzoneResponse(this);
        } 

    } 

}
