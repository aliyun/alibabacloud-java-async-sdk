// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainCountResponseBody</p>
 */
public class DescribeDomainCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootDomainsCount")
    private Integer rootDomainsCount;

    @com.aliyun.core.annotation.NameInMap("SubDomainsCount")
    private Integer subDomainsCount;

    @com.aliyun.core.annotation.NameInMap("TotalDomainsCount")
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C286491D-4A2F-589A-B63B-D2AD3DA9BD71</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of root domains.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder rootDomainsCount(Integer rootDomainsCount) {
            this.rootDomainsCount = rootDomainsCount;
            return this;
        }

        /**
         * <p>The number of subdomains.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder subDomainsCount(Integer subDomainsCount) {
            this.subDomainsCount = subDomainsCount;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
