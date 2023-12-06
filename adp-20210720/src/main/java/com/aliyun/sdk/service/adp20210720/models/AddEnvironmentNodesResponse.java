// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEnvironmentNodesResponse} extends {@link TeaModel}
 *
 * <p>AddEnvironmentNodesResponse</p>
 */
public class AddEnvironmentNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private AddEnvironmentNodesResponseBody body;

    private AddEnvironmentNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddEnvironmentNodesResponse create() {
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
    public AddEnvironmentNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddEnvironmentNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddEnvironmentNodesResponseBody body);

        @Override
        AddEnvironmentNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddEnvironmentNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddEnvironmentNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddEnvironmentNodesResponse response) {
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
        public Builder body(AddEnvironmentNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddEnvironmentNodesResponse build() {
            return new AddEnvironmentNodesResponse(this);
        } 

    } 

}
