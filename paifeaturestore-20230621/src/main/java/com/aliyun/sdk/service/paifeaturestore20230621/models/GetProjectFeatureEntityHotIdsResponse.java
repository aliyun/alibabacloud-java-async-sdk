// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectFeatureEntityHotIdsResponse} extends {@link TeaModel}
 *
 * <p>GetProjectFeatureEntityHotIdsResponse</p>
 */
public class GetProjectFeatureEntityHotIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private GetProjectFeatureEntityHotIdsResponseBody body;

    private GetProjectFeatureEntityHotIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetProjectFeatureEntityHotIdsResponse create() {
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
    public GetProjectFeatureEntityHotIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProjectFeatureEntityHotIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetProjectFeatureEntityHotIdsResponseBody body);

        @Override
        GetProjectFeatureEntityHotIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProjectFeatureEntityHotIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetProjectFeatureEntityHotIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProjectFeatureEntityHotIdsResponse response) {
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
        public Builder body(GetProjectFeatureEntityHotIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProjectFeatureEntityHotIdsResponse build() {
            return new GetProjectFeatureEntityHotIdsResponse(this);
        } 

    } 

}
