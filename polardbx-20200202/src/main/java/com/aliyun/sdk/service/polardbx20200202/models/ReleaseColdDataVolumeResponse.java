// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReleaseColdDataVolumeResponse} extends {@link TeaModel}
 *
 * <p>ReleaseColdDataVolumeResponse</p>
 */
public class ReleaseColdDataVolumeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ReleaseColdDataVolumeResponseBody body;

    private ReleaseColdDataVolumeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReleaseColdDataVolumeResponse create() {
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
    public ReleaseColdDataVolumeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseColdDataVolumeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReleaseColdDataVolumeResponseBody body);

        @Override
        ReleaseColdDataVolumeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseColdDataVolumeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReleaseColdDataVolumeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseColdDataVolumeResponse response) {
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
        public Builder body(ReleaseColdDataVolumeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseColdDataVolumeResponse build() {
            return new ReleaseColdDataVolumeResponse(this);
        } 

    } 

}
