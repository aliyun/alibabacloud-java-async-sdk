// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainSuffixResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainSuffixResponseBody</p>
 */
public class QueryDomainSuffixResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuffixList")
    private SuffixList suffixList;

    private QueryDomainSuffixResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suffixList = builder.suffixList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainSuffixResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suffixList
     */
    public SuffixList getSuffixList() {
        return this.suffixList;
    }

    public static final class Builder {
        private String requestId; 
        private SuffixList suffixList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuffixList.
         */
        public Builder suffixList(SuffixList suffixList) {
            this.suffixList = suffixList;
            return this;
        }

        public QueryDomainSuffixResponseBody build() {
            return new QueryDomainSuffixResponseBody(this);
        } 

    } 

    public static class SuffixList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Suffix")
        private java.util.List < String > suffix;

        private SuffixList(Builder builder) {
            this.suffix = builder.suffix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuffixList create() {
            return builder().build();
        }

        /**
         * @return suffix
         */
        public java.util.List < String > getSuffix() {
            return this.suffix;
        }

        public static final class Builder {
            private java.util.List < String > suffix; 

            /**
             * Suffix.
             */
            public Builder suffix(java.util.List < String > suffix) {
                this.suffix = suffix;
                return this;
            }

            public SuffixList build() {
                return new SuffixList(this);
            } 

        } 

    }
}
