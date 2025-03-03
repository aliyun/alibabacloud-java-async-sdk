// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link QueryTrafficControlTargetItemReportDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryTrafficControlTargetItemReportDetailRequest</p>
 */
public class QueryTrafficControlTargetItemReportDetailRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficControlTargetId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Date")
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Environment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private QueryTrafficControlTargetItemReportDetailRequest(Builder builder) {
        super(builder);
        this.trafficControlTargetId = builder.trafficControlTargetId;
        this.regionId = builder.regionId;
        this.date = builder.date;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTrafficControlTargetItemReportDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trafficControlTargetId
     */
    public String getTrafficControlTargetId() {
        return this.trafficControlTargetId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<QueryTrafficControlTargetItemReportDetailRequest, Builder> {
        private String trafficControlTargetId; 
        private String regionId; 
        private String date; 
        private String environment; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTrafficControlTargetItemReportDetailRequest request) {
            super(request);
            this.trafficControlTargetId = request.trafficControlTargetId;
            this.regionId = request.regionId;
            this.date = request.date;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder trafficControlTargetId(String trafficControlTargetId) {
            this.putPathParameter("TrafficControlTargetId", trafficControlTargetId);
            this.trafficControlTargetId = trafficControlTargetId;
            return this;
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
         * Date.
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder environment(String environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public QueryTrafficControlTargetItemReportDetailRequest build() {
            return new QueryTrafficControlTargetItemReportDetailRequest(this);
        } 

    } 

}
