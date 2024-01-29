// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPipelineRelationsResponse} extends {@link TeaModel}
 *
 * <p>AddPipelineRelationsResponse</p>
 */
public class AddPipelineRelationsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private AddPipelineRelationsResponseBody body;

    private AddPipelineRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddPipelineRelationsResponse create() {
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
    public AddPipelineRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPipelineRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddPipelineRelationsResponseBody body);

        @Override
        AddPipelineRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPipelineRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddPipelineRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPipelineRelationsResponse response) {
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
        public Builder body(AddPipelineRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPipelineRelationsResponse build() {
            return new AddPipelineRelationsResponse(this);
        } 

    } 

}
