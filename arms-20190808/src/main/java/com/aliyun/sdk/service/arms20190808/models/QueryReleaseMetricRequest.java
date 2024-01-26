// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryReleaseMetricRequest} extends {@link RequestModel}
 *
 * <p>QueryReleaseMetricRequest</p>
 */
public class QueryReleaseMetricRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ChangeOrderId")
    @Validation(required = true)
    private String changeOrderId;

    @Query
    @NameInMap("CreateTime")
    private Long createTime;

    @Query
    @NameInMap("MetricType")
    private String metricType;

    @Query
    @NameInMap("Pid")
    @Validation(required = true)
    private String pid;

    @Query
    @NameInMap("ProxyUserId")
    private String proxyUserId;

    @Query
    @NameInMap("ReleaseEndTime")
    @Validation(required = true)
    private Long releaseEndTime;

    @Query
    @NameInMap("ReleaseStartTime")
    @Validation(required = true)
    private Long releaseStartTime;

    @Query
    @NameInMap("Service")
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ChangeOrderId.
         */
        public Builder changeOrderId(String changeOrderId) {
            this.putQueryParameter("ChangeOrderId", changeOrderId);
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * ProxyUserId.
         */
        public Builder proxyUserId(String proxyUserId) {
            this.putQueryParameter("ProxyUserId", proxyUserId);
            this.proxyUserId = proxyUserId;
            return this;
        }

        /**
         * ReleaseEndTime.
         */
        public Builder releaseEndTime(Long releaseEndTime) {
            this.putQueryParameter("ReleaseEndTime", releaseEndTime);
            this.releaseEndTime = releaseEndTime;
            return this;
        }

        /**
         * ReleaseStartTime.
         */
        public Builder releaseStartTime(Long releaseStartTime) {
            this.putQueryParameter("ReleaseStartTime", releaseStartTime);
            this.releaseStartTime = releaseStartTime;
            return this;
        }

        /**
         * Service.
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
