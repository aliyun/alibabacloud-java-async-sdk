// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeQosCarsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQosCarsResponseBody</p>
 */
public class DescribeQosCarsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("QosCars")
    private QosCars qosCars;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeQosCarsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.qosCars = builder.qosCars;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQosCarsResponseBody create() {
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
     * @return qosCars
     */
    public QosCars getQosCars() {
        return this.qosCars;
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

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private QosCars qosCars; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeQosCarsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.qosCars = model.qosCars;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of traffic throttling rules.</p>
         */
        public Builder qosCars(QosCars qosCars) {
            this.qosCars = qosCars;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B7B758A9-009E-4C9D-9618-714EAE8BA5E9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeQosCarsResponseBody build() {
            return new DescribeQosCarsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeQosCarsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQosCarsResponseBody</p>
     */
    public static class QosCar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LimitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("MaxBandwidthAbs")
        private Integer maxBandwidthAbs;

        @com.aliyun.core.annotation.NameInMap("MaxBandwidthPercent")
        private Integer maxBandwidthPercent;

        @com.aliyun.core.annotation.NameInMap("MinBandwidthAbs")
        private Integer minBandwidthAbs;

        @com.aliyun.core.annotation.NameInMap("MinBandwidthPercent")
        private Integer minBandwidthPercent;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PercentSourceType")
        private String percentSourceType;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("QosCarId")
        private String qosCarId;

        @com.aliyun.core.annotation.NameInMap("QosId")
        private String qosId;

        private QosCar(Builder builder) {
            this.description = builder.description;
            this.limitType = builder.limitType;
            this.maxBandwidthAbs = builder.maxBandwidthAbs;
            this.maxBandwidthPercent = builder.maxBandwidthPercent;
            this.minBandwidthAbs = builder.minBandwidthAbs;
            this.minBandwidthPercent = builder.minBandwidthPercent;
            this.name = builder.name;
            this.percentSourceType = builder.percentSourceType;
            this.priority = builder.priority;
            this.qosCarId = builder.qosCarId;
            this.qosId = builder.qosId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosCar create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return maxBandwidthAbs
         */
        public Integer getMaxBandwidthAbs() {
            return this.maxBandwidthAbs;
        }

        /**
         * @return maxBandwidthPercent
         */
        public Integer getMaxBandwidthPercent() {
            return this.maxBandwidthPercent;
        }

        /**
         * @return minBandwidthAbs
         */
        public Integer getMinBandwidthAbs() {
            return this.minBandwidthAbs;
        }

        /**
         * @return minBandwidthPercent
         */
        public Integer getMinBandwidthPercent() {
            return this.minBandwidthPercent;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return percentSourceType
         */
        public String getPercentSourceType() {
            return this.percentSourceType;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return qosCarId
         */
        public String getQosCarId() {
            return this.qosCarId;
        }

        /**
         * @return qosId
         */
        public String getQosId() {
            return this.qosId;
        }

        public static final class Builder {
            private String description; 
            private String limitType; 
            private Integer maxBandwidthAbs; 
            private Integer maxBandwidthPercent; 
            private Integer minBandwidthAbs; 
            private Integer minBandwidthPercent; 
            private String name; 
            private String percentSourceType; 
            private Integer priority; 
            private String qosCarId; 
            private String qosId; 

            private Builder() {
            } 

            private Builder(QosCar model) {
                this.description = model.description;
                this.limitType = model.limitType;
                this.maxBandwidthAbs = model.maxBandwidthAbs;
                this.maxBandwidthPercent = model.maxBandwidthPercent;
                this.minBandwidthAbs = model.minBandwidthAbs;
                this.minBandwidthPercent = model.minBandwidthPercent;
                this.name = model.name;
                this.percentSourceType = model.percentSourceType;
                this.priority = model.priority;
                this.qosCarId = model.qosCarId;
                this.qosId = model.qosId;
            } 

            /**
             * <p>The description of the traffic throttling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>des</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of traffic throttling. Valid values:</p>
             * <ul>
             * <li><strong>Absolute</strong>: throttles traffic based on a specific range of bandwidth.</li>
             * <li><strong>Percent</strong>: throttles traffic based on a specific range of bandwidth percentage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Absolute</p>
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * <p>The maximum bandwidth. Unit: <strong>Mbit/s</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder maxBandwidthAbs(Integer maxBandwidthAbs) {
                this.maxBandwidthAbs = maxBandwidthAbs;
                return this;
            }

            /**
             * <p>The maximum bandwidth percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder maxBandwidthPercent(Integer maxBandwidthPercent) {
                this.maxBandwidthPercent = maxBandwidthPercent;
                return this;
            }

            /**
             * <p>The minimum bandwidth. Unit: <strong>Mbit/s</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minBandwidthAbs(Integer minBandwidthAbs) {
                this.minBandwidthAbs = minBandwidthAbs;
                return this;
            }

            /**
             * <p>The minimum bandwidth percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder minBandwidthPercent(Integer minBandwidthPercent) {
                this.minBandwidthPercent = minBandwidthPercent;
                return this;
            }

            /**
             * <p>The name of the traffic throttling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The bandwidth type when traffic is throttled based on bandwidth percentage.</p>
             * <ul>
             * <li><strong>CcnBandwidth</strong>: Cloud Connect Network (CCN) bandwidth.</li>
             * <li><strong>InternetUpBandwidth</strong>: Internet upstream bandwidth.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CcnBandwidth</p>
             */
            public Builder percentSourceType(String percentSourceType) {
                this.percentSourceType = percentSourceType;
                return this;
            }

            /**
             * <p>The priority of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the traffic throttling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-awfxl1adxeqyk****</p>
             */
            public Builder qosCarId(String qosCarId) {
                this.qosCarId = qosCarId;
                return this;
            }

            /**
             * <p>The ID of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-awfxl1adxeqyk****</p>
             */
            public Builder qosId(String qosId) {
                this.qosId = qosId;
                return this;
            }

            public QosCar build() {
                return new QosCar(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeQosCarsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQosCarsResponseBody</p>
     */
    public static class QosCars extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QosCar")
        private java.util.List<QosCar> qosCar;

        private QosCars(Builder builder) {
            this.qosCar = builder.qosCar;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QosCars create() {
            return builder().build();
        }

        /**
         * @return qosCar
         */
        public java.util.List<QosCar> getQosCar() {
            return this.qosCar;
        }

        public static final class Builder {
            private java.util.List<QosCar> qosCar; 

            private Builder() {
            } 

            private Builder(QosCars model) {
                this.qosCar = model.qosCar;
            } 

            /**
             * QosCar.
             */
            public Builder qosCar(java.util.List<QosCar> qosCar) {
                this.qosCar = qosCar;
                return this;
            }

            public QosCars build() {
                return new QosCars(this);
            } 

        } 

    }
}
