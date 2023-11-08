// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpgradeVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeVersionResponseBody</p>
 */
public class DescribeUpgradeVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Version")
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

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The version information.
         */
        public Builder version(Version version) {
            this.version = version;
            return this;
        }

        public DescribeUpgradeVersionResponseBody build() {
            return new DescribeUpgradeVersionResponseBody(this);
        } 

    } 

    public static class Version extends TeaModel {
        @NameInMap("IstioOperatorVersion")
        private String istioOperatorVersion;

        @NameInMap("IstioVersion")
        private String istioVersion;

        @NameInMap("KubernetesVersion")
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

            /**
             * The version of the ASM instance.
             */
            public Builder istioOperatorVersion(String istioOperatorVersion) {
                this.istioOperatorVersion = istioOperatorVersion;
                return this;
            }

            /**
             * The Istio version.
             */
            public Builder istioVersion(String istioVersion) {
                this.istioVersion = istioVersion;
                return this;
            }

            /**
             * The Kubernetes version.
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
