// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeNatFirewallDropTrafficTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeNatFirewallDropTrafficTrendRequest</p>
 */
public class DescribeNatFirewallDropTrafficTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeNatFirewallDropTrafficTrendRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallDropTrafficTrendRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeNatFirewallDropTrafficTrendRequest, Builder> {
        private Long endTime; 
        private String sourceIp; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNatFirewallDropTrafficTrendRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time. Specify a UNIX timestamp in seconds. This parameter is required. If this parameter is not specified, the API returns ErrorTimeError (400). Specify a UNIX timestamp in seconds. The value of EndTime must be later than the value of StartTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1758334822</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>122.190.56.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The start time. Specify a UNIX timestamp in seconds. This parameter is required. If this parameter is not specified, the API returns ErrorTimeError (400). Specify a UNIX timestamp in seconds. The value of StartTime must be earlier than the value of EndTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1740968766</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeNatFirewallDropTrafficTrendRequest build() {
            return new DescribeNatFirewallDropTrafficTrendRequest(this);
        } 

    } 

}
