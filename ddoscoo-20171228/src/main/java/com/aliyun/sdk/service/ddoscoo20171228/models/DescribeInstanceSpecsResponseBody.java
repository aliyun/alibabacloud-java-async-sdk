// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeInstanceSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecsResponseBody</p>
 */
public class DescribeInstanceSpecsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceSpecs")
    private java.util.List<InstanceSpecs> instanceSpecs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceSpecsResponseBody(Builder builder) {
        this.instanceSpecs = builder.instanceSpecs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSpecsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceSpecs
     */
    public java.util.List<InstanceSpecs> getInstanceSpecs() {
        return this.instanceSpecs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceSpecs> instanceSpecs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceSpecsResponseBody model) {
            this.instanceSpecs = model.instanceSpecs;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceSpecs.
         */
        public Builder instanceSpecs(java.util.List<InstanceSpecs> instanceSpecs) {
            this.instanceSpecs = instanceSpecs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSpecsResponseBody build() {
            return new DescribeInstanceSpecsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSpecsResponseBody</p>
     */
    public static class InstanceSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthMbps")
        private Integer bandwidthMbps;

        @com.aliyun.core.annotation.NameInMap("BaseBandwidth")
        private Integer baseBandwidth;

        @com.aliyun.core.annotation.NameInMap("DefenseCount")
        private Integer defenseCount;

        @com.aliyun.core.annotation.NameInMap("DomainLimit")
        private Integer domainLimit;

        @com.aliyun.core.annotation.NameInMap("ElasticBandwidth")
        private Integer elasticBandwidth;

        @com.aliyun.core.annotation.NameInMap("FunctionVersion")
        private String functionVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PortLimit")
        private Integer portLimit;

        @com.aliyun.core.annotation.NameInMap("QpsLimit")
        private Integer qpsLimit;

        @com.aliyun.core.annotation.NameInMap("SiteLimit")
        private Integer siteLimit;

        private InstanceSpecs(Builder builder) {
            this.bandwidthMbps = builder.bandwidthMbps;
            this.baseBandwidth = builder.baseBandwidth;
            this.defenseCount = builder.defenseCount;
            this.domainLimit = builder.domainLimit;
            this.elasticBandwidth = builder.elasticBandwidth;
            this.functionVersion = builder.functionVersion;
            this.instanceId = builder.instanceId;
            this.portLimit = builder.portLimit;
            this.qpsLimit = builder.qpsLimit;
            this.siteLimit = builder.siteLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpecs create() {
            return builder().build();
        }

        /**
         * @return bandwidthMbps
         */
        public Integer getBandwidthMbps() {
            return this.bandwidthMbps;
        }

        /**
         * @return baseBandwidth
         */
        public Integer getBaseBandwidth() {
            return this.baseBandwidth;
        }

        /**
         * @return defenseCount
         */
        public Integer getDefenseCount() {
            return this.defenseCount;
        }

        /**
         * @return domainLimit
         */
        public Integer getDomainLimit() {
            return this.domainLimit;
        }

        /**
         * @return elasticBandwidth
         */
        public Integer getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        /**
         * @return functionVersion
         */
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return portLimit
         */
        public Integer getPortLimit() {
            return this.portLimit;
        }

        /**
         * @return qpsLimit
         */
        public Integer getQpsLimit() {
            return this.qpsLimit;
        }

        /**
         * @return siteLimit
         */
        public Integer getSiteLimit() {
            return this.siteLimit;
        }

        public static final class Builder {
            private Integer bandwidthMbps; 
            private Integer baseBandwidth; 
            private Integer defenseCount; 
            private Integer domainLimit; 
            private Integer elasticBandwidth; 
            private String functionVersion; 
            private String instanceId; 
            private Integer portLimit; 
            private Integer qpsLimit; 
            private Integer siteLimit; 

            private Builder() {
            } 

            private Builder(InstanceSpecs model) {
                this.bandwidthMbps = model.bandwidthMbps;
                this.baseBandwidth = model.baseBandwidth;
                this.defenseCount = model.defenseCount;
                this.domainLimit = model.domainLimit;
                this.elasticBandwidth = model.elasticBandwidth;
                this.functionVersion = model.functionVersion;
                this.instanceId = model.instanceId;
                this.portLimit = model.portLimit;
                this.qpsLimit = model.qpsLimit;
                this.siteLimit = model.siteLimit;
            } 

            /**
             * BandwidthMbps.
             */
            public Builder bandwidthMbps(Integer bandwidthMbps) {
                this.bandwidthMbps = bandwidthMbps;
                return this;
            }

            /**
             * BaseBandwidth.
             */
            public Builder baseBandwidth(Integer baseBandwidth) {
                this.baseBandwidth = baseBandwidth;
                return this;
            }

            /**
             * DefenseCount.
             */
            public Builder defenseCount(Integer defenseCount) {
                this.defenseCount = defenseCount;
                return this;
            }

            /**
             * DomainLimit.
             */
            public Builder domainLimit(Integer domainLimit) {
                this.domainLimit = domainLimit;
                return this;
            }

            /**
             * ElasticBandwidth.
             */
            public Builder elasticBandwidth(Integer elasticBandwidth) {
                this.elasticBandwidth = elasticBandwidth;
                return this;
            }

            /**
             * FunctionVersion.
             */
            public Builder functionVersion(String functionVersion) {
                this.functionVersion = functionVersion;
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
             * PortLimit.
             */
            public Builder portLimit(Integer portLimit) {
                this.portLimit = portLimit;
                return this;
            }

            /**
             * QpsLimit.
             */
            public Builder qpsLimit(Integer qpsLimit) {
                this.qpsLimit = qpsLimit;
                return this;
            }

            /**
             * SiteLimit.
             */
            public Builder siteLimit(Integer siteLimit) {
                this.siteLimit = siteLimit;
                return this;
            }

            public InstanceSpecs build() {
                return new InstanceSpecs(this);
            } 

        } 

    }
}
