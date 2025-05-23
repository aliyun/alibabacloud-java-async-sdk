// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InstallClusterAddonsRequest} extends {@link RequestModel}
 *
 * <p>InstallClusterAddonsRequest</p>
 */
public class InstallClusterAddonsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<InstallClusterAddonsRequestBody> body;

    private InstallClusterAddonsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallClusterAddonsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return body
     */
    public java.util.List<InstallClusterAddonsRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<InstallClusterAddonsRequest, Builder> {
        private String clusterId; 
        private java.util.List<InstallClusterAddonsRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(InstallClusterAddonsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.body = request.body;
        } 

        /**
         * <p>集群ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>请求体参数。</p>
         * 
         * <strong>example:</strong>
         * <p>ags-metrics-collector</p>
         */
        public Builder body(java.util.List<InstallClusterAddonsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public InstallClusterAddonsRequest build() {
            return new InstallClusterAddonsRequest(this);
        } 

    } 

    /**
     * 
     * {@link InstallClusterAddonsRequest} extends {@link TeaModel}
     *
     * <p>InstallClusterAddonsRequest</p>
     */
    public static class InstallClusterAddonsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String version;

        private InstallClusterAddonsRequestBody(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstallClusterAddonsRequestBody create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String config; 
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(InstallClusterAddonsRequestBody model) {
                this.config = model.config;
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>组件自定义参数，使用JSON字符串编码。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;IngressDashboardEnabled&quot;:&quot;true&quot;,&quot;sls_project_name&quot;:&quot;your_sls_project_name&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>组件名称。您可以通过<a href="https://help.aliyun.com/document_detail/2667939.html">ListAddons</a>接口查询可用组件的信息，包括组件名称及版本等。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>logtail-ds</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>组件版本。您可以通过<a href="https://help.aliyun.com/document_detail/2667939.html">ListAddons</a>接口查询可用组件的信息，包括组件名称及版本等。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.7.3.0-aliyun</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public InstallClusterAddonsRequestBody build() {
                return new InstallClusterAddonsRequestBody(this);
            } 

        } 

    }
}
