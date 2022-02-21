// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIncidentResponse} extends {@link TeaModel}
 *
 * <p>UpdateIncidentResponse</p>
 */
public class UpdateIncidentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIncidentResponseBody body;

    private UpdateIncidentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIncidentResponse create() {
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
    public UpdateIncidentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIncidentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIncidentResponseBody body);

        @Override
        UpdateIncidentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIncidentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIncidentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIncidentResponse response) {
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
        public Builder body(UpdateIncidentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIncidentResponse build() {
            return new UpdateIncidentResponse(this);
        } 

    } 

}
