// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeMetricListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricListRequest</p>
 */
public class DescribeMetricListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OwnerID")
    private String ownerID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Param")
    @com.aliyun.core.annotation.Validation(required = true)
    private String param;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Period")
    private Long period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeMetricListRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.dtsJobId = builder.dtsJobId;
        this.endTime = builder.endTime;
        this.env = builder.env;
        this.metricName = builder.metricName;
        this.metricType = builder.metricType;
        this.ownerID = builder.ownerID;
        this.param = builder.param;
        this.period = builder.period;
        this.resourceGroupId = builder.resourceGroupId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return ownerID
     */
    public String getOwnerID() {
        return this.ownerID;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeMetricListRequest, Builder> {
        private String accountId; 
        private String clientToken; 
        private String dtsJobId; 
        private Long endTime; 
        private String env; 
        private String metricName; 
        private String metricType; 
        private String ownerID; 
        private String param; 
        private Long period; 
        private String resourceGroupId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMetricListRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.clientToken = request.clientToken;
            this.dtsJobId = request.dtsJobId;
            this.endTime = request.endTime;
            this.env = request.env;
            this.metricName = request.metricName;
            this.metricType = request.metricType;
            this.ownerID = request.ownerID;
            this.param = request.param;
            this.period = request.period;
            this.resourceGroupId = request.resourceGroupId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>Ensures the idempotency of the request. Generate a parameter value from your client to make sure that the value is unique among different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the data migration or data synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>k2gm967v16f****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putBodyParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The end timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642476194000</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Default value: <strong>ALIYUN</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder env(String env) {
            this.putBodyParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <ul>
         * <li><strong>InternetOut</strong>: outbound Internet traffic, in bytes.</li>
         * <li><strong>diskusage_utilization</strong>: disk usage.</li>
         * <li><strong>IntranetInRate</strong>: inbound internal network traffic, in bytes.</li>
         * <li><strong>InternetIn</strong>: inbound Internet traffic, in bytes.</li>
         * <li><strong>cpu_total</strong>: CPU utilization.</li>
         * <li><strong>memory_usedutilization</strong>: memory utilization.</li>
         * <li><strong>IntranetOutRate</strong>: outbound internal network traffic, in bytes.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total</p>
         */
        public Builder metricName(String metricName) {
            this.putBodyParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>Specifies whether to query a cluster or a node. Valid values:</p>
         * <ul>
         * <li><strong>CLUSTER</strong>: cluster.</li>
         * <li><strong>NODE</strong>: node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NODE</p>
         */
        public Builder metricType(String metricType) {
            this.putBodyParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * OwnerID.
         */
        public Builder ownerID(String ownerID) {
            this.putBodyParameter("OwnerID", ownerID);
            this.ownerID = ownerID;
            return this;
        }

        /**
         * <p>The observation value. If <strong>MetricType</strong> is set to <strong>NODE</strong>, the value is <strong>nodeid</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nodeid</p>
         */
        public Builder param(String param) {
            this.putBodyParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The observation interval in seconds. The minimum interval is 15 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder period(Long period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The start timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1642476144000</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeMetricListRequest build() {
            return new DescribeMetricListRequest(this);
        } 

    } 

}
