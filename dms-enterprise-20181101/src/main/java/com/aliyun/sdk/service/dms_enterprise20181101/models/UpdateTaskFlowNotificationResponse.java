// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskFlowNotificationResponse} extends {@link TeaModel}
 *
 * <p>UpdateTaskFlowNotificationResponse</p>
 */
public class UpdateTaskFlowNotificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTaskFlowNotificationResponseBody body;

    private UpdateTaskFlowNotificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTaskFlowNotificationResponse create() {
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
    public UpdateTaskFlowNotificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTaskFlowNotificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTaskFlowNotificationResponseBody body);

        @Override
        UpdateTaskFlowNotificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTaskFlowNotificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTaskFlowNotificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTaskFlowNotificationResponse response) {
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
        public Builder body(UpdateTaskFlowNotificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTaskFlowNotificationResponse build() {
            return new UpdateTaskFlowNotificationResponse(this);
        } 

    } 

}
