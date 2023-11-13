// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableMultiAccountResourceCenterResponse} extends {@link TeaModel}
 *
 * <p>DisableMultiAccountResourceCenterResponse</p>
 */
public class DisableMultiAccountResourceCenterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DisableMultiAccountResourceCenterResponseBody body;

    private DisableMultiAccountResourceCenterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DisableMultiAccountResourceCenterResponse create() {
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
    public DisableMultiAccountResourceCenterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableMultiAccountResourceCenterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DisableMultiAccountResourceCenterResponseBody body);

        @Override
        DisableMultiAccountResourceCenterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableMultiAccountResourceCenterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DisableMultiAccountResourceCenterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableMultiAccountResourceCenterResponse response) {
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
        public Builder body(DisableMultiAccountResourceCenterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableMultiAccountResourceCenterResponse build() {
            return new DisableMultiAccountResourceCenterResponse(this);
        } 

    } 

}
