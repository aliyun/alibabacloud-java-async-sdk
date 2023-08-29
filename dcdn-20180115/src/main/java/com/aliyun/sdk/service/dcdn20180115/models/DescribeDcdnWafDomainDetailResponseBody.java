// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnWafDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafDomainDetailResponseBody</p>
 */
public class DescribeDcdnWafDomainDetailResponseBody extends TeaModel {
    @NameInMap("Domain")
    private Domain domain;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnWafDomainDetailResponseBody(Builder builder) {
        this.domain = builder.domain;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafDomainDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return domain
     */
    public Domain getDomain() {
        return this.domain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Domain domain; 
        private String requestId; 

        /**
         * The information about the accelerated domain name.
         */
        public Builder domain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafDomainDetailResponseBody build() {
            return new DescribeDcdnWafDomainDetailResponseBody(this);
        } 

    } 

    public static class DefenseScenes extends TeaModel {
        @NameInMap("DefenseScene")
        private String defenseScene;

        @NameInMap("PolicyId")
        private Long policyId;

        @NameInMap("PolicyIds")
        private String policyIds;

        private DefenseScenes(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.policyId = builder.policyId;
            this.policyIds = builder.policyIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefenseScenes create() {
            return builder().build();
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyIds
         */
        public String getPolicyIds() {
            return this.policyIds;
        }

        public static final class Builder {
            private String defenseScene; 
            private Long policyId; 
            private String policyIds; 

            /**
             * The type of the protection policy. Valid values:
             * <p>
             * 
             * *   waf_group: basic web protection
             * *   custom_acl: custom protection
             * *   whitelist: whitelist
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * The ID of the protection policy.
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The IDs of the protection policy.
             */
            public Builder policyIds(String policyIds) {
                this.policyIds = policyIds;
                return this;
            }

            public DefenseScenes build() {
                return new DefenseScenes(this);
            } 

        } 

    }
    public static class Domain extends TeaModel {
        @NameInMap("DefenseScenes")
        private java.util.List < DefenseScenes> defenseScenes;

        @NameInMap("DomainName")
        private String domainName;

        private Domain(Builder builder) {
            this.defenseScenes = builder.defenseScenes;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return defenseScenes
         */
        public java.util.List < DefenseScenes> getDefenseScenes() {
            return this.defenseScenes;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private java.util.List < DefenseScenes> defenseScenes; 
            private String domainName; 

            /**
             * The types of the protection policies.
             */
            public Builder defenseScenes(java.util.List < DefenseScenes> defenseScenes) {
                this.defenseScenes = defenseScenes;
                return this;
            }

            /**
             * The accelerated domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
}
