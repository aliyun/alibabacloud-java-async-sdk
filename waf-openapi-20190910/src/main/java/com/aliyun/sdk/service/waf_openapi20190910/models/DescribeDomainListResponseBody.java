// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainListResponseBody</p>
 */
public class DescribeDomainListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    private java.util.List < String > domainNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDomainListResponseBody(Builder builder) {
        this.domainNames = builder.domainNames;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainListResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainNames
     */
    public java.util.List < String > getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < String > domainNames; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DomainNames.
         */
        public Builder domainNames(java.util.List < String > domainNames) {
            this.domainNames = domainNames;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainListResponseBody build() {
            return new DescribeDomainListResponseBody(this);
        } 

    } 

}
