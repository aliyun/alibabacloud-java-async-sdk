// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrefixListAssociationsResponse} extends {@link TeaModel}
 *
 * <p>DescribePrefixListAssociationsResponse</p>
 */
public class DescribePrefixListAssociationsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribePrefixListAssociationsResponseBody body;

    private DescribePrefixListAssociationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribePrefixListAssociationsResponse create() {
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
    public DescribePrefixListAssociationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePrefixListAssociationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribePrefixListAssociationsResponseBody body);

        @Override
        DescribePrefixListAssociationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePrefixListAssociationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribePrefixListAssociationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePrefixListAssociationsResponse response) {
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
        public Builder body(DescribePrefixListAssociationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePrefixListAssociationsResponse build() {
            return new DescribePrefixListAssociationsResponse(this);
        } 

    } 

}
