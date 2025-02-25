// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafScenesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnWafScenesResponseBody</p>
 */
public class DescribeDcdnWafScenesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefenseScenes")
    private java.util.List < DefenseScenes> defenseScenes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnWafScenesResponseBody(Builder builder) {
        this.defenseScenes = builder.defenseScenes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafScenesResponseBody create() {
        return builder().build();
    }

    /**
     * @return defenseScenes
     */
    public java.util.List < DefenseScenes> getDefenseScenes() {
        return this.defenseScenes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DefenseScenes> defenseScenes; 
        private String requestId; 

        /**
         * <p>The types of the protection policies.</p>
         */
        public Builder defenseScenes(java.util.List < DefenseScenes> defenseScenes) {
            this.defenseScenes = defenseScenes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D7BB13C-DD84-5654-A835-B8E1385DE274</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnWafScenesResponseBody build() {
            return new DescribeDcdnWafScenesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnWafScenesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnWafScenesResponseBody</p>
     */
    public static class DefenseScenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        @com.aliyun.core.annotation.NameInMap("PolicyCount")
        private Integer policyCount;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

        private DefenseScenes(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.policyCount = builder.policyCount;
            this.ruleCount = builder.ruleCount;
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
         * @return policyCount
         */
        public Integer getPolicyCount() {
            return this.policyCount;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public static final class Builder {
            private String defenseScene; 
            private Integer policyCount; 
            private Integer ruleCount; 

            /**
             * <p>The type of the protection policy, which is the same as the DefenseScenes parameter in request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_group</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The total number of policies of this type that were configured.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder policyCount(Integer policyCount) {
                this.policyCount = policyCount;
                return this;
            }

            /**
             * <p>The total number of protection rules that were configured in this type of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            public DefenseScenes build() {
                return new DefenseScenes(this);
            } 

        } 

    }
}
