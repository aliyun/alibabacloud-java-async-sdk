// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryReleaseMetricRequest} extends {@link RequestModel}
 *
 * <p>QueryReleaseMetricRequest</p>
 */
public class QueryReleaseMetricRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String changeOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyUserId")
    private String proxyUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseEndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long releaseEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseStartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long releaseStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    private QueryReleaseMetricRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.changeOrderId = builder.changeOrderId;
        this.createTime = builder.createTime;
        this.metricType = builder.metricType;
        this.pid = builder.pid;
        this.proxyUserId = builder.proxyUserId;
        this.releaseEndTime = builder.releaseEndTime;
        this.releaseStartTime = builder.releaseStartTime;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReleaseMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return changeOrderId
     */
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return proxyUserId
     */
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    /**
     * @return releaseEndTime
     */
    public Long getReleaseEndTime() {
        return this.releaseEndTime;
    }

    /**
     * @return releaseStartTime
     */
    public Long getReleaseStartTime() {
        return this.releaseStartTime;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    public static final class Builder extends Request.Builder<QueryReleaseMetricRequest, Builder> {
        private String regionId; 
        private String changeOrderId; 
        private Long createTime; 
        private String metricType; 
        private String pid; 
        private String proxyUserId; 
        private Long releaseEndTime; 
        private Long releaseStartTime; 
        private String service; 

        private Builder() {
            super();
        } 

        private Builder(QueryReleaseMetricRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.changeOrderId = request.changeOrderId;
            this.createTime = request.createTime;
            this.metricType = request.metricType;
            this.pid = request.pid;
            this.proxyUserId = request.proxyUserId;
            this.releaseEndTime = request.releaseEndTime;
            this.releaseStartTime = request.releaseStartTime;
            this.service = request.service;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the change order.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a341a2f2-ed07-4257-aae9-dfb1be******</p>
         */
        public Builder changeOrderId(String changeOrderId) {
            this.putQueryParameter("ChangeOrderId", changeOrderId);
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * <p>The time when the change order was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1634005438000</p>
         */
        public Builder createTime(Long createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The type of the metric that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemContrast</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The ID of the Enterprise Distributed Application Service (EDAS) or Kubernetes application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8b46d03f-5947-449d-90fd-3a96c2******</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>This parameter is not in use.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder proxyUserId(String proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        /**
         * <p>The end time of the version release.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1632798718632</p>
         */
        public Builder releaseEndTime(Long releaseEndTime) {
            this.putQueryParameter("ReleaseEndTime", releaseEndTime);
            this.releaseEndTime = releaseEndTime;
            return this;
        }

        /**
         * <p>The start time of the version release.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1632798686692</p>
         */
        public Builder releaseStartTime(Long releaseStartTime) {
            this.putQueryParameter("ReleaseStartTime", releaseStartTime);
            this.releaseStartTime = releaseStartTime;
            return this;
        }

        /**
         * <p>The service that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>clothservice</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        @Override
        public QueryReleaseMetricRequest build() {
            return new QueryReleaseMetricRequest(this);
        } 

    } 

}
