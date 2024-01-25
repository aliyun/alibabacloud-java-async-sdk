// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpenJMeterSceneResponse} extends {@link TeaModel}
 *
 * <p>GetOpenJMeterSceneResponse</p>
 */
public class GetOpenJMeterSceneResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetOpenJMeterSceneResponseBody body;

    private GetOpenJMeterSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetOpenJMeterSceneResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetOpenJMeterSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOpenJMeterSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetOpenJMeterSceneResponseBody body);

        @Override
        GetOpenJMeterSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOpenJMeterSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetOpenJMeterSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOpenJMeterSceneResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetOpenJMeterSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOpenJMeterSceneResponse build() {
            return new GetOpenJMeterSceneResponse(this);
        } 

    } 

}
