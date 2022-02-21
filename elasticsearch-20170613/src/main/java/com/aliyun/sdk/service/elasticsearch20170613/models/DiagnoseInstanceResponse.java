// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnoseInstanceResponse} extends {@link TeaModel}
 *
 * <p>DiagnoseInstanceResponse</p>
 */
public class DiagnoseInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DiagnoseInstanceResponseBody body;

    private DiagnoseInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DiagnoseInstanceResponse create() {
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
    public DiagnoseInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DiagnoseInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DiagnoseInstanceResponseBody body);

        @Override
        DiagnoseInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DiagnoseInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DiagnoseInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DiagnoseInstanceResponse response) {
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
        public Builder body(DiagnoseInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DiagnoseInstanceResponse build() {
            return new DiagnoseInstanceResponse(this);
        } 

    } 

}
