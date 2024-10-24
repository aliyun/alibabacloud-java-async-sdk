// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainTopAttackListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopAttackListResponseBody</p>
 */
public class DescribeDomainTopAttackListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttackList")
    private java.util.List < AttackList> attackList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The peak QPS of the website.</p>
         */
        public Builder attackList(java.util.List < AttackList> attackList) {
            this.attackList = attackList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainTopAttackListResponseBody build() {
            return new DescribeDomainTopAttackListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainTopAttackListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainTopAttackListResponseBody</p>
     */
    public static class AttackList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attack")
        private Long attack;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Domain")
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
             * <p>The attack QPS. Unit: QPS</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attack(Long attack) {
                this.attack = attack;
                return this;
            }

            /**
             * <p>The number of all QPS, which includes normal and attack QPS. Unit: QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>294</p>
             */
            public Builder count(Long count) {
                this.count = count;
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

            public AttackList build() {
                return new AttackList(this);
            } 

        } 

    }
}
