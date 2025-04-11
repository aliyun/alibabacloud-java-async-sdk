// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeCenVbrHealthCheckResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenVbrHealthCheckResponseBody</p>
 */
public class DescribeCenVbrHealthCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VbrHealthChecks")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCenVbrHealthCheckResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vbrHealthChecks = model.vbrHealthChecks;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B8C9702E-304A-4E18-AC89-BE2D91C2C176</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The health check configuration of the VBR.</p>
         */
        public Builder vbrHealthChecks(VbrHealthChecks vbrHealthChecks) {
            this.vbrHealthChecks = vbrHealthChecks;
            return this;
        }

        public DescribeCenVbrHealthCheckResponseBody build() {
            return new DescribeCenVbrHealthCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCenVbrHealthCheckResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenVbrHealthCheckResponseBody</p>
     */
    public static class VbrHealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
        private Integer healthCheckInterval;

        @com.aliyun.core.annotation.NameInMap("HealthCheckOnly")
        private Boolean healthCheckOnly;

        @com.aliyun.core.annotation.NameInMap("HealthCheckSourceIp")
        private String healthCheckSourceIp;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTargetIp")
        private String healthCheckTargetIp;

        @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("VbrInstanceId")
        private String vbrInstanceId;

        @com.aliyun.core.annotation.NameInMap("VbrInstanceRegionId")
        private String vbrInstanceRegionId;

        private VbrHealthCheck(Builder builder) {
            this.cenId = builder.cenId;
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private Integer healthCheckInterval; 
            private Boolean healthCheckOnly; 
            private String healthCheckSourceIp; 
            private String healthCheckTargetIp; 
            private Integer healthyThreshold; 
            private String vbrInstanceId; 
            private String vbrInstanceRegionId; 

            private Builder() {
            } 

            private Builder(VbrHealthCheck model) {
                this.cenId = model.cenId;
                this.description = model.description;
                this.healthCheckInterval = model.healthCheckInterval;
                this.healthCheckOnly = model.healthCheckOnly;
                this.healthCheckSourceIp = model.healthCheckSourceIp;
                this.healthCheckTargetIp = model.healthCheckTargetIp;
                this.healthyThreshold = model.healthyThreshold;
                this.vbrInstanceId = model.vbrInstanceId;
                this.vbrInstanceRegionId = model.vbrInstanceRegionId;
            } 

            /**
             * <p>The ID of the CEN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-6hpdgj7ni6pz1k****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>healthcheck_description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time interval at which probe packets are sent during the health check. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder healthCheckInterval(Integer healthCheckInterval) {
                this.healthCheckInterval = healthCheckInterval;
                return this;
            }

            /**
             * <p>Indicates whether probing is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Probing is enabled.</p>
             * <pre><code>If you enable probing, the system does not switch to another route if the detected route is not reachable.
             * </code></pre>
             * </li>
             * <li><p><strong>false</strong>: Probing is disabled.</p>
             * <pre><code>  If probing is disabled and a redundant route is specified, the system switches to the redundant route when the detected route is not reachable.
             * </code></pre>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder healthCheckOnly(Boolean healthCheckOnly) {
                this.healthCheckOnly = healthCheckOnly;
                return this;
            }

            /**
             * <p>The source IP address of the health check.</p>
             * 
             * <strong>example:</strong>
             * <p>172.XX.XX.1</p>
             */
            public Builder healthCheckSourceIp(String healthCheckSourceIp) {
                this.healthCheckSourceIp = healthCheckSourceIp;
                return this;
            }

            /**
             * <p>The destination IP address of the health check.</p>
             * 
             * <strong>example:</strong>
             * <p>192.XX.XX.1</p>
             */
            public Builder healthCheckTargetIp(String healthCheckTargetIp) {
                this.healthCheckTargetIp = healthCheckTargetIp;
                return this;
            }

            /**
             * <p>The number of probe packets that are sent during the health check.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The VBR ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vbr-bp1kznorjeembsuhl****</p>
             */
            public Builder vbrInstanceId(String vbrInstanceId) {
                this.vbrInstanceId = vbrInstanceId;
                return this;
            }

            /**
             * <p>The ID of the region where the VBR is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link DescribeCenVbrHealthCheckResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCenVbrHealthCheckResponseBody</p>
     */
    public static class VbrHealthChecks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VbrHealthCheck")
        private java.util.List<VbrHealthCheck> vbrHealthCheck;

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
        public java.util.List<VbrHealthCheck> getVbrHealthCheck() {
            return this.vbrHealthCheck;
        }

        public static final class Builder {
            private java.util.List<VbrHealthCheck> vbrHealthCheck; 

            private Builder() {
            } 

            private Builder(VbrHealthChecks model) {
                this.vbrHealthCheck = model.vbrHealthCheck;
            } 

            /**
             * VbrHealthCheck.
             */
            public Builder vbrHealthCheck(java.util.List<VbrHealthCheck> vbrHealthCheck) {
                this.vbrHealthCheck = vbrHealthCheck;
                return this;
            }

            public VbrHealthChecks build() {
                return new VbrHealthChecks(this);
            } 

        } 

    }
}
