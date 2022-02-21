// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemNoticeResponse} extends {@link TeaModel}
 *
 * <p>UpdateProblemNoticeResponse</p>
 */
public class UpdateProblemNoticeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProblemNoticeResponseBody body;

    private UpdateProblemNoticeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProblemNoticeResponse create() {
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
    public UpdateProblemNoticeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProblemNoticeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProblemNoticeResponseBody body);

        @Override
        UpdateProblemNoticeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProblemNoticeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProblemNoticeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProblemNoticeResponse response) {
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
        public Builder body(UpdateProblemNoticeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProblemNoticeResponse build() {
            return new UpdateProblemNoticeResponse(this);
        } 

    } 

}
