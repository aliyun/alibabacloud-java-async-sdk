// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MakeCallResponse} extends {@link TeaModel}
 *
 * <p>MakeCallResponse</p>
 */
public class MakeCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MakeCallResponseBody body;

    private MakeCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MakeCallResponse create() {
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
    public MakeCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MakeCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MakeCallResponseBody body);

        @Override
        MakeCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MakeCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MakeCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MakeCallResponse response) {
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
        public Builder body(MakeCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MakeCallResponse build() {
            return new MakeCallResponse(this);
        } 

    } 

}
