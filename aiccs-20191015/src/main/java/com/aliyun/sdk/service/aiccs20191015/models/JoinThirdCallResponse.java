// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinThirdCallResponse} extends {@link TeaModel}
 *
 * <p>JoinThirdCallResponse</p>
 */
public class JoinThirdCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinThirdCallResponseBody body;

    private JoinThirdCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinThirdCallResponse create() {
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
    public JoinThirdCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinThirdCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinThirdCallResponseBody body);

        @Override
        JoinThirdCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinThirdCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinThirdCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinThirdCallResponse response) {
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
        public Builder body(JoinThirdCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinThirdCallResponse build() {
            return new JoinThirdCallResponse(this);
        } 

    } 

}
