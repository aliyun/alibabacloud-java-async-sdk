// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskPreparingResponse} extends {@link TeaModel}
 *
 * <p>TaskPreparingResponse</p>
 */
public class TaskPreparingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TaskPreparingResponseBody body;

    private TaskPreparingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TaskPreparingResponse create() {
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
    public TaskPreparingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TaskPreparingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TaskPreparingResponseBody body);

        @Override
        TaskPreparingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TaskPreparingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TaskPreparingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TaskPreparingResponse response) {
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
        public Builder body(TaskPreparingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TaskPreparingResponse build() {
            return new TaskPreparingResponse(this);
        } 

    } 

}
