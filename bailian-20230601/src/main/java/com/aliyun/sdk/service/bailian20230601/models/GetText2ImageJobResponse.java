// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetText2ImageJobResponse} extends {@link TeaModel}
 *
 * <p>GetText2ImageJobResponse</p>
 */
public class GetText2ImageJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetText2ImageJobResponseBody body;

    private GetText2ImageJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetText2ImageJobResponse create() {
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
    public GetText2ImageJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetText2ImageJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetText2ImageJobResponseBody body);

        @Override
        GetText2ImageJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetText2ImageJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetText2ImageJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetText2ImageJobResponse response) {
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
        public Builder body(GetText2ImageJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetText2ImageJobResponse build() {
            return new GetText2ImageJobResponse(this);
        } 

    } 

}
