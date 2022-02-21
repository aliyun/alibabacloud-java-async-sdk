// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitStagingRoutineCodeResponse} extends {@link TeaModel}
 *
 * <p>CommitStagingRoutineCodeResponse</p>
 */
public class CommitStagingRoutineCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CommitStagingRoutineCodeResponseBody body;

    private CommitStagingRoutineCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CommitStagingRoutineCodeResponse create() {
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
    public CommitStagingRoutineCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CommitStagingRoutineCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CommitStagingRoutineCodeResponseBody body);

        @Override
        CommitStagingRoutineCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CommitStagingRoutineCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CommitStagingRoutineCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CommitStagingRoutineCodeResponse response) {
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
        public Builder body(CommitStagingRoutineCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CommitStagingRoutineCodeResponse build() {
            return new CommitStagingRoutineCodeResponse(this);
        } 

    } 

}
