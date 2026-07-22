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
 * {@link DescribeFirewallTrafficTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeFirewallTrafficTrendRequest</p>
 */
public class DescribeFirewallTrafficTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeFirewallTrafficTrendRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallTrafficTrendRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeFirewallTrafficTrendRequest, Builder> {
        private Long endTime; 
        private String lang; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFirewallTrafficTrendRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.startTime = request.startTime;
        } 

        /**
         * <p>查询结束时间。本参数实际为必填项，未提供时 API 返回 ErrorTimeError(400)。需提供秒级 Unix 时间戳，且 EndTime 应晚于 StartTime。</p>
         * 
         * <strong>example:</strong>
         * <p>1758474000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>查询起始时间。本参数实际为必填项，未提供时 API 返回 ErrorTimeError(400)。需提供秒级 Unix 时间戳，且 StartTime 应早于 EndTime。</p>
         * 
         * <strong>example:</strong>
         * <p>1758470400</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeFirewallTrafficTrendRequest build() {
            return new DescribeFirewallTrafficTrendRequest(this);
        } 

    } 

}
