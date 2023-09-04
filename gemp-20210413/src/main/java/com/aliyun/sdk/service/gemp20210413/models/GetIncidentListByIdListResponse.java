// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentListByIdListResponse} extends {@link TeaModel}
 *
 * <p>GetIncidentListByIdListResponse</p>
 */
public class GetIncidentListByIdListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIncidentListByIdListResponseBody body;

    private GetIncidentListByIdListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIncidentListByIdListResponse create() {
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
    public GetIncidentListByIdListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIncidentListByIdListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIncidentListByIdListResponseBody body);

        @Override
        GetIncidentListByIdListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIncidentListByIdListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIncidentListByIdListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIncidentListByIdListResponse response) {
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
        public Builder body(GetIncidentListByIdListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIncidentListByIdListResponse build() {
            return new GetIncidentListByIdListResponse(this);
        } 

    } 

}
