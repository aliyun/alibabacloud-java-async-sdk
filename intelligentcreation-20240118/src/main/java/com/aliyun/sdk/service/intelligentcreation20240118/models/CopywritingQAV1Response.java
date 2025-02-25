// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopywritingQAV1Response} extends {@link TeaModel}
 *
 * <p>CopywritingQAV1Response</p>
 */
public class CopywritingQAV1Response extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DigitalHumanLiveBroadcastQAResult body;

    private CopywritingQAV1Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CopywritingQAV1Response create() {
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
    public DigitalHumanLiveBroadcastQAResult getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopywritingQAV1Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DigitalHumanLiveBroadcastQAResult body);

        @Override
        CopywritingQAV1Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopywritingQAV1Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DigitalHumanLiveBroadcastQAResult body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopywritingQAV1Response response) {
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
        public Builder body(DigitalHumanLiveBroadcastQAResult body) {
            this.body = body;
            return this;
        }

        @Override
        public CopywritingQAV1Response build() {
            return new CopywritingQAV1Response(this);
        } 

    } 

}
