// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricListRequest} extends {@link RequestModel}
 *
 * <p>DescribeMetricListRequest</p>
 */
public class DescribeMetricListRequest extends Request {
    @Body
    @NameInMap("AccountId")
    private String accountId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("Env")
    private String env;

    @Body
    @NameInMap("MetricName")
    @Validation(required = true)
    private String metricName;

    @Body
    @NameInMap("MetricType")
    private String metricType;

    @Body
    @NameInMap("OwnerID")
    private String ownerID;

    @Body
    @NameInMap("Param")
    @Validation(required = true)
    private String param;

    @Body
    @NameInMap("Period")
    private Long period;

    @Body
    @NameInMap("StartTime")
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
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the Alibaba Cloud account.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. **The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the data migration or synchronization task.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putBodyParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The timestamp that indicates the end of the time range to query. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Default value: **ALIYUN**.
         */
        public Builder env(String env) {
            this.putBodyParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * *   **InternetOut**: the outbound traffic over the Internet. Unit: byte.
         * <p>
         * *   **diskusage_utilization**: the disk usage.
         * *   **IntranetInRate**: the inbound traffic over the internal network. Unit: byte.
         * *   **InternetIn**: the inbound traffic from the Internet. Unit: byte.
         * *   **cpu_total**: the CPU utilization.
         * *   **memory_usedutilization**: the memory usage.
         * *   **IntranetOutRate**: the outbound traffic over the internal network. Unit: byte.
         */
        public Builder metricName(String metricName) {
            this.putBodyParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * Specifies whether to query the metrics of the cluster or a node. Valid values:
         * <p>
         * 
         * *   **CLUSTER**: query the metrics of the cluster.
         * *   **NODE**: query the metrics of a node.
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
         * The monitored object. If the **MetricType** parameter is set to **NODE**, set this parameter to the ID of the node that is monitored.
         */
        public Builder param(String param) {
            this.putBodyParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * The monitoring interval. Unit: seconds. Minimum value: 15.
         */
        public Builder period(Long period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The timestamp that indicates the beginning of the time range to query. Unit: milliseconds.
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
