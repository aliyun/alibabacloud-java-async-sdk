// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisSettingsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisSettingsResponse</p>
 */
public class DescribeDiagnosisSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiagnosisSettingsResponseBody body;

    private DescribeDiagnosisSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiagnosisSettingsResponse create() {
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
    public DescribeDiagnosisSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiagnosisSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiagnosisSettingsResponseBody body);

        @Override
        DescribeDiagnosisSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiagnosisSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiagnosisSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiagnosisSettingsResponse response) {
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
        public Builder body(DescribeDiagnosisSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiagnosisSettingsResponse build() {
            return new DescribeDiagnosisSettingsResponse(this);
        } 

    } 

}
