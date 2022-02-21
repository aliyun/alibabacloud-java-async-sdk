// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventRecordPlanResponse} extends {@link TeaModel}
 *
 * <p>DeleteEventRecordPlanResponse</p>
 */
public class DeleteEventRecordPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEventRecordPlanResponseBody body;

    private DeleteEventRecordPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEventRecordPlanResponse create() {
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
    public DeleteEventRecordPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEventRecordPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEventRecordPlanResponseBody body);

        @Override
        DeleteEventRecordPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEventRecordPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEventRecordPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEventRecordPlanResponse response) {
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
        public Builder body(DeleteEventRecordPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEventRecordPlanResponse build() {
            return new DeleteEventRecordPlanResponse(this);
        } 

    } 

}
