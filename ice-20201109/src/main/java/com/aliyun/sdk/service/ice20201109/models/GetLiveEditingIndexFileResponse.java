// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveEditingIndexFileResponse} extends {@link TeaModel}
 *
 * <p>GetLiveEditingIndexFileResponse</p>
 */
public class GetLiveEditingIndexFileResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetLiveEditingIndexFileResponseBody body;

    private GetLiveEditingIndexFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetLiveEditingIndexFileResponse create() {
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
    public GetLiveEditingIndexFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLiveEditingIndexFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetLiveEditingIndexFileResponseBody body);

        @Override
        GetLiveEditingIndexFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLiveEditingIndexFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetLiveEditingIndexFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLiveEditingIndexFileResponse response) {
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
        public Builder body(GetLiveEditingIndexFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLiveEditingIndexFileResponse build() {
            return new GetLiveEditingIndexFileResponse(this);
        } 

    } 

}
