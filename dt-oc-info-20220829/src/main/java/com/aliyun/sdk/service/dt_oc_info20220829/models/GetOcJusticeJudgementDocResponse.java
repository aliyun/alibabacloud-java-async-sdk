// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeJudgementDocResponse} extends {@link TeaModel}
 *
 * <p>GetOcJusticeJudgementDocResponse</p>
 */
public class GetOcJusticeJudgementDocResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcJusticeJudgementDocResponseBody body;

    private GetOcJusticeJudgementDocResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcJusticeJudgementDocResponse create() {
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
    public GetOcJusticeJudgementDocResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcJusticeJudgementDocResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcJusticeJudgementDocResponseBody body);

        @Override
        GetOcJusticeJudgementDocResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcJusticeJudgementDocResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcJusticeJudgementDocResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcJusticeJudgementDocResponse response) {
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
        public Builder body(GetOcJusticeJudgementDocResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcJusticeJudgementDocResponse build() {
            return new GetOcJusticeJudgementDocResponse(this);
        } 

    } 

}
