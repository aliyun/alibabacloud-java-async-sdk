// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemTimelineResponse} extends {@link TeaModel}
 *
 * <p>UpdateProblemTimelineResponse</p>
 */
public class UpdateProblemTimelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProblemTimelineResponseBody body;

    private UpdateProblemTimelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProblemTimelineResponse create() {
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
    public UpdateProblemTimelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProblemTimelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProblemTimelineResponseBody body);

        @Override
        UpdateProblemTimelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProblemTimelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProblemTimelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProblemTimelineResponse response) {
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
        public Builder body(UpdateProblemTimelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProblemTimelineResponse build() {
            return new UpdateProblemTimelineResponse(this);
        } 

    } 

}
