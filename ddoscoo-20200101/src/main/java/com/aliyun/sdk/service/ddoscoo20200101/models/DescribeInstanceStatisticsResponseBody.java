// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStatisticsResponseBody</p>
 */
public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceStatistics")
    private java.util.List < InstanceStatistics> instanceStatistics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceStatisticsResponseBody(Builder builder) {
        this.instanceStatistics = builder.instanceStatistics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceStatistics
     */
    public java.util.List < InstanceStatistics> getInstanceStatistics() {
        return this.instanceStatistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceStatistics> instanceStatistics; 
        private String requestId; 

        /**
         * The statistics on the instance.
         */
        public Builder instanceStatistics(java.util.List < InstanceStatistics> instanceStatistics) {
            this.instanceStatistics = instanceStatistics;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceStatisticsResponseBody build() {
            return new DescribeInstanceStatisticsResponseBody(this);
        } 

    } 

    public static class InstanceStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseCountUsage")
        private Integer defenseCountUsage;

        @com.aliyun.core.annotation.NameInMap("DomainUsage")
        private Integer domainUsage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PortUsage")
        private Integer portUsage;

        @com.aliyun.core.annotation.NameInMap("SiteUsage")
        private Integer siteUsage;

        private InstanceStatistics(Builder builder) {
            this.defenseCountUsage = builder.defenseCountUsage;
            this.domainUsage = builder.domainUsage;
            this.instanceId = builder.instanceId;
            this.portUsage = builder.portUsage;
            this.siteUsage = builder.siteUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatistics create() {
            return builder().build();
        }

        /**
         * @return defenseCountUsage
         */
        public Integer getDefenseCountUsage() {
            return this.defenseCountUsage;
        }

        /**
         * @return domainUsage
         */
        public Integer getDomainUsage() {
            return this.domainUsage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return portUsage
         */
        public Integer getPortUsage() {
            return this.portUsage;
        }

        /**
         * @return siteUsage
         */
        public Integer getSiteUsage() {
            return this.siteUsage;
        }

        public static final class Builder {
            private Integer defenseCountUsage; 
            private Integer domainUsage; 
            private String instanceId; 
            private Integer portUsage; 
            private Integer siteUsage; 

            /**
             * The number of advanced mitigation sessions that are used in this month.
             * <p>
             * 
             * >  This parameter is returned only if Anti-DDoS Proxy (Outside Chinese Mainland) instances are queried.
             */
            public Builder defenseCountUsage(Integer defenseCountUsage) {
                this.defenseCountUsage = defenseCountUsage;
                return this;
            }

            /**
             * The number of domain names that are protected by the instance.
             */
            public Builder domainUsage(Integer domainUsage) {
                this.domainUsage = domainUsage;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The number of ports that are protected by the instance.
             */
            public Builder portUsage(Integer portUsage) {
                this.portUsage = portUsage;
                return this;
            }

            /**
             * The number of websites that are protected by the instance.
             */
            public Builder siteUsage(Integer siteUsage) {
                this.siteUsage = siteUsage;
                return this;
            }

            public InstanceStatistics build() {
                return new InstanceStatistics(this);
            } 

        } 

    }
}
