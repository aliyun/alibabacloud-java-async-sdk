// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCdnUserConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserConfigsResponseBody</p>
 */
public class DescribeCdnUserConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnUserConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private String requestId; 

        /**
         * <p>The user configurations.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
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

        public DescribeCdnUserConfigsResponseBody build() {
            return new DescribeCdnUserConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnUserConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnUserConfigsResponseBody</p>
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
             * <li><strong>cc_rule</strong>: HTTP flood protection rules</li>
             * <li><strong>ddos_dispatch</strong>: integration with Anti-DDoS</li>
             * <li><strong>edge_safe</strong>: application security settings on POPs</li>
             * <li><strong>blocked_regions</strong>: blocked regions</li>
             * <li><strong>http_acl_policy</strong>: access control list (ACL) rules</li>
             * <li><strong>bot_manager</strong>: bot traffic management</li>
             * <li><strong>ip_reputation</strong>: IP reputation library</li>
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
