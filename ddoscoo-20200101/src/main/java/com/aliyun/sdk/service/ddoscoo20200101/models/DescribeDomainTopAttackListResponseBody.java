// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainTopAttackListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopAttackListResponseBody</p>
 */
public class DescribeDomainTopAttackListResponseBody extends TeaModel {
    @NameInMap("AttackList")
    private java.util.List < AttackList> attackList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainTopAttackListResponseBody(Builder builder) {
        this.attackList = builder.attackList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopAttackListResponseBody create() {
        return builder().build();
    }

    /**
     * @return attackList
     */
    public java.util.List < AttackList> getAttackList() {
        return this.attackList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AttackList> attackList; 
        private String requestId; 

        /**
         * AttackList.
         */
        public Builder attackList(java.util.List < AttackList> attackList) {
            this.attackList = attackList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainTopAttackListResponseBody build() {
            return new DescribeDomainTopAttackListResponseBody(this);
        } 

    } 

    public static class AttackList extends TeaModel {
        @NameInMap("Attack")
        private Long attack;

        @NameInMap("Count")
        private Long count;

        @NameInMap("Domain")
        private String domain;

        private AttackList(Builder builder) {
            this.attack = builder.attack;
            this.count = builder.count;
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackList create() {
            return builder().build();
        }

        /**
         * @return attack
         */
        public Long getAttack() {
            return this.attack;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private Long attack; 
            private Long count; 
            private String domain; 

            /**
             * Attack.
             */
            public Builder attack(Long attack) {
                this.attack = attack;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            public AttackList build() {
                return new AttackList(this);
            } 

        } 

    }
}
