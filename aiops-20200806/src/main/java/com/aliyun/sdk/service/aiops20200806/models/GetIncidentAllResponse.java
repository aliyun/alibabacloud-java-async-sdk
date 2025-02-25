// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentAllResponse} extends {@link TeaModel}
 *
 * <p>GetIncidentAllResponse</p>
 */
public class GetIncidentAllResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetIncidentAllResponseBody body;

    private GetIncidentAllResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetIncidentAllResponse create() {
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
    public GetIncidentAllResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIncidentAllResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetIncidentAllResponseBody body);

        @Override
        GetIncidentAllResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIncidentAllResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetIncidentAllResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIncidentAllResponse response) {
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
        public Builder body(GetIncidentAllResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIncidentAllResponse build() {
            return new GetIncidentAllResponse(this);
        } 

    } 

}
