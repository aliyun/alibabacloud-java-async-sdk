// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePushReviewOnOffResponse} extends {@link TeaModel}
 *
 * <p>UpdatePushReviewOnOffResponse</p>
 */
public class UpdatePushReviewOnOffResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePushReviewOnOffResponseBody body;

    private UpdatePushReviewOnOffResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePushReviewOnOffResponse create() {
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
    public UpdatePushReviewOnOffResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePushReviewOnOffResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePushReviewOnOffResponseBody body);

        @Override
        UpdatePushReviewOnOffResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePushReviewOnOffResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePushReviewOnOffResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePushReviewOnOffResponse response) {
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
        public Builder body(UpdatePushReviewOnOffResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePushReviewOnOffResponse build() {
            return new UpdatePushReviewOnOffResponse(this);
        } 

    } 

}
