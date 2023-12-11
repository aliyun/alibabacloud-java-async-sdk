// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceConsumeTimeRankResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceConsumeTimeRankResponse</p>
 */
public class GetInstanceConsumeTimeRankResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceConsumeTimeRankResponseBody body;

    private GetInstanceConsumeTimeRankResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceConsumeTimeRankResponse create() {
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
    public GetInstanceConsumeTimeRankResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceConsumeTimeRankResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceConsumeTimeRankResponseBody body);

        @Override
        GetInstanceConsumeTimeRankResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceConsumeTimeRankResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceConsumeTimeRankResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceConsumeTimeRankResponse response) {
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
        public Builder body(GetInstanceConsumeTimeRankResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceConsumeTimeRankResponse build() {
            return new GetInstanceConsumeTimeRankResponse(this);
        } 

    } 

}
