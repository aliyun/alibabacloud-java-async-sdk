// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsReportsBySceneIdResponse} extends {@link TeaModel}
 *
 * <p>GetPtsReportsBySceneIdResponse</p>
 */
public class GetPtsReportsBySceneIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPtsReportsBySceneIdResponseBody body;

    private GetPtsReportsBySceneIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPtsReportsBySceneIdResponse create() {
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
    public GetPtsReportsBySceneIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPtsReportsBySceneIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPtsReportsBySceneIdResponseBody body);

        @Override
        GetPtsReportsBySceneIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPtsReportsBySceneIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPtsReportsBySceneIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPtsReportsBySceneIdResponse response) {
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
        public Builder body(GetPtsReportsBySceneIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPtsReportsBySceneIdResponse build() {
            return new GetPtsReportsBySceneIdResponse(this);
        } 

    } 

}
