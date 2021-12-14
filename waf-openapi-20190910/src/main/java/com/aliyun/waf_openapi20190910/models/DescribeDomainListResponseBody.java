// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeDomainListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainListResponseBody</p>
 */
public class DescribeDomainListResponseBody extends TeaModel {
    @NameInMap("DomainNames")
    private java.util.List < String > domainNames;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * <p>DomainNames.</p>
         */
        public Builder domainNames(java.util.List < String > domainNames) {
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
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
