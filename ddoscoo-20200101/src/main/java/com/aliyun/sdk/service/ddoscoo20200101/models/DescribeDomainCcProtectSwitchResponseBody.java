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
         * ProtectSwitchList.
         */
        public Builder protectSwitchList(java.util.List<ProtectSwitchList> protectSwitchList) {
            this.protectSwitchList = protectSwitchList;
            return this;
        }

        /**
         * RequestId.
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
             * AiMode.
             */
            public Builder aiMode(String aiMode) {
                this.aiMode = aiMode;
                return this;
            }

            /**
             * AiRuleEnable.
             */
            public Builder aiRuleEnable(Integer aiRuleEnable) {
                this.aiRuleEnable = aiRuleEnable;
                return this;
            }

            /**
             * AiTemplate.
             */
            public Builder aiTemplate(String aiTemplate) {
                this.aiTemplate = aiTemplate;
                return this;
            }

            /**
             * BlackWhiteListEnable.
             */
            public Builder blackWhiteListEnable(Integer blackWhiteListEnable) {
                this.blackWhiteListEnable = blackWhiteListEnable;
                return this;
            }

            /**
             * CcCustomRuleEnable.
             */
            public Builder ccCustomRuleEnable(Integer ccCustomRuleEnable) {
                this.ccCustomRuleEnable = ccCustomRuleEnable;
                return this;
            }

            /**
             * CcEnable.
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
             * CcTemplate.
             */
            public Builder ccTemplate(String ccTemplate) {
                this.ccTemplate = ccTemplate;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * PreciseRuleEnable.
             */
            public Builder preciseRuleEnable(Integer preciseRuleEnable) {
                this.preciseRuleEnable = preciseRuleEnable;
                return this;
            }

            /**
             * RegionBlockEnable.
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
