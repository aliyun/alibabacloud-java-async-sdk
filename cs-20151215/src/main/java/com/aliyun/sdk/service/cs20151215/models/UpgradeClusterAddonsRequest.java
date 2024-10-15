// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeClusterAddonsRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClusterAddonsRequest</p>
 */
public class UpgradeClusterAddonsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < UpgradeClusterAddonsRequestBody> body;

    private UpgradeClusterAddonsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeClusterAddonsRequest create() {
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
    public java.util.List < UpgradeClusterAddonsRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpgradeClusterAddonsRequest, Builder> {
        private String clusterId; 
        private java.util.List < UpgradeClusterAddonsRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeClusterAddonsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.body = request.body;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cf4299b79b3e34226abfdc80a4bda****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The request parameters.</p>
         */
        public Builder body(java.util.List < UpgradeClusterAddonsRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpgradeClusterAddonsRequest build() {
            return new UpgradeClusterAddonsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpgradeClusterAddonsRequest} extends {@link TeaModel}
     *
     * <p>UpgradeClusterAddonsRequest</p>
     */
    public static class UpgradeClusterAddonsRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("component_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("next_version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nextVersion;

        @com.aliyun.core.annotation.NameInMap("policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private UpgradeClusterAddonsRequestBody(Builder builder) {
            this.componentName = builder.componentName;
            this.config = builder.config;
            this.nextVersion = builder.nextVersion;
            this.policy = builder.policy;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeClusterAddonsRequestBody create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return nextVersion
         */
        public String getNextVersion() {
            return this.nextVersion;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String componentName; 
            private String config; 
            private String nextVersion; 
            private String policy; 
            private String version; 

            /**
             * <p>The name of the component.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>coredns</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>The custom component settings that you want to use. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;CpuRequest&quot;:&quot;800m&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The version to which the component can be updated. You can call the <code>DescribeClusterAddonsVersion</code> operation to query the version to which the component can be updated.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1.6.7</p>
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
                return this;
            }

            /**
             * <p>The update policy. Valid values:</p>
             * <ul>
             * <li>overwrite</li>
             * <li>canary</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>canary</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The current version of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.6.2</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public UpgradeClusterAddonsRequestBody build() {
                return new UpgradeClusterAddonsRequestBody(this);
            } 

        } 

    }
}
