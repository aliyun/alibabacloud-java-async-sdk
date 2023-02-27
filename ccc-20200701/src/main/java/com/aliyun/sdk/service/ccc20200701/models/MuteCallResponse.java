// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MuteCallResponse} extends {@link TeaModel}
 *
 * <p>MuteCallResponse</p>
 */
public class MuteCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MuteCallResponseBody body;

    private MuteCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MuteCallResponse create() {
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
    public MuteCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MuteCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MuteCallResponseBody body);

        @Override
        MuteCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MuteCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MuteCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MuteCallResponse response) {
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
        public Builder body(MuteCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MuteCallResponse build() {
            return new MuteCallResponse(this);
        } 

    } 

}
