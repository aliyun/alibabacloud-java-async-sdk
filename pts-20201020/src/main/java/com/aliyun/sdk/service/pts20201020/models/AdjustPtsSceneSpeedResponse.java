// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AdjustPtsSceneSpeedResponse} extends {@link TeaModel}
 *
 * <p>AdjustPtsSceneSpeedResponse</p>
 */
public class AdjustPtsSceneSpeedResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private AdjustPtsSceneSpeedResponseBody body;

    private AdjustPtsSceneSpeedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AdjustPtsSceneSpeedResponse create() {
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
    public AdjustPtsSceneSpeedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AdjustPtsSceneSpeedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AdjustPtsSceneSpeedResponseBody body);

        @Override
        AdjustPtsSceneSpeedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AdjustPtsSceneSpeedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AdjustPtsSceneSpeedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AdjustPtsSceneSpeedResponse response) {
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
        public Builder body(AdjustPtsSceneSpeedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AdjustPtsSceneSpeedResponse build() {
            return new AdjustPtsSceneSpeedResponse(this);
        } 

    } 

}
