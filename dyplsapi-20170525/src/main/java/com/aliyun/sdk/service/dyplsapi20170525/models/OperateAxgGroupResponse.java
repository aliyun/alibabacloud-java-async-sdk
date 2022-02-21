// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateAxgGroupResponse} extends {@link TeaModel}
 *
 * <p>OperateAxgGroupResponse</p>
 */
public class OperateAxgGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateAxgGroupResponseBody body;

    private OperateAxgGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateAxgGroupResponse create() {
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
    public OperateAxgGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateAxgGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateAxgGroupResponseBody body);

        @Override
        OperateAxgGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateAxgGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateAxgGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateAxgGroupResponse response) {
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
        public Builder body(OperateAxgGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateAxgGroupResponse build() {
            return new OperateAxgGroupResponse(this);
        } 

    } 

}
