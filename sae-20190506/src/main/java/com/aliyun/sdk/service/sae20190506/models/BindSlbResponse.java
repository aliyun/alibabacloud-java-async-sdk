// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindSlbResponse} extends {@link TeaModel}
 *
 * <p>BindSlbResponse</p>
 */
public class BindSlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindSlbResponseBody body;

    private BindSlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindSlbResponse create() {
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
    public BindSlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindSlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindSlbResponseBody body);

        @Override
        BindSlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindSlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindSlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindSlbResponse response) {
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
        public Builder body(BindSlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindSlbResponse build() {
            return new BindSlbResponse(this);
        } 

    } 

}
