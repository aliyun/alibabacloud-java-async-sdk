// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartReleaseResponse} extends {@link TeaModel}
 *
 * <p>ListChartReleaseResponse</p>
 */
public class ListChartReleaseResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListChartReleaseResponseBody body;

    private ListChartReleaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListChartReleaseResponse create() {
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
    public ListChartReleaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListChartReleaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListChartReleaseResponseBody body);

        @Override
        ListChartReleaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListChartReleaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListChartReleaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListChartReleaseResponse response) {
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
        public Builder body(ListChartReleaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListChartReleaseResponse build() {
            return new ListChartReleaseResponse(this);
        } 

    } 

}
