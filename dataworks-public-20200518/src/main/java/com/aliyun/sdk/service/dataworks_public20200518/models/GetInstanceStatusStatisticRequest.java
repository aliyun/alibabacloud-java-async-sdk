// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetInstanceStatusStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceStatusStatisticRequest</p>
 */
public class GetInstanceStatusStatisticRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizDate")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 10, minLength = 10)
    private String bizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DagType")
    private String dagType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchedulerPeriod")
    private String schedulerPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchedulerType")
    private String schedulerType;

    private GetInstanceStatusStatisticRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizDate = builder.bizDate;
        this.dagType = builder.dagType;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
        this.schedulerPeriod = builder.schedulerPeriod;
        this.schedulerType = builder.schedulerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceStatusStatisticRequest create() {
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
     * @return bizDate
     */
    public String getBizDate() {
        return this.bizDate;
    }

    /**
     * @return dagType
     */
    public String getDagType() {
        return this.dagType;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return schedulerPeriod
     */
    public String getSchedulerPeriod() {
        return this.schedulerPeriod;
    }

    /**
     * @return schedulerType
     */
    public String getSchedulerType() {
        return this.schedulerType;
    }

    public static final class Builder extends Request.Builder<GetInstanceStatusStatisticRequest, Builder> {
        private String regionId; 
        private String bizDate; 
        private String dagType; 
        private String projectEnv; 
        private Long projectId; 
        private String schedulerPeriod; 
        private String schedulerType; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceStatusStatisticRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizDate = request.bizDate;
            this.dagType = request.dagType;
            this.projectEnv = request.projectEnv;
            this.projectId = request.projectId;
            this.schedulerPeriod = request.schedulerPeriod;
            this.schedulerType = request.schedulerType;
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
         * <p>The date on which the numbers of instances in different states are obtained. Specify the date in the yyyy-MM-dd format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        public Builder bizDate(String bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
            return this;
        }

        /**
         * <p>The type of the directed acyclic graph (DAG). Valid values:</p>
         * <ul>
         * <li>MANUAL: DAG for a manually triggered workflow</li>
         * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
         * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
         * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow</li>
         * </ul>
         * <!---->
         * 
         * <ul>
         * <li>DAILY</li>
         * <li>MANUAL</li>
         * <li>SMOKE_TEST</li>
         * <li>SUPPLY_DATA</li>
         * <li>BUSINESS_PROCESS_DAG</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        public Builder dagType(String dagType) {
            this.putBodyParameter("DagType", dagType);
            this.dagType = dagType;
            return this;
        }

        /**
         * <p>The runtime environment. Valid values: PROD and DEV.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the Workspace page to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The scheduling cycle. Valid values:</p>
         * <ul>
         * <li>MINUTE</li>
         * <li>HOUR</li>
         * <li>DAY</li>
         * <li>WEEK</li>
         * <li>MONTH</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        public Builder schedulerPeriod(String schedulerPeriod) {
            this.putBodyParameter("SchedulerPeriod", schedulerPeriod);
            this.schedulerPeriod = schedulerPeriod;
            return this;
        }

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <ul>
         * <li>NORMAL: auto triggered node</li>
         * <li>MANUAL: manually triggered node</li>
         * <li>PAUSE: paused node</li>
         * <li>SKIP: dry-run node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder schedulerType(String schedulerType) {
            this.putBodyParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        @Override
        public GetInstanceStatusStatisticRequest build() {
            return new GetInstanceStatusStatisticRequest(this);
        } 

    } 

}
