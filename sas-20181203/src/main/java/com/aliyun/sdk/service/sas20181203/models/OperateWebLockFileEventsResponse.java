// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateWebLockFileEventsResponse} extends {@link TeaModel}
 *
 * <p>OperateWebLockFileEventsResponse</p>
 */
public class OperateWebLockFileEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OperateWebLockFileEventsResponseBody body;

    private OperateWebLockFileEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OperateWebLockFileEventsResponse create() {
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
    public OperateWebLockFileEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateWebLockFileEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OperateWebLockFileEventsResponseBody body);

        @Override
        OperateWebLockFileEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateWebLockFileEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OperateWebLockFileEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateWebLockFileEventsResponse response) {
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
        public Builder body(OperateWebLockFileEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateWebLockFileEventsResponse build() {
            return new OperateWebLockFileEventsResponse(this);
        } 

    } 

}
