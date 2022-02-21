// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemTimeLinesResponse} extends {@link TeaModel}
 *
 * <p>ListProblemTimeLinesResponse</p>
 */
public class ListProblemTimeLinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProblemTimeLinesResponseBody body;

    private ListProblemTimeLinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProblemTimeLinesResponse create() {
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
    public ListProblemTimeLinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProblemTimeLinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProblemTimeLinesResponseBody body);

        @Override
        ListProblemTimeLinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProblemTimeLinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProblemTimeLinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProblemTimeLinesResponse response) {
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
        public Builder body(ListProblemTimeLinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProblemTimeLinesResponse build() {
            return new ListProblemTimeLinesResponse(this);
        } 

    } 

}
