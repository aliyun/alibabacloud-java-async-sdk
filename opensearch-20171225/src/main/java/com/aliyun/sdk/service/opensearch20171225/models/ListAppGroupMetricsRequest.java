// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppGroupMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListAppGroupMetricsRequest</p>
 */
public class ListAppGroupMetricsRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Query
    @NameInMap("endTime")
    private Integer endTime;

    @Query
    @NameInMap("indexes")
    private String indexes;

    @Query
    @NameInMap("metricType")
    private String metricType;

    @Query
    @NameInMap("startTime")
    private Integer startTime;

    private ListAppGroupMetricsRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.endTime = builder.endTime;
        this.indexes = builder.indexes;
        this.metricType = builder.metricType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppGroupMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return indexes
     */
    public String getIndexes() {
        return this.indexes;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAppGroupMetricsRequest, Builder> {
        private String appGroupIdentity; 
        private Integer endTime; 
        private String indexes; 
        private String metricType; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAppGroupMetricsRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.endTime = response.endTime;
            this.indexes = response.indexes;
            this.metricType = response.metricType;
            this.startTime = response.startTime;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * indexes.
         */
        public Builder indexes(String indexes) {
            this.putQueryParameter("indexes", indexes);
            this.indexes = indexes;
            return this;
        }

        /**
         * metricType.
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("metricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAppGroupMetricsRequest build() {
            return new ListAppGroupMetricsRequest(this);
        } 

    } 

}
