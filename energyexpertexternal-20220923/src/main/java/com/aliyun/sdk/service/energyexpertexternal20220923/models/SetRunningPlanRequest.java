// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link SetRunningPlanRequest} extends {@link RequestModel}
 *
 * <p>SetRunningPlanRequest</p>
 */
public class SetRunningPlanRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("controlType")
    private Integer controlType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dateType")
    private Integer dateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("earliestStartupTime")
    private String earliestStartupTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("factoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String factoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("latestShutdownTime")
    private String latestShutdownTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxCarbonDioxide")
    private Double maxCarbonDioxide;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxTem")
    private Double maxTem;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("minTem")
    private Double minTem;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pKey")
    private String pKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("seasonMode")
    private Integer seasonMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("statisticsTime")
    private String statisticsTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("systemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String systemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workingEndTime")
    private String workingEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workingStartTime")
    private String workingStartTime;

    private SetRunningPlanRequest(Builder builder) {
        super(builder);
        this.controlType = builder.controlType;
        this.dateType = builder.dateType;
        this.earliestStartupTime = builder.earliestStartupTime;
        this.endTime = builder.endTime;
        this.factoryId = builder.factoryId;
        this.latestShutdownTime = builder.latestShutdownTime;
        this.maxCarbonDioxide = builder.maxCarbonDioxide;
        this.maxTem = builder.maxTem;
        this.minTem = builder.minTem;
        this.pKey = builder.pKey;
        this.seasonMode = builder.seasonMode;
        this.startTime = builder.startTime;
        this.statisticsTime = builder.statisticsTime;
        this.systemId = builder.systemId;
        this.workingEndTime = builder.workingEndTime;
        this.workingStartTime = builder.workingStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRunningPlanRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return controlType
     */
    public Integer getControlType() {
        return this.controlType;
    }

    /**
     * @return dateType
     */
    public Integer getDateType() {
        return this.dateType;
    }

    /**
     * @return earliestStartupTime
     */
    public String getEarliestStartupTime() {
        return this.earliestStartupTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return factoryId
     */
    public String getFactoryId() {
        return this.factoryId;
    }

    /**
     * @return latestShutdownTime
     */
    public String getLatestShutdownTime() {
        return this.latestShutdownTime;
    }

    /**
     * @return maxCarbonDioxide
     */
    public Double getMaxCarbonDioxide() {
        return this.maxCarbonDioxide;
    }

    /**
     * @return maxTem
     */
    public Double getMaxTem() {
        return this.maxTem;
    }

    /**
     * @return minTem
     */
    public Double getMinTem() {
        return this.minTem;
    }

    /**
     * @return pKey
     */
    public String getPKey() {
        return this.pKey;
    }

    /**
     * @return seasonMode
     */
    public Integer getSeasonMode() {
        return this.seasonMode;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statisticsTime
     */
    public String getStatisticsTime() {
        return this.statisticsTime;
    }

    /**
     * @return systemId
     */
    public String getSystemId() {
        return this.systemId;
    }

    /**
     * @return workingEndTime
     */
    public String getWorkingEndTime() {
        return this.workingEndTime;
    }

    /**
     * @return workingStartTime
     */
    public String getWorkingStartTime() {
        return this.workingStartTime;
    }

    public static final class Builder extends Request.Builder<SetRunningPlanRequest, Builder> {
        private Integer controlType; 
        private Integer dateType; 
        private String earliestStartupTime; 
        private String endTime; 
        private String factoryId; 
        private String latestShutdownTime; 
        private Double maxCarbonDioxide; 
        private Double maxTem; 
        private Double minTem; 
        private String pKey; 
        private Integer seasonMode; 
        private String startTime; 
        private String statisticsTime; 
        private String systemId; 
        private String workingEndTime; 
        private String workingStartTime; 

        private Builder() {
            super();
        } 

        private Builder(SetRunningPlanRequest request) {
            super(request);
            this.controlType = request.controlType;
            this.dateType = request.dateType;
            this.earliestStartupTime = request.earliestStartupTime;
            this.endTime = request.endTime;
            this.factoryId = request.factoryId;
            this.latestShutdownTime = request.latestShutdownTime;
            this.maxCarbonDioxide = request.maxCarbonDioxide;
            this.maxTem = request.maxTem;
            this.minTem = request.minTem;
            this.pKey = request.pKey;
            this.seasonMode = request.seasonMode;
            this.startTime = request.startTime;
            this.statisticsTime = request.statisticsTime;
            this.systemId = request.systemId;
            this.workingEndTime = request.workingEndTime;
            this.workingStartTime = request.workingStartTime;
        } 

        /**
         * controlType.
         */
        public Builder controlType(Integer controlType) {
            this.putBodyParameter("controlType", controlType);
            this.controlType = controlType;
            return this;
        }

        /**
         * dateType.
         */
        public Builder dateType(Integer dateType) {
            this.putBodyParameter("dateType", dateType);
            this.dateType = dateType;
            return this;
        }

        /**
         * earliestStartupTime.
         */
        public Builder earliestStartupTime(String earliestStartupTime) {
            this.putBodyParameter("earliestStartupTime", earliestStartupTime);
            this.earliestStartupTime = earliestStartupTime;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder factoryId(String factoryId) {
            this.putBodyParameter("factoryId", factoryId);
            this.factoryId = factoryId;
            return this;
        }

        /**
         * latestShutdownTime.
         */
        public Builder latestShutdownTime(String latestShutdownTime) {
            this.putBodyParameter("latestShutdownTime", latestShutdownTime);
            this.latestShutdownTime = latestShutdownTime;
            return this;
        }

        /**
         * maxCarbonDioxide.
         */
        public Builder maxCarbonDioxide(Double maxCarbonDioxide) {
            this.putBodyParameter("maxCarbonDioxide", maxCarbonDioxide);
            this.maxCarbonDioxide = maxCarbonDioxide;
            return this;
        }

        /**
         * maxTem.
         */
        public Builder maxTem(Double maxTem) {
            this.putBodyParameter("maxTem", maxTem);
            this.maxTem = maxTem;
            return this;
        }

        /**
         * minTem.
         */
        public Builder minTem(Double minTem) {
            this.putBodyParameter("minTem", minTem);
            this.minTem = minTem;
            return this;
        }

        /**
         * pKey.
         */
        public Builder pKey(String pKey) {
            this.putBodyParameter("pKey", pKey);
            this.pKey = pKey;
            return this;
        }

        /**
         * seasonMode.
         */
        public Builder seasonMode(Integer seasonMode) {
            this.putBodyParameter("seasonMode", seasonMode);
            this.seasonMode = seasonMode;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * statisticsTime.
         */
        public Builder statisticsTime(String statisticsTime) {
            this.putBodyParameter("statisticsTime", statisticsTime);
            this.statisticsTime = statisticsTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>system1</p>
         */
        public Builder systemId(String systemId) {
            this.putBodyParameter("systemId", systemId);
            this.systemId = systemId;
            return this;
        }

        /**
         * workingEndTime.
         */
        public Builder workingEndTime(String workingEndTime) {
            this.putBodyParameter("workingEndTime", workingEndTime);
            this.workingEndTime = workingEndTime;
            return this;
        }

        /**
         * workingStartTime.
         */
        public Builder workingStartTime(String workingStartTime) {
            this.putBodyParameter("workingStartTime", workingStartTime);
            this.workingStartTime = workingStartTime;
            return this;
        }

        @Override
        public SetRunningPlanRequest build() {
            return new SetRunningPlanRequest(this);
        } 

    } 

}
