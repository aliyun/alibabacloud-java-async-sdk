// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMeetingTransResponse} extends {@link TeaModel}
 *
 * <p>CreateMeetingTransResponse</p>
 */
public class CreateMeetingTransResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMeetingTransResponseBody body;

    private CreateMeetingTransResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMeetingTransResponse create() {
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
    public CreateMeetingTransResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMeetingTransResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMeetingTransResponseBody body);

        @Override
        CreateMeetingTransResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMeetingTransResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMeetingTransResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMeetingTransResponse response) {
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
        public Builder body(CreateMeetingTransResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMeetingTransResponse build() {
            return new CreateMeetingTransResponse(this);
        } 

    } 

}
