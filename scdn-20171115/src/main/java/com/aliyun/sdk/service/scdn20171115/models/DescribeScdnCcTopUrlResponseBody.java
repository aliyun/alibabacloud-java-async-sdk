// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnCcTopUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnCcTopUrlResponseBody</p>
 */
public class DescribeScdnCcTopUrlResponseBody extends TeaModel {
    @NameInMap("AttackUrlDataList")
    private AttackUrlDataList attackUrlDataList;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private String total;

    private DescribeScdnCcTopUrlResponseBody(Builder builder) {
        this.attackUrlDataList = builder.attackUrlDataList;
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnCcTopUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return attackUrlDataList
     */
    public AttackUrlDataList getAttackUrlDataList() {
        return this.attackUrlDataList;
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
        private AttackUrlDataList attackUrlDataList; 
        private String domainName; 
        private String requestId; 
        private String total; 

        /**
         * AttackUrlDataList.
         */
        public Builder attackUrlDataList(AttackUrlDataList attackUrlDataList) {
            this.attackUrlDataList = attackUrlDataList;
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

        public DescribeScdnCcTopUrlResponseBody build() {
            return new DescribeScdnCcTopUrlResponseBody(this);
        } 

    } 

    public static class AttackUrlDatas extends TeaModel {
        @NameInMap("AttackCount")
        private String attackCount;

        @NameInMap("Url")
        private String url;

        private AttackUrlDatas(Builder builder) {
            this.attackCount = builder.attackCount;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackUrlDatas create() {
            return builder().build();
        }

        /**
         * @return attackCount
         */
        public String getAttackCount() {
            return this.attackCount;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String attackCount; 
            private String url; 

            /**
             * AttackCount.
             */
            public Builder attackCount(String attackCount) {
                this.attackCount = attackCount;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public AttackUrlDatas build() {
                return new AttackUrlDatas(this);
            } 

        } 

    }
    public static class AttackUrlDataList extends TeaModel {
        @NameInMap("AttackUrlDatas")
        private java.util.List < AttackUrlDatas> attackUrlDatas;

        private AttackUrlDataList(Builder builder) {
            this.attackUrlDatas = builder.attackUrlDatas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackUrlDataList create() {
            return builder().build();
        }

        /**
         * @return attackUrlDatas
         */
        public java.util.List < AttackUrlDatas> getAttackUrlDatas() {
            return this.attackUrlDatas;
        }

        public static final class Builder {
            private java.util.List < AttackUrlDatas> attackUrlDatas; 

            /**
             * AttackUrlDatas.
             */
            public Builder attackUrlDatas(java.util.List < AttackUrlDatas> attackUrlDatas) {
                this.attackUrlDatas = attackUrlDatas;
                return this;
            }

            public AttackUrlDataList build() {
                return new AttackUrlDataList(this);
            } 

        } 

    }
}
