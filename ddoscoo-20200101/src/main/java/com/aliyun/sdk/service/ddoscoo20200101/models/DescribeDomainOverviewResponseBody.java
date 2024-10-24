// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainOverviewResponseBody</p>
 */
public class DescribeDomainOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxHttp")
    private Long maxHttp;

    @com.aliyun.core.annotation.NameInMap("MaxHttps")
    private Long maxHttps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The peak queries per second (QPS) during HTTP traffic scrubbing. Unit: QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>41652</p>
         */
        public Builder maxHttp(Long maxHttp) {
            this.maxHttp = maxHttp;
            return this;
        }

        /**
         * <p>The peak QPS during HTTPS traffic scrubbing. Unit: QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxHttps(Long maxHttps) {
            this.maxHttps = maxHttps;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
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
