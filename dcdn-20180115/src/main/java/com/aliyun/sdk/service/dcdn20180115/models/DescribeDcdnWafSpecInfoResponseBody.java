// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafSpecInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafSpecInfoResponseBody</p>
 */
public class DescribeDcdnWafSpecInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpecInfos")
    private java.util.List < SpecInfos> specInfos;

    private DescribeDcdnWafSpecInfoResponseBody(Builder builder) {
        this.edition = builder.edition;
        this.requestId = builder.requestId;
        this.specInfos = builder.specInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafSpecInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return specInfos
     */
    public java.util.List < SpecInfos> getSpecInfos() {
        return this.specInfos;
    }

    public static final class Builder {
        private String edition; 
        private String requestId; 
        private java.util.List < SpecInfos> specInfos; 

        /**
         * <p>The version of WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>dcdnwaf_afterpay</p>
         */
        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7281593a-f414-42c1-b7ba-2ce65e21cc00</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The supported types of protection policies and the configuration information of protection rules.</p>
         */
        public Builder specInfos(java.util.List < SpecInfos> specInfos) {
            this.specInfos = specInfos;
            return this;
        }

        public DescribeDcdnWafSpecInfoResponseBody build() {
            return new DescribeDcdnWafSpecInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafSpecInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafSpecInfoResponseBody</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Configs(Builder builder) {
            this.config = builder.config;
            this.expr = builder.expr;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String config; 
            private String expr; 
            private String value; 

            /**
             * <p>The configuration code of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The configuration expression of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>equal</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>The value of the configuration expression of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDcdnWafSpecInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafSpecInfoResponseBody</p>
     */
    public static class SpecInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configs")
        private java.util.List < Configs> configs;

        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        private SpecInfos(Builder builder) {
            this.configs = builder.configs;
            this.defenseScene = builder.defenseScene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecInfos create() {
            return builder().build();
        }

        /**
         * @return configs
         */
        public java.util.List < Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public static final class Builder {
            private java.util.List < Configs> configs; 
            private String defenseScene; 

            /**
             * <p>The configuration information of the protection rule.</p>
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * <p>The type of the protection policy. Valid values:</p>
             * <ul>
             * <li>waf_group: basic web protection</li>
             * <li>custom_acl: custom</li>
             * <li>whitelist: whitelist</li>
             * <li>ip_blacklist: IP address blacklist</li>
             * <li>region_block: region blacklist</li>
             * <li>bot: bot management</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom_acl</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            public SpecInfos build() {
                return new SpecInfos(this);
            } 

        } 

    }
}
