// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDSEntityResponse} extends {@link TeaModel}
 *
 * <p>UpdateDSEntityResponse</p>
 */
public class UpdateDSEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDSEntityResponseBody body;

    private UpdateDSEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDSEntityResponse create() {
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
    public UpdateDSEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDSEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDSEntityResponseBody body);

        @Override
        UpdateDSEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDSEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDSEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDSEntityResponse response) {
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
        public Builder body(UpdateDSEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDSEntityResponse build() {
            return new UpdateDSEntityResponse(this);
        } 

    } 

}
