// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserConfigsResponseBody</p>
 */
public class DescribeDcdnUserConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List < Configs> configs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnUserConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List < Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Configs> configs; 
        private String requestId; 

        /**
         * The user configurations.
         */
        public Builder configs(java.util.List < Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnUserConfigsResponseBody build() {
            return new DescribeDcdnUserConfigsResponseBody(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArgName")
        private String argName;

        @com.aliyun.core.annotation.NameInMap("ArgValue")
        private String argValue;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        private Configs(Builder builder) {
            this.argName = builder.argName;
            this.argValue = builder.argValue;
            this.functionName = builder.functionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return argName
         */
        public String getArgName() {
            return this.argName;
        }

        /**
         * @return argValue
         */
        public String getArgValue() {
            return this.argValue;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        public static final class Builder {
            private String argName; 
            private String argValue; 
            private String functionName; 

            /**
             * The name of the configuration.
             * <p>
             * 
             * The configuration is specified by enterprise users and public service sectors.
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * The value of the configuration. Valid values:
             * <p>
             * 
             * *   cc_rule: HTTP flood protection
             * *   ddos_dispatch: DDoS mitigation
             * *   edge_safe: application security on points of presence (POPs)
             * *   blocked_regions: region blacklist
             * *   http_acl_policy: precise access control
             * *   bot_manager: bot traffic management
             * *   ip_reputation: IP reputation library
             */
            public Builder argValue(String argValue) {
                this.argValue = argValue;
                return this;
            }

            /**
             * The name of the feature.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
