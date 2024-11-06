// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The user configurations.</p>
         */
        public Builder configs(java.util.List < Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>06D29681-B7CD-4034-A8CC-28AFFA213539</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnUserConfigsResponseBody build() {
            return new DescribeDcdnUserConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnUserConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserConfigsResponseBody</p>
     */
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
             * <p>The name of the configuration.</p>
             * <p>The configuration is specified by enterprise users and public service sectors.</p>
             * 
             * <strong>example:</strong>
             * <p>allow_function</p>
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * <p>The value of the configuration. Valid values:</p>
             * <ul>
             * <li>cc_rule: HTTP flood protection</li>
             * <li>ddos_dispatch: DDoS mitigation</li>
             * <li>edge_safe: application security on points of presence (POPs)</li>
             * <li>blocked_regions: region blacklist</li>
             * <li>http_acl_policy: precise access control</li>
             * <li>bot_manager: bot traffic management</li>
             * <li>ip_reputation: IP reputation library</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dcdn_allow&quot;:[&quot;cc_rule&quot;,&quot;ddos_dispatch&quot;]}</p>
             */
            public Builder argValue(String argValue) {
                this.argValue = argValue;
                return this;
            }

            /**
             * <p>The name of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>domain_business_control</p>
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
