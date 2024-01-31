// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationsForTemplateResponse} extends {@link TeaModel}
 *
 * <p>ListQuotaApplicationsForTemplateResponse</p>
 */
public class ListQuotaApplicationsForTemplateResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListQuotaApplicationsForTemplateResponseBody body;

    private ListQuotaApplicationsForTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListQuotaApplicationsForTemplateResponse create() {
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
    public ListQuotaApplicationsForTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQuotaApplicationsForTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListQuotaApplicationsForTemplateResponseBody body);

        @Override
        ListQuotaApplicationsForTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQuotaApplicationsForTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListQuotaApplicationsForTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQuotaApplicationsForTemplateResponse response) {
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
        public Builder body(ListQuotaApplicationsForTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQuotaApplicationsForTemplateResponse build() {
            return new ListQuotaApplicationsForTemplateResponse(this);
        } 

    } 

}
