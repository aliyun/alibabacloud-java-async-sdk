// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeDDoSEventMaxResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSEventMaxResponseBody</p>
 */
public class DescribeDDoSEventMaxResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bps")
    private Long bps;

    @com.aliyun.core.annotation.NameInMap("Cps")
    private Long cps;

    @com.aliyun.core.annotation.NameInMap("Pps")
    private Long pps;

    @com.aliyun.core.annotation.NameInMap("Qps")
    private Long qps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private DescribeDDoSEventMaxResponseBody(Builder builder) {
        this.bps = builder.bps;
        this.cps = builder.cps;
        this.pps = builder.pps;
        this.qps = builder.qps;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSEventMaxResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bps
     */
    public Long getBps() {
        return this.bps;
    }

    /**
     * @return cps
     */
    public Long getCps() {
        return this.cps;
    }

    /**
     * @return pps
     */
    public Long getPps() {
        return this.pps;
    }

    /**
     * @return qps
     */
    public Long getQps() {
        return this.qps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder {
        private Long bps; 
        private Long cps; 
        private Long pps; 
        private Long qps; 
        private String requestId; 
        private Long siteId; 

        private Builder() {
        } 

        private Builder(DescribeDDoSEventMaxResponseBody model) {
            this.bps = model.bps;
            this.cps = model.cps;
            this.pps = model.pps;
            this.qps = model.qps;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
        } 

        /**
         * Bps.
         */
        public Builder bps(Long bps) {
            this.bps = bps;
            return this;
        }

        /**
         * Cps.
         */
        public Builder cps(Long cps) {
            this.cps = cps;
            return this;
        }

        /**
         * Pps.
         */
        public Builder pps(Long pps) {
            this.pps = pps;
            return this;
        }

        /**
         * Qps.
         */
        public Builder qps(Long qps) {
            this.qps = qps;
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
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        public DescribeDDoSEventMaxResponseBody build() {
            return new DescribeDDoSEventMaxResponseBody(this);
        } 

    } 

}
