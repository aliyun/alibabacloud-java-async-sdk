// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LeaveMessageGroupResponse} extends {@link TeaModel}
 *
 * <p>LeaveMessageGroupResponse</p>
 */
public class LeaveMessageGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LeaveMessageGroupResponseBody body;

    private LeaveMessageGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LeaveMessageGroupResponse create() {
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
    public LeaveMessageGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LeaveMessageGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LeaveMessageGroupResponseBody body);

        @Override
        LeaveMessageGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LeaveMessageGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LeaveMessageGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LeaveMessageGroupResponse response) {
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
        public Builder body(LeaveMessageGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LeaveMessageGroupResponse build() {
            return new LeaveMessageGroupResponse(this);
        } 

    } 

}
