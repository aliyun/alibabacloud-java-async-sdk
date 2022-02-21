// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveVideoSummaryTaskVideoResponse} extends {@link TeaModel}
 *
 * <p>SaveVideoSummaryTaskVideoResponse</p>
 */
public class SaveVideoSummaryTaskVideoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveVideoSummaryTaskVideoResponseBody body;

    private SaveVideoSummaryTaskVideoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveVideoSummaryTaskVideoResponse create() {
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
    public SaveVideoSummaryTaskVideoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveVideoSummaryTaskVideoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveVideoSummaryTaskVideoResponseBody body);

        @Override
        SaveVideoSummaryTaskVideoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveVideoSummaryTaskVideoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveVideoSummaryTaskVideoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveVideoSummaryTaskVideoResponse response) {
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
        public Builder body(SaveVideoSummaryTaskVideoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveVideoSummaryTaskVideoResponse build() {
            return new SaveVideoSummaryTaskVideoResponse(this);
        } 

    } 

}
