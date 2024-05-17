// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetOverviewRequest</p>
 */
public class GetOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private GetOverviewRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.groupId = builder.groupId;
        this.metricType = builder.metricType;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.operate = builder.operate;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOverviewRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return metricType
     */
    public Integer getMetricType() {
        return this.metricType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return operate
     */
    public String getOperate() {
        return this.operate;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetOverviewRequest, Builder> {
        private Long endTime; 
        private String groupId; 
        private Integer metricType; 
        private String namespace; 
        private String namespaceSource; 
        private String operate; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetOverviewRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.groupId = request.groupId;
            this.metricType = request.metricType;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.operate = request.operate;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(Integer metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespaceSource.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * Operate.
         */
        public Builder operate(String operate) {
            this.putQueryParameter("Operate", operate);
            this.operate = operate;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetOverviewRequest build() {
            return new GetOverviewRequest(this);
        } 

    } 

}
