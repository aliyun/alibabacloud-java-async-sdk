// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecordLifecycleActionHeartbeatResponse} extends {@link TeaModel}
 *
 * <p>RecordLifecycleActionHeartbeatResponse</p>
 */
public class RecordLifecycleActionHeartbeatResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RecordLifecycleActionHeartbeatResponseBody body;

    private RecordLifecycleActionHeartbeatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RecordLifecycleActionHeartbeatResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public RecordLifecycleActionHeartbeatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecordLifecycleActionHeartbeatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RecordLifecycleActionHeartbeatResponseBody body);

        @Override
        RecordLifecycleActionHeartbeatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecordLifecycleActionHeartbeatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RecordLifecycleActionHeartbeatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecordLifecycleActionHeartbeatResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(RecordLifecycleActionHeartbeatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecordLifecycleActionHeartbeatResponse build() {
            return new RecordLifecycleActionHeartbeatResponse(this);
        } 

    } 

}
