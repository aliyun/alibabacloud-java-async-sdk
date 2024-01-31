// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAddonUpgradeStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterAddonUpgradeStatusResponse</p>
 */
public class DescribeClusterAddonUpgradeStatusResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private java.util.Map < String, ? > body;

    private DescribeClusterAddonUpgradeStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeClusterAddonUpgradeStatusResponse create() {
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
    public java.util.Map < String, ? > getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterAddonUpgradeStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.Map < String, ? > body);

        @Override
        DescribeClusterAddonUpgradeStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterAddonUpgradeStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.Map < String, ? > body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterAddonUpgradeStatusResponse response) {
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
        public Builder body(java.util.Map < String, ? > body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterAddonUpgradeStatusResponse build() {
            return new DescribeClusterAddonUpgradeStatusResponse(this);
        } 

    } 

}
