// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProblemMeasureResponse} extends {@link TeaModel}
 *
 * <p>UpdateProblemMeasureResponse</p>
 */
public class UpdateProblemMeasureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProblemMeasureResponseBody body;

    private UpdateProblemMeasureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProblemMeasureResponse create() {
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
    public UpdateProblemMeasureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProblemMeasureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProblemMeasureResponseBody body);

        @Override
        UpdateProblemMeasureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProblemMeasureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProblemMeasureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProblemMeasureResponse response) {
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
        public Builder body(UpdateProblemMeasureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProblemMeasureResponse build() {
            return new UpdateProblemMeasureResponse(this);
        } 

    } 

}
