// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEventRecordPlanResponse} extends {@link TeaModel}
 *
 * <p>CreateEventRecordPlanResponse</p>
 */
public class CreateEventRecordPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEventRecordPlanResponseBody body;

    private CreateEventRecordPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEventRecordPlanResponse create() {
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
    public CreateEventRecordPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEventRecordPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEventRecordPlanResponseBody body);

        @Override
        CreateEventRecordPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEventRecordPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEventRecordPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEventRecordPlanResponse response) {
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
        public Builder body(CreateEventRecordPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEventRecordPlanResponse build() {
            return new CreateEventRecordPlanResponse(this);
        } 

    } 

}
