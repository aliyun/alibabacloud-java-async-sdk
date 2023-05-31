// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspiciousOverallConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspiciousOverallConfigResponseBody</p>
 */
public class DescribeSuspiciousOverallConfigResponseBody extends TeaModel {
    @NameInMap("OverallConfig")
    private OverallConfig overallConfig;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSuspiciousOverallConfigResponseBody(Builder builder) {
        this.overallConfig = builder.overallConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspiciousOverallConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return overallConfig
     */
    public OverallConfig getOverallConfig() {
        return this.overallConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OverallConfig overallConfig; 
        private String requestId; 

        /**
         * The configuration.
         */
        public Builder overallConfig(OverallConfig overallConfig) {
            this.overallConfig = overallConfig;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSuspiciousOverallConfigResponseBody build() {
            return new DescribeSuspiciousOverallConfigResponseBody(this);
        } 

    } 

    public static class OverallConfig extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("Type")
        private String type;

        private OverallConfig(Builder builder) {
            this.config = builder.config;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallConfig create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String config; 
            private String type; 

            /**
             * The status of the feature. Valid values:
             * <p>
             * 
             * *   **off**: disabled
             * *   **on**: enabled
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The type of the feature. Valid values:
             * <p>
             * 
             * *   **auto_breaking**: Anti-Virus
             * *   **ransomware_breaking**: Anti-ransomware (Bait Capture)
             * *   **webshell\_cloud_breaking**: Webshell Protection
             * *   **alinet**: Behavior prevention
             * *   **k8s\_log_analysis**: K8s Threat Detection
             * *   **alisecguard**: Defense mode for Client Protection
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OverallConfig build() {
                return new OverallConfig(this);
            } 

        } 

    }
}
