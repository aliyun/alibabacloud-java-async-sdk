// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLoadBalancerListenMonitorRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoadBalancerListenMonitorRequest</p>
 */
public class DescribeLoadBalancerListenMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Proto")
    private String proto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vPort;

    private DescribeLoadBalancerListenMonitorRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.loadBalancerId = builder.loadBalancerId;
        this.proto = builder.proto;
        this.startTime = builder.startTime;
        this.vPort = builder.vPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerListenMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return proto
     */
    public String getProto() {
        return this.proto;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return vPort
     */
    public String getVPort() {
        return this.vPort;
    }

    public static final class Builder extends Request.Builder<DescribeLoadBalancerListenMonitorRequest, Builder> {
        private String endTime; 
        private String loadBalancerId; 
        private String proto; 
        private String startTime; 
        private String vPort; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLoadBalancerListenMonitorRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.loadBalancerId = request.loadBalancerId;
            this.proto = request.proto;
            this.startTime = request.startTime;
            this.vPort = request.vPort;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-30 08:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5q73cv04zeyh43lh74lp4****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * Proto.
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-15 16:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder vPort(String vPort) {
            this.putQueryParameter("VPort", vPort);
            this.vPort = vPort;
            return this;
        }

        @Override
        public DescribeLoadBalancerListenMonitorRequest build() {
            return new DescribeLoadBalancerListenMonitorRequest(this);
        } 

    } 

}
