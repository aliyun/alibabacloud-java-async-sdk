// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListWafTemplateRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWafTemplateRulesResponseBody</p>
 */
public class ListWafTemplateRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private ListWafTemplateRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafTemplateRulesResponseBody create() {
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
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Rules> rules; 

        private Builder() {
        } 

        private Builder(ListWafTemplateRulesResponseBody model) {
            this.requestId = model.requestId;
            this.rules = model.rules;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of returned template rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        public ListWafTemplateRulesResponseBody build() {
            return new ListWafTemplateRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWafTemplateRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWafTemplateRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private WafRuleConfig config;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Rules(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.phase = builder.phase;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public WafRuleConfig getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private WafRuleConfig config; 
            private String name; 
            private String phase; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.config = model.config;
                this.name = model.name;
                this.phase = model.phase;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>Rule configuration.</p>
             */
            public Builder config(WafRuleConfig config) {
                this.config = config;
                return this;
            }

            /**
             * <p>Rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP Directory Traversal Rule [Template]</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>WAF operation phase.</p>
             * 
             * <strong>example:</strong>
             * <p>http_anti_scan</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>Rule status.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>http_directory_traversal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
