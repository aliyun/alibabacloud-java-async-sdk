// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonitorRequest} extends {@link RequestModel}
 *
 * <p>QueryMonitorRequest</p>
 */
public class QueryMonitorRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MonitorType")
    @Validation(required = true)
    private String monitorType;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    @Query
    @NameInMap("Step")
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
         * The timestamp when the monitoring starts.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * system error
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * mse-100-001
         */
        public Builder monitorType(String monitorType) {
            this.putQueryParameter("MonitorType", monitorType);
            this.monitorType = monitorType;
            return this;
        }

        /**
         * cluster not found
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * systemError
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The extended request parameters in the JSON format.
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
