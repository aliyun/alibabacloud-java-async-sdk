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
         * <p>查询结束时间。本参数实际为必填项，未提供时 API 返回 ErrorTimeError(400)。需提供秒级 Unix 时间戳，且 EndTime 应晚于 StartTime。</p>
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>查询起始时间。本参数实际为必填项，未提供时 API 返回 ErrorTimeError(400)。需提供秒级 Unix 时间戳，且 StartTime 应早于 EndTime。</p>
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
