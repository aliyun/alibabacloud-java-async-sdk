// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallClusterAddonsRequest} extends {@link RequestModel}
 *
 * <p>InstallClusterAddonsRequest</p>
 */
public class InstallClusterAddonsRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("body")
    private java.util.List < InstallClusterAddonsRequestBody> body;

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
    public java.util.List < InstallClusterAddonsRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<InstallClusterAddonsRequest, Builder> {
        private String clusterId; 
        private java.util.List < InstallClusterAddonsRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(InstallClusterAddonsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.body = request.body;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The request body parameters.
         */
        public Builder body(java.util.List < InstallClusterAddonsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public InstallClusterAddonsRequest build() {
            return new InstallClusterAddonsRequest(this);
        } 

    } 

    public static class InstallClusterAddonsRequestBody extends TeaModel {
        @NameInMap("name")
        @Validation(required = true)
        private String name;

        @NameInMap("version")
        @Validation(required = true)
        private String version;

        @NameInMap("config")
        private String config;

        private InstallClusterAddonsRequestBody(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstallClusterAddonsRequestBody create() {
            return builder().build();
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

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        public static final class Builder {
            private String name; 
            private String version; 
            private String config; 

            /**
             * 组件名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 组件版本。
             * <p>
             * 
             * > 可以API接口[DescribeClusterAddonsVersion](~~197434~~)通过组件列表查询版本号。
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * 组件配置信息。
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            public InstallClusterAddonsRequestBody build() {
                return new InstallClusterAddonsRequestBody(this);
            } 

        } 

    }
}
