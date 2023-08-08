// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeClusterAddonsRequest} extends {@link RequestModel}
 *
 * <p>UpgradeClusterAddonsRequest</p>
 */
public class UpgradeClusterAddonsRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("body")
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
         * cf4299b79b3e34226abfdc80a4bda\*\*\*\*
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * body.
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

    public static class UpgradeClusterAddonsRequestBody extends TeaModel {
        @NameInMap("component_name")
        @Validation(required = true)
        private String componentName;

        @NameInMap("config")
        private String config;

        @NameInMap("next_version")
        @Validation(required = true)
        private String nextVersion;

        @NameInMap("policy")
        private String policy;

        @NameInMap("version")
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
             * component_name.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * next_version.
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
                return this;
            }

            /**
             * policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * version.
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
