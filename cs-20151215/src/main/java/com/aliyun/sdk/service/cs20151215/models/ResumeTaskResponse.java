// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeTaskResponse} extends {@link TeaModel}
 *
 * <p>ResumeTaskResponse</p>
 */
public class ResumeTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private ResumeTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static ResumeTaskResponse create() {
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

    public interface Builder extends Response.Builder<ResumeTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        ResumeTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeTaskResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public ResumeTaskResponse build() {
            return new ResumeTaskResponse(this);
        } 

    } 

}
