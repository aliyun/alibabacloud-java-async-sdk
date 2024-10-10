// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAppNetworkRequest} extends {@link RequestModel}
 *
 * <p>GetAppNetworkRequest</p>
 */
public class GetAppNetworkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private GetAppNetworkRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppNetworkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetAppNetworkRequest, Builder> {
        private String clusterId; 
        private Long endTime; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetAppNetworkRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the cluster to which the container belongs.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cf77xxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end timestamp of the query. Unit: milliseconds.</p>
         * <blockquote>
         * <p>The days between the start timestamp and the end timestamp cannot exceed <strong>seven</strong> days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1650470399999</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The start timestamp of the query. Unit: milliseconds.</p>
         * <blockquote>
         * <p>The days between the start timestamp and the end timestamp cannot exceed <strong>seven</strong> days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1649260800000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetAppNetworkRequest build() {
            return new GetAppNetworkRequest(this);
        } 

    } 

}
