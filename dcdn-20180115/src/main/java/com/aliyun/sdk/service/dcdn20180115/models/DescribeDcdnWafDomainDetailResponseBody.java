// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafDomainDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafDomainDetailResponseBody</p>
 */
public class DescribeDcdnWafDomainDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domain")
    private Domain domain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the accelerated domain name.</p>
         */
        public Builder domain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>153ca2cd-3c01-44be-82C0-64dbc6c88630</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafDomainDetailResponseBody build() {
            return new DescribeDcdnWafDomainDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafDomainDetailResponseBody</p>
     */
    public static class DefenseScenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyIds")
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
             * <p>The type of the protection policy. Valid values:</p>
             * <ul>
             * <li>waf_group: basic web protection</li>
             * <li>custom_acl: custom protection</li>
             * <li>whitelist: whitelist</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>waf_group</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The ID of the protection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>10000002</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The IDs of the protection policy.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001,10000004</p>
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
    /**
     * 
     * {@link DescribeDcdnWafDomainDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafDomainDetailResponseBody</p>
     */
    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseScenes")
        private java.util.List < DefenseScenes> defenseScenes;

        @com.aliyun.core.annotation.NameInMap("DomainName")
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
             * <p>The types of the protection policies.</p>
             */
            public Builder defenseScenes(java.util.List < DefenseScenes> defenseScenes) {
                this.defenseScenes = defenseScenes;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
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
