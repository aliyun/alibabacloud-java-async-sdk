// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateReportUrlResponse} extends {@link TeaModel}
 *
 * <p>UpdateReportUrlResponse</p>
 */
public class UpdateReportUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateReportUrlResponseBody body;

    private UpdateReportUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateReportUrlResponse create() {
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
    public UpdateReportUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateReportUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateReportUrlResponseBody body);

        @Override
        UpdateReportUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateReportUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateReportUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateReportUrlResponse response) {
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
        public Builder body(UpdateReportUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateReportUrlResponse build() {
            return new UpdateReportUrlResponse(this);
        } 

    } 

}
