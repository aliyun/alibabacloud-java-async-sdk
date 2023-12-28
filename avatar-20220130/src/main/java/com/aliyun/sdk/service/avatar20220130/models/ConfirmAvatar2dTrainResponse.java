// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmAvatar2dTrainResponse} extends {@link TeaModel}
 *
 * <p>ConfirmAvatar2dTrainResponse</p>
 */
public class ConfirmAvatar2dTrainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ConfirmAvatar2dTrainResponseBody body;

    private ConfirmAvatar2dTrainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ConfirmAvatar2dTrainResponse create() {
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
    public ConfirmAvatar2dTrainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfirmAvatar2dTrainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ConfirmAvatar2dTrainResponseBody body);

        @Override
        ConfirmAvatar2dTrainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfirmAvatar2dTrainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ConfirmAvatar2dTrainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfirmAvatar2dTrainResponse response) {
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
        public Builder body(ConfirmAvatar2dTrainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfirmAvatar2dTrainResponse build() {
            return new ConfirmAvatar2dTrainResponse(this);
        } 

    } 

}
