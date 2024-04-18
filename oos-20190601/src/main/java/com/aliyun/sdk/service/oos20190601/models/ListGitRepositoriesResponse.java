// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGitRepositoriesResponse} extends {@link TeaModel}
 *
 * <p>ListGitRepositoriesResponse</p>
 */
public class ListGitRepositoriesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListGitRepositoriesResponseBody body;

    private ListGitRepositoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListGitRepositoriesResponse create() {
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
    public ListGitRepositoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGitRepositoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListGitRepositoriesResponseBody body);

        @Override
        ListGitRepositoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGitRepositoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListGitRepositoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGitRepositoriesResponse response) {
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
        public Builder body(ListGitRepositoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGitRepositoriesResponse build() {
            return new ListGitRepositoriesResponse(this);
        } 

    } 

}
