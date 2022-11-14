// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDpChGeneralStanfordResponse} extends {@link TeaModel}
 *
 * <p>GetDpChGeneralStanfordResponse</p>
 */
public class GetDpChGeneralStanfordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDpChGeneralStanfordResponseBody body;

    private GetDpChGeneralStanfordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDpChGeneralStanfordResponse create() {
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
    public GetDpChGeneralStanfordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDpChGeneralStanfordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDpChGeneralStanfordResponseBody body);

        @Override
        GetDpChGeneralStanfordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDpChGeneralStanfordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDpChGeneralStanfordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDpChGeneralStanfordResponse response) {
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
        public Builder body(GetDpChGeneralStanfordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDpChGeneralStanfordResponse build() {
            return new GetDpChGeneralStanfordResponse(this);
        } 

    } 

}
