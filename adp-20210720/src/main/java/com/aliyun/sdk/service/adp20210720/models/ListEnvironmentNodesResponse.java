// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentNodesResponse} extends {@link TeaModel}
 *
 * <p>ListEnvironmentNodesResponse</p>
 */
public class ListEnvironmentNodesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListEnvironmentNodesResponseBody body;

    private ListEnvironmentNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListEnvironmentNodesResponse create() {
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
    public ListEnvironmentNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEnvironmentNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListEnvironmentNodesResponseBody body);

        @Override
        ListEnvironmentNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEnvironmentNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListEnvironmentNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEnvironmentNodesResponse response) {
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
        public Builder body(ListEnvironmentNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEnvironmentNodesResponse build() {
            return new ListEnvironmentNodesResponse(this);
        } 

    } 

}
