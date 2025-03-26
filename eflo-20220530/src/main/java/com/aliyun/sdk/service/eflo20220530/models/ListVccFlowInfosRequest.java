// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link ListVccFlowInfosRequest} extends {@link RequestModel}
 *
 * <p>ListVccFlowInfosRequest</p>
 */
public class ListVccFlowInfosRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("From")
    private Long from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("To")
    private Long to;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    private String vccId;

    private ListVccFlowInfosRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.from = builder.from;
        this.metricName = builder.metricName;
        this.regionId = builder.regionId;
        this.to = builder.to;
        this.vccId = builder.vccId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVccFlowInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    /**
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    public static final class Builder extends Request.Builder<ListVccFlowInfosRequest, Builder> {
        private String direction; 
        private Long from; 
        private String metricName; 
        private String regionId; 
        private Long to; 
        private String vccId; 

        private Builder() {
            super();
        } 

        private Builder(ListVccFlowInfosRequest request) {
            super(request);
            this.direction = request.direction;
            this.from = request.from;
            this.metricName = request.metricName;
            this.regionId = request.regionId;
            this.to = request.to;
            this.vccId = request.vccId;
        } 

        /**
         * <p>Direction</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>IN: inbound.</li>
         * <li>OUT: the outbound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OUT</p>
         */
        public Builder direction(String direction) {
            this.putBodyParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The start time. The default value is 5 minutes ago.</p>
         * 
         * <strong>example:</strong>
         * <p>1667727514000</p>
         */
        public Builder from(Long from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>Metric</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>totalPacketsRate: Total Packet Rate.</li>
         * <li>dropBytesRate: the of the stream drop rate.</li>
         * <li>dropPacketsRate: Dropped Packet Rate.</li>
         * <li>totalBytesRate: the total streaming rate.</li>
         * <li>passBytesRate: by stream rate.</li>
         * <li>passPacketsRate: by packet rate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>passBytesRate</p>
         */
        public Builder metricName(String metricName) {
            this.putBodyParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The end time. The default time is the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1689749749000</p>
         */
        public Builder to(Long to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        /**
         * <p>Lingjun Connection ID</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2******</p>
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        @Override
        public ListVccFlowInfosRequest build() {
            return new ListVccFlowInfosRequest(this);
        } 

    } 

}
