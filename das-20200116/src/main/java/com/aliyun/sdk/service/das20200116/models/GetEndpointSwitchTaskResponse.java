// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEndpointSwitchTaskResponse} extends {@link TeaModel}
 *
 * <p>GetEndpointSwitchTaskResponse</p>
 */
public class GetEndpointSwitchTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetEndpointSwitchTaskResponseBody body;

    private GetEndpointSwitchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetEndpointSwitchTaskResponse create() {
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
    public GetEndpointSwitchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEndpointSwitchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetEndpointSwitchTaskResponseBody body);

        @Override
        GetEndpointSwitchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEndpointSwitchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetEndpointSwitchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEndpointSwitchTaskResponse response) {
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
        public Builder body(GetEndpointSwitchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEndpointSwitchTaskResponse build() {
            return new GetEndpointSwitchTaskResponse(this);
        } 

    } 

}
