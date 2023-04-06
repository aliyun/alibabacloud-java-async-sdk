// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserDescriptionResponse} extends {@link TeaModel}
 *
 * <p>UpdateUserDescriptionResponse</p>
 */
public class UpdateUserDescriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateUserDescriptionResponseBody body;

    private UpdateUserDescriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateUserDescriptionResponse create() {
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
    public UpdateUserDescriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUserDescriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateUserDescriptionResponseBody body);

        @Override
        UpdateUserDescriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUserDescriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateUserDescriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUserDescriptionResponse response) {
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
        public Builder body(UpdateUserDescriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUserDescriptionResponse build() {
            return new UpdateUserDescriptionResponse(this);
        } 

    } 

}
