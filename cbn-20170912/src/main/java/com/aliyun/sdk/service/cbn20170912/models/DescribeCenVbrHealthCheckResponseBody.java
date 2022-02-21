// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenVbrHealthCheckResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenVbrHealthCheckResponseBody</p>
 */
public class DescribeCenVbrHealthCheckResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VbrHealthChecks")
    private VbrHealthChecks vbrHealthChecks;

    private DescribeCenVbrHealthCheckResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vbrHealthChecks = builder.vbrHealthChecks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenVbrHealthCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vbrHealthChecks
     */
    public VbrHealthChecks getVbrHealthChecks() {
        return this.vbrHealthChecks;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VbrHealthChecks vbrHealthChecks; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VbrHealthChecks.
         */
        public Builder vbrHealthChecks(VbrHealthChecks vbrHealthChecks) {
            this.vbrHealthChecks = vbrHealthChecks;
            return this;
        }

        public DescribeCenVbrHealthCheckResponseBody build() {
            return new DescribeCenVbrHealthCheckResponseBody(this);
        } 

    } 

    public static class VbrHealthCheck extends TeaModel {
        @NameInMap("CenId")
        private String cenId;

        @NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @NameInMap("HealthCheckOnly")
        private Boolean healthCheckOnly;

        @NameInMap("HealthCheckSourceIp")
        private String healthCheckSourceIp;

        @NameInMap("HealthCheckTargetIp")
        private String healthCheckTargetIp;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("VbrInstanceId")
        private String vbrInstanceId;

        @NameInMap("VbrInstanceRegionId")
        private String vbrInstanceRegionId;

        private VbrHealthCheck(Builder builder) {
            this.cenId = builder.cenId;
            this.healthCheckInterval = builder.healthCheckInterval;
            this.healthCheckOnly = builder.healthCheckOnly;
            this.healthCheckSourceIp = builder.healthCheckSourceIp;
            this.healthCheckTargetIp = builder.healthCheckTargetIp;
            this.healthyThreshold = builder.healthyThreshold;
            this.vbrInstanceId = builder.vbrInstanceId;
            this.vbrInstanceRegionId = builder.vbrInstanceRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VbrHealthCheck create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return healthCheckInterval
         */
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        /**
         * @return healthCheckOnly
         */
        public Boolean getHealthCheckOnly() {
            return this.healthCheckOnly;
        }

        /**
         * @return healthCheckSourceIp
         */
        public String getHealthCheckSourceIp() {
            return this.healthCheckSourceIp;
        }

        /**
         * @return healthCheckTargetIp
         */
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return vbrInstanceId
         */
        public String getVbrInstanceId() {
            return this.vbrInstanceId;
        }

        /**
         * @return vbrInstanceRegionId
         */
        public String getVbrInstanceRegionId() {
            return this.vbrInstanceRegionId;
        }

        public static final class Builder {
            private String cenId; 
            private Integer healthCheckInterval; 
            private Boolean healthCheckOnly; 
            private String healthCheckSourceIp; 
            private String healthCheckTargetIp; 
            private Integer healthyThreshold; 
            private String vbrInstanceId; 
            private String vbrInstanceRegionId; 

            /**
             * CenId.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * HealthCheckInterval.
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * HealthCheckOnly.
             */
            public Builder healthCheckOnly(Boolean healthCheckOnly) {
                this.healthCheckOnly = healthCheckOnly;
                return this;
            }

            /**
             * HealthCheckSourceIp.
             */
            public Builder healthCheckSourceIp(String healthCheckSourceIp) {
                this.healthCheckSourceIp = healthCheckSourceIp;
                return this;
            }

            /**
             * HealthCheckTargetIp.
             */
            public Builder healthCheckTargetIp(String healthCheckTargetIp) {
                this.healthCheckTargetIp = healthCheckTargetIp;
                return this;
            }

            /**
             * HealthyThreshold.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * VbrInstanceId.
             */
            public Builder vbrInstanceId(String vbrInstanceId) {
                this.vbrInstanceId = vbrInstanceId;
                return this;
            }

            /**
             * VbrInstanceRegionId.
             */
            public Builder vbrInstanceRegionId(String vbrInstanceRegionId) {
                this.vbrInstanceRegionId = vbrInstanceRegionId;
                return this;
            }

            public VbrHealthCheck build() {
                return new VbrHealthCheck(this);
            } 

        } 

    }
    public static class VbrHealthChecks extends TeaModel {
        @NameInMap("VbrHealthCheck")
        private java.util.List < VbrHealthCheck> vbrHealthCheck;

        private VbrHealthChecks(Builder builder) {
            this.vbrHealthCheck = builder.vbrHealthCheck;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VbrHealthChecks create() {
            return builder().build();
        }

        /**
         * @return vbrHealthCheck
         */
        public java.util.List < VbrHealthCheck> getVbrHealthCheck() {
            return this.vbrHealthCheck;
        }

        public static final class Builder {
            private java.util.List < VbrHealthCheck> vbrHealthCheck; 

            /**
             * VbrHealthCheck.
             */
            public Builder vbrHealthCheck(java.util.List < VbrHealthCheck> vbrHealthCheck) {
                this.vbrHealthCheck = vbrHealthCheck;
                return this;
            }

            public VbrHealthChecks build() {
                return new VbrHealthChecks(this);
            } 

        } 

    }
}
