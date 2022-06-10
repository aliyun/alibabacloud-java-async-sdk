// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDSEntityValueResponse} extends {@link TeaModel}
 *
 * <p>UpdateDSEntityValueResponse</p>
 */
public class UpdateDSEntityValueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDSEntityValueResponseBody body;

    private UpdateDSEntityValueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDSEntityValueResponse create() {
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
    public UpdateDSEntityValueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDSEntityValueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDSEntityValueResponseBody body);

        @Override
        UpdateDSEntityValueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDSEntityValueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDSEntityValueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDSEntityValueResponse response) {
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
        public Builder body(UpdateDSEntityValueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDSEntityValueResponse build() {
            return new UpdateDSEntityValueResponse(this);
        } 

    } 

}
