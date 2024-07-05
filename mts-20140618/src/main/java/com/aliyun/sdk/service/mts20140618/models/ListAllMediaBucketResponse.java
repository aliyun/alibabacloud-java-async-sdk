// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllMediaBucketResponse} extends {@link TeaModel}
 *
 * <p>ListAllMediaBucketResponse</p>
 */
public class ListAllMediaBucketResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAllMediaBucketResponseBody body;

    private ListAllMediaBucketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAllMediaBucketResponse create() {
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
    public ListAllMediaBucketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAllMediaBucketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAllMediaBucketResponseBody body);

        @Override
        ListAllMediaBucketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAllMediaBucketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAllMediaBucketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAllMediaBucketResponse response) {
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
        public Builder body(ListAllMediaBucketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAllMediaBucketResponse build() {
            return new ListAllMediaBucketResponse(this);
        } 

    } 

}
