// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStatisticsResponseBody</p>
 */
public class DescribeInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("InstanceStatistics")
    private java.util.List < InstanceStatistics> instanceStatistics;

    @NameInMap("RequestId")
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
         * InstanceStatistics.
         */
        public Builder instanceStatistics(java.util.List < InstanceStatistics> instanceStatistics) {
            this.instanceStatistics = instanceStatistics;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("DefenseCountUsage")
        private Integer defenseCountUsage;

        @NameInMap("DomainUsage")
        private Integer domainUsage;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PortUsage")
        private Integer portUsage;

        @NameInMap("SiteUsage")
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
             * DefenseCountUsage.
             */
            public Builder defenseCountUsage(Integer defenseCountUsage) {
                this.defenseCountUsage = defenseCountUsage;
                return this;
            }

            /**
             * DomainUsage.
             */
            public Builder domainUsage(Integer domainUsage) {
                this.domainUsage = domainUsage;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PortUsage.
             */
            public Builder portUsage(Integer portUsage) {
                this.portUsage = portUsage;
                return this;
            }

            /**
             * SiteUsage.
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
