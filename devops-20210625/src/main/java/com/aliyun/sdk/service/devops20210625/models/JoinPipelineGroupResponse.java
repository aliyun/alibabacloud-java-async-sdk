// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinPipelineGroupResponse} extends {@link TeaModel}
 *
 * <p>JoinPipelineGroupResponse</p>
 */
public class JoinPipelineGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private JoinPipelineGroupResponseBody body;

    private JoinPipelineGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static JoinPipelineGroupResponse create() {
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
    public JoinPipelineGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<JoinPipelineGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(JoinPipelineGroupResponseBody body);

        @Override
        JoinPipelineGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<JoinPipelineGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private JoinPipelineGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(JoinPipelineGroupResponse response) {
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
        public Builder body(JoinPipelineGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public JoinPipelineGroupResponse build() {
            return new JoinPipelineGroupResponse(this);
        } 

    } 

}
