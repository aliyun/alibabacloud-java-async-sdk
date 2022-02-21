// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebCcProtectSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebCcProtectSwitchResponseBody</p>
 */
public class DescribeWebCcProtectSwitchResponseBody extends TeaModel {
    @NameInMap("ProtectSwitchList")
    private java.util.List < ProtectSwitchList> protectSwitchList;

    @NameInMap("RequestId")
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
         * ProtectSwitchList.
         */
        public Builder protectSwitchList(java.util.List < ProtectSwitchList> protectSwitchList) {
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

        public DescribeWebCcProtectSwitchResponseBody build() {
            return new DescribeWebCcProtectSwitchResponseBody(this);
        } 

    } 

    public static class ProtectSwitchList extends TeaModel {
        @NameInMap("AiMode")
        private String aiMode;

        @NameInMap("AiRuleEnable")
        private Integer aiRuleEnable;

        @NameInMap("AiTemplate")
        private String aiTemplate;

        @NameInMap("BlackWhiteListEnable")
        private Integer blackWhiteListEnable;

        @NameInMap("CcCustomRuleEnable")
        private Integer ccCustomRuleEnable;

        @NameInMap("CcEnable")
        private Integer ccEnable;

        @NameInMap("CcTemplate")
        private String ccTemplate;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("PreciseRuleEnable")
        private Integer preciseRuleEnable;

        @NameInMap("RegionBlockEnable")
        private Integer regionBlockEnable;

        private ProtectSwitchList(Builder builder) {
            this.aiMode = builder.aiMode;
            this.aiRuleEnable = builder.aiRuleEnable;
            this.aiTemplate = builder.aiTemplate;
            this.blackWhiteListEnable = builder.blackWhiteListEnable;
            this.ccCustomRuleEnable = builder.ccCustomRuleEnable;
            this.ccEnable = builder.ccEnable;
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
            private String ccTemplate; 
            private String domain; 
            private Integer preciseRuleEnable; 
            private Integer regionBlockEnable; 

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
