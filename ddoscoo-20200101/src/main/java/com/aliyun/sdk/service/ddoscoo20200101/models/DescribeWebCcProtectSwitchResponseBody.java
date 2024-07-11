// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebCcProtectSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebCcProtectSwitchResponseBody</p>
 */
public class DescribeWebCcProtectSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProtectSwitchList")
    private java.util.List < ProtectSwitchList> protectSwitchList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWebCcProtectSwitchResponseBody(Builder builder) {
        this.protectSwitchList = builder.protectSwitchList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebCcProtectSwitchResponseBody create() {
        return builder().build();
    }

    /**
     * @return protectSwitchList
     */
    public java.util.List < ProtectSwitchList> getProtectSwitchList() {
        return this.protectSwitchList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ProtectSwitchList> protectSwitchList; 
        private String requestId; 

        /**
         * The status of each mitigation policy for the website.
         */
        public Builder protectSwitchList(java.util.List < ProtectSwitchList> protectSwitchList) {
            this.protectSwitchList = protectSwitchList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebCcProtectSwitchResponseBody build() {
            return new DescribeWebCcProtectSwitchResponseBody(this);
        } 

    } 

    public static class ProtectSwitchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiMode")
        private String aiMode;

        @com.aliyun.core.annotation.NameInMap("AiRuleEnable")
        private Integer aiRuleEnable;

        @com.aliyun.core.annotation.NameInMap("AiTemplate")
        private String aiTemplate;

        @com.aliyun.core.annotation.NameInMap("BlackWhiteListEnable")
        private Integer blackWhiteListEnable;

        @com.aliyun.core.annotation.NameInMap("CcCustomRuleEnable")
        private Integer ccCustomRuleEnable;

        @com.aliyun.core.annotation.NameInMap("CcEnable")
        private Integer ccEnable;

        @com.aliyun.core.annotation.NameInMap("CcGlobalSwitch")
        private String ccGlobalSwitch;

        @com.aliyun.core.annotation.NameInMap("CcTemplate")
        private String ccTemplate;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("PreciseRuleEnable")
        private Integer preciseRuleEnable;

        @com.aliyun.core.annotation.NameInMap("RegionBlockEnable")
        private Integer regionBlockEnable;

        private ProtectSwitchList(Builder builder) {
            this.aiMode = builder.aiMode;
            this.aiRuleEnable = builder.aiRuleEnable;
            this.aiTemplate = builder.aiTemplate;
            this.blackWhiteListEnable = builder.blackWhiteListEnable;
            this.ccCustomRuleEnable = builder.ccCustomRuleEnable;
            this.ccEnable = builder.ccEnable;
            this.ccGlobalSwitch = builder.ccGlobalSwitch;
            this.ccTemplate = builder.ccTemplate;
            this.domain = builder.domain;
            this.preciseRuleEnable = builder.preciseRuleEnable;
            this.regionBlockEnable = builder.regionBlockEnable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtectSwitchList create() {
            return builder().build();
        }

        /**
         * @return aiMode
         */
        public String getAiMode() {
            return this.aiMode;
        }

        /**
         * @return aiRuleEnable
         */
        public Integer getAiRuleEnable() {
            return this.aiRuleEnable;
        }

        /**
         * @return aiTemplate
         */
        public String getAiTemplate() {
            return this.aiTemplate;
        }

        /**
         * @return blackWhiteListEnable
         */
        public Integer getBlackWhiteListEnable() {
            return this.blackWhiteListEnable;
        }

        /**
         * @return ccCustomRuleEnable
         */
        public Integer getCcCustomRuleEnable() {
            return this.ccCustomRuleEnable;
        }

        /**
         * @return ccEnable
         */
        public Integer getCcEnable() {
            return this.ccEnable;
        }

        /**
         * @return ccGlobalSwitch
         */
        public String getCcGlobalSwitch() {
            return this.ccGlobalSwitch;
        }

        /**
         * @return ccTemplate
         */
        public String getCcTemplate() {
            return this.ccTemplate;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return preciseRuleEnable
         */
        public Integer getPreciseRuleEnable() {
            return this.preciseRuleEnable;
        }

        /**
         * @return regionBlockEnable
         */
        public Integer getRegionBlockEnable() {
            return this.regionBlockEnable;
        }

        public static final class Builder {
            private String aiMode; 
            private Integer aiRuleEnable; 
            private String aiTemplate; 
            private Integer blackWhiteListEnable; 
            private Integer ccCustomRuleEnable; 
            private Integer ccEnable; 
            private String ccGlobalSwitch; 
            private String ccTemplate; 
            private String domain; 
            private Integer preciseRuleEnable; 
            private Integer regionBlockEnable; 

            /**
             * The mode of Intelligent Protection. Valid values:
             * <p>
             * 
             * *   **watch**: Warning
             * *   **defense**: Defense
             */
            public Builder aiMode(String aiMode) {
                this.aiMode = aiMode;
                return this;
            }

            /**
             * The status of Intelligent Protection. Valid values:
             * <p>
             * 
             * *   **0**: turned off
             * *   **1:** turned on
             */
            public Builder aiRuleEnable(Integer aiRuleEnable) {
                this.aiRuleEnable = aiRuleEnable;
                return this;
            }

            /**
             * The level of Intelligent Protection. Valid values:
             * <p>
             * 
             * *   **level30**: Loose
             * *   **level60**: Normal
             * *   **level90**: Strict
             */
            public Builder aiTemplate(String aiTemplate) {
                this.aiTemplate = aiTemplate;
                return this;
            }

            /**
             * The status of Blacklist/Whitelist (Domain Names). Valid values:
             * <p>
             * 
             * *   **0**: turned off
             * *   **1:** turned on
             */
            public Builder blackWhiteListEnable(Integer blackWhiteListEnable) {
                this.blackWhiteListEnable = blackWhiteListEnable;
                return this;
            }

            /**
             * The status of the Custom Rules switch for Frequency Control. Valid values:
             * <p>
             * 
             * *   **0**: turned off
             * *   **1:** turned on
             */
            public Builder ccCustomRuleEnable(Integer ccCustomRuleEnable) {
                this.ccCustomRuleEnable = ccCustomRuleEnable;
                return this;
            }

            /**
             * The status of Frequency Control. Valid values:
             * <p>
             * 
             * *   **0**: turned off
             * *   **1:** turned on
             */
            public Builder ccEnable(Integer ccEnable) {
                this.ccEnable = ccEnable;
                return this;
            }

            /**
             * CcGlobalSwitch.
             */
            public Builder ccGlobalSwitch(String ccGlobalSwitch) {
                this.ccGlobalSwitch = ccGlobalSwitch;
                return this;
            }

            /**
             * The mode of Frequency Control. Valid values:
             * <p>
             * 
             * *   **default**: Normal
             * *   **gf_under_attack**: Emergency
             * *   **gf_sos_verify**: Strict
             * *   **gf_sos_enhance**: Super Strict
             */
            public Builder ccTemplate(String ccTemplate) {
                this.ccTemplate = ccTemplate;
                return this;
            }

            /**
             * The domain name of the website.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The status of Accurate Access Control. Valid values:
             * <p>
             * 
             * *   **0**: turned off
             * *   **1:** turned on
             */
            public Builder preciseRuleEnable(Integer preciseRuleEnable) {
                this.preciseRuleEnable = preciseRuleEnable;
                return this;
            }

            /**
             * The status of Location Blacklist (Domain Names). Valid values:
             * <p>
             * 
             * *   **0**: turned off
             * *   **1:** turned on
             */
            public Builder regionBlockEnable(Integer regionBlockEnable) {
                this.regionBlockEnable = regionBlockEnable;
                return this;
            }

            public ProtectSwitchList build() {
                return new ProtectSwitchList(this);
            } 

        } 

    }
}
