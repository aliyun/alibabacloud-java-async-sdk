// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafDefaultRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafDefaultRulesResponseBody</p>
 */
public class DescribeDcdnWafDefaultRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List < Content> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnWafDefaultRulesResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafDefaultRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Content> content; 
        private String requestId; 

        /**
         * <p>The rule configurations.</p>
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafDefaultRulesResponseBody build() {
            return new DescribeDcdnWafDefaultRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafDefaultRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafDefaultRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Rules(Builder builder) {
            this.action = builder.action;
            this.config = builder.config;
            this.name = builder.name;
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
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String action; 
            private String config; 
            private String name; 
            private String status; 
            private String type; 

            /**
             * <p>The default action of the rule. Valid values:</p>
             * <ul>
             * <li><strong>monitor</strong></li>
             * <li><strong>deny</strong></li>
             * <li><strong>block</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The default configuration of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;wafGroupIds&quot;:&quot;1012&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The default name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Default_WafGroup_Rule</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The default status of the rule. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li><strong>waf_group</strong>: basic web protection.</li>
             * <li><strong>high_frequency</strong>: high-frequency scanning blocking.</li>
             * <li><strong>directory_traversal</strong>: directory traversal blocking.</li>
             * <li><strong>scan_tools</strong>: scanner blocking.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>waf_group</p>
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
    /**
     * 
     * {@link DescribeDcdnWafDefaultRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafDefaultRulesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        private Content(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String defenseScene; 
            private java.util.List < Rules> rules; 

            /**
             * <p>The protection scenario. Valid values:</p>
             * <ul>
             * <li><strong>waf_group</strong>: basic web protection.</li>
             * <li><strong>anti_scan</strong>: scan protection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>anti_scan</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The rules.</p>
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
