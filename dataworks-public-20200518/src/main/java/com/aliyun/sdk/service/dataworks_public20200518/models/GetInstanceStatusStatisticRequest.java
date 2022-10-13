// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceStatusStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceStatusStatisticRequest</p>
 */
public class GetInstanceStatusStatisticRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("BizDate")
    @Validation(required = true, maxLength = 10, minLength = 10)
    private String bizDate;

    @Body
    @NameInMap("DagType")
    private String dagType;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 1)
    private Long projectId;

    @Body
    @NameInMap("SchedulerType")
    private String schedulerType;

    private GetInstanceStatusStatisticRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizDate = builder.bizDate;
        this.dagType = builder.dagType;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
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
            this.schedulerType = request.schedulerType;
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
         * BizDate.
         */
        public Builder bizDate(String bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
            return this;
        }

        /**
         * DagType.
         */
        public Builder dagType(String dagType) {
            this.putBodyParameter("DagType", dagType);
            this.dagType = dagType;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * SchedulerType.
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
