// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDomainCcProtectSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainCcProtectSwitchResponseBody</p>
 */
public class DescribeDomainCcProtectSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProtectSwitchList")
    private java.util.List<ProtectSwitchList> protectSwitchList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainCcProtectSwitchResponseBody(Builder builder) {
        this.protectSwitchList = builder.protectSwitchList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCcProtectSwitchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return protectSwitchList
     */
    public java.util.List<ProtectSwitchList> getProtectSwitchList() {
        return this.protectSwitchList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ProtectSwitchList> protectSwitchList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDomainCcProtectSwitchResponseBody model) {
            this.protectSwitchList = model.protectSwitchList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status of each protection feature for the website.</p>
         */
        public Builder protectSwitchList(java.util.List<ProtectSwitchList> protectSwitchList) {
            this.protectSwitchList = protectSwitchList;
            return this;
        }

        /**
         * <p>The ID of the request. This ID is unique to the request. Use the request ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainCcProtectSwitchResponseBody build() {
            return new DescribeDomainCcProtectSwitchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainCcProtectSwitchResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainCcProtectSwitchResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ProtectSwitchList model) {
                this.aiMode = model.aiMode;
                this.aiRuleEnable = model.aiRuleEnable;
                this.aiTemplate = model.aiTemplate;
                this.blackWhiteListEnable = model.blackWhiteListEnable;
                this.ccCustomRuleEnable = model.ccCustomRuleEnable;
                this.ccEnable = model.ccEnable;
                this.ccGlobalSwitch = model.ccGlobalSwitch;
                this.ccTemplate = model.ccTemplate;
                this.domain = model.domain;
                this.preciseRuleEnable = model.preciseRuleEnable;
                this.regionBlockEnable = model.regionBlockEnable;
            } 

            /**
             * <p>The mode of AI-powered protection. Valid values:</p>
             * <ul>
             * <li><p><strong>watch</strong>: Warning mode</p>
             * </li>
             * <li><p><strong>defense</strong>: Defense mode</p>
             * </li>
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
             * <p>The status of the AI-powered protection feature. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Disabled</p>
             * </li>
             * <li><p><strong>1</strong>: Enabled</p>
             * </li>
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
             * <p>The level of AI-powered protection. Valid values:</p>
             * <ul>
             * <li><p><strong>level30</strong>: Loose</p>
             * </li>
             * <li><p><strong>level60</strong>: Normal</p>
             * </li>
             * <li><p><strong>level90</strong>: Strict</p>
             * </li>
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
             * <p>The status of the blacklists and whitelists feature. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Disabled</p>
             * </li>
             * <li><p><strong>1</strong>: Enabled</p>
             * </li>
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
             * <p>The status of custom CC rules. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Disabled</p>
             * </li>
             * <li><p><strong>1</strong>: Enabled</p>
             * </li>
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
             * <p>The status of the rate limiting (CC protection) feature. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Disabled</p>
             * </li>
             * <li><p><strong>1</strong>: Enabled</p>
             * </li>
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
             * <p>The status of the global switch for custom and precise CC protection. Valid values:</p>
             * <ul>
             * <li><p><strong>open</strong>: Enabled</p>
             * </li>
             * <li><p><strong>close</strong>: Disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>close</p>
             */
            public Builder ccGlobalSwitch(String ccGlobalSwitch) {
                this.ccGlobalSwitch = ccGlobalSwitch;
                return this;
            }

            /**
             * <p>The CC protection mode. Valid values:</p>
             * <ul>
             * <li><p><strong>default</strong>: Normal</p>
             * </li>
             * <li><p><strong>gf_under_attack</strong>: Emergency</p>
             * </li>
             * <li><p><strong>gf_sos_verify</strong>: Strict</p>
             * </li>
             * <li><p><strong>gf_sos_enhance</strong>: Very Strict</p>
             * </li>
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
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The status of the precise access control feature. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Disabled</p>
             * </li>
             * <li><p><strong>1</strong>: Enabled</p>
             * </li>
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
             * <p>The status of the Location Blacklist (Domain Names) feature. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Disabled</p>
             * </li>
             * <li><p><strong>1</strong>: Enabled</p>
             * </li>
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
