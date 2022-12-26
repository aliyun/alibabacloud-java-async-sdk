// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUniRestorePlanResponse} extends {@link TeaModel}
 *
 * <p>CreateUniRestorePlanResponse</p>
 */
public class CreateUniRestorePlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUniRestorePlanResponseBody body;

    private CreateUniRestorePlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUniRestorePlanResponse create() {
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
    public CreateUniRestorePlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUniRestorePlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUniRestorePlanResponseBody body);

        @Override
        CreateUniRestorePlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUniRestorePlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUniRestorePlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUniRestorePlanResponse response) {
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
        public Builder body(CreateUniRestorePlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUniRestorePlanResponse build() {
            return new CreateUniRestorePlanResponse(this);
        } 

    } 

}
