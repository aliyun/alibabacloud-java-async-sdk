// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMergeRequestPersonnelResponse} extends {@link TeaModel}
 *
 * <p>UpdateMergeRequestPersonnelResponse</p>
 */
public class UpdateMergeRequestPersonnelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMergeRequestPersonnelResponseBody body;

    private UpdateMergeRequestPersonnelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMergeRequestPersonnelResponse create() {
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
    public UpdateMergeRequestPersonnelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMergeRequestPersonnelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMergeRequestPersonnelResponseBody body);

        @Override
        UpdateMergeRequestPersonnelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMergeRequestPersonnelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMergeRequestPersonnelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMergeRequestPersonnelResponse response) {
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
        public Builder body(UpdateMergeRequestPersonnelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMergeRequestPersonnelResponse build() {
            return new UpdateMergeRequestPersonnelResponse(this);
        } 

    } 

}
