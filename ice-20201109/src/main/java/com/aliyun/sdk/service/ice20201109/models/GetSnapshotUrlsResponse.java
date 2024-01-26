// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSnapshotUrlsResponse} extends {@link TeaModel}
 *
 * <p>GetSnapshotUrlsResponse</p>
 */
public class GetSnapshotUrlsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetSnapshotUrlsResponseBody body;

    private GetSnapshotUrlsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSnapshotUrlsResponse create() {
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
    public GetSnapshotUrlsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSnapshotUrlsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSnapshotUrlsResponseBody body);

        @Override
        GetSnapshotUrlsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSnapshotUrlsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetSnapshotUrlsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSnapshotUrlsResponse response) {
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
        public Builder body(GetSnapshotUrlsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSnapshotUrlsResponse build() {
            return new GetSnapshotUrlsResponse(this);
        } 

    } 

}
