// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link QueryMonitorRequest} extends {@link RequestModel}
 *
 * <p>QueryMonitorRequest</p>
 */
public class QueryMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String monitorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Step")
    private Long step;

    private QueryMonitorRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.monitorType = builder.monitorType;
        this.requestPars = builder.requestPars;
        this.startTime = builder.startTime;
        this.step = builder.step;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonitorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return monitorType
     */
    public String getMonitorType() {
        return this.monitorType;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return step
     */
    public Long getStep() {
        return this.step;
    }

    public static final class Builder extends Request.Builder<QueryMonitorRequest, Builder> {
        private String acceptLanguage; 
        private Long endTime; 
        private String instanceId; 
        private String monitorType; 
        private String requestPars; 
        private Long startTime; 
        private Long step; 

        private Builder() {
            super();
        } 

        private Builder(QueryMonitorRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.monitorType = request.monitorType;
            this.requestPars = request.requestPars;
            this.startTime = request.startTime;
            this.step = request.step;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The timestamp when the monitoring ends.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1666678376</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The metric type. The following metric types are supported:</p>
         * <p>[Basic system metrics]</p>
         * <ul>
         * <li>cpuUsage</li>
         * <li>memoryUsage</li>
         * <li>diskUsage</li>
         * <li>gcCount</li>
         * <li>gcTime</li>
         * </ul>
         * <p>[Nacos registry]</p>
         * <ul>
         * <li>serviceCount</li>
         * <li>writeCostTime</li>
         * <li>readCostTime</li>
         * <li>TPS regCenterTps</li>
         * <li>QPS regCenterQps</li>
         * </ul>
         * <p>[Nacos configuration center]</p>
         * <ul>
         * <li>publish</li>
         * <li>getConfig</li>
         * </ul>
         * <p>[zookeeper]</p>
         * <ul>
         * <li>TPS zk_TpsCount</li>
         * <li>QPS zk_QpsCount</li>
         * <li>zookeeper_AvgRequestLatency</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>regCenterQps</p>
         */
        public Builder monitorType(String monitorType) {
            this.putQueryParameter("MonitorType", monitorType);
            this.monitorType = monitorType;
            return this;
        }

        /**
         * <p>The extended request parameters in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * <p>The timestamp when the monitoring starts.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1666678376</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The interval between data points. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder step(Long step) {
            this.putQueryParameter("Step", step);
            this.step = step;
            return this;
        }

        @Override
        public QueryMonitorRequest build() {
            return new QueryMonitorRequest(this);
        } 

    } 

}
