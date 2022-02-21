// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TempModifyDBNodeResponse} extends {@link TeaModel}
 *
 * <p>TempModifyDBNodeResponse</p>
 */
public class TempModifyDBNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TempModifyDBNodeResponseBody body;

    private TempModifyDBNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TempModifyDBNodeResponse create() {
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
    public TempModifyDBNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TempModifyDBNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TempModifyDBNodeResponseBody body);

        @Override
        TempModifyDBNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TempModifyDBNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TempModifyDBNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TempModifyDBNodeResponse response) {
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
        public Builder body(TempModifyDBNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TempModifyDBNodeResponse build() {
            return new TempModifyDBNodeResponse(this);
        } 

    } 

}
