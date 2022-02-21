// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnCcTopIpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnCcTopIpResponseBody</p>
 */
public class DescribeScdnCcTopIpResponseBody extends TeaModel {
    @NameInMap("AttackIpDataList")
    private AttackIpDataList attackIpDataList;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private String total;

    private DescribeScdnCcTopIpResponseBody(Builder builder) {
        this.attackIpDataList = builder.attackIpDataList;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnCcTopIpResponseBody create() {
        return builder().build();
    }

    /**
     * @return attackIpDataList
     */
    public AttackIpDataList getAttackIpDataList() {
        return this.attackIpDataList;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private AttackIpDataList attackIpDataList; 
        private String domainName; 
        private String requestId; 
        private String total; 

        /**
         * AttackIpDataList.
         */
        public Builder attackIpDataList(AttackIpDataList attackIpDataList) {
            this.attackIpDataList = attackIpDataList;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeScdnCcTopIpResponseBody build() {
            return new DescribeScdnCcTopIpResponseBody(this);
        } 

    } 

    public static class AttackIpDatas extends TeaModel {
        @NameInMap("AttackCount")
        private String attackCount;

        @NameInMap("Ip")
        private String ip;

        private AttackIpDatas(Builder builder) {
            this.attackCount = builder.attackCount;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackIpDatas create() {
            return builder().build();
        }

        /**
         * @return attackCount
         */
        public String getAttackCount() {
            return this.attackCount;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String attackCount; 
            private String ip; 

            /**
             * AttackCount.
             */
            public Builder attackCount(String attackCount) {
                this.attackCount = attackCount;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public AttackIpDatas build() {
                return new AttackIpDatas(this);
            } 

        } 

    }
    public static class AttackIpDataList extends TeaModel {
        @NameInMap("AttackIpDatas")
        private java.util.List < AttackIpDatas> attackIpDatas;

        private AttackIpDataList(Builder builder) {
            this.attackIpDatas = builder.attackIpDatas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackIpDataList create() {
            return builder().build();
        }

        /**
         * @return attackIpDatas
         */
        public java.util.List < AttackIpDatas> getAttackIpDatas() {
            return this.attackIpDatas;
        }

        public static final class Builder {
            private java.util.List < AttackIpDatas> attackIpDatas; 

            /**
             * AttackIpDatas.
             */
            public Builder attackIpDatas(java.util.List < AttackIpDatas> attackIpDatas) {
                this.attackIpDatas = attackIpDatas;
                return this;
            }

            public AttackIpDataList build() {
                return new AttackIpDataList(this);
            } 

        } 

    }
}
