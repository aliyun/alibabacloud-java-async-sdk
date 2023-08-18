// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMergeRequestResponse} extends {@link TeaModel}
 *
 * <p>UpdateMergeRequestResponse</p>
 */
public class UpdateMergeRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMergeRequestResponseBody body;

    private UpdateMergeRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMergeRequestResponse create() {
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
    public UpdateMergeRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMergeRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMergeRequestResponseBody body);

        @Override
        UpdateMergeRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMergeRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMergeRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMergeRequestResponse response) {
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
        public Builder body(UpdateMergeRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMergeRequestResponse build() {
            return new UpdateMergeRequestResponse(this);
        } 

    } 

}
