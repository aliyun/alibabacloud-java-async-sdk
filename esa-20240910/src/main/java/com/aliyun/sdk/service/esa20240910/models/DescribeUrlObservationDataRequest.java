// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeUrlObservationDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeUrlObservationDataRequest</p>
 */
public class DescribeUrlObservationDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientPlatform")
    private String clientPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metric")
    private String metric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private DescribeUrlObservationDataRequest(Builder builder) {
        super(builder);
        this.clientPlatform = builder.clientPlatform;
        this.endTime = builder.endTime;
        this.metric = builder.metric;
        this.siteId = builder.siteId;
        this.startTime = builder.startTime;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUrlObservationDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientPlatform
     */
    public String getClientPlatform() {
        return this.clientPlatform;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<DescribeUrlObservationDataRequest, Builder> {
        private String clientPlatform; 
        private String endTime; 
        private String metric; 
        private String siteId; 
        private String startTime; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUrlObservationDataRequest request) {
            super(request);
            this.clientPlatform = request.clientPlatform;
            this.endTime = request.endTime;
            this.metric = request.metric;
            this.siteId = request.siteId;
            this.startTime = request.startTime;
            this.url = request.url;
        } 

        /**
         * ClientPlatform.
         */
        public Builder clientPlatform(String clientPlatform) {
            this.putQueryParameter("ClientPlatform", clientPlatform);
            this.clientPlatform = clientPlatform;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Metric.
         */
        public Builder metric(String metric) {
            this.putQueryParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54362329990032</p>
         */
        public Builder siteId(String siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public DescribeUrlObservationDataRequest build() {
            return new DescribeUrlObservationDataRequest(this);
        } 

    } 

}
