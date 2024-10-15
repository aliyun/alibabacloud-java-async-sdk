// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeResourcesDeleteProtectionResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourcesDeleteProtectionResponse</p>
 */
public class DescribeResourcesDeleteProtectionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < DescribeResourcesDeleteProtectionResponseBody> body;

    private DescribeResourcesDeleteProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeResourcesDeleteProtectionResponse create() {
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
    public java.util.List < DescribeResourcesDeleteProtectionResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourcesDeleteProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List < DescribeResourcesDeleteProtectionResponseBody> body);

        @Override
        DescribeResourcesDeleteProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourcesDeleteProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.List < DescribeResourcesDeleteProtectionResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourcesDeleteProtectionResponse response) {
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
        public Builder body(java.util.List < DescribeResourcesDeleteProtectionResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourcesDeleteProtectionResponse build() {
            return new DescribeResourcesDeleteProtectionResponse(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourcesDeleteProtectionResponse} extends {@link TeaModel}
     *
     * <p>DescribeResourcesDeleteProtectionResponse</p>
     */
    public static class DescribeResourcesDeleteProtectionResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("protection")
        private Boolean protection;

        private DescribeResourcesDeleteProtectionResponseBody(Builder builder) {
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.resource = builder.resource;
            this.protection = builder.protection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeResourcesDeleteProtectionResponseBody create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return protection
         */
        public Boolean getProtection() {
            return this.protection;
        }

        public static final class Builder {
            private String name; 
            private String namespace; 
            private String resource; 
            private Boolean protection; 

            /**
             * <p>The name of the resource.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The type of resource for which deletion protection is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>namespaces</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>Indicates whether deletion protection is enabled.</p>
             * <ul>
             * <li>true: deletion protection is enabled.</li>
             * <li>false: deletion protection is disabled.</li>
             * </ul>
             * <p>Default value: false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder protection(Boolean protection) {
                this.protection = protection;
                return this;
            }

            public DescribeResourcesDeleteProtectionResponseBody build() {
                return new DescribeResourcesDeleteProtectionResponseBody(this);
            } 

        } 

    }
}
