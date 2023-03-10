// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainOverviewResponseBody</p>
 */
public class DescribeDomainOverviewResponseBody extends TeaModel {
    @NameInMap("MaxHttp")
    private Long maxHttp;

    @NameInMap("MaxHttps")
    private Long maxHttps;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainOverviewResponseBody(Builder builder) {
        this.maxHttp = builder.maxHttp;
        this.maxHttps = builder.maxHttps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainOverviewResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxHttp
     */
    public Long getMaxHttp() {
        return this.maxHttp;
    }

    /**
     * @return maxHttps
     */
    public Long getMaxHttps() {
        return this.maxHttps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long maxHttp; 
        private Long maxHttps; 
        private String requestId; 

        /**
         * The peak queries per second (QPS) during HTTP traffic scrubbing. Unit: QPS.
         */
        public Builder maxHttp(Long maxHttp) {
            this.maxHttp = maxHttp;
            return this;
        }

        /**
         * The peak QPS during HTTPS traffic scrubbing. Unit: QPS.
         */
        public Builder maxHttps(Long maxHttps) {
            this.maxHttps = maxHttps;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainOverviewResponseBody build() {
            return new DescribeDomainOverviewResponseBody(this);
        } 

    } 

}
