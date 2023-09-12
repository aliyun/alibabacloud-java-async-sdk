// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainCountResponseBody</p>
 */
public class DescribeDomainCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RootDomainsCount")
    private Integer rootDomainsCount;

    @NameInMap("SubDomainsCount")
    private Integer subDomainsCount;

    @NameInMap("TotalDomainsCount")
    private Integer totalDomainsCount;

    private DescribeDomainCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rootDomainsCount = builder.rootDomainsCount;
        this.subDomainsCount = builder.subDomainsCount;
        this.totalDomainsCount = builder.totalDomainsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootDomainsCount
     */
    public Integer getRootDomainsCount() {
        return this.rootDomainsCount;
    }

    /**
     * @return subDomainsCount
     */
    public Integer getSubDomainsCount() {
        return this.subDomainsCount;
    }

    /**
     * @return totalDomainsCount
     */
    public Integer getTotalDomainsCount() {
        return this.totalDomainsCount;
    }

    public static final class Builder {
        private String requestId; 
        private Integer rootDomainsCount; 
        private Integer subDomainsCount; 
        private Integer totalDomainsCount; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of root domains.
         */
        public Builder rootDomainsCount(Integer rootDomainsCount) {
            this.rootDomainsCount = rootDomainsCount;
            return this;
        }

        /**
         * The number of subdomains.
         */
        public Builder subDomainsCount(Integer subDomainsCount) {
            this.subDomainsCount = subDomainsCount;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalDomainsCount(Integer totalDomainsCount) {
            this.totalDomainsCount = totalDomainsCount;
            return this;
        }

        public DescribeDomainCountResponseBody build() {
            return new DescribeDomainCountResponseBody(this);
        } 

    } 

}
