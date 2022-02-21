// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRecordPlanResponse} extends {@link TeaModel}
 *
 * <p>CreateRecordPlanResponse</p>
 */
public class CreateRecordPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRecordPlanResponseBody body;

    private CreateRecordPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRecordPlanResponse create() {
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
    public CreateRecordPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRecordPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRecordPlanResponseBody body);

        @Override
        CreateRecordPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRecordPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRecordPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRecordPlanResponse response) {
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
        public Builder body(CreateRecordPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRecordPlanResponse build() {
            return new CreateRecordPlanResponse(this);
        } 

    } 

}
