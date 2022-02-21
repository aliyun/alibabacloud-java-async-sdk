// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIncidentTimelinesResponse} extends {@link TeaModel}
 *
 * <p>ListIncidentTimelinesResponse</p>
 */
public class ListIncidentTimelinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIncidentTimelinesResponseBody body;

    private ListIncidentTimelinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIncidentTimelinesResponse create() {
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
    public ListIncidentTimelinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIncidentTimelinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIncidentTimelinesResponseBody body);

        @Override
        ListIncidentTimelinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIncidentTimelinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIncidentTimelinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIncidentTimelinesResponse response) {
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
        public Builder body(ListIncidentTimelinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIncidentTimelinesResponse build() {
            return new ListIncidentTimelinesResponse(this);
        } 

    } 

}
