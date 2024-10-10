// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSuspiciousOverallConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSuspiciousOverallConfigResponseBody</p>
 */
public class DescribeSuspiciousOverallConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OverallConfig")
    private OverallConfig overallConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The configuration.</p>
         */
        public Builder overallConfig(OverallConfig overallConfig) {
            this.overallConfig = overallConfig;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSuspiciousOverallConfigResponseBody build() {
            return new DescribeSuspiciousOverallConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSuspiciousOverallConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSuspiciousOverallConfigResponseBody</p>
     */
    public static class OverallConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The status of the feature. Valid values:</p>
             * <ul>
             * <li><strong>off</strong>: disabled</li>
             * <li><strong>on</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The type of the feature. Valid values:</p>
             * <ul>
             * <li><strong>auto_breaking</strong>: Anti-Virus</li>
             * <li><strong>ransomware_breaking</strong>: Anti-ransomware (Bait Capture)</li>
             * <li><strong>webshell_cloud_breaking</strong>: Webshell Protection</li>
             * <li><strong>alinet</strong>: Behavior prevention</li>
             * <li><strong>k8s_log_analysis</strong>: K8s Threat Detection</li>
             * <li><strong>alisecguard</strong>: Defense mode for Client Protection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto_breaking</p>
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
