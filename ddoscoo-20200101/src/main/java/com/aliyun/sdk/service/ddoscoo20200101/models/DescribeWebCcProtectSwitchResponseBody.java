// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The status of each mitigation policy for the website.</p>
         */
        public Builder protectSwitchList(java.util.List < ProtectSwitchList> protectSwitchList) {
            this.protectSwitchList = protectSwitchList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3ADD9EED-CA4B-488C-BC82-01B0B899363D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebCcProtectSwitchResponseBody build() {
            return new DescribeWebCcProtectSwitchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebCcProtectSwitchResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebCcProtectSwitchResponseBody</p>
     */
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
             * <p>The mode of Intelligent Protection. Valid values:</p>
             * <ul>
             * <li><strong>watch</strong>: Warning</li>
             * <li><strong>defense</strong>: Defense</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>defense</p>
             */
            public Builder aiMode(String aiMode) {
                this.aiMode = aiMode;
                return this;
            }

            /**
             * <p>The status of Intelligent Protection. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: turned off</li>
             * <li><strong>1:</strong> turned on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder aiRuleEnable(Integer aiRuleEnable) {
                this.aiRuleEnable = aiRuleEnable;
                return this;
            }

            /**
             * <p>The level of Intelligent Protection. Valid values:</p>
             * <ul>
             * <li><strong>level30</strong>: Loose</li>
             * <li><strong>level60</strong>: Normal</li>
             * <li><strong>level90</strong>: Strict</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>level60</p>
             */
            public Builder aiTemplate(String aiTemplate) {
                this.aiTemplate = aiTemplate;
                return this;
            }

            /**
             * <p>The status of Blacklist/Whitelist (Domain Names). Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: turned off</li>
             * <li><strong>1:</strong> turned on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder blackWhiteListEnable(Integer blackWhiteListEnable) {
                this.blackWhiteListEnable = blackWhiteListEnable;
                return this;
            }

            /**
             * <p>The status of the Custom Rules switch for Frequency Control. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: turned off</li>
             * <li><strong>1:</strong> turned on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ccCustomRuleEnable(Integer ccCustomRuleEnable) {
                this.ccCustomRuleEnable = ccCustomRuleEnable;
                return this;
            }

            /**
             * <p>The status of Frequency Control. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: turned off</li>
             * <li><strong>1:</strong> turned on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The mode of Frequency Control. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: Normal</li>
             * <li><strong>gf_under_attack</strong>: Emergency</li>
             * <li><strong>gf_sos_verify</strong>: Strict</li>
             * <li><strong>gf_sos_enhance</strong>: Super Strict</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder ccTemplate(String ccTemplate) {
                this.ccTemplate = ccTemplate;
                return this;
            }

            /**
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The status of Accurate Access Control. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: turned off</li>
             * <li><strong>1:</strong> turned on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder preciseRuleEnable(Integer preciseRuleEnable) {
                this.preciseRuleEnable = preciseRuleEnable;
                return this;
            }

            /**
             * <p>The status of Location Blacklist (Domain Names). Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: turned off</li>
             * <li><strong>1:</strong> turned on</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
