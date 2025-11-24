// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeUpgradeVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeVersionResponseBody</p>
 */
public class DescribeUpgradeVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Version version;

    private DescribeUpgradeVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpgradeVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return version
     */
    public Version getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private Version version; 

        private Builder() {
        } 

        private Builder(DescribeUpgradeVersionResponseBody model) {
            this.requestId = model.requestId;
            this.version = model.version;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11fd0027-c27e-41bb-a565-75583054****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version information.</p>
         */
        public Builder version(Version version) {
            this.version = version;
            return this;
        }

        public DescribeUpgradeVersionResponseBody build() {
            return new DescribeUpgradeVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUpgradeVersionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpgradeVersionResponseBody</p>
     */
    public static class Version extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IstioOperatorVersion")
        private String istioOperatorVersion;

        @com.aliyun.core.annotation.NameInMap("IstioVersion")
        private String istioVersion;

        @com.aliyun.core.annotation.NameInMap("KubernetesVersion")
        private String kubernetesVersion;

        private Version(Builder builder) {
            this.istioOperatorVersion = builder.istioOperatorVersion;
            this.istioVersion = builder.istioVersion;
            this.kubernetesVersion = builder.kubernetesVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Version create() {
            return builder().build();
        }

        /**
         * @return istioOperatorVersion
         */
        public String getIstioOperatorVersion() {
            return this.istioOperatorVersion;
        }

        /**
         * @return istioVersion
         */
        public String getIstioVersion() {
            return this.istioVersion;
        }

        /**
         * @return kubernetesVersion
         */
        public String getKubernetesVersion() {
            return this.kubernetesVersion;
        }

        public static final class Builder {
            private String istioOperatorVersion; 
            private String istioVersion; 
            private String kubernetesVersion; 

            private Builder() {
            } 

            private Builder(Version model) {
                this.istioOperatorVersion = model.istioOperatorVersion;
                this.istioVersion = model.istioVersion;
                this.kubernetesVersion = model.kubernetesVersion;
            } 

            /**
             * <p>The version of the ASM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.17.2.42-gf7619883-aliyun</p>
             */
            public Builder istioOperatorVersion(String istioOperatorVersion) {
                this.istioOperatorVersion = istioOperatorVersion;
                return this;
            }

            /**
             * <p>The Istio version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.17.2</p>
             */
            public Builder istioVersion(String istioVersion) {
                this.istioVersion = istioVersion;
                return this;
            }

            /**
             * <p>The Kubernetes version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.24.6-aliyun.1</p>
             */
            public Builder kubernetesVersion(String kubernetesVersion) {
                this.kubernetesVersion = kubernetesVersion;
                return this;
            }

            public Version build() {
                return new Version(this);
            } 

        } 

    }
}
