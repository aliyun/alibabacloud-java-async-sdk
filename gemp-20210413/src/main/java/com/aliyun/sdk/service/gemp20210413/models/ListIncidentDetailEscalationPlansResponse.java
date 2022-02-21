// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentDetailEscalationPlansResponse} extends {@link TeaModel}
 *
 * <p>ListIncidentDetailEscalationPlansResponse</p>
 */
public class ListIncidentDetailEscalationPlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIncidentDetailEscalationPlansResponseBody body;

    private ListIncidentDetailEscalationPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public ListIncidentDetailEscalationPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIncidentDetailEscalationPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIncidentDetailEscalationPlansResponseBody body);

        @Override
        ListIncidentDetailEscalationPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIncidentDetailEscalationPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIncidentDetailEscalationPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIncidentDetailEscalationPlansResponse response) {
            super(response);
            this.headers = response.headers;
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
