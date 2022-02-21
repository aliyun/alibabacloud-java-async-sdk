// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemImprovementResponse} extends {@link TeaModel}
 *
 * <p>UpdateProblemImprovementResponse</p>
 */
public class UpdateProblemImprovementResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProblemImprovementResponseBody body;

    private UpdateProblemImprovementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProblemImprovementResponse create() {
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
    public UpdateProblemImprovementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProblemImprovementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProblemImprovementResponseBody body);

        @Override
        UpdateProblemImprovementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProblemImprovementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProblemImprovementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProblemImprovementResponse response) {
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
        public Builder body(UpdateProblemImprovementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProblemImprovementResponse build() {
            return new UpdateProblemImprovementResponse(this);
        } 

    } 

}
