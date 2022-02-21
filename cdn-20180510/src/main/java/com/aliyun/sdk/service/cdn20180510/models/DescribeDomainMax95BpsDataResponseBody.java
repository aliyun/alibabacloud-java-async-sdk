// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainMax95BpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainMax95BpsDataResponseBody</p>
 */
public class DescribeDomainMax95BpsDataResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("DomesticMax95Bps")
    private String domesticMax95Bps;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Max95Bps")
    private String max95Bps;

    @NameInMap("OverseasMax95Bps")
    private String overseasMax95Bps;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDomainMax95BpsDataResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.domesticMax95Bps = builder.domesticMax95Bps;
        this.endTime = builder.endTime;
        this.max95Bps = builder.max95Bps;
        this.overseasMax95Bps = builder.overseasMax95Bps;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainMax95BpsDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domesticMax95Bps
     */
    public String getDomesticMax95Bps() {
        return this.domesticMax95Bps;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return max95Bps
     */
    public String getMax95Bps() {
        return this.max95Bps;
    }

    /**
     * @return overseasMax95Bps
     */
    public String getOverseasMax95Bps() {
        return this.overseasMax95Bps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String domainName; 
        private String domesticMax95Bps; 
        private String endTime; 
        private String max95Bps; 
        private String overseasMax95Bps; 
        private String requestId; 
        private String startTime; 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * DomesticMax95Bps.
         */
        public Builder domesticMax95Bps(String domesticMax95Bps) {
            this.domesticMax95Bps = domesticMax95Bps;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Max95Bps.
         */
        public Builder max95Bps(String max95Bps) {
            this.max95Bps = max95Bps;
            return this;
        }

        /**
         * OverseasMax95Bps.
         */
        public Builder overseasMax95Bps(String overseasMax95Bps) {
            this.overseasMax95Bps = overseasMax95Bps;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDomainMax95BpsDataResponseBody build() {
            return new DescribeDomainMax95BpsDataResponseBody(this);
        } 

    } 

}
