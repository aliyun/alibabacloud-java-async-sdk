// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentDetailEscalationPlansResponse} extends {@link TeaModel}
 *
 * <p>ListIncidentDetailEscalationPlansResponse</p>
 */
public class ListIncidentDetailEscalationPlansResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListIncidentDetailEscalationPlansResponseBody body;

    private ListIncidentDetailEscalationPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListIncidentDetailEscalationPlansResponse create() {
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
    public ListIncidentDetailEscalationPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIncidentDetailEscalationPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListIncidentDetailEscalationPlansResponseBody body);

        @Override
        ListIncidentDetailEscalationPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIncidentDetailEscalationPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListIncidentDetailEscalationPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIncidentDetailEscalationPlansResponse response) {
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
        public Builder body(ListIncidentDetailEscalationPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIncidentDetailEscalationPlansResponse build() {
            return new ListIncidentDetailEscalationPlansResponse(this);
        } 

    } 

}
