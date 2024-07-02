// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppReleaseStageExecutionsResponse} extends {@link TeaModel}
 *
 * <p>ListAppReleaseStageExecutionsResponse</p>
 */
public class ListAppReleaseStageExecutionsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAppReleaseStageExecutionsResponseBody body;

    private ListAppReleaseStageExecutionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAppReleaseStageExecutionsResponse create() {
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
    public ListAppReleaseStageExecutionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppReleaseStageExecutionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAppReleaseStageExecutionsResponseBody body);

        @Override
        ListAppReleaseStageExecutionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppReleaseStageExecutionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAppReleaseStageExecutionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppReleaseStageExecutionsResponse response) {
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
        public Builder body(ListAppReleaseStageExecutionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppReleaseStageExecutionsResponse build() {
            return new ListAppReleaseStageExecutionsResponse(this);
        } 

    } 

}
