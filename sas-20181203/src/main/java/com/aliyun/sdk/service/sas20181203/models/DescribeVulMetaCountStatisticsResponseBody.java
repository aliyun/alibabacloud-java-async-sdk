// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulMetaCountStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulMetaCountStatisticsResponseBody</p>
 */
public class DescribeVulMetaCountStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppCount")
    private Integer appCount;

    @com.aliyun.core.annotation.NameInMap("CveCount")
    private Integer cveCount;

    @com.aliyun.core.annotation.NameInMap("RaspDefendCount")
    private Integer raspDefendCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SysCount")
    private Integer sysCount;

    private DescribeVulMetaCountStatisticsResponseBody(Builder builder) {
        this.appCount = builder.appCount;
        this.cveCount = builder.cveCount;
        this.raspDefendCount = builder.raspDefendCount;
        this.requestId = builder.requestId;
        this.sysCount = builder.sysCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulMetaCountStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appCount
     */
    public Integer getAppCount() {
        return this.appCount;
    }

    /**
     * @return cveCount
     */
    public Integer getCveCount() {
        return this.cveCount;
    }

    /**
     * @return raspDefendCount
     */
    public Integer getRaspDefendCount() {
        return this.raspDefendCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sysCount
     */
    public Integer getSysCount() {
        return this.sysCount;
    }

    public static final class Builder {
        private Integer appCount; 
        private Integer cveCount; 
        private Integer raspDefendCount; 
        private String requestId; 
        private Integer sysCount; 

        /**
         * The number of application vulnerabilities.
         */
        public Builder appCount(Integer appCount) {
            this.appCount = appCount;
            return this;
        }

        /**
         * The number of Linux software vulnerabilities.
         */
        public Builder cveCount(Integer cveCount) {
            this.cveCount = cveCount;
            return this;
        }

        /**
         * The number of vulnerabilities that can be defended by the application protection feature.
         */
        public Builder raspDefendCount(Integer raspDefendCount) {
            this.raspDefendCount = raspDefendCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of Windows system vulnerabilities.
         */
        public Builder sysCount(Integer sysCount) {
            this.sysCount = sysCount;
            return this;
        }

        public DescribeVulMetaCountStatisticsResponseBody build() {
            return new DescribeVulMetaCountStatisticsResponseBody(this);
        } 

    } 

}
