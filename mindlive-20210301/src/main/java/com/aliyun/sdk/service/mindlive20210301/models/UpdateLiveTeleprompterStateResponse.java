// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveTeleprompterStateResponse} extends {@link TeaModel}
 *
 * <p>UpdateLiveTeleprompterStateResponse</p>
 */
public class UpdateLiveTeleprompterStateResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateLiveTeleprompterStateResponseBody body;

    private UpdateLiveTeleprompterStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateLiveTeleprompterStateResponse create() {
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
    public UpdateLiveTeleprompterStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLiveTeleprompterStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateLiveTeleprompterStateResponseBody body);

        @Override
        UpdateLiveTeleprompterStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLiveTeleprompterStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateLiveTeleprompterStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLiveTeleprompterStateResponse response) {
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
        public Builder body(UpdateLiveTeleprompterStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLiveTeleprompterStateResponse build() {
            return new UpdateLiveTeleprompterStateResponse(this);
        } 

    } 

}
