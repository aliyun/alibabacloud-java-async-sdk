// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBoardRecordResponse} extends {@link TeaModel}
 *
 * <p>StartBoardRecordResponse</p>
 */
public class StartBoardRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartBoardRecordResponseBody body;

    private StartBoardRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartBoardRecordResponse create() {
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
    public StartBoardRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartBoardRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartBoardRecordResponseBody body);

        @Override
        StartBoardRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartBoardRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartBoardRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartBoardRecordResponse response) {
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
        public Builder body(StartBoardRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartBoardRecordResponse build() {
            return new StartBoardRecordResponse(this);
        } 

    } 

}
