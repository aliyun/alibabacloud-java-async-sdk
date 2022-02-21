// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinEniQosGroupResponse} extends {@link TeaModel}
 *
 * <p>JoinEniQosGroupResponse</p>
 */
public class JoinEniQosGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinEniQosGroupResponseBody body;

    private JoinEniQosGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinEniQosGroupResponse create() {
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
    public JoinEniQosGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinEniQosGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinEniQosGroupResponseBody body);

        @Override
        JoinEniQosGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinEniQosGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinEniQosGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinEniQosGroupResponse response) {
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
        public Builder body(JoinEniQosGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinEniQosGroupResponse build() {
            return new JoinEniQosGroupResponse(this);
        } 

    } 

}
