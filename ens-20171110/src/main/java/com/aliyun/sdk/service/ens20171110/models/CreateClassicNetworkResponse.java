// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClassicNetworkResponse} extends {@link TeaModel}
 *
 * <p>CreateClassicNetworkResponse</p>
 */
public class CreateClassicNetworkResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateClassicNetworkResponseBody body;

    private CreateClassicNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateClassicNetworkResponse create() {
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
    public CreateClassicNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClassicNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateClassicNetworkResponseBody body);

        @Override
        CreateClassicNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClassicNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateClassicNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClassicNetworkResponse response) {
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
        public Builder body(CreateClassicNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClassicNetworkResponse build() {
            return new CreateClassicNetworkResponse(this);
        } 

    } 

}
