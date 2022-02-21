// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LeaveEniQosGroupResponse} extends {@link TeaModel}
 *
 * <p>LeaveEniQosGroupResponse</p>
 */
public class LeaveEniQosGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LeaveEniQosGroupResponseBody body;

    private LeaveEniQosGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LeaveEniQosGroupResponse create() {
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
    public LeaveEniQosGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LeaveEniQosGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LeaveEniQosGroupResponseBody body);

        @Override
        LeaveEniQosGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LeaveEniQosGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LeaveEniQosGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LeaveEniQosGroupResponse response) {
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
        public Builder body(LeaveEniQosGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LeaveEniQosGroupResponse build() {
            return new LeaveEniQosGroupResponse(this);
        } 

    } 

}
