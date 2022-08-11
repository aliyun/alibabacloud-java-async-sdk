// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityEntityResponse} extends {@link TeaModel}
 *
 * <p>CreateQualityEntityResponse</p>
 */
public class CreateQualityEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateQualityEntityResponseBody body;

    private CreateQualityEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateQualityEntityResponse create() {
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
    public CreateQualityEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateQualityEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateQualityEntityResponseBody body);

        @Override
        CreateQualityEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateQualityEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateQualityEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateQualityEntityResponse response) {
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
        public Builder body(CreateQualityEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateQualityEntityResponse build() {
            return new CreateQualityEntityResponse(this);
        } 

    } 

}
