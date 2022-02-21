// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRecycleBinRestoreJobResponse} extends {@link TeaModel}
 *
 * <p>CreateRecycleBinRestoreJobResponse</p>
 */
public class CreateRecycleBinRestoreJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRecycleBinRestoreJobResponseBody body;

    private CreateRecycleBinRestoreJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRecycleBinRestoreJobResponse create() {
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
    public CreateRecycleBinRestoreJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRecycleBinRestoreJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRecycleBinRestoreJobResponseBody body);

        @Override
        CreateRecycleBinRestoreJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRecycleBinRestoreJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRecycleBinRestoreJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRecycleBinRestoreJobResponse response) {
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
        public Builder body(CreateRecycleBinRestoreJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRecycleBinRestoreJobResponse build() {
            return new CreateRecycleBinRestoreJobResponse(this);
        } 

    } 

}
