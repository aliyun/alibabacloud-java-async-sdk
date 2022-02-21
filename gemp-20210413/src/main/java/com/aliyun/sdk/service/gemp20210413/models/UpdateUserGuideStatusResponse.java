// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserGuideStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateUserGuideStatusResponse</p>
 */
public class UpdateUserGuideStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateUserGuideStatusResponseBody body;

    private UpdateUserGuideStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateUserGuideStatusResponse create() {
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
    public UpdateUserGuideStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUserGuideStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateUserGuideStatusResponseBody body);

        @Override
        UpdateUserGuideStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUserGuideStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateUserGuideStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUserGuideStatusResponse response) {
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
        public Builder body(UpdateUserGuideStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUserGuideStatusResponse build() {
            return new UpdateUserGuideStatusResponse(this);
        } 

    } 

}
