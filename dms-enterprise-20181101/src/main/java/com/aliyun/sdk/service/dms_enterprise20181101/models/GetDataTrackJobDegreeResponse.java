// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataTrackJobDegreeResponse} extends {@link TeaModel}
 *
 * <p>GetDataTrackJobDegreeResponse</p>
 */
public class GetDataTrackJobDegreeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetDataTrackJobDegreeResponseBody body;

    private GetDataTrackJobDegreeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetDataTrackJobDegreeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataTrackJobDegreeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetDataTrackJobDegreeResponseBody body);

        @Override
        GetDataTrackJobDegreeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataTrackJobDegreeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetDataTrackJobDegreeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataTrackJobDegreeResponse response) {
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
