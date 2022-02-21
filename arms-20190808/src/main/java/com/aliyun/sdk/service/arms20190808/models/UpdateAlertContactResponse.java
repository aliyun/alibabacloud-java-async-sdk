// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertContactResponse} extends {@link TeaModel}
 *
 * <p>UpdateAlertContactResponse</p>
 */
public class UpdateAlertContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAlertContactResponseBody body;

    private UpdateAlertContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAlertContactResponse create() {
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
    public UpdateAlertContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAlertContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAlertContactResponseBody body);

        @Override
        UpdateAlertContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAlertContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAlertContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAlertContactResponse response) {
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
        public Builder body(UpdateAlertContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAlertContactResponse build() {
            return new UpdateAlertContactResponse(this);
        } 

    } 

}
