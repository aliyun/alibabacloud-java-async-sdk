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
 * {@link DescribeFirewallDropTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeFirewallDropTrendRequest</p>
 */
public class DescribeFirewallDropTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeFirewallDropTrendRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallDropTrendRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeFirewallDropTrendRequest, Builder> {
        private Long endTime; 
        private String lang; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFirewallDropTrendRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time of the query. Specify a UNIX timestamp in seconds. This parameter is required and must be specified together with StartTime. The value must be a UNIX timestamp in seconds and must be later than StartTime. If this parameter is not specified, the API returns ErrorTimeError(400).</p>
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The start time of the query. Specify a UNIX timestamp in seconds. This parameter is required and must be specified together with EndTime. The value must be a UNIX timestamp in seconds and must be earlier than EndTime. If this parameter is not specified, the API returns ErrorTimeError(400).</p>
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
        public DescribeFirewallDropTrendRequest build() {
            return new DescribeFirewallDropTrendRequest(this);
        } 

    } 

}
