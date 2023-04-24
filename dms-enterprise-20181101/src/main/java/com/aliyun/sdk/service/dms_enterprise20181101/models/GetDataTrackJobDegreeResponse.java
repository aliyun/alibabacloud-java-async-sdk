// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataTrackJobDegreeResponse} extends {@link TeaModel}
 *
 * <p>GetDataTrackJobDegreeResponse</p>
 */
public class GetDataTrackJobDegreeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataTrackJobDegreeResponseBody body;

    private GetDataTrackJobDegreeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataTrackJobDegreeResponse create() {
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
    public GetDataTrackJobDegreeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataTrackJobDegreeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataTrackJobDegreeResponseBody body);

        @Override
        GetDataTrackJobDegreeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataTrackJobDegreeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataTrackJobDegreeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataTrackJobDegreeResponse response) {
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
        public Builder body(GetDataTrackJobDegreeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataTrackJobDegreeResponse build() {
            return new GetDataTrackJobDegreeResponse(this);
        } 

    } 

}
