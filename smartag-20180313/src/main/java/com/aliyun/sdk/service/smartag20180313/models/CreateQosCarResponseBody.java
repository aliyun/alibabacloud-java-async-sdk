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
 * {@link CreateQosCarResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQosCarResponseBody</p>
 */
public class CreateQosCarResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("PercentSourceType")
    private String percentSourceType;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("QosCarId")
    private String qosCarId;

    @com.aliyun.core.annotation.NameInMap("QosId")
    private String qosId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateQosCarResponseBody(Builder builder) {
        this.description = builder.description;
        this.limitType = builder.limitType;
        this.maxBandwidthAbs = builder.maxBandwidthAbs;
        this.maxBandwidthPercent = builder.maxBandwidthPercent;
        this.minBandwidthAbs = builder.minBandwidthAbs;
        this.minBandwidthPercent = builder.minBandwidthPercent;
        this.percentSourceType = builder.percentSourceType;
        this.priority = builder.priority;
        this.qosCarId = builder.qosCarId;
        this.qosId = builder.qosId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQosCarResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String description; 
        private String limitType; 
        private Integer maxBandwidthAbs; 
        private Integer maxBandwidthPercent; 
        private Integer minBandwidthAbs; 
        private Integer minBandwidthPercent; 
        private String percentSourceType; 
        private Integer priority; 
        private String qosCarId; 
        private String qosId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateQosCarResponseBody model) {
            this.description = model.description;
            this.limitType = model.limitType;
            this.maxBandwidthAbs = model.maxBandwidthAbs;
            this.maxBandwidthPercent = model.maxBandwidthPercent;
            this.minBandwidthAbs = model.minBandwidthAbs;
            this.minBandwidthPercent = model.minBandwidthPercent;
            this.percentSourceType = model.percentSourceType;
            this.priority = model.priority;
            this.qosCarId = model.qosCarId;
            this.qosId = model.qosId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The description of the traffic throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Qosdesc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The type of the traffic throttling rule. Valid values:</p>
         * <ul>
         * <li><strong>Absolute</strong>: throttles traffic based on a specific range of bandwidth.</li>
         * <li><strong>Percent</strong>: throttles traffic based on a specific range of bandwidth percentage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Percent</p>
         */
        public Builder limitType(String limitType) {
            this.limitType = limitType;
            return this;
        }

        /**
         * <p>The maximum bandwidth value. Unit: Mbit/s.</p>
         * <p>This parameter is returned when <strong>LimitType</strong> is set to <strong>Absolute</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder maxBandwidthAbs(Integer maxBandwidthAbs) {
            this.maxBandwidthAbs = maxBandwidthAbs;
            return this;
        }

        /**
         * <p>The maximum bandwidth percentage. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder maxBandwidthPercent(Integer maxBandwidthPercent) {
            this.maxBandwidthPercent = maxBandwidthPercent;
            return this;
        }

        /**
         * <p>The minimum bandwidth value. Unit: Mbit/s.</p>
         * <p>This parameter is returned when <strong>LimitType</strong> is set to <strong>Absolute</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minBandwidthAbs(Integer minBandwidthAbs) {
            this.minBandwidthAbs = minBandwidthAbs;
            return this;
        }

        /**
         * <p>The minimum bandwidth percentage. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder minBandwidthPercent(Integer minBandwidthPercent) {
            this.minBandwidthPercent = minBandwidthPercent;
            return this;
        }

        /**
         * <p>The type of bandwidth when traffic is throttled based on bandwidth percentage. Valid values:</p>
         * <ul>
         * <li><strong>CcnBandwidth</strong>: CCN bandwidth</li>
         * <li><strong>InternetUpBandwidth</strong>: total Internet bandwidth</li>
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
         * <p>The priority value of the traffic throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the traffic throttling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>qoscar-n5k8g97lihlph****</p>
         */
        public Builder qosCarId(String qosCarId) {
            this.qosCarId = qosCarId;
            return this;
        }

        /**
         * <p>The ID of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-xitd8690ucu8ro****</p>
         */
        public Builder qosId(String qosId) {
            this.qosId = qosId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AC13E8FF-4D61-40AD-868E-817F2D3AC86A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateQosCarResponseBody build() {
            return new CreateQosCarResponseBody(this);
        } 

    } 

}
