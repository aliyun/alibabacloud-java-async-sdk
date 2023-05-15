// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateDingTalkResponse} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateDingTalkResponse</p>
 */
public class CreateOrUpdateDingTalkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrUpdateDingTalkResponseBody body;

    private CreateOrUpdateDingTalkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOrUpdateDingTalkResponse create() {
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
    public CreateOrUpdateDingTalkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrUpdateDingTalkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOrUpdateDingTalkResponseBody body);

        @Override
        CreateOrUpdateDingTalkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrUpdateDingTalkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrUpdateDingTalkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrUpdateDingTalkResponse response) {
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
        public Builder body(CreateOrUpdateDingTalkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrUpdateDingTalkResponse build() {
            return new CreateOrUpdateDingTalkResponse(this);
        } 

    } 

}
