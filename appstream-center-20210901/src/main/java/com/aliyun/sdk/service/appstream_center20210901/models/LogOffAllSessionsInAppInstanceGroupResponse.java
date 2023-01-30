// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogOffAllSessionsInAppInstanceGroupResponse} extends {@link TeaModel}
 *
 * <p>LogOffAllSessionsInAppInstanceGroupResponse</p>
 */
public class LogOffAllSessionsInAppInstanceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LogOffAllSessionsInAppInstanceGroupResponseBody body;

    private LogOffAllSessionsInAppInstanceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LogOffAllSessionsInAppInstanceGroupResponse create() {
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
    public LogOffAllSessionsInAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LogOffAllSessionsInAppInstanceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LogOffAllSessionsInAppInstanceGroupResponseBody body);

        @Override
        LogOffAllSessionsInAppInstanceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LogOffAllSessionsInAppInstanceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LogOffAllSessionsInAppInstanceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LogOffAllSessionsInAppInstanceGroupResponse response) {
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
        public Builder body(LogOffAllSessionsInAppInstanceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LogOffAllSessionsInAppInstanceGroupResponse build() {
            return new LogOffAllSessionsInAppInstanceGroupResponse(this);
        } 

    } 

}
