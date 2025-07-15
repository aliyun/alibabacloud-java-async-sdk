// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveInteractionMetricDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveInteractionMetricDataRequest</p>
 */
public class DescribeLiveInteractionMetricDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
    private String terminalType;

    private DescribeLiveInteractionMetricDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.beginTs = builder.beginTs;
        this.endTs = builder.endTs;
        this.metricType = builder.metricType;
        this.os = builder.os;
        this.terminalType = builder.terminalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveInteractionMetricDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return beginTs
     */
    public Long getBeginTs() {
        return this.beginTs;
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    public static final class Builder extends Request.Builder<DescribeLiveInteractionMetricDataRequest, Builder> {
        private String appId; 
        private Long beginTs; 
        private Long endTs; 
        private String metricType; 
        private String os; 
        private String terminalType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveInteractionMetricDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.beginTs = request.beginTs;
            this.endTs = request.endTs;
            this.metricType = request.metricType;
            this.os = request.os;
            this.terminalType = request.terminalType;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e4d7f08a-01fe-41b5-a091-fe41060a****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1698195600000</p>
         */
        public Builder beginTs(Long beginTs) {
            this.putQueryParameter("BeginTs", beginTs);
            this.beginTs = beginTs;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1698201013000</p>
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * <p>The metric. Valid values:</p>
         * <ul>
         * <li>JoinChannelSucRate: the success rate of joining a channel within 5 seconds.</li>
         * <li>VideoStuckRate: the video stuttering rate.</li>
         * <li>AudioStuckRate: the audio stuttering rate.</li>
         * <li>FirstFrameCost: the time to first frame.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FirstFrameCost</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The operating system. Valid values: iOS and Android.</p>
         * 
         * <strong>example:</strong>
         * <p>Android</p>
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>The terminal type. Valid values: web and mobile.</p>
         * 
         * <strong>example:</strong>
         * <p>mobile</p>
         */
        public Builder terminalType(String terminalType) {
            this.putQueryParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        @Override
        public DescribeLiveInteractionMetricDataRequest build() {
            return new DescribeLiveInteractionMetricDataRequest(this);
        } 

    } 

}
