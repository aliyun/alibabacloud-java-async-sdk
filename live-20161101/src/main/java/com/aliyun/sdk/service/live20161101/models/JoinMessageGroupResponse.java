// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinMessageGroupResponse} extends {@link TeaModel}
 *
 * <p>JoinMessageGroupResponse</p>
 */
public class JoinMessageGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinMessageGroupResponseBody body;

    private JoinMessageGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinMessageGroupResponse create() {
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
    public JoinMessageGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinMessageGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinMessageGroupResponseBody body);

        @Override
        JoinMessageGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinMessageGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinMessageGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinMessageGroupResponse response) {
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
        public Builder body(JoinMessageGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinMessageGroupResponse build() {
            return new JoinMessageGroupResponse(this);
        } 

    } 

}
